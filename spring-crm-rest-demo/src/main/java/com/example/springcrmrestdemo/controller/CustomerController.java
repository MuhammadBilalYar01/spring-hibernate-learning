package com.example.springcrmrestdemo.controller;

import com.example.springcrmrestdemo.entity.Customer;
import com.example.springcrmrestdemo.exceptions.CustomerNotFoundException;
import com.example.springcrmrestdemo.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    private CustomerService _service;
    public CustomerController(CustomerService service){
        this._service=service;
    }
    @GetMapping("customers")
    public List<Customer> getCustomers(){
        return  this._service.getCustomers();
    }
    @GetMapping("customers/{customerId}")
    public Customer getCustomer(@PathVariable int customerId){
        Customer customer =   this._service.getCustomer(customerId);
        if(null==customer)
            throw  new CustomerNotFoundException("No customer found with id "+customerId);
        return customer;
    }

    @PostMapping("customers")
    public Customer postCustomer(@RequestBody Customer customer){
        customer.setId(0);
        return this._service.saveCustomer(customer);
    }

    @PutMapping("customers")
    public Customer updateCustomer(@RequestBody Customer customer){
        return this._service.saveCustomer(customer);
    }
    @DeleteMapping("customers/{customerId}")
    public String deleteCustomer(@PathVariable int customerId){
        Customer customer =   this._service.getCustomer(customerId);
        if(null==customer)
            throw  new CustomerNotFoundException("No customer found with id "+customerId);
        this._service.deleteCustomer(customerId);
        return "Customer with id "+customerId+" deleted";
    }
}
