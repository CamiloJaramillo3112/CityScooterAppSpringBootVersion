package com.cesde.cityscooterapp.controllers;

import com.cesde.cityscooterapp.domain.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private List<Customer> customers = new ArrayList<>();

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customers.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return customer;
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable int id, @RequestBody Customer updatedCustomer) {
        for (Customer c : customers) {
            if (c.getId() == id) {
                c.setName(updatedCustomer.getName());
                c.setLastName(updatedCustomer.getLastName());
                c.setEmail(updatedCustomer.getEmail());
                c.setPassword(updatedCustomer.getPassword());
                c.setStatus(updatedCustomer.isStatus());
                return c;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable int id) {
        customers.removeIf(c -> c.getId() == id);
        return "Customer deleted with id: " + id;
    }
}
