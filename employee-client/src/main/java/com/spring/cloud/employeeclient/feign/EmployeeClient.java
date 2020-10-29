package com.spring.cloud.employeeclient.feign;

import com.spring.cloud.employeeclient.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${feign.name}", fallback = EmployeeClient.HystrixClientFallback.class)
public interface EmployeeClient {
    //..

    @GetMapping("/employees/{id}")
    ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId);

    class HystrixClientFallback implements EmployeeClient {
        @Override
        public ResponseEntity<Employee> getEmployeeById(Long employeeId) {
            return null;
        }
    }
}