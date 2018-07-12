package models;

public class Department {
    private String title;
    private Manager manager;

    public Department() {
    }

    public Department(String title, Manager manager) {
        this.title = title;
        this.manager = manager;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
