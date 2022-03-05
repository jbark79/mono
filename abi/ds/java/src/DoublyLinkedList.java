public class DoublyLinkedList
{
    class Node
    {
        Node(Object pobject, Node prev, Node next)
        {
            this.val = pobject;
            this.prev = prev;
            this.next = next;
        }
        Object val;
        Node prev;
        Node next;
    }

    DoublyLinkedList()
    {
        cur = null;
        last = null;
        first = null;
    }

    boolean isEmpty()
    {
        return first == null;
    }

    boolean hasAccess()
    {
        return cur != null;
    }

    void next()
    {
        if (isEmpty() || !hasAccess())
        {
            return;
        }
        if (cur == last)
        {
            cur = null;
            return;
        }
        cur = cur.next;
    }

    void toFirst()
    {
        if (!isEmpty())
        {
            cur = first;
        }
    }

    void toLast()
    {
        if (!isEmpty())
        {
            cur = last;
        }
    }

    Object getObject()
    {
        if (hasAccess())
            return cur.val;
        return null;
    }

    void setObject(Object pobject)
    {
        if (!hasAccess() || pobject == null)
            return;
        cur.val = pobject;
    }

    void append(Object pObject)
    {
        if (pObject == null)
            return;

        if (isEmpty())
        {
            first = new Node(pObject, null, null);
            last = first;
            return;
        }

        Node tmp = new Node(pObject, last, null);
        last.next = tmp;
        last = tmp;
    }

    void insert(Object pObject)
    {
        if (pObject == null)
            return;

        if (!hasAccess())
        {
            if (isEmpty())
                append(pObject);
            return;
        }

        if (cur == first)
        {
            Node tmp = new Node(pObject, null, cur);
            cur.prev = tmp;
            first = tmp;
        }
        else
        {
            Node tmp = new Node(pObject, cur.prev, cur);
            cur.prev.next = tmp;
            cur.prev = tmp;
        }
    }

    void concat(DoublyLinkedList pList)
    {
        if (pList == null || pList.isEmpty())
            return;

        pList.first.prev = last;
        last.next = pList.first;

        pList.first = first;
        last = pList.last;
    }

    void remove()
    {
        if (isEmpty() || !hasAccess())
            return;

        if (first == last && cur == first)
        {
            first = null;
            last = null;
            cur = null;
        }
        else if (cur == last)
        {
            last = last.prev;
            last.next = null;
            cur = null;
        }
        else if (cur == first)
        {
            first = first.next; 
            first.prev = null;
            cur = first;
        }
        else
        {
            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
            cur = cur.next;
        }
    }

    void print()
    {
        if (isEmpty())
            return;

        Node tmp = first;
        while (tmp != null)
        {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }

    private Node cur;
    private Node last;
    private Node first;
}
