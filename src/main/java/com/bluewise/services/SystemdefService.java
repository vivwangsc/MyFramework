package com.bluewise.services;

import com.bluewise.entitys.Systemdef;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

@Service
public interface SystemdefService extends PagingAndSortingRepository<Systemdef,Long>{
}
