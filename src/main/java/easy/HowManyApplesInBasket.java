package easy;

import java.util.Arrays;

public class HowManyApplesInBasket {
    public static void main(String[] args){
        System.out.println(maxNumberOfApples(new int[] {2500,2500}));
    }
    public static int maxNumberOfApples(int[] arr) {
        Arrays.sort(arr);
        int weight = 0;
        int i;
        for(i =0; i<arr.length && weight<=5000; i++){
            if(arr[i] + weight>5000){
                break;
            }
            weight = weight + arr[i];
        }
        return i;
    }
}
