package sort;
/**
 * Name: Humna Sultan
 * Program Name: Sorting/Searching Project
 * Date: 2 February 2021
 * Extra: not required
 */
public class sort {
    public static void main (String[] args)
    {
        int[] a = {2,6,3,9,5,4,8,7,0,13,-3,1};
        //array to sort
        SelectionSort(a);
        //calls selection sort program

        System.out.println("--- Selection Sort ---");
        for (int i = 0; i < 12; i++)
        {
            System.out.println(a[i]);
        }
        //prints array
        int[] b = {2,6,3,9,5,4,8,7,0,13,-3,1};
        //array to sort
        sort(b, 0, b.length - 1);
        //calls sort method - sort calls merge sort
        System.out.println("--- Merge Sort ---");
        for (int i = 0; i < 12; i++)
        {
            System.out.println(b[i]);

        }
        //prints array

        System.out.println("--- Sorted A Before Linear Search ---");
        SelectionSort2(a);
        //sorts array before search
        for (int i = 0; i < 12; i++)
        {
            System.out.println(a[i]);
        }
        //prints array before search
        System.out.println("--- Linear Search Results ---");
        System.out.println("Key: 7");
        System.out.println(linear(a, 7));
        //prints result of search
        System.out.println("--- Sorted B Before Binary Search ---");
        SelectionSort2(b);
        //sorts array before search
        for (int i = 0; i < 12; i++)
        {
            System.out.println(b[i]);
        }
        //prints array before search
        System.out.println("--- Binary Search Results ---");
        System.out.println("Key: 7");
        System.out.println(binarySearch(b, 7));
        //prints result of search
    }
    /**
     method that performs selection sort (descending)
     @param - array to sort
     */
    public static void SelectionSort ( int [ ] num )
    {
        int i, j, first, temp;
        for ( i = num.length - 1; i > 0; i--)

        {
            first = 0;
            for(j = 1; j <= i; j ++)
            {
                if( num[ j ] < num[ first ] )
                    first = j;
            }
            temp = num[ first ];
            num[ first ] = num[ i ];
            num[ i ] = temp;
        }
    }
    /**
     method that performs selection sort (ascending)
     @param - array to sort
     */
    public static void SelectionSort2 ( int [ ] num )
    {
        int i, j, first, temp;
        for ( i = num.length - 1; i > 0; i--)
        {
            first = 0;
            for(j = 1; j <= i; j ++)
            {
                if( num[ j ] > num[ first ] )
                    first = j;
            }
            temp = num[ first ];
            num[ first ] = num[ i ];
            num[ i ] = temp;
        }
    }
    /**
     method that performs merge sort (descending)
     @param - array to sort, first place, middle place, last place
     */
    public static void merge( int [ ] arr, int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    /**

     method that calls merge sort method for sorting of array
     @param - array to sort, first place, last place
     */
    public static void sort(int arr[],int l,int r)
    {
        if (l < r) {
            int m = (l + r) / 2;
        //middle point
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    /**
     method that performs linear search
     @param - array to sort, key value
     */
    public static int linear(int [ ] numbers, int key)
    {
        for (int index = 0; index < numbers.length; index++)
        {
            if ( numbers[index] == key )
                return index; //We found it!!!
        }
        return -1;
    }
    /**
     method that performs binary search
     @param - array to sort, key value
     */
    public static int binarySearch(int[] arr, int element)
    {
        int low = 0;
        int high = arr.length -1;
        while (low <= high)

        {
            int mid = (low + high) / 2;
            int diff = arr[mid] - element;
            if (diff == 0)
                return mid;
            else if (diff < 0)
                low = mid + 1;
            else
                high = mid -1;

        }
        return -1;
    }
}