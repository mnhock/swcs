package swcs.gof.structural.adapter.textformatter;

import java.util.regex.Pattern;

public class CsvFormatter implements CsvFormattable {

    @Override
    public String formatCsv(String text, String separator) {
        if (text != null && separator != null) {
            return String.join(", ", text.split(Pattern.quote(separator)));
        }

        return null;
    }
}
