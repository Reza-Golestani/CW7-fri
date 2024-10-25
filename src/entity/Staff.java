package entity;

import entity.enums.Department;
import entity.enums.StaffPosition;

public class Staff extends User {

    private Department department;
    private StaffPosition position;
    private int salary;

    public Staff(String userName, String password, String firstName, String lastName,
                 Department department, StaffPosition position, int salary) {
        super(userName, password, firstName, lastName);
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public StaffPosition getPosition() {
        return position;
    }

    public void setPosition(StaffPosition position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
