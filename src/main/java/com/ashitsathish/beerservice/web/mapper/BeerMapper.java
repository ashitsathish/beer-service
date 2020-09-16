package com.ashitsathish.beerservice.web.mapper;

import com.ashitsathish.beerservice.domain.Beer;
import com.ashitsathish.beerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by ashitsathish on Sep,2020
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
