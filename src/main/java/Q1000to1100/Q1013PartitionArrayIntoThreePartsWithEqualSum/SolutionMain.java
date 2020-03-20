package Q1000to1100.Q1013PartitionArrayIntoThreePartsWithEqualSum;

public class SolutionMain {
    public static void main(String[] args) {
        int[] A = {0,2,1,-6,6,-7,9,1,2,0,1}; //output true
        int[] B = {0,2,1,-6,6,7,9,-1,2,0,1}; //output false
        int[] C = {3,3,6,5,-2,2,5,1,-9,4}; //output true
        int[] D = {1,-1,1,-1}; //output false

        Solution solution = new Solution();

        System.out.println(solution.canThreePartsEqualSum(A));
        System.out.println(solution.canThreePartsEqualSum(B));
        System.out.println(solution.canThreePartsEqualSum(C));
        System.out.println(solution.canThreePartsEqualSum(D));

    }
}
