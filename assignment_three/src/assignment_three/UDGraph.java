package assignment_three;
import java.io.*;
import java.util.*;

/**
 *  The UDGraph class represents an unweighted directed graph.
 *  Implemented with an adjacency matrix.
 *  original author: UC Berkeley - https://www.cs.berkeley.edu/~jrs/61b/lab/lab13/UDGraph.java
 */

public class UDGraph {

    /*
     *  adjMatrix references the adjacency matrix of the graph.
     *  vertices is the number of vertices in the graph.
     *  edges is the number of edges in the graph.
     *
     */

    private boolean[][] adjMatrix;
    private int vertices;
    private int edges;

    /*
     *  Constructs a graph with n vertices and no edges.
     */
    public UDGraph(int n) {
        vertices = n;
        edges = 0;
        adjMatrix = new boolean[n][n];
        for (int i = 0; i < vertices; i++ ) {
            for (int j = 0; j < vertices; j++ ) {
      	        adjMatrix[i][j] = false;
            }
        }
    }

    /*
     *  Returns the number of vertices.
     *  @return this graph's vertex count.
     */
    public int getNumVertices() {
      return vertices;
    }

    /*
     *  Returns the number of edges.
     *  @return this graph's edge count.
     */
    public int getNumEdges() {
      return edges;
    }

    /*
     *  Returns true if v is a valid vertex number; false otherwise.
     *  @param v the vertex.
     *  @return boolean indicating existence of vertex number v.
     */
    public boolean validVertex(int v) {
        return (v >= 0) && (v < vertices);
    }

    /*
     *  Returns true if edge (origin, destination) exists; false otherwise.
     *  @param origin the origin vertex.
     *  @param destination the destination vertex.
     *  @return boolean indicating the presence of edge (origin, destination).
     */
    public boolean hasEdge(int origin, int destination) {
      if (validVertex(origin) && validVertex(destination)) {
          return adjMatrix[origin][destination];
      }
      else {
          return false;
      }
    }

    /*
     *  Creates the edge (origin, destination).  If the edge did not already
     *    exists, increments the edge count.
     *  @param origin the origin vertex.
     *  @param edstination the destination vertex.
     */
    public void addEdge(int origin, int destination) {
        if (validVertex(origin) && validVertex(destination)) {
            if (!adjMatrix[origin][destination]) {
                 adjMatrix[origin][destination] = true;
                 edges++;
            }
        }
    }

    /*
     *  Deletes the edge (origin, destination).  If the edge existed, decrements
     *    the edge count.
     *  @param origin the origin vertex.
     *  @param destination the destination vertex.
     */
    public void removeEdge(int origin, int destination) {
        if (validVertex(origin) && validVertex(destination)) {
            if (adjMatrix[origin][destination]) {
      	         adjMatrix[origin][destination] = false;
      	          edges--;
            }
        }
    }

    /**
     *  Returns a new UDGraph with the same vertices as "this" UDGraph.
     *    The new graph has an edge (v, w) if and only if there is a path of
     *    length 2 from v to w in "this" graph.
     *  @return the new UDGraph.
     */
    public UDGraph length2Paths() {
        UDGraph newGraph = new UDGraph(vertices);
        return newGraph;
    }

    /**
     *  Returns a new UDGraph with the same vertices as "this" UDGraph.
     *    The new graph has an edge (v, w) if and only if there is a path of
     *    length "length" from v to w in "this" graph.
     *  @param length the length of paths used to construct the new graph.
     *  @return the new UDGraph.
     */
    public UDGraph paths(int length) {
        UDGraph newGraph = new UDGraph(vertices);
        return newGraph;
    }

    /**
     *  Returns a String representing the adjacency matrix, including the number
     *    of vertices and edges.
     *  @return a String representing the adjacency matrix.
     */
    public String toString() {
        int i, j;
        String s = vertices + " vertices and " + edges + " edges\n";

        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices - 1; j++) {
      	         s = s + (adjMatrix[i][j] ? "t" : ".")  + " ";
            }
            s = s + (adjMatrix[i][j] ? "t" : ".")  + "\n";
        }
        return s;
    }
}
