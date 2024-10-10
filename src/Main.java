import java.io.IOException;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        String jsonResponse = ConsomeApi.enviarRequisicao();

        Pattern emailPattern = Pattern.compile("\"email\":\\s*\"(.*?)\"");
        Matcher matcher = emailPattern.matcher(jsonResponse);

        List<String> emails = matcher.results()
                .map(m -> m.group(1))
                .collect(Collectors.toList());

        System.out.println(emails);


}}