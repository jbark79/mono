import java.util.Random;

public class Main
{
    static void test_stack()
    {
        Stack s = new Stack();
        int len = 10;
        for (int i = 0; i < len; ++i)
            s.push(i);

        for (int i = 0; i < len; ++i)
        {
            System.out.println(s.top());
            s.pop();
        }
    }

    static void test_SortedList()
    {
        Random rand = new Random();

        SortedList l = new SortedList();
        for (int i = 0; i < 1000; i++)
            l.insert(rand.nextInt(100));

        l.show();
    }

    static void test_queue()
    {
        Queue q = new Queue();
        int len = 10;
        for (int i = 0; i < len; ++i)
            q.enqueue(i);

        for (int i = 0; i < len; ++i)
        {
            System.out.println(q.front());
            q.dequeue();
        }

        for (int i = 0; i < len; ++i)
            q.enqueue(i);

        for (int i = 0; i < len; ++i)
        {
            System.out.println(q.front());
            q.dequeue();
        }
        for (int i = 0; i < len; ++i)
        {
            System.out.println(q.front());
            q.dequeue();
        }
    }

    public static void main(String[] args)
    {
        test_SortedList();
        // test_stack();
        // test_queue();
    }
}
