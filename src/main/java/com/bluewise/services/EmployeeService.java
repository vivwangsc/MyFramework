package com.bluewise.services;

import com.bluewise.entitys.EmployeesEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangshunchu on 16/3/7.
 */
@Repository
public interface EmployeeService extends PagingAndSortingRepository<EmployeesEntity,Long> {
    public List<EmployeesEntity> findByFirstName(String name);
    public List<EmployeesEntity> findByFirstNameLike(String name);
//    @Query(value = "select * from Employees where FIRST_NAME like ?1",nativeQuery =true )
//    public Page<EmployeesEntity> findBylikExists(PageRequest pr,String name);
    }
