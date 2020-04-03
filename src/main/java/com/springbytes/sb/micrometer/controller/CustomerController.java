package com.springbytes.sb.micrometer.controller;

import com.springbytes.sb.micrometer.model.Customer;
import com.springbytes.sb.micrometer.repo.CustomerRepository;
import com.springbytes.sb.micrometer.service.ICustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private ICustomerService customerService;

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @PostMapping
    public @ResponseBody ResponseEntity<String> createCustomer() throws InterruptedException {
        logger.info("Request Received to Create a new Customer");
        Customer cust = new Customer("John","Smith");
        customerService.createCustomer(cust);
        return new ResponseEntity<String>("Request successful", HttpStatus.CREATED);
    }

}
