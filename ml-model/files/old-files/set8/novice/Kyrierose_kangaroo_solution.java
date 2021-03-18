import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        System.out.println(kangaroo(x1,v1,x2,v2));
    }
    private static String kangaroo(int x1,int v1,int x2, int v2){
        ArrayList<Integer> temp=new ArrayList<Integer>();
        int val1=x1+v1,val2=x2+v2;
        int index=10;
        while(index>0){
            val1+=v1;
            val2+=v2;
            if(val1<val2)temp.add(val2-val1);
            else temp.add(val1-val2);
            index--;
        }
        for(int i=0;i<temp.size()-1;i++){
            if(temp.get(i)==0)return "YES";
            if(temp.get(i)>temp.get(i+1)&&temp.get(i)==0)return "YES";
            if(temp.get(i)<temp.get(i+1)||temp.get(i)==temp.get(i+1))return "NO";
            
        }
        return "YES";
    }
}
