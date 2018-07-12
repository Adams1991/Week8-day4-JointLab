package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager extends Employee {
    private int budget;
    private String department;
    private List<Admin> admins;

    public Manager(String name, String niNumber, int salary, int budget, String department) {
        super(name, niNumber, salary);
        this.budget = budget;
        this.department = department;
    }

    public Manager() {
    }

    @Column(name = "budget")
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }
}
