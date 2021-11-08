package swcs.junit.converter;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FahrenheitCelsiusConverterTest {

    @Test
    void shouldConvertCelsiusToFahrenheit() {
        assertAll(
                () -> assertEquals(32, FahrenheitCelsiusConverter.toFahrenheit(0)),
                () -> assertEquals(98, FahrenheitCelsiusConverter.toFahrenheit(37)),
                () -> assertEquals(212, FahrenheitCelsiusConverter.toFahrenheit(100))
        );

    }

    @Test
    void shouldConvertFahrenheitToCelsius() {
        assertAll(
                () -> assertEquals(0, FahrenheitCelsiusConverter.toCelsius(32)),
                () -> assertEquals(37, FahrenheitCelsiusConverter.toCelsius(100)),
                () -> assertEquals(100, FahrenheitCelsiusConverter.toCelsius(212))
        );
    }
}