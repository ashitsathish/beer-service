package com.ashitsathish.beerservice.repositories;

import com.ashitsathish.beerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by ashitsathish on Aug,2020
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
