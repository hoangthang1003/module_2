package ss16_filetest.exercise.copyfiletest;

import ss16_filetest.practice.filetest.ReadFileExample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CopyFileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\module_2\\src\\ss16_filetest\\exercise\\sourcefile.csv");
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> list = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        bufferedReader.close();
        File file1 = new File("D:\\module_2\\src\\ss16_filetest\\exercise\\targetfile.csv");
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        FileWriter fileWriter1 = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter1);
        for (String element : list) {
            bufferedWriter.write(element);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        String string = "";
        for (String str:list) {
            string += str;
        }
        System.out.println("Số kí tự trong tệp là: " + string.length());
    }
}
