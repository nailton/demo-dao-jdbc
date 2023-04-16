package src.model.dao;

import src.entities.model.Department;

import java.util.List;

public interface DepartamentDao {
    void insert(Department obj);

    void update(Department obj);

    void deleteById(Department id);

    Department findById(Integer id);

    List<Department> findAll();
}
