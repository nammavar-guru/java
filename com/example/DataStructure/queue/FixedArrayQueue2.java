package com.example.DataStructure.queue;

public class FixedArrayQueue2 {
	private static final int CAPACITY = 16;
	
	int queueArray[];
	int front = 0;
	int rear = 0;
	int currentSize=0;
	int capacity;
	
	public FixedArrayQueue2() {
		this(CAPACITY);
	}
	
public FixedArrayQueue2(int size) {
		this.capacity = size;
		queueArray =  new int[size];
	}

public void enqueue(int data) {
	if(isQueueFull()) {
		System.out.println("faq is FULL");
	}else {
		rear++;
		if(rear == capacity){
            rear = 0;
        }
		
		queueArray[rear] = data;
		currentSize++;
		System.out.println("Enqueued the data :"+queueArray[rear]);
	}
}

public void dequeue() {
	if(isQueueEmpty())
		System.out.println("faq is EMPTY");
	else {
		front++;
		int deletedValue = queueArray[front];
		if(front == capacity ) {
			front =0;	
		}
		System.out.println("Dequeued the data :"+deletedValue);
		currentSize--;
			
	}
}
public boolean isQueueFull() {
	boolean status = false;
	if(currentSize == CAPACITY)
		status = true;
	return status;
}

public boolean isQueueEmpty() {
	boolean status = false;
	if (currentSize == 0)	
		status = true;
	return status;
}


public int size() {
	return currentSize;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedArrayQueue2 faq = new FixedArrayQueue2();
		/*
		 * faq.enqueue(20); faq.enqueue(40); faq.enqueue(60);
		 * 
		 * faq.dequeue(); faq.dequeue(); faq.dequeue(); faq.dequeue();
		 * 
		 * faq.enqueue(10); faq.enqueue(15); faq.enqueue(20); faq.enqueue(25);
		 * faq.enqueue(30);
		 * 
		 * faq.dequeue(); faq.dequeue(); faq.dequeue(); faq.dequeue();
		 */
		
		faq.enqueue(4);
		faq.dequeue();
		faq.enqueue(56);
        faq.enqueue(2);
        faq.enqueue(67);
        faq.dequeue();
        faq.dequeue();
        faq.enqueue(24);
        faq.dequeue();
        faq.enqueue(98);
        faq.enqueue(45);
        faq.enqueue(23);
        faq.enqueue(435);
	}

}
