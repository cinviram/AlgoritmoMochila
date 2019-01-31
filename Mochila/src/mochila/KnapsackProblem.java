/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    static Matriz Algoritmo(Knapsack knapsack, ArrayList<Box> objectList) {
        Matriz Optimos = new Matriz(objectList.size() + 1, knapsack.getCapacity() + 1);

        for (int i = 1; i <= pListaDeObjetos.size(); i++) {
            int Peso = pListaDeObjetos.get(i - 1).getPeso();
            int Valor = pListaDeObjetos.get(i - 1).getValor();

            for (int j = 0; j < pMochila.getCapacidad(); j++) {
                Optimos.getMatriz()[i][j] = Optimos.getMatriz()[i - 1][j];
            }

            for (int j = Peso; j <= pMochila.getCapacidad(); j++) {
                Optimos.getMatriz()[i][j] = Math.max(Optimos.getMatriz()[i - 1][j], Optimos.getMatriz()[i - 1][j - Peso] + Valor);
            }
        }
        return Optimos;
    }

    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack(4);
        //new Boxes(Value,Weight)
        Box box1 = new Box(8, 1);
        Box box2 = new Box(7, 2);
        Box box3 = new Box(11, 3);

        ArrayList<Box> ListaDeObjetos = new ArrayList();

        ListaDeObjetos.add(box1);
        ListaDeObjetos.add(box2);
        ListaDeObjetos.add(box3);

        Matriz MatrizOptimos = Algoritmo(knapsack, ListaDeObjetos);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("Matrix that contains the optimum solutions:");
        MatrizOptimos.Mostrar();
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("In accordance with the weight of the knapsack, the higher value that you can get with the boxes is: "
                + MatrizOptimos.getMatriz()[ListaDeObjetos.size()][knapsack.getCapacity()]);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
}
