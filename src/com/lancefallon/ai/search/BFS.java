package com.lancefallon.ai.search;

import com.lancefallon.ai.domain.Vertex;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Breadth-First search implementation. Visit each neighbor.
 */
public class BFS implements SearchService {

    @Override
    public void search(Vertex root){
        Queue queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);

        while(!queue.isEmpty()){
            Vertex vertex = (Vertex) queue.remove();
            System.out.println(vertex.toString());

            for(Vertex v : vertex.getNeighborList()){
                if(!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }

    @Override
    public void searchRecursive(Vertex vertex) {
        throw new NotImplementedException();
    }

}
