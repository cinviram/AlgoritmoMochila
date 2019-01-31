package Mochila;

import java.util.ArrayList;

public class QuizDinamica {

    static Matriz Algoritmo(Knapsack pMochila, ArrayList<Box> pListaDeObjetos) {
        Matriz Optimos = new Matriz(pListaDeObjetos.size() + 1, pMochila.getCapacidad() + 1);

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
        Knapsack mochila = new Knapsack(4);
        //new Objeto(Valor,Peso)
        Box Jugo = new Box(8, 1);
        Box Mapa = new Box(7, 2);
        Box Botella = new Box(11, 3);

        ArrayList<Box> ListaDeObjetos = new ArrayList();

        ListaDeObjetos.add(Jugo);
        ListaDeObjetos.add(Mapa);
        ListaDeObjetos.add(Botella);

        Matriz MatrizOptimos = Algoritmo(mochila, ListaDeObjetos);
        System.out.println("Matriz de soluciones optimas:");
        MatrizOptimos.Mostrar();

        System.out.println("Basado en el tamaño de la mochila, el mayor valor que se puede obtener de los objetos es: "
                + MatrizOptimos.getMatriz()[ListaDeObjetos.size()][mochila.getCapacidad()]);
    }
}
