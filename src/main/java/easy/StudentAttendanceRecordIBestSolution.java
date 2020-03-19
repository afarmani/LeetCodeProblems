package easy;


public class StudentAttendanceRecordIBestSolution {
    public static void main(String[] args){
        //should the student be rewarded true or false ?
        System.out.println(checkRecord("PPALLPLL"));
    }
    public static boolean checkRecord(String s) {
        int countA = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='A'){
                countA++;
            }
        }
        return countA<=1 && s.indexOf("LLL")==-1;
    }
}
