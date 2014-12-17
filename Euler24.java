/*
A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:

012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
*/


public class euler24 {
    
    public static void main(String[] args) {       
 
        String a = "0123456789";
 
        for (int y = 0; y < 999999; y++) {
 
            int largestIndexK = -1; 
            int largestIndexL = 0;
            char[] b = a.toCharArray(); 
 
            for (int k = 0; k < a.length() - 1; k++) {
                if (a.charAt(k) < a.charAt(k + 1)) {
                    largestIndexK = k;
                }
            }
 
            if (largestIndexK == -1) {
                System.out.println("last permutation");
                break;
            }
 
            for (int l = 0; l < a.length(); l++) {
                if (a.charAt(largestIndexK) < a.charAt(l)) {
                    largestIndexL = l;
                }
            }
 
            b[largestIndexK] = a.charAt(largestIndexL);
            b[largestIndexL] = a.charAt(largestIndexK);
 
            String s = new String(b).substring(largestIndexK + 1);
            int x = 1;
            for (int i=s.length(); i > 0; i--) {
                b[largestIndexK + x] = s.charAt(i - 1);
                x++;
            }
 
            a = new String(b);
        }
        System.out.println(a);
 
    }
}