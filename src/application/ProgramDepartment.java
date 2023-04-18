package src.application;

import src.entities.model.Department;
import src.model.dao.DaoFactory;
import src.model.dao.DepartamentDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramDepartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartamentDao departamentDao = DaoFactory.createDepartmentDao();
        System.out.println("--- TEST 1: Department findById ---");
        Department department = departamentDao.findById(8);
        System.out.println(department);

        System.out.println("\n--- TEST 2: Department findAll ---");
        List<Department> list = new ArrayList<>();
        list = departamentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n--- TEST 3: Department insert ---");
        Department newDepartment = new Department(null, "Suplements");
        departamentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n--- TEST 4: Department update ---");
        department = departamentDao.findById(8);
        department.setName("Food");
        departamentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("\n--- TEST 5: Department delete ---");
        System.out.println("Enter id for delete test:");
        int id = sc.nextInt();
        departamentDao.deleteById(id);
        System.out.println("Delete completed");
        sc.close();
    }
}
