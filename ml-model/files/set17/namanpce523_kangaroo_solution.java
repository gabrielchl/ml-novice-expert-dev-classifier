import java.io.*;
import java.util.*;


public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        int maxDiff = 0;

            if(v1>v2)maxDiff = v1;
            else maxDiff = v2;

            for(; ;){

                    x1 =x1+v1;
                    x2 =x2+v2;
          //      System.out.print(x1+" "+x2);
						if(x1==x2){
                        System.out.print("YES"); break;
                    }else {int diff =0;
                            if (x1>x2)  diff = x1-x2;
                             else diff = x2-x1 ;

                        if (diff > maxDiff  ) {
                            System.out.print("NO"); break;
                        }
                    }
            }

    }
}
