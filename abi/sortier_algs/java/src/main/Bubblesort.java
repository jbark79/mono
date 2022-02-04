package main;

public class Bubblesort
{
    public static void sort(int[] arr)
    {
        for (int i=0; i<arr.length-1; ++i)
        {
            for (int j=i+1; j<arr.length; ++j)
            {
                if (arr[i] > arr[j])
                {
                    Utils.swap(arr,i,j);
                }
            }
        }
    }

    public static void sort(String[] arr)
    {
        for (int i=0; i<arr.length-1; ++i)
        {
            for (int j=i+1; j<arr.length; ++j)
            {
                if (arr[i].compareTo(arr[j]) > 0)
                {
                    Utils.swap(arr,i,j);
                }
            }
        }
    }
}
