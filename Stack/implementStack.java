class Stack {
	int[] stack;
	int top, capacity, currentSize;
	public Stack (int capacity) {
		this.capacity = capacity;
		top = -1;
		currentSize = 0;
		stack = new int[this.capacity];
	}

	public boolean isEmpty() {
		return currentSize == 0;
	}
	
	public int size() {
		return currentSize;
	}
	
	public int top() {
		if(top < 0) {
			return -1;
		}
		return stack[top];
	}
	
	public void push(int element) {
		if(top >= capacity - 1) {
			return;
		}
		stack[++top] = element;
		currentSize++;
	}
	
	public void pop() {
		if(top < 0) {
			return;
		}
		top--;
		currentSize--;
	}
}