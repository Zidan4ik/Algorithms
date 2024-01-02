package task.task7;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {
    String name;
    boolean visited;
    List<Edge> neighbours;
    int distance; // відстань до нього, початкове нескінченно багато
    Vertex predecessor;

    public Vertex(String name) {
        this.name = name;
        neighbours = new ArrayList<>();
        distance = Integer.MAX_VALUE;
        predecessor = null;
    }

    public void addNeighbour(Edge edge) {
        neighbours.add(edge);
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Edge> getNeighbours() {
        return neighbours;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public int compareTo(Vertex o) {
        return Integer.compare(this.getDistance(), o.getDistance());
    }

    @Override
    public String toString() {
        return name;
    }
}
