package com.bluewise.services;

import com.bluewise.entitys.BaIcd10Entity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wangshunchu on 16/3/7.
 */
@Repository
public interface BaIcd10Service extends PagingAndSortingRepository<BaIcd10Entity,Long> {
    //public Page<BaIcd10Entity> findAll(Pageable page);
    
}
