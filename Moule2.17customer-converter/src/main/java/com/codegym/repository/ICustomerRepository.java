package com.codegym.repository;

import com.codegym.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer,Long> {
}
