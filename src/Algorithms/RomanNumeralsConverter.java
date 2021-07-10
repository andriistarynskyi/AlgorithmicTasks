package Algorithms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumeralsConverter {
    public static void main(String[] args) {
        //create roman numerals converter
        System.out.println(romanNumParser("X"));
    }

    public static boolean isRomanNumStringValid(String str) {
        String regex = "^(?=[MDCLXVI])M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$";
        Pattern p = Pattern.compile(regex);

        if (str.isBlank() || str.isEmpty()) {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }

//    to do parser needs to be completed
    public static int romanNumParser(String str) {
        int res = 0;
        if (isRomanNumStringValid(str)) {
            if (str.contains("X")) {
                res += 10;
            }
        }
        return res;
    }
}
