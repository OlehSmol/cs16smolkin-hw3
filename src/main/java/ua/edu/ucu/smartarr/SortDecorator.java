package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;
import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    private MyComparator comparator;

    public SortDecorator(SmartArray array, MyComparator comparator) {
        super(array);
        this.comparator = comparator;
    }

    @Override
    public Object[] toArray() {
        Object[] innerArray = this.smartArray.toArray();
        Arrays.sort(innerArray, this.comparator);
        return innerArray;
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
