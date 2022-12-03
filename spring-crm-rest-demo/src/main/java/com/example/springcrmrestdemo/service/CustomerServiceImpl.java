package com.example.springcrmrestdemo.service;

import java.util.List;

import com.example.springcrmrestdemo.repository.CustomerRepo;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springcrmrestdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepo _repo;
	public CustomerServiceImpl(CustomerRepo repo){
		this._repo=repo;
	}


	@Override
	public List<Customer> getCustomers() {
		return this._repo.getCustomers();
	}

	@Override
	public Customer saveCustomer(Customer theCustomer) {
return this._repo.save(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {
		return this._repo.findById(theId).orElse(null);
	}

	@Override
	public void deleteCustomer(int theId) {
this._repo.deleteById(theId);
	}
}





