package swcs.dp.isp.printer.before;

class InkjetPrinter implements MultiFunctionDevice {

    @Override
    public void print() {
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException();
    }
}
