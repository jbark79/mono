public class Stack
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

    private Knoten tos;

    public Stack()
    {
        tos = null;
    }

    public boolean isEmpty()
    {
        return tos == null;
    }

    public void push(Object x)
    {
        Knoten n = new Knoten(x);
        n.next = tos;
        tos = n;
    }

    public void pop()
    {
        if (!isEmpty())
            tos = tos.next;
    }

    public Object top()
    {
        if (!isEmpty())
            return tos.wert;
        return null;
    }
}
