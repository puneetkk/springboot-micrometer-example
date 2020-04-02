package com.springbytes.sb.micrometer.repo;

import java.util.List;

import com.springbytes.sb.micrometer.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository  extends CrudRepository<Customer, Long> {

    List<Customer> findByLname(String lname);
    Customer findById(long id);

}
