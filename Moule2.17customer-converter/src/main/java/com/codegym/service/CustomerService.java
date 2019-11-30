package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements  ICustomerService{

    @Autowired
    ICustomerRepository customerRepository;

    @Override
    public List<Customer> getAll() {
        List<Customer> customerList =(List<Customer>) customerRepository.findAll();
        return customerList;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findOne(id);
    }
}
