package org.leo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Code {
    private int min;
    private int max;
    private String symbol;
    private String sequence;

    @Override
    public String toString() {
        return "Code{" +
                "min=" + min +
                ", max=" + max +
                ", symbol='" + symbol + '\'' +
                ", sequence='" + sequence + '\'' +
                '}';
    }

    //1-3 a: abcde
    public static long process(String data) {
        return Reader.readData(data).stream()
                .map(Code::new)
                .filter(Code::valid)
                .count();
    }

    private static boolean valid(Code code) {
        Matcher m = Pattern.compile(code.symbol).matcher(code.sequence);

        int count = 0;
        while (m.find()) {
            count++;
        }
        return (code.min <= count && code.max >= count);
    }

    public Code (String input) {
        String[] splitedInput = input.split(":");
        sequence = splitedInput[1].trim();

        String metaData = splitedInput[0];
        String[] assumptionArr = metaData.split(" ");
        symbol = assumptionArr[1].trim();

        String[] numbers = assumptionArr[0].split("-");
        min = Integer.parseInt(numbers[0]);
        max = Integer.parseInt(numbers[1]);
    }
}
