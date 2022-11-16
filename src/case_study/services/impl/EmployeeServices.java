package case_study.services.impl;

import case_study.model.Employee;
import case_study.services.IEmployeeServices;
import case_study.util.data.ReadWrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServices implements IEmployeeServices {
    Scanner scanner = new Scanner(System.in);
    ReadWrite readWrite = new ReadWrite();

    @Override
    public void display() throws IOException {
        List<Employee> list = readWrite.readFile();
        readWrite.writeFile(list);
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    @Override
    public void add() throws IOException {
        List<Employee> listEmployee = readWrite.readFile();
        int id;
        if (listEmployee.size() == 0 ) {
            id = 1;
        } else {
            id = listEmployee.get(listEmployee.size() - 1).getId() + 1;
        }

        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh");
        String date = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập CMND,CCCD");
        String idCard = scanner.nextLine();
        System.out.println("Nhập SDT");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập trình độ");
        String trinhDo = scanner.nextLine();
        System.out.println("Nhập chức vụ");
        String cV = scanner.nextLine();
        System.out.println("Nhập lương");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(name, date, gender, idCard, phoneNumber, email, trinhDo, cV, salary);
        employee.setId(id);
        listEmployee.add(employee);
        readWrite.writeFile(listEmployee);
    }

    @Override
    public void delete() throws IOException {
        List<Employee> listEmployee = ReadWrite.readFile();

        System.out.print("Nhập id bạn muốn xóa");
        int id = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < listEmployee.size(); i++) {
            if (id == listEmployee.get(i).getId()) {
                listEmployee.remove(listEmployee.get(i));
                check = true;
                break;
            }
        }
        readWrite.writeFile(listEmployee);
        if (!check) {
            System.out.println("Không có nhân viên có id này trong danh sách");
        }
    }

    @Override
    public void edit() throws IOException {
        List<Employee> listEmployee = ReadWrite.readFile();
        System.out.println("Nhập id nhân viên bạn muốn sửa");
        int id = Integer.parseInt(scanner.nextLine()  );
        for (Employee e : listEmployee) {
            if (e.getId() == id) {
                System.out.println("MỜi bạn nhập lại tên");
                e.setName(scanner.nextLine());
                System.out.println("MỜi bạn nhập lại ngày tháng năm sinh");
                e.setDateOfBirth(scanner.nextLine());
                System.out.println("MỜi bạn nhập lại giới tính");
                e.setGender(scanner.nextLine());
                System.out.println("MỜi bạn nhập lại CMND,CCCD");
                e.setIdCard(scanner.nextLine());
                System.out.println("MỜi bạn nhập lại SDT");
                e.setPhone(scanner.nextLine());
                System.out.println("MỜi bạn nhập lại email");
                e.setEmail(scanner.nextLine());
                System.out.println("MỜi bạn nhập lại trình độ");
                e.setQualifications(scanner.nextLine());
                System.out.println("MỜi bạn nhập lại chức vụ");
                e.setPosition(scanner.nextLine());
                System.out.println("MỜi bạn nhập lại lương");
                e.setSalary(Integer.parseInt(scanner.nextLine()));
            }
        }
        ReadWrite.writeFile(listEmployee);
    }
}
