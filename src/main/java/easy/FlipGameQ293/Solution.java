package easy.FlipGameQ293;
/**
 * Input: s = "++++"
 * Output:
 * [
 *   "--++",
 *   "+--+",
 *   "++--"
 * ]
 *
 * Input: s = "+++++"
 * Output:
 * [
 *   "--+++",
 *   "+--++",
 *   "++--+"
 *   "+++--"
 * ]
 *
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> ret = new ArrayList<>();
        char[] chars = s.toCharArray();

        for(int i=0; i<chars.length-1; i++){
            if(chars[i]=='+' && chars[i+1]=='+'){
                chars[i] = '-';
                chars[i+1] = '-';
                ret.add(new String(chars));
                chars[i] = '+';
                chars[i+1] = '+';
            }
        }
        return ret;
    }
}