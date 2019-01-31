package Mochila;

/**
*
* @author Mishell Angulo
* @author John Cuesta
* @author Darwin Guaman
* @author Cindy Ramirez
*/

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
