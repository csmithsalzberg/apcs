// Team TomatoCale -- Caleb Smith-Salzberg
// APCS2 pd5
// HW04 -- Where In the Array Is Carmen San Numero? 
// 2017-02-04

/* Algorithm Description
This algorithm works by swapping the number on the current index with the number's "correct position".
If the number is already in the correct position, the next index is looked at. When a number to be
swapped is the same as the number at the number's "correct position", it means that number is the duplicate. 
Finally, the difference between expected total and actual total is added to the duplicate to determine the missing number.
We implemented a recursive approach, but an equivalent while loop would do the job.

Example for array {4,2,2,1}:
{4,3,4,1} 
{1,3,4,4} position 0 is swapped with 4 (the number 4 belongs in position 3)
{1,4,3,4} 1 is in the correct position, so position 1 is swapped with 2 (the number 3 belongs in position 2)
No more swaps occur!
The number 4 is not already in the correct position, so it "tries" to swap to move to the correct position...
but it runs into another 4!! So the duplicate is 4.
Then, since the expected total is 10, but the actual is 12, the missing number is 4+10-12= 2
*/

public class MissingNum{
    public static int two(int[] arr, int i){
            if ( (arr[arr[i]-1] == arr[i]) && (arr[i]-1 != i) ){ //make sure the number is the same, and it is not swapping with itself
                return arr[i]; //return the number once it matches a number: that is the duplicate
            }
            if (arr[i]-1 == i) //if it was to be swapped with itself
                return two(arr, i+1); //recurse with the next element
            else{
                //otherwise, swap and recurse with the new element that was swapped
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
                return two(arr, i); //the ith element is now a different number!
            }
    }
    public static int missing(int[] arr){
        int total = 0;
        int expected = (1+arr.length)*arr.length/2; //what the sum should be
        for (int i : arr)
            total+=i; //count the actual sum
        int doubler = two(arr,0); //find the double value, start with index one
        return doubler+expected-total; //the double element plus the difference between expected and actual is the missing number
    }
    public static void main(String args[]){
        //test cases
        int[] carmen = {2,1,2,4};
        System.out.println(missing(carmen));
        int[] TomatoCale={6,3,5,4,5,2};
        System.out.println(missing(TomatoCale));
        int[] peanutButter={4,1,4,3,2};
        System.out.println(missing(peanutButter));
        int[] boo = {5, 5, 2, 3, 1};
        System.out.println(missing(boo));
    }
}