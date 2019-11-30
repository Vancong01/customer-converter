package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
    Customer save(Customer customer);
    Customer getCustomerById(Long id);
}
