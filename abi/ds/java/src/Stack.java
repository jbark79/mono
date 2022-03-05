public class Stack
{
    class Node
    {
        Node(Object val, Node prev)
        {
            this.val = val;
            this.prev = prev;
        }

        Object val;
        Node prev;
    }

    Stack()
    {
        top = null;
    }

    boolean isEmpty()
    {
        return top == null;
    }

    void push(Object pobject)
    {
        if (pobject == null)
            return;

        if (isEmpty())
            top = new Node(pobject, null);
        else
        {
            Node tmp = new Node(pobject, top);
            top = tmp;
        }
    }

    void pop()
    {
        if (isEmpty())
            return;

        top = top.prev;
    }

    Object top()
    {
        if (isEmpty())
            return null;
        return top.val;
    }

    Node top;
}
