package org.leo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        String data = """
                1-3 a: abcde
                1-3 b: cdefg
                2-9 c: ccccccccc""";

        String[] strings = data.split("\n");

        BufferedReader br = new BufferedReader(new FileReader("C:\\java_projects\\advent-of-code\\2020\\advent-of-code-2020\\day-2\\src\\main\\resources\\data.txt"));

        int count = 0;
        String s1;
        while ((s1 = br.readLine()) != null) {
//        for (String s : strings) {
            Password password = new Password(s1);
            if (password.isValid()) count++;

        }
        System.out.println(count);
    }
}
