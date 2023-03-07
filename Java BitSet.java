import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N =scan.nextInt();
        BitSet[] B = new BitSet[]{null, new BitSet(N),new BitSet(N)};
        int M = scan.nextInt();
        for(int i=0;i<M;i++)
        {
          String opera = scan.next();
          int k1 = scan.nextInt();
          int k2 = scan.nextInt();
          if (opera.equals("AND")) {
                a[k1].and(a[k2]);
            } else if (opera.equals("OR")) {
                a[k1].or(a[k2]);
            } else if (opera.equals("XOR")) {
                a[k1].xor(a[k2]);
            } else if (opera.equals("FLIP")) {
                a[k1].flip(k2);
            } else if (opera.equals("SET")) {
                a[k1].set(k2);
            }
            System.out.println(a[1].cardinality() + " " + a[2].cardinality());
        }
  }
}
