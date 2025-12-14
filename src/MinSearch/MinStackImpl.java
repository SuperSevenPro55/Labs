package MinSearch;

public class MinStackImpl implements MinStack<Integer>{
    @Override
    public void push(Integer data) { // Положить число в стек
        if (head == null) {
            head = new Node(data, data, null);
        }
        else {
            int newMin = Math.min(data, head.min);
            head = new Node(data, newMin, head);
        }
    }

    @Override
    public Integer pop() {          // Убрать последний элемент в стеке
        // TODO
        return null;
    }

    @Override
    public Integer top() {          // Выдать последний элемент в стеке
        // TODO
        return null;
    }

    @Override
    public Integer min() {          // Выдать текущий минимум в стеке
        // TODO
        return null;
    }

    private Node head;              // Голова списка (для выполнения за O(1))

    private static class Node {     // Описание узла
        final int data;
        final int min;
        final Node next;

        Node(int data, int min, Node next) {
            this.data = data;
            this.min = min;
            this.next = next;
        }
    }
}
