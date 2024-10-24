public class MyQueue {
    private Object[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    // Конструктор для ініціалізації черги
    public MyQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Метод додавання елемента в чергу
    public void add(Object value) {
        if (size == capacity) {
            throw new IllegalStateException("Черга переповнена");
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    // Метод очищає колекцію
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }

    // Метод повертає розмір колекції
    public int size() {
        return size;
    }

    // Метод повертає перший елемент з черги
    public Object peek() {
        if (size == 0) {
            throw new IllegalStateException("Черга порожня");
        }
        return queue[front];
    }

    // Метод повертає перший елемент з черги і видаляє його з колекції
    public Object poll() {
        if (size == 0) {
            throw new IllegalStateException("Черга порожня");
        }

        Object result = queue[front];
        front = (front + 1) % capacity;
        size--;
        return result;
    }
}
