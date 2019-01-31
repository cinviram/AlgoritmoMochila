package Mochila;

public class Matriz {

    private int Largo;
    private int Ancho;
    private int Matriz[][];

    public Matriz(int pLargo, int pAncho) {
        Matriz = new int[pLargo][pAncho];
        Largo = pLargo;
        Ancho = pAncho;
        for (int x = 0; x < Largo; x++) {
            for (int y = 0; y < Ancho; y++) {
                Matriz[x][y] = 0;
            }
            System.out.println();
        }
    }

    public void Mostrar() {
        for (int x = 0; x < Largo; x++) {
            for (int y = 0; y < Ancho; y++) {
                System.out.printf("%4d", Matriz[x][y]);
            }
            System.out.println();
        }
    }

    public int getLargo() {
        return Largo;
    }

    public void setLargo(int Largo) {
        this.Largo = Largo;
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int Ancho) {
        this.Ancho = Ancho;
    }

    public int[][] getMatriz() {
        return Matriz;
    }

    public void setMatriz(int[][] Matriz) {
        this.Matriz = Matriz;
    }
}
