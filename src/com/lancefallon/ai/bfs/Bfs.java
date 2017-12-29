package com.lancefallon.ai.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

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

}
