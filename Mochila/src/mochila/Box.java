/*
Box.java
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
