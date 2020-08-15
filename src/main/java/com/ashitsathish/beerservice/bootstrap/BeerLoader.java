package com.ashitsathish.beerservice.bootstrap;

import com.ashitsathish.beerservice.domain.Beer;
import com.ashitsathish.beerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by ashitsathish on Aug,2020
 */
@Component
public class BeerLoader implements CommandLineRunner {
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count()==0){
            beerRepository.save(
                    Beer.builder()
                            .beerName("Mango Bobs")
                            .beerStyle("IPA")
                            .upc(123121L)
                            .price(new BigDecimal(12.95))
                            .quantityToBrew(200)
                            .minOnHand(12)
                            .build());

            beerRepository.save(
                    Beer.builder()
                            .beerName("Galaxy Cat")
                            .beerStyle("PALE_ALE")
                            .upc(123122311L)
                            .quantityToBrew(1200)
                            .price(new BigDecimal(19.95))
                            .minOnHand(52)
                            .build());

        }
        System.out.println("Loaded Count " + beerRepository.count());
    }
}
