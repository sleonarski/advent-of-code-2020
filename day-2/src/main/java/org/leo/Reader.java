package org.leo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static List<String> readData(String input) {
        List<String> dataList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
            String dataRow;
            while ((dataRow = bufferedReader.readLine()) != null) {
                dataList.add(dataRow);
            }
        } catch (IOException e) {
            System.err.print("Something wrong with input");
            e.printStackTrace();
        }
        return dataList;
    }
}
