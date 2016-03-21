/**
 * 
 */
package com.bluewise.services;

import java.util.List;

import javax.annotation.Resource;

import com.bluewise.entitys.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService extends PagingAndSortingRepository<Customer,Long> {

//    List<Customer> list = customerService.datagridCustomer(page);

}
