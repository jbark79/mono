public class Main
{
    static void test_stack()
    {
        Stack s = new Stack();

        for (int i=0; i<5; ++i)
            s.push(i);

        for (int i=0; i<5; ++i)
        {
            System.out.println(s.top());
            s.pop();
        }
    }

    static void test_queue()
    {
        Queue q = new Queue();

        for (int i=0; i<5; ++i)
            q.enqueue(i);

        for (int i=0; i<5; ++i)
        {
            System.out.println(q.front());
            q.dequeue();
        }

        q.enqueue(null);
        q.enqueue(null);
        q.enqueue(null);

        q.dequeue();
        q.enqueue(5);
        System.out.println(q.front());
        q.dequeue();
        System.out.println(q.front());
    }

    static void put(Object o)
    {
        System.out.println(o);
    }

    static void test_dllist()
    {
        DoublyLinkedList l = new DoublyLinkedList();
        l.append(5);
        l.append(7);
        l.toFirst();
        l.toLast();
        l.insert(6);

        l.toFirst();
        l.remove();
        l.remove();
        l.remove();
        l.print();

        l.insert(5);
        l.insert(5);
        //l.print(); // 5
        l.append(6);


        DoublyLinkedList l2 = new DoublyLinkedList();
        l2.append(7);
        l2.append(8);

        l.concat(l2);
        l.print();

        l.toLast();
        put(l.getObject());
        l.toFirst();
        l.next();
        l.next();
        l.insert(12);
        l.insert(12);
        l.insert(12);
        l.print();
        put(l.getObject());
    }

    static void test_list()
    {
        List l = new List();
        l.append(5);
        l.append(7);
        l.toFirst();
        l.toLast();
        l.insert(6);

        l.toFirst();
        l.remove();
        l.remove();
        l.remove();
        l.print();

        l.insert(5);
        l.insert(5);
        //l.print(); // 5
        l.append(6);


        List l2 = new List();
        l2.append(7);
        l2.append(8);

        l.concat(l2);
        l.print();

        l.toLast();
        put(l.getObject());
        l.toFirst();
        l.next();
        l.next();
        l.insert(12);
        l.insert(12);
        l.insert(12);
        l.print();
        put(l.getObject());
    }

    public static void main(String[] args)
    {
        test_list();
    }
}
