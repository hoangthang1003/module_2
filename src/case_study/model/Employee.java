package case_study.model;

public class Employee extends Person{
    private String qualifications;
    private String position;
    private int salary;

    public Employee(String name, String dateOfBirth, String gender, String idCard, String phone, String email, String qualifications, String position, int salary) {
        super(name, dateOfBirth, gender, idCard, phone, email);
        this.qualifications = qualifications;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, String dateOfBirth, String gender, String idCard, String phone, String email, String qualifications, String position, int salary) {
        super(id, name, dateOfBirth, gender, idCard, phone, email);
        this.qualifications = qualifications;
        this.position = position;
        this.salary = salary;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                "qualifications='" + qualifications + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
