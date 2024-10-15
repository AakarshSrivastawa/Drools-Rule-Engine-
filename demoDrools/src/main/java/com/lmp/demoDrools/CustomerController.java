package com.lmp.demoDrools;

import com.lmp.demoDrools.model.Customer;
import com.lmp.demoDrools.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/categorize")
    public ResponseEntity<Customer> categorizeCustomer(@RequestBody Customer customer) {
        Customer updatedCustomer = customerService.applyCategoryToCustomer(customer);
        return ResponseEntity.ok(updatedCustomer);
    }
}
