package org.example;

import org.classes.dynamic.Graph;

public class Main {
    public static void main(String[] args) throws Exception {
        /*Graph graph = new Graph();
        graph.addNode(0);
        graph.addNode(1);
        graph.addNode(2);
        graph.addEdge(0,1,3);
        graph.addEdge(1,2,3);
        int adjMatrix[][] = graph.getAdjacencyMatrix();
        printMatrix(adjMatrix);*/

        int matrixA[][] =
                {
                    {1, 2 ,3},
                    {4, 3 ,2},
                    {1, 2 ,3}
                };
        int matrixB[][] =
                {
                    {4, 2 ,1},
                    {3, 2 ,1},
                    {1, 3 ,4}
                };
        printMatrix(multiplyMatrices(matrixA,matrixB));

    }
    static void printMatrix(int adjMatrix[][]){
        for(int i = 0; i< adjMatrix.length; i++){
            for (int j =0; j< adjMatrix.length; j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int [][] multiplyMatrices(int matrixA[][], int matrixB[][]){
        int length = matrixA.length;
        int matrixRes[][] = new int[length][length];
        for(int i=0;i<length;i++){
            int acum=0;
            for(int j=0;j<length;j++){
                for(int k=0;k<length;k++){
                    acum += matrixA[i][k] * matrixB[k][j];
                }
                matrixRes[i][j] = acum;
                acum = 0;
            }
        }
        return matrixRes;
    }
}