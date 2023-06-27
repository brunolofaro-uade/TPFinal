package org.example;

import org.classes.dynamic.Graph;

public class Main {
    public static void main(String[] args) throws Exception {
        Graph graph = new Graph();
        graph.addNode(0);
        graph.addNode(1);
        graph.addNode(2);
        graph.addEdge(0,1,3);
        graph.addEdge(1,2,3);
        //System.out.println(graph.weight(0,2));
        int adjMatrix[][] = graph.getAdjacencyMatrix();
        printMatrix(adjMatrix);
    }
    static void printMatrix(int adjMatrix[][]){
        for(int i = 0; i< adjMatrix.length; i++){
            for (int j =0; j< adjMatrix.length; j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}