package swcs.gof.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class SortListAdapter implements Sorter {

    @Override
    public int[] sort(int[] numbers) {
        List<Integer> numberList = new ArrayList<>();

        // convert the array to a List

        // call the adapter
        NumberSorter sorter = new NumberSorter();
        numberList = sorter.sort(numberList);

        // convert the list back to an array and return

        return numbers; //falsch
    }
}