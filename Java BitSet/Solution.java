import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        while(m-- > 0){
            String opn = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            switch(opn){
                case "AND" :
                    if(x == 1)
                        b1.and(b2);
                    else
                        b2.and(b1);
                    break;
                case "OR" :
                    if(x == 1)
                         b1.or(b2);
                    else
                            b2.or(b1);
                    break;
                case "XOR" :
                        if(x == 1)
                            b1.xor(b2);
                        else
                            b2.xor(b1);
                        break;
                case "SET" :
                    if(x == 1)
                        b1.set(y);
                    else
                        b2.set(y);
                    break;
                case "FLIP" :
                    if(x == 1)
                        b1.flip(y);
                    else
                        b2.flip(y);
                    break;
                
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}
