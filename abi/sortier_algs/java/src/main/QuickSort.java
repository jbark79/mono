package main;

public class QuickSort
{
    // pivot right
    public static void sort(int[] arr)
    {
        sort_impl(arr, 0, arr.length-1, arr.length-1);
    }

    // pivot right
    public static void sort_implg1(int[] arr, int l, int r, int p)
    {
        if (l >= r)
            return;
        
        // to be done in linearly
        // move all elements less than or equal to p left of p
        // move all elements bigger than p right of p
        // notice that p is then in position
        // recursively call for 0..p-1 and p+1..N

        int pivot = arr[p];

        int[] low = new int[r-l+1];
        int[] hi = new int[r-l+1];
        int clow=0;
        int chi=0;

        for (int i=l; i<=r; ++i)
        {
            if (arr[i] <= pivot)
            {
                low[clow++] = arr[i];
            }
            else
            {
                hi[chi++] = arr[i];
            }
        }
        for (int i=0; i<clow; ++i)
            arr[l+i] = low[i];
        for (int i=0; i<chi; ++i)
            arr[l+clow+i] = hi[i];

        sort_implg1(arr, l, l+clow-2,l+clow-2);
        sort_implg1(arr, l+clow, r, r);
    }

    public static void sort_impl(int[] arr, int l, int r, int p)
    {
        if (l >= r)
            return;

        int pivot = arr[p];
        int left=l;
        int right=p-1;
        for (;;)
        {
            while (left <= right && arr[left] <= pivot) ++left;
            while (right >= left && arr[right] > pivot) --right;
            if (left >= right) break;
            Utils.swap(arr,left,right);
        }
        Utils.swap(arr, p, left);
        p = left;

        sort_impl(arr, l, p-1,p-1);
        sort_impl(arr, p+1, r, r);
    }


    // pivot right
    public static void sort(String[] arr)
    {
        sort_impl(arr, 0, arr.length-1, arr.length-1);
    }

    public static void sort_impl(String[] arr, int l, int r, int p)
    {
        if (l >= r)
            return;

        String pivot = arr[p];
        int left=l;
        int right=p-1;
        for (;;)
        {
            while (left <= right && arr[left].compareTo(pivot)<=0) ++left;
            while (right >= left && arr[right].compareTo(pivot)>0) --right;
            if (left >= right) break;
            Utils.swap(arr,left,right);
        }
        Utils.swap(arr, p, left);
        p = left;

        sort_impl(arr, l, p-1,p-1);
        sort_impl(arr, p+1, r, r);
    }
}
