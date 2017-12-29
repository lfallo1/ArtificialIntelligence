package com.lancefallon.ai.search;

import com.lancefallon.ai.domain.Vertex;

public class DFSRecursive implements SearchService {

    /**
     * recursive implementation of DFS
     * @param vertex
     */
    @Override
    public void search(Vertex vertex) {
        vertex.setVisited(true);
        System.out.println(vertex);
        for(Vertex v : vertex.getNeighborList()){
            if(!v.isVisited()){
                search(v);
            }
        }
    }

}
