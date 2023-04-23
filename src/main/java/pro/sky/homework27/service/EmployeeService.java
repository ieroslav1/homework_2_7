package pro.sky.homework27.service;

import pro.sky.homeworksspring.G_2_7_Collections_Generics_n_Maps_Final.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Collection<Employee> findAll();
}
