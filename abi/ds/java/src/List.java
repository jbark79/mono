public class List
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

    List()
    {
        cur = first = last = null;
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
        if (!hasAccess() || isEmpty() || cur == last)
        {
            return;
        }
        cur = cur.next;
    }

    void toFirst()
    {
        cur = first;
    }

    void toLast()
    {
        cur = last;
    }

    Object getObject()
    {
        if (hasAccess())
            return cur.val;
        return null;
    }

    void setObject(Object pObject)
    {
        if (!hasAccess() || pObject == null)
            return;
        cur.val = pObject;
    }

    void append(Object pObject)
    {
        if (pObject == null)
            return;

        Node tmp = new Node(pObject, null);
        if (isEmpty())
        {
            first = last = tmp;
        }
        else
        {
            last.next = tmp;
            last = last.next;
        }
    }

    void insert(Object pObject)
    {
        if (!hasAccess())
        {
            if (isEmpty())
                append(pObject);
            return;
        }

        Node tmp = first;
        while (tmp.next != cur)
            tmp = tmp.next;

        Node newElem = new Node(pObject, cur);
        tmp.next = newElem;
    }

    void concat(List pList)
    {
        if (pList == null || pList.isEmpty())
            return;

        last.next = pList.first;
        last = pList.last;
        pList = null;
    }

    void remove()
    {
        if (!hasAccess())
            return;

        if (first == last && first == cur)
        {
            first = last = cur = null;
        }
        else if (cur == first)
        {
            first = first.next;
            cur = first;
        }
        else if (cur == last)
        {
            Node tmp = first;
            while (tmp.next != cur)
            {
                tmp = tmp.next;
            }
            tmp.next = cur.next;
            cur = cur.next;
        }
    }

    void print()
    {
        Node tmp = first;
        while (tmp != null)
        {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }


    private Node cur;
    private Node first;
    private Node last;
}
