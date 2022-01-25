import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilder poesy = new StringBuilder();
        poesy.append("Сквозь туман тернистый путь блестит.\n");
        poesy.append("Ночь тиха, пустыня внемлет Богу");
        poesy.append("\n");
        poesy.append("И звезда с звездою говорит.");
        poesy.insert(0, "Выхожу один я на дорогу,\n");
        System.out.println(poesy);

        String json = "{\"fullName\":\"Роберт Джеймс Смит\",\"age\":\"62\",\"profession\":\"musician\"}";
        Pattern patternKeyValue = Pattern.compile("\"[a-zA-Z]*\":\"[а-яА-Яa-zA-Z0-9\\s]*\"");
        Map<String, String> keyValues = new TreeMap<>();
        Matcher matcher = patternKeyValue.matcher(json);
        while (matcher.find()) keyValues.put(matcher.group().split(":")[0].replace("\"", ""), matcher.group().split(":")[1].replace("\"", ""));
        for(Map.Entry<String, String> entry: keyValues.entrySet()){
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
}

