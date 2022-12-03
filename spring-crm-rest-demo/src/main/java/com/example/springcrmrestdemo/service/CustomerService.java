package com.example.springcrmrestdemo.service;

import java.util.List;

import com.example.springcrmrestdemo.entity.Customer;
import org.springframework.transaction.annotation.Transactional;

public interface CustomerService {
	public List<Customer> getCustomers();

	public Customer saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
