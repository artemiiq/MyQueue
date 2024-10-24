public class Main {
    public static void main(String[] args) {
        MyQueue list = new MyQueue(3);

        list.add("Hello");
        list.add("World");
        list.add("GoIT courses");

        System.out.println("Розмір колекції: " + list.size());

        System.out.println("Перший елемент з черги: " + list.peek());

        System.out.println("Перший елемент з черги і видаляє його з колекції: " + list.poll());
        System.out.println("Розмір колекції: " + list.size());

        list.clear();

        System.out.println("Розмір колекції: " + list.size());
    }
}