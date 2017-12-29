package com.lancefallon.ai;

import com.lancefallon.ai.domain.Vertex;
import com.lancefallon.ai.search.BFS;
import com.lancefallon.ai.search.DFS;
import com.lancefallon.ai.search.DFSRecursive;
import com.lancefallon.ai.search.SearchService;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {

        SearchService bfs = new BFS();
        SearchService dfs = new DFS();
        SearchService dfsRecursive = new DFSRecursive();

        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);
        Vertex vertex6 = new Vertex(6);

        vertex1.addNeighbor(vertex2);
        vertex1.addNeighbor(vertex4);
        vertex4.addNeighbor(vertex5);
        vertex2.addNeighbor(vertex3);
        vertex3.addNeighbor(vertex6);
        vertex1.addNeighbor(vertex6);

        bfs.search(vertex1);
        clearVisited(vertex1,vertex2,vertex3,vertex4,vertex5,vertex6);
        dfs.search(vertex1);
        clearVisited(vertex1,vertex2,vertex3,vertex4,vertex5,vertex6);
        dfsRecursive.search(vertex1);
    }

    private static void clearVisited(Vertex... vertices){
        System.out.println("**********************");
        System.out.println("**********************");
        Arrays.asList(vertices).stream().forEach(v->v.setVisited(false));
    }

}
