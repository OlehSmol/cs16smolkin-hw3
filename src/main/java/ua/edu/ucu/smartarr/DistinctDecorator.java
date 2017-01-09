package ua.edu.ucu.smartarr;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray array) {
        super(array);
    }

    @Override
    public Object[] toArray() {
        Object[] innerArray = this.smartArray.toArray();
        ArrayList<Object> resultArray = new ArrayList<>(innerArray.length);
        for(Object innerEl : innerArray){
            boolean unique = true;
            for(Object resultEl : resultArray) {
                if(innerEl.equals(resultEl)){
                    unique = false;
                    break;
                }
            }
            if(unique){
                resultArray.add(innerEl);
            }
        }
        return resultArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "Distinct array.";
    }
}
