package org.leo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public int min;
    public int max;
    public String character;
    public String password;

    public Password(String s) {
//        1-3 a: abcde
        String[] sArr = s.split(":");
        String metaData = sArr[0].trim();
        password = sArr[1].trim();

        sArr = metaData.split(" ");
        String occurance = sArr[0].trim();
        character = sArr[1].trim();

        sArr = occurance.split("-");
        min = Integer.parseInt(sArr[0].trim());
        max = Integer.parseInt(sArr[1].trim());
    }

    public boolean isValid() {
        Matcher m = Pattern.compile(character).matcher(password);

        int matches = 0;
        while(m.find())
            matches++;
        return min <= matches && max >= matches;
    }
}
