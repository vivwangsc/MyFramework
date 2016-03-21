package com.bluewise.services;

import com.bluewise.entitys.SysMenu;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

//@Service
//public interface CustomerService extends PagingAndSortingRepository<Customer,Long> {
//}

@Service
public interface MenuService extends PagingAndSortingRepository<SysMenu,Long> {

}
