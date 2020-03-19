package easy;

import java.nio.CharBuffer;
import java.util.stream.IntStream;

public class StudentAttendanceRecordIStreamSolution {
    public static void main(String[] args){
        System.out.println(checkRecord("PPALLPLLLAPLA"));
    }
    public static boolean checkRecord(String s) {
        char[] chars = s.toCharArray();
        IntStream charStream = CharBuffer.wrap(chars).chars();
        if(charStream.filter(value -> value== 'A').count()>=2){
            return false;
        }
        if(s.indexOf("LLL")!=-1){
            return false;
        }
        return true;
    }
}

