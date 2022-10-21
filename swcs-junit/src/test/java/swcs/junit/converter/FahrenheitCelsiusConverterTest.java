package swcs.junit.converter;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FahrenheitCelsiusConverterTest {

    @Test
    void shouldConvertCelsiusToFahrenheit() {
        assertAll(
                () -> assertEquals(32, FahrenheitCelsiusConverter.toFahrenheit(0)),
                () -> assertEquals(98.6, FahrenheitCelsiusConverter.toFahrenheit(37), 1),
                () -> assertEquals(212, FahrenheitCelsiusConverter.toFahrenheit(100)),
                () -> assertEquals(26.6, FahrenheitCelsiusConverter.toFahrenheit(-3), 1),
                () -> assertEquals(-167.8, FahrenheitCelsiusConverter.toFahrenheit(-111), 1)
        );

    }

    @Test
    void shouldConvertFahrenheitToCelsius() {
        assertAll(
                () -> assertEquals(0, FahrenheitCelsiusConverter.toCelsius(32)),
                () -> assertEquals(37.7, FahrenheitCelsiusConverter.toCelsius(100), 1),
                () -> assertEquals(100, FahrenheitCelsiusConverter.toCelsius(212), 1),
                () -> assertEquals(-2.7, FahrenheitCelsiusConverter.toCelsius(27), 1),
                () -> assertEquals(-110.5, FahrenheitCelsiusConverter.toCelsius(-167), 1)
        );
    }
}