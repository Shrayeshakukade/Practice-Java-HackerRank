import java.util.*;
import java.lang.*;
import java.math.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        Map<Character, Integer> wt = new HashMap<Character, Integer>();
        int i = 1; 
        for(char ch = 'a';ch<='z';ch++){
            wt.put(ch, i++);
        }

        int sum = 0;

        for(int j=0;j<s.length();j++)
            sum = sum + wt.get(s.charAt(j));
        System.out.println(sum);
    }
}
