package main;

public class BubbleSort
{
    public static void sort(int[] arr)
    {
        for (int i = 1; i < arr.length; ++i)
        {
            for (int j = 0; j < arr.length - i; ++j)
            {
                if (arr[j] > arr[j + 1])
                {
                    Utils.swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void sort(String[] arr)
    {
        for (int i = 1; i < arr.length; ++i)
        {
            for (int j = 0; j < arr.length - i; ++j)
            {
                if (arr[j].compareTo(arr[j + 1]) > 0)
                {
                    Utils.swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void sort_opt1(int[] arr)
    {
        for (int i = 1; i < arr.length; ++i)
        {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i; ++j)
            {
                if (arr[j] > arr[j + 1])
                {
                    Utils.swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void sort_opt1(String[] arr)
    {
        for (int i = 1; i < arr.length; ++i)
        {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i; ++j)
            {
                if (arr[j].compareTo(arr[j + 1]) > 0)
                {
                    Utils.swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void sort_opt2(int[] arr)
    {
        int i = arr.length - 1;
        boolean swapped = true;
        while (swapped)
        {
            swapped = false;
            int tmp_i = i;
            for (int j = 0; j < tmp_i; ++j)
            {
                if (arr[j] > arr[j + 1])
                {
                    Utils.swap(arr, j, j + 1);
                    swapped = true;
                    i = j;
                }
            }
        }
    }

    public static void sort_opt2(String[] arr)
    {
        int i = arr.length - 1;
        boolean swapped = true;
        while (swapped)
        {
            swapped = false;
            int tmp_i = i;
            for (int j = 0; j < tmp_i; ++j)
            {
                if (arr[j].compareTo(arr[j + 1]) > 0)
                {
                    Utils.swap(arr, j, j + 1);
                    swapped = true;
                    i = j;
                }
            }
        }
    }
}
