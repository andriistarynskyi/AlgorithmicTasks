package Algorithms;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;


public class RepeatedNumber {
    public static void main(String[] args) throws ParseException {
        String date = "6th Oct 2052";
//        objective 2052-10-06
        System.out.println(getDate(date));
    }

    public static String getDate(String date) {
        StringBuilder sb = new StringBuilder();
        String year = date.substring(date.length() - 4);
        String month = getMonth(date.substring(date.indexOf(" ") + 1, date.lastIndexOf(" ")));
        String day = getDay(date.substring(0, date.indexOf(" ")));
        String delimiter = "-";
        return sb.append(year)
                .append(delimiter)
                .append(month)
                .append(delimiter)
                .append(day)
                .toString();
    }

    public static String getMonth(String month) {
        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");
        if (months.containsKey(month)) {
            return months.get(month);
        }
        throw new IllegalArgumentException("Such month does not exist!!!");
    }

    public static String getDay(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        if (sb.length() == 1) {
            sb.insert(0, "0");
        }
        return sb.toString();
    }
}