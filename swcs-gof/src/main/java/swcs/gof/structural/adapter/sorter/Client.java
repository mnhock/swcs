package swcs.gof.structural.adapter.sorter;

class Client {

    public static void main(String[] args) {
        int[] numbers = {34, 2, 4, 12, 1};

        Sorter sorter = new SortListAdapter();
        sorter.sort(numbers);
    }
}
