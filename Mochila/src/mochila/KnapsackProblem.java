/*
Estrategia Programacion dinamica
El problema consiste en que la mochila tiene una capacidad maxima para poder meter objetos en nuestro caso cajas, dichos objetos tienen peso y un valor o beneficio. 
La mochila tiene un peso maximo que debe cumplir cuando se lo llene.
El objetivo es seleccionar y tomar la mayor cantidad de objetos y que tenga mayor beneficios ademas que no sobrepase el peso maximo.
la programacion dinamica nos proporciona una solucion optima comparado a la fuerza bruta ya que requiere mayor cantidad de recursos.
 */
package Mochila;

import java.util.ArrayList;

/**
 *
 * @author Mishell Angulo
 * @author John Cuesta
 * @author Darwin Guaman
 * @author Cindy Ramirez
 */
public class KnapsackProblem {

    static Matrix Algoritmo(Knapsack knapsack, ArrayList<Box> objectList) {
        Matrix solutions = new Matrix(objectList.size() + 1, knapsack.getCapacity() + 1);

        for (int i = 1; i <= objectList.size(); i++) {
            int weight = objectList.get(i - 1).getWeight();
            int value = objectList.get(i - 1).getWeight();

            for (int j = 0; j < knapsack.getCapacity(); j++) {
                solutions.getMatrix()[i][j] = solutions.getMatrix()[i - 1][j];
            }

            for (int j = weight; j <= knapsack.getCapacity(); j++) {
                solutions.getMatrix()[i][j] = Math.max(solutions.getMatrix()[i - 1][j], solutions.getMatrix()[i - 1][j - weight] + value);
            }
        }
        return solutions;
    }

    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack(19);
        //new Boxes(Value,Weight)
        Box box1 = new Box(8, 1);
        Box box2 = new Box(7, 2);
        Box box3 = new Box(11, 3);

        ArrayList<Box> objectList = new ArrayList();

        objectList.add(box1);
        objectList.add(box2);
        objectList.add(box3);

        Matrix solutions = Algoritmo(knapsack, objectList);
        System.out.println("Matrix that contains the optimum solutions:");
        solutions.ShowMatrix();

        System.out.println("In accordance with the weight of the knapsack, the higher value that you can get with the boxes is: "
                + solutions.getMatrix()[objectList.size()][knapsack.getCapacity()]);
    }
}
