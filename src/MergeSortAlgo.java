/**
 * The MergeSortAlgo program is used to demonstrate mergesort
 *
 * @author Edward Kang
 * @version 1.0
 * @since 2019-04-20
 */


public class MergeSortAlgo {

    /*Preconditions: int[]A, indices int p, q, r.
     L=A[p...q] (left)is sorted. R=A[q...r] (right)is sorted
     This method merges the two sorted arrays together.

     */
    public static void merge (int[]A, int p, int q, int r) //My own java implementation of the psuedocode from Introduction to Algorithms, Third Edition 3rd The MIT Press ©2009
    {
        int n = q-p+1;
        int n2 = r-q;
        int[]L = new int[n+1];
        int[]R = new int[n2+1];
        for (int i =1; i<=n; i++)
        {
            L[i-1]= A[p+i-1];
        }
        for (int j =1; j<=n2; j++)
        {
            R[j-1]= A[q+j];
        }
        //Sentinel Values pseudo-infinity
        L[n]= Integer.MAX_VALUE;
        R[n] = Integer.MAX_VALUE;
        int i =0;
        int j =0;
        for (int k =p; k<=r; k++)
        {
            if(L[i]<=R[j])
            {
                A[k]=L[i];
                i++;
            }
            else
            {
                A[k]=R[j];
                j++;
            }

        }

    }
    public static void sort(int[]A, int p, int r)//My own java implementation of the psuedocode from Introduction to Algorithms, Third Edition 3rd The MIT Press ©2009
    {
        if(p<r)
        {
            int q=(int)Math.floor((p+r)/2);
            sort(A, p, q);
            sort(A, q+1, r);
            merge(A, p, q, r);
        }
    }
    public static void main(String[]args)
    {
        int[]test = {0,2,3,23,-3,32,4,5};
        sort(test,0,test.length-1);
        for (int i =0; i<test.length; i++)
        {
            System.out.print(test[i]+" ");
        }

    }

}

