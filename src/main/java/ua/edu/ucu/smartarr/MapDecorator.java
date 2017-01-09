package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    private MyFunction function;

    public MapDecorator(SmartArray array, MyFunction function) {
        super(array);
        this.function = function;
    }

    @Override
    public Object[] toArray() {
        Object[] innerArray = smartArray.toArray();
        Object[] resultArray = new Object[innerArray.length];
        for(int i=0; i < innerArray.length; i++) {
            resultArray[i] = this.function.apply(innerArray[i]);
        }
        return resultArray;
    }

    @Override
    public String operationDescription() {
        return null;
    }
}
