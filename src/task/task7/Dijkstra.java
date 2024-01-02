package task.task7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    PriorityQueue<Vertex> queue;

    public Dijkstra() {
        queue = new PriorityQueue<>(); // Зберігаємо всі вершини, де будуть сортуватись по відстані. Завжди будемо обирати наймінімальнішу відстань
    }

    public void compute(Vertex source) {
        source.distance = 0;
        queue.add(source);

        while (!queue.isEmpty()) {
            Vertex current = queue.poll();

            for (Edge neighbour : current.getNeighbours()) {
                Vertex end = neighbour.getEnd();
                int weight = neighbour.getWeight();

                if (!end.isVisited()) { // якщо я не був в цій вершині, то перевіряємо, якщо ні, то вже знайшли коротший шлях
                    if (current.getDistance() + weight < end.getDistance()) { // перевіряємо, чи новий шлях через поточну вершину є коротшим за старим найкоротшим шляхом старої вершини
// getDistance() - містить найкоротший шлях до вершини
                        end.setDistance(current.getDistance() + weight);

                        if (queue.contains(end)) { // перевірка чи є така вершина в черзі
                            queue.remove(end); // видаляємо його
                        }
                        queue.add(end);
                        end.setPredecessor(current);
                    }
                }
            }
            current.setVisited(true); // в цій вершині були, повертатись не потрібно
        }
    }

    public void showPath(Vertex end) {
        List<Vertex> vertexList = new ArrayList<>();
        while (end != null) {
            vertexList.add(end);
            end = end.getPredecessor();
        }
        Collections.reverse(vertexList);

        String result = "";
        int distance = 0;
        for (Vertex vertex : vertexList) {
            result += vertex.name + "("+vertex.getDistance()+") -> ";
            distance=vertex.getDistance();
        }
        System.out.println("Відстань між ("+vertexList.get(0)+") до ("+vertexList.get(vertexList.size()-1)+") = "+distance);
        System.out.println("Маршрут: ");
        System.out.println(result.substring(0, result.length() - 4));
    }
}
