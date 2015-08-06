package base;

import java.io.Serializable;

public class Param<T> implements Serializable {
    private String paramName;
    private T value;
    private T minValue;
    private T maxValue;
    private T adequeteValue;

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getMinValue() {
        return minValue;
    }

    public void setMinValue(T minValue) {
        this.minValue = minValue;
    }

    public T getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(T maxValue) {
        this.maxValue = maxValue;
    }

    public T getAdequeteValue() {
        return adequeteValue;
    }

    public void setAdequeteValue(T adequeteValue) {
        this.adequeteValue = adequeteValue;
    }
}
