package ss16_filetest.exercise.readfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountryTest {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\module_2\\src\\ss16_filetest\\exercise\\readfile\\sourcefile.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String line;
            List<Country> list = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                Country country = new Country(Integer.parseInt(arr[0]),arr[1],arr[2]);
                list.add(country);
            }
            for (Country e : list) {
                System.out.println(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bufferedReader.close();
    }
}
