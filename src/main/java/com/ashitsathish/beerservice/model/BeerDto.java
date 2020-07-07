package com.ashitsathish.beerservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by ashitsathish on Jul,2020
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {
    private UUID id;
    private Integer version;
    private OffsetDateTime createDate;
    private OffsetDateTime modifiedDate;
    private String beerName;
    private BeerStyleEnum beerStyleEnum;
    private Long upc;
    private BigDecimal bigDecimal;
    private Integer quantityOnHand;

}
