package src.application;

import src.entities.model.Department;
import src.model.dao.DaoFactory;
import src.model.dao.DepartamentDao;

import java.util.Date;
import java.util.Scanner;

public class ProgramDepartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartamentDao departamentDao = DaoFactory.createDepartmentDao();
//        System.out.println("--- TEST 1: Seller findById ---");
//        Seller seller = sellerDao.findById(3);
//        System.out.println(seller);
//
//        System.out.println("\n--- TEST 2: Seller findByDepartment ---");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        for (Seller obj : list) {
//            System.out.println(obj);
//        }
//
//        System.out.println("\n--- TEST 3: Seller findAll ---");
//        list = sellerDao.findAll();
//        for (Seller obj : list) {
//            System.out.println(obj);
//        }

        System.out.println("\n--- TEST 4: Department insert ---");
        Department newDepartment = new Department(null, "Suplements");
        departamentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

//        System.out.println("\n--- TEST 5: Seller update ---");
//        seller = sellerDao.findById(1);
//        seller.setName("Martha Waine");
//        sellerDao.update(seller);
//        System.out.println("Update completed!");
//
//        System.out.println("\n--- TEST 6: Seller delete ---");
//        System.out.println("Enter id for delete test:");
//        int id = sc.nextInt();
//        sellerDao.deleteById(id);
//        System.out.println("Delete completed");
        sc.close();
    }
}
