package swcs.gof.structural.adapter.textformatter;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CsvFormatter implements CsvFormattable {

    @Override
    public String formatCsv(String text, String separator) {
        if (text != null && separator != null) {
            return Stream.of(text.split(Pattern.quote(separator)))
                    .collect(Collectors.joining(", "));
        }

        return null;
    }
}
