package com.example.employeecruddemo.doa;

import com.example.employeecruddemo.entaties.Employee;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDOA {

    private EntityManager entityManager;

    public EmployeeDAOHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        Session sessionManager = entityManager.unwrap(Session.class);

        Query<Employee> employeeQuery = sessionManager.createQuery("from Employee", Employee.class);

        List<Employee> employees =employeeQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int id) {
        Session sessionManager = entityManager.unwrap(Session.class);

        Employee employee = sessionManager.get( Employee.class, id);

        return employee;
    }

    @Override
    public void save(Employee employee) {
        Session sessionManager = entityManager.unwrap(Session.class);

        sessionManager.saveOrUpdate(employee);
    }

    @Override
    public void deleteById(int id) {
        Session sessionManager = entityManager.unwrap(Session.class);

        Query employeeQuery = sessionManager.createQuery("delete from Employee where id=:employeeId", Employee.class);
        employeeQuery.setParameter("employeeId",id);

        employeeQuery.executeUpdate();
    }
}
