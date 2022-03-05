public class Queue
{
    class Node
    {
        Node(Object val, Node next)
        {
            this.val = val;
            this.next = next;
        }

        Object val;
        Node next;
    }

    Queue()
    {
        front = null;
        back = null;
    }

    boolean isEmpty()
    {
        return front == null;
    }

    void enqueue(Object pobject)
    {
        if (pobject == null)
            return;

        if (isEmpty())
        {
            front = new Node(pobject, null);
            back = front;
        }
        else
        {
            Node tmp = new Node(pobject, null);
            back.next = tmp;
            back = tmp;
        }
    }

    void dequeue()
    {
        if (!isEmpty())
        {
            front = front.next;
        }
    }

    Object front()
    {
        if (isEmpty())
            return null;
        return front.val;
    }

    Node front;
    Node back;
}
