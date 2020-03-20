package Q1000to1100.Q1013PartitionArrayIntoThreePartsWithEqualSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer,Integer> map = new HashMap<>();
    public boolean canThreePartsEqualSum(int[] A) {
        //Linear Time O(n) solution, as inputs increase the time increases linearly.
        // first sum all values and divide it by 3, the remainder should be 0.
        // Division will also give us what the equal sum value is, this will be our target.
        // we will then iterate the first part until we reach our target value, then the second part and finally the third part.

        int sumA = Arrays.stream(A).sum();
        if(sumA % 3 !=0){
            return false; //should have no remainders.
        }
        int target = sumA/3; //the value that the 3 parts should equal
        int part1 = 0;
        int part2 = 0;
        int part3 = 0;

        for(int a = 0; a<A.length; a++){
            part1=part1+A[a];
            if(part1==target){
                for(int b=a+1; b<A.length; b++){
                    part2=part2+A[b];
                    if(part2==target){
                        for(int c=a+1; c<A.length; c++){
                            part3=part3+A[c];
                            //check that iterators a and b do not equal the length of the array if they do,
                            // then this mean that the pointer did not segment the array in 3.
                            if(part3==target && a!=A.length-1 && b!=A.length-1 ){
                                return true;
                            }
                        }
                        return false;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public boolean Approach1CanThreePartsEqualSum(int[] A) {
        //Quadratic Time (O(n^2)) this approach was not good because the time to run increases quadratically when the inputs increase
        //this approach was setting pointers on the first 2 elements and then iterating over the remaining elements.
        int val1=0;
        int val2=0;
        int val3=0;

        for(int i = 0; i<A.length; i++){
            val1=val1+A[i];
            for(int b = i+1; b<A.length; b++){
                val2=val2+A[b];
                for(int c = b+1; c<A.length; c++){
                    val3=val3+A[c];
                }
                if(val1==val2 && val2==val3 && i!=A.length-1 && b!=A.length-1) {
                    return true;
                }
                    val3=0;
            }
            val2=0;
        }
        return false;
    }
}
