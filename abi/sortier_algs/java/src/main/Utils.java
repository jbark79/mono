package main;

import java.util.Random;
import java.util.random.*;

public class Utils
{
    public static int abs(int n)
    {
        if (n < 0)
            return -n;
        return n;
    }

    // generate an array containing n values x_i
    // such that min <= x_i <= max
    public static int[] generate_random_int_arr(int n, int min, int max)
    {
        Random rng = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
        {
            arr[i] = rng.nextInt(abs(min) + abs(max) + 1) - abs(min);
        }
        return arr;
    }

    public static String[] generate_random_string_arr(int n, int length)
    {
        // String alphabet = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String alphabet = new String("abcdefghijklmnopqrstuvwxyz");
        Random rng = new Random();
        String[] arr = new String[n];
        for (int i = 0; i < n; ++i)
        {
            String tmp = new String();
            for (int j = 0; j < length; ++j)
            {
                tmp += alphabet.charAt(rng.nextInt(alphabet.length()));
            }
            arr[i] = tmp;
        }
        return arr;
    }

    public static void print_arr(int[] arr)
    {
        for (int i = 0; i < arr.length; ++i)
        {
            System.out.println(arr[i]);
        }
    }

    public static void print_arr(String[] arr)
    {
        for (int i = 0; i < arr.length; ++i)
        {
            System.out.println(arr[i]);
        }
    }

    public static boolean is_sorted(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; ++i)
        {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static boolean is_sorted(String[] arr)
    {
        for (int i = 0; i < arr.length - 1; ++i)
        {
            if (arr[i].compareTo(arr[i + 1]) > 0)
                return false;
        }
        return true;
    }

    public static void swap(int[] arr, int l, int r)
    {
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }

    public static void swap(String[] arr, int l, int r)
    {
        String tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }
}
