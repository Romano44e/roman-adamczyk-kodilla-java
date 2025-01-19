package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("z sezamem")
                .burgers(2)
                .sauce("standard")
                .ingredient("sałata")
                .ingredient("cebula")
                .ingredient("ogórek")
                .ingredient("bekon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();

        //Then
        assertEquals(4, howManyIngredients);
        assertEquals("z sezamem", bun);
        assertEquals(2, burgers);
        assertEquals("standard", sauce);

    }

}
