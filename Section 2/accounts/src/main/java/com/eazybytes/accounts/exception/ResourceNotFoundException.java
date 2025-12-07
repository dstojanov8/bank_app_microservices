package com.eazybytes.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    // resourceName: e.g. account or customer
    // fieldName: e.g. mobileNumber
    // fieldValue: the actual value sent
    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
        // invokes RuntimeException Constructor since it is the superclass of this class
        super(String.format("%s not found with the given input data %s: '%s'", resourceName, fieldName, fieldValue));
    }
}
