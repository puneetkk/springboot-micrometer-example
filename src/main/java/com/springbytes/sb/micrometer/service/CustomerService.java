package com.springbytes.sb.micrometer.service;

import com.springbytes.sb.micrometer.model.Customer;
import com.springbytes.sb.micrometer.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public Customer createCustomer(Customer cust) throws InterruptedException {
        //Thread.sleep(58000);
        return customerRepository.save(cust);

    }
}
