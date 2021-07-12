package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class RenderTemplate {
    public static void main(String[] args) {
        //    create solution which will parse the string
        String str = "Hi, I am {{firstName}} {{lastName}} and I line in {{city}}.";
        Map<String, String> map = new HashMap<>();
        map.put("firstName", "Ara");
        map.put("lastName", "Livingstone");
        map.put("city", "Toronto");
        System.out.println(stringParser(str, map));
    }

    public static String stringParser(String str, Map<String, String> map) {
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("{{") && arr[i].contains("}}")) {
                String tempStr = arr[i].replaceAll("[^a-zA-Z]", "");
                if (map.containsKey(tempStr)) {
                    arr[i] = map.get(tempStr);
                }
            }
        }
        return String.join(" ", arr) + ".";
    }
}