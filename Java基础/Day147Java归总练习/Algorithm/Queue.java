/*
package Day0619.graphTraverser;


import Day0619.trainNetwork.Vertex;

public class Queue {

    public LinkedList queue;
    public int size;

    public Queue() {
        this.queue = new LinkedList();
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(Vertex data) {
        this.queue.addToTail(data);
        this.size++;
    }

    public Vertex peek() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.queue.head.data;
        }
    }

    public Vertex dequeue() {
        if (!this.isEmpty()) {
            Vertex data = this.queue.removeHead();
            this.size--;
            return data;
        } else {
            throw new Error("LinearDataStructures.Queues.Queue is empty!");
        }
    }

}

 */
