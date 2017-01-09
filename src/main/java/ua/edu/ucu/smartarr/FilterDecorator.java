package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;
import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    private MyPredicate predicate;
    public FilterDecorator(SmartArray array, MyPredicate predicate) {
        super(array);
        this.predicate = predicate;
    }

    @Override
    public Object[] toArray() {
        Object[] innerArray = this.smartArray.toArray();
        ArrayList<Object> resultArray = new ArrayList<>(innerArray.length);
        for(Object innerEl : innerArray) {
            if(predicate.test(innerEl)){
                resultArray.add(innerEl);
            }
        }
        return resultArray.toArray();
    }

    @Override
    public String operationDescription() {
        return null;
    }
}
