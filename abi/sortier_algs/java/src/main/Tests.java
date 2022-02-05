package main;

public class Tests
{
    public static void print_status(String test, boolean cond)
    {
        System.out.printf("%-50s %s\n", test, cond ? "SUCCESS" : "FAILURE");
    }

    public static void test_bubblesort_int(int n, int min, int max)
    {
        int[] arr = Utils.generate_random_int_arr(n, min, max);
        BubbleSort.sort(arr);
        print_status("test_bubblesort_int", Utils.is_sorted(arr));
    }

    public static void test_bubblesort_string(int n, int string_length)
    {
        String[] arr = Utils.generate_random_string_arr(n, string_length);
        BubbleSort.sort(arr);
        print_status("test_bubblesort_string", Utils.is_sorted(arr));
    }

    public static void test_bubblesort_opt1_int(int n, int min, int max)
    {
        int[] arr = Utils.generate_random_int_arr(n, min, max);
        BubbleSort.sort_opt1(arr);
        print_status("test_bubblesort_opt1_int", Utils.is_sorted(arr));
    }

    public static void test_bubblesort_opt1_string(int n, int string_length)
    {
        String[] arr = Utils.generate_random_string_arr(n, string_length);
        BubbleSort.sort_opt1(arr);
        print_status("test_bubblesort_opt1_string", Utils.is_sorted(arr));
    }

    public static void test_bubblesort_opt2_int(int n, int min, int max)
    {
        int[] arr = Utils.generate_random_int_arr(n, min, max);
        BubbleSort.sort_opt2(arr);
        print_status("test_bubblesort_opt2_int", Utils.is_sorted(arr));
    }

    public static void test_bubblesort_opt2_string(int n, int string_length)
    {
        String[] arr = Utils.generate_random_string_arr(n, string_length);
        BubbleSort.sort_opt2(arr);
        print_status("test_bubblesort_opt2_string", Utils.is_sorted(arr));
    }

    public static void test_insertionsort_int(int n, int min, int max)
    {
        int[] arr = Utils.generate_random_int_arr(n, min, max);
        InsertionSort.sort(arr);
        print_status("test_insertionsort_int", Utils.is_sorted(arr));
    }

    public static void test_insertionsort_string(int n, int string_length)
    {
        String[] arr = Utils.generate_random_string_arr(n, string_length);
        InsertionSort.sort(arr);
        print_status("test_insertionsort_string", Utils.is_sorted(arr));
    }
}
