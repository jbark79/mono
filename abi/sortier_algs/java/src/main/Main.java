package main;

public class Main
{
    public static void main(String[] args)
    {
        int size = 100000;
        int string_len = 5;
        int min = -10000;
        int max = 10000;

        Tests.test_bubblesort_int(size, min, max);
        Tests.test_bubblesort_string(size, string_len);

        Tests.test_bubblesort_opt1_int(size, min, max);
        Tests.test_bubblesort_opt1_string(size, string_len);

        Tests.test_bubblesort_opt2_int(size, min, max);
        Tests.test_bubblesort_opt2_string(size, string_len);

        Tests.test_insertionsort_int(size, min, max);
        Tests.test_insertionsort_string(size, string_len);
    }
}
