import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int n1=s.nextInt();
        int k1=s.nextInt();
        int i=0;
        int flag=0;
        while(i<1000)
        {
            flag=0;
            n=n+k;
            n1=n1+k1;
            if(n==n1)
            {
                System.out.print("YES");
                break;
            }
            else
            {
                flag=1;
            }
            i=i+1;
        }
        if(flag==1)
        {
            System.out.print("NO");
        }
        
    }
}
