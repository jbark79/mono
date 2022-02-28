package main;

import java.util.Random;
import java.util.random.*;
import java.util.TreeMap;

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

    public static boolean is_sorted_and_permutated(int[] arr, int[] cp)
    {
        var map = new TreeMap<Integer,Integer>();
        for (int i : arr)
        {
            if (map.containsKey(i))
            {
                map.put(i, map.get(i)+1);
            }
            else
            {
                map.put(i, 1);
            }
        }
        var map2 = new TreeMap<Integer,Integer>();
        for (int i : cp)
        {
            if (map2.containsKey(i))
            {
                map2.put(i, map2.get(i)+1);
            }
            else
            {
                map2.put(i, 1);
            }
        }
        for (var e : map.keySet())
        {
            if (map.get(e) != map2.getOrDefault(e,0))
            {
                return false;
            }
        }
        for (var e : map2.keySet())
        {
            if (map2.get(e) != map.getOrDefault(e,0))
            {
                return false;
            }
        }
        for (int i = 0; i < arr.length - 1; ++i)
        {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static boolean is_sorted_and_permutated(String[] arr, String[] cp)
    {
        var map = new TreeMap<String,Integer>();
        for (var i : arr)
        {
            if (map.containsKey(i))
            {
                map.put(i, map.get(i)+1);
            }
            else
            {
                map.put(i, 1);
            }
        }
        var map2 = new TreeMap<String,Integer>();
        for (var i : cp)
        {
            if (map2.containsKey(i))
            {
                map2.put(i, map2.get(i)+1);
            }
            else
            {
                map2.put(i, 1);
            }
        }
        for (var e : map.entrySet())
        {
            if (map.get(e.getKey()) != map2.getOrDefault(e.getKey(),0))
            {
                return false;
            }
        }
        for (var e : map2.entrySet())
        {
            if (map2.get(e.getKey()) != map.getOrDefault(e.getKey(),0))
            {
                return false;
            }
        }

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
