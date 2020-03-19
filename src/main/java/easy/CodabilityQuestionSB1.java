package easy;

public class CodabilityQuestionSB1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,-2,0,-5}));
    }
    public static int solution(int[] A) {
        int total = 1;
        for(int i = 0; i<A.length; i++){
            total *= A[i];
        }
        if(total>0){
            return 1;
        } else if (total<0){
            return -1;
        }
        return 0;
    }
}
