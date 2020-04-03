package com.springbytes.sb.micrometer.service;

import com.springbytes.sb.micrometer.model.Customer;

import java.util.List;

public interface ICustomerService {

    public List<Customer> getCustomers();
    public Customer createCustomer(Customer cust) throws InterruptedException;

}
