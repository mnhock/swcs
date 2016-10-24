package swcs.junit.converter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FahrenheitCelciusConverterTest {

    @Test
    public void shouldConvertCelciusToFahrenheit() {
        assertEquals(FahrenheitCelciusConverter.toFahrenheit(0), 32);
        assertEquals(FahrenheitCelciusConverter.toFahrenheit(37), 98);
        assertEquals(FahrenheitCelciusConverter.toFahrenheit(100), 212);
    }

    @Test
    public void shouldConvertFahrenheitToCelcius() {
        assertEquals(FahrenheitCelciusConverter.toCelcius(32), 0);
        assertEquals(FahrenheitCelciusConverter.toCelcius(100), 37);
        assertEquals(FahrenheitCelciusConverter.toCelcius(212), 100);
    }
}