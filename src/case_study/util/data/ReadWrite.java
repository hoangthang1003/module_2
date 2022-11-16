package case_study.util.data;

import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {
    public static final String PATH ="D:\\module_2\\src\\case_study\\util\\data\\employee.csv";
    public static List<Employee> readFile() throws IOException {
        FileReader fileReader = new FileReader(PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Employee> list = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null ) {
            String[] str = line.split(",");
            list.add(new Employee(Integer.parseInt(str[0]),str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],Integer.parseInt(str[9])));
        }
        bufferedReader.close();
        return list;
    }
    public static void writeFile(List<Employee> list) throws IOException {
        FileWriter fileWriter = new FileWriter(PATH);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Employee employee: list) {
            bufferedWriter.write(employee.getId()+","+employee.getName()+","+employee.getDateOfBirth()+","+employee.getGender()+","+employee.getIdCard()+","+employee.getPhone()+","+employee.getEmail()+","+employee.getQualifications()+","+employee.getPosition()+","+employee.getSalary());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
