package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employees")

public class Admin extends Employee {

    private Manager manager;

    public Admin(String name, String niNumber, int salary, Manager manager) {
        super(name, niNumber, salary);
        this.manager = manager;
    }

    public Admin() {
    }

    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
