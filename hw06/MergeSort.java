// Caleb Smith-Salzberg
// APCS2 pd5
// HW06 -- Step 1: Split, Step 2: ?, Step 3: Sorted
// 2017-02-12

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 

    The merge sort algorithm is a divide-and-conquer method utilizing
    recursion to sort an array in log linear time. If the array length is one,
    then it is already sorted, so it is added to the merging block. Otherwise, the
    array is split in half, and the halves are sorted, and then merged using the rsiu 
    methodology. Once the recursion is complete, there will be multiple nested merge 
    calls, so it is merging many merges, with the simplest being merging two sorted arrays of
    length one.
  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	int[] added = new int[a.length+b.length]; //create an array big enough to fit both
	int c=0;
	int d=0;
    //implement rsiu algorithm for merging
	while (c<a.length && d<b.length){
	    if (a[c]<=b[d]){
		    added[c+d]=a[c];
		    c+=1;
		}
	    else{
		added[c+d]=b[d];
		d+=1;
	    }
	}
    //once one aray is empty, add the rest of the other array
	if (c==a.length){
	    while (d<b.length){
		added[c+d]=b[d];
		d+=1;
	    }
	}
	else {
	    while(c<a.length){
		added[c+d]=a[c];
		c+=1;
	    }
	}
	return added;
    }

    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	if (arr.length==1){//base case
        return arr;
    }
    else {
        //split the array in half
        int[] left = new int[arr.length/2];
        int[] right = new int[(arr.length+1)/2]; //THE PLUS ONE IS KEY
        for (int i=0; i<left.length; i++){
            left[i]=arr[i];
        }
        for (int j=0; j<right.length; j++){
            right[j]=arr[arr.length/2 + j];
        }
        //merge the sorted left and right parts of the array
        return merge(sort(left),sort(right));
    }                         
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {

	//~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

       	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );
    }//end main()

}//end class MergeSort


