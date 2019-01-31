package Mochila;

public class Box {

    private int weight;
    private int value;

    Box(int Pvalue, int Pweight) {
        weight = Pweight;
        value = Pvalue;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}
