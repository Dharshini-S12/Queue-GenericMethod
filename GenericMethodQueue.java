package prob1;
import java.util.*;
class GenericQueue<T>{
	int front;
	int rear;
	int size = 10;
	Object Queue[];

	public GenericQueue() {
		super();
		this.Queue = new Object[size];
		this.front = -1;
		this.rear = -1;
	}
	public void enQueue(T data) {
		if (isFull()) {
			System.out.println("Queue is Full");
		} else {
			if (front == -1) {
				front = 0;
			}
			rear++;
			Queue[rear] = data;
		}
	}
	public Object deQueue() {
		Object element;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			element = Queue[front];
			if (front >= rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
			return (element);
		}
	}
	void display() {
	    int i;
	    if (isEmpty()) {
	      System.out.println("Empty Queue");
	    }
	    else {
	      for (i = front; i <= rear; i++)
	        System.out.print(Queue[i] + " ");
	    }
	    System.out.println();
	  }
	public boolean isEmpty() {
		if (front == -1) {
			return true;
		} else {
			return false;
		}
	}
	public boolean isFull() {
		if (front == 0 && rear ==size-1) {
			return true;
		} else {
			return false;
		}
	}
}
public class GenericMethodQueue {
	public static void main(String[] args) {
		GenericQueue q=new GenericQueue();
		q.enQueue(10);
		q.enQueue(20);
		q.deQueue();
		q.display();
		GenericQueue q1=new GenericQueue();
		q1.enQueue("A");
		q1.enQueue("B");
		q1.display();
	}

}
