package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {

    @Test
    public void convertToFahrenheit() {
        double celsius = 27.0d;
        double fahrenheit = (9.0 / 5) * celsius + 32;


        // TODO: Use a floating point calculation to calculate the fahrenheit equivalent of the celsius value.

        assertThat(fahrenheit, equalTo(80.6));
    }

    //
    // Exercise 2: Convert kilograms to pounds
    // There are 2.20462 pounds in a kilogram
    //
    @Test
    public void convertKilogramsToPounds() {
        int weightInKilograms = 50;
        double weightInPounds = weightInKilograms * 2.20462;

        // TODO: Use a floating point calculation to calculate the correct weight in pounds

        assertThat(weightInPounds, equalTo(110.231));
    }
}