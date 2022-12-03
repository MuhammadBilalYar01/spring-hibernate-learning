package com.example.springcrmrestdemo.repository;

import com.example.springcrmrestdemo.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo  extends CrudRepository<Customer, Integer> {
    @Query("from Customer order by lastName")
    List<Customer> getCustomers();
}
