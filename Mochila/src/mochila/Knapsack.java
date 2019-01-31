package Mochila;

import java.util.ArrayList;

public class Knapsack {

    private ArrayList<Box> objectList;
    private int capacity;

    Knapsack(int pCapacidad) {
        objectList = new ArrayList<>();
        capacity = pCapacidad;
    }

    public void getInto(Box box) {
        objectList.add(box);
    }

}
