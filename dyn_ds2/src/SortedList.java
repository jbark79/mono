public class SortedList
{
    class IntNode
    {
        int value;
        IntNode next;

        IntNode(int val, IntNode next)
        {
            value = val;
            this.next = next;
        }
    }

    IntNode first, last;

    public SortedList()
    {
        first = last = null;
    }

    public void insert(int x)
    {
        IntNode neu = new IntNode(x, null);
        // Liste noch leer?
        if (empty())
        {
            first = neu;
            last = neu;
        }

        // eventuell vorne einfuegen?
        else if (x < first.value)
        {
            neu.next = first;
            first = neu;
        }

        // oder hinten anhaengen?
        else if (x >= last.value)
        {
            last.next = neu;
            last = neu;
        }

        // oder mitten drin einfuegen
        else
        {
            IntNode pos = first;
            while (pos.next.value < x)
                pos = pos.next;
            neu.next = pos.next;
            pos.next = neu;
        }
    }

    public boolean empty()
    {
        return first == null;
    }

    public void show()
    {
        IntNode pos = first;
        while (pos != null)
        {
            System.out.println(pos.value);
            pos = pos.next;
        }
    }
}
