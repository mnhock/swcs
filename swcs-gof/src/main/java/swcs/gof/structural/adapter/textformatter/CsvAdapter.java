package swcs.gof.structural.adapter.textformatter;

public class CsvAdapter implements TextFormattable {

    private final CsvFormattable csvFormattable;

    public CsvAdapter(CsvFormatter csvFormattable) {
        this.csvFormattable = csvFormattable;
    }

    @Override
    public String formatText(String text, String separator) {
        return this.csvFormattable.formatCsv(text, separator);
    }

}