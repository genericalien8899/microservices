package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Customer;

public class CustomerMapper {

    public static CustomerDto mapToCustomerDTO(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto,Customer customer) {
        customer.setName(customer.getName());
        customer.setEmail(customer.getEmail());
        customer.setMobileNumber(customer.getMobileNumber());
        return customer;
    }
}
