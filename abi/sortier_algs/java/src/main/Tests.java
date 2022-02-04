package main;

public class Tests
{
    public static void print_status(String test, boolean cond)
    {
        System.out.printf("%-50s %s\n", test, cond ? "SUCCESS" : "FAILURE");
    }

    public static void test_int_bubblesort(int n, int min, int max)
    {
        int[] arr = Utils.generate_random_int_arr(n, min, max);
        Bubblesort.sort(arr);
        print_status("test_int_bubblesort", Utils.is_sorted(arr));
    }

    public static void test_string_bubblesort(int n, int string_length)
    {
        String[] arr = Utils.generate_random_string_arr(n, string_length);
        Bubblesort.sort(arr);
        print_status("test_string_bubblesort", Utils.is_sorted(arr));
    }
}
