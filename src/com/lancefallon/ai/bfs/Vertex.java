package com.lancefallon.ai.bfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int value;
    private boolean visited;
    private List<Vertex> neighborList;

    public Vertex(int value){
        this.value = value;
        neighborList = new ArrayList<>();
        visited = false;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighborList() {
        return neighborList;
    }

    public void setNeighborList(List<Vertex> neighborList) {
        this.neighborList = neighborList;
    }

    public void addNeighbor(Vertex vertex){
        this.neighborList.add(vertex);
    }

    @Override
    public String toString() {
        return "com.lancefallon.ai.bfs.Vertex{" +
                "value=" + value +
                ", visited=" + visited +
                ", neighborList=" + neighborList +
                '}';
    }
}
