package easy;

import java.util.TreeSet;

public class CodabilityQuestionSB2 {
    public static void main(String[] args) {
        System.out.println(solution("WeTestCodErs"));
    }
    public static String solution(String S) {
        TreeSet<String> alphaSet=new TreeSet<String>();
        String[] arrStr = S.split("");

        for(String s: arrStr){
            if(s.toUpperCase().equals(s)){
                //s is uppercase
                if(S.indexOf(s.toLowerCase())!=-1){
                    alphaSet.add(s.toUpperCase());
                }
            } else if (s.toLowerCase().equals(s)){
                //s is lowercase
                if(S.indexOf(s.toUpperCase())!=-1){
                    alphaSet.add(s.toUpperCase());
                }
            }
        }

        if(alphaSet.size()==0){
            return "NO";
        }
        return alphaSet.last();
    }
}
