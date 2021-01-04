package swcs.gof.structural.adapter.textformatter;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewlineFormatter implements TextFormattable {

    @Override
    public String formatText(String text, String separator) {
        if (text != null && separator != null) {
            return Stream.of(text.split(Pattern.quote(separator)))
                    .map(String::stripLeading)
                    .collect(Collectors.joining("\n"));
        }

        return null;
    }
}
