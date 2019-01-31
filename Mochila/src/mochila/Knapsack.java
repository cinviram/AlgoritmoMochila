package Mochila;

import java.util.ArrayList;

/**
 *
 * @author Mishell Angulo
 * @author John Cuesta
 * @author Darwin Guaman
 * @author Cindy Ramirez
 */

public class Knapsack {

    private ArrayList<Box> objectList;
    private int capacity;

    Knapsack(int pCapacidad) {
        objectList = new ArrayList<>();
        capacity = pCapacidad;
    }

    //method for get the boxes into the knapsack
    public void getInto(Box box) {
        objectList.add(box);
    }

    public ArrayList<Box> getObjectList() {
        return objectList;
    }

    public void setObjectList(ArrayList<Box> objectList) {
        this.objectList = objectList;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
