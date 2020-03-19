package easy;

import java.util.ArrayList;
import java.util.List;

public class CodabilityQuestionSB3 {
    public static void main(String[] args) {
        String s = "SMS Messages are really short";
        int k = 12;
        System.out.println(solution(s,k));
    }
    public static int solution(String S, int K) {
        int count = 0;
        String sms = "";
        String[] sArray = S.split(" ");
        for(int i = 0; i < sArray.length; i++){
            int smsLength = sms.length();
            int msgLength = sArray[i].length();
            if(smsLength + msgLength <=K){
                sms+= sArray[i]+" ";
            } else {
                count++;
                sms = sArray[i]+" ";
            }
        }

        if(count == 0 ){
            return -1;
        }
        return count + 1;
    }
}
