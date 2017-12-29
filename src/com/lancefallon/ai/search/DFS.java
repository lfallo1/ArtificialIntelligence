package com.lancefallon.ai.search;

import com.lancefallon.ai.domain.Vertex;

import java.util.Stack;

/**
 * Depth-First search - search as far down path as possible.
 */
public class DFS implements SearchService {

    /**
     * recursive
     * @param vertex
     */
    @Override
    public void searchRecursive(Vertex vertex) {
        vertex.setVisited(true);
        System.out.println(vertex);
        for(Vertex v : vertex.getNeighborList()){
            if(!v.isVisited()){
                search(v);
            }
        }
    }

    /**
     * iterative
     * @param vertex
     */
    @Override
    public void search(Vertex root) {
        Stack<Vertex> stack = new Stack<>();
        root.setVisited(true);
        stack.push(root);
        while(!stack.isEmpty()){
            Vertex vertex = stack.pop();
            System.out.println(vertex);
            for(Vertex v : vertex.getNeighborList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    stack.push(v);
                }
            }
        }
    }
}
