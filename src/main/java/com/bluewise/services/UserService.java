/**
 * 
 */
package com.bluewise.services;

import java.util.List;

import javax.annotation.Resource;

import com.bluewise.entitys.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends PagingAndSortingRepository<User,Long> {
    //@Query
//    List<User> findBySyStartingWith

}
