package org.example.generic;

public class BoxPractice <T> {
    private T justValue;

    public void addElement(T value){
        this.justValue=value;
    }

    public T getJustValue(){
        return justValue;
    }

}
