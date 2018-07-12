import db.DBHelper;
import db.DBManager;
import models.Admin;
import models.Manager;

import java.util.List;

public class Runner {
    public static void main(String[] args){

        Manager manager1 = new Manager("Big Bill", "SR5543I", 60000, 500000, "Development");
        DBHelper.save(manager1);

        Admin admin1 = new Admin("Wee Bill", "SR5623J", 20000, manager1);
        DBHelper.save(admin1);

        List<Admin> adminsList = DBManager.getAdminsForManager(manager1);

    }
}
