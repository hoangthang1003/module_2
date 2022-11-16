package case_study.services;

import java.io.IOException;

public interface IEmployeeServices {
    void display() throws IOException;
    void add() throws IOException;
    void delete() throws IOException;
    void edit() throws IOException;
}
