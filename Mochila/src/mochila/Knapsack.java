/*
Knapsack.java
Estrategia Programacion dinamica
El problema consiste en que la mochila tiene una capacidad maxima para poder meter objetos en nuestro caso cajas, dichos objetos tienen peso y un valor o beneficio. 
La mochila tiene un peso maximo que debe cumplir cuando se lo llene.
El objetivo es seleccionar y tomar la mayor cantidad de objetos y que tenga mayor beneficios ademas que no sobrepase el peso maximo.
la programacion dinamica nos proporciona una solucion mas óptima en comparacion al algoritmo de fuerza bruta en tiempos de ejecucion.
/**
 *
 * @author Mishell Angulo
 * @author John Cuesta
 * @author Darwin Guaman
 * @author Cindy Ramirez
 *
Fecha:30/01/2019
 */
package Mochila;

import java.util.ArrayList;

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
