public class Queue
{
    public class Knoten
    {
        Object wert;
        Knoten next;

        public Knoten(Object w)
        {
            wert = w;
            next = null;
        }
    }

    private Knoten front;
    private Knoten back;

    public Queue()
    {
        front = null;
        back = null;
    }

    public boolean isEmpty()
    {
        return front == null;
    }

    public void enqueue(Object x)
    {
        Knoten n = new Knoten(x);
        if (front == null)
        {
            back = n;
            front = n;
        }
        back.next = n;
        back = n;
    }

    public void dequeue()
    {
        if (!isEmpty())
            front = front.next;
    }

    public Object front()
    {
        if (!isEmpty())
            return front.wert;
        return null;
    }
}
