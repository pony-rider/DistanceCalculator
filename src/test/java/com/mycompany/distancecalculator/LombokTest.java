package com.mycompany.distancecalculator;

import com.mycompany.distancecalculator.entity.City;
import org.junit.jupiter.api.Test;

public class LombokTest {

    @Test
    public void testCity() {
        City city1 = new City("moscow", 123d, 321d);
        System.out.println(city1);
    }
}
