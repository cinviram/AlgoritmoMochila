/*
KnapsackProblem.java
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

public class Matrix {

    private int Matrix[][];
    private int Fila;
    private int Columna;

    public int[][] getMatrix() {
        return Matrix;
    }

    public void setMatrix(int[][] Matrix) {
        this.Matrix = Matrix;
    }

    public int getFila() {
        return Fila;
    }

    public void setFila(int Fila) {
        this.Fila = Fila;
    }

    public int getColumna() {
        return Columna;
    }

    public void setColumna(int Columna) {
        this.Columna = Columna;
    }

    public Matrix(int nuevaColumna, int nuevaFila) {
        Matrix = new int[nuevaColumna][nuevaFila];
        Columna = nuevaColumna;
        Fila = nuevaFila;

        for (int i = 0; i < Columna; i++) {
            for (int j = 0; j < Fila; j++) {
                Matrix[i][j] = 0;
            }
            System.out.println();
        }
    }

    public void ShowMatrix() {
        for (int i = 0; i < Columna; i++) {
            for (int j = 0; j < Fila; j++) {
                System.out.printf("%5d", Matrix[i][j]);
            }
            System.out.println();
        }
    }

}
