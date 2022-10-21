package swcs.junit.converter;

public final class FahrenheitCelsiusConverter {

    private FahrenheitCelsiusConverter() {
    }

    public static float toCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5) / 9;
    }

    public static float toFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }
}
