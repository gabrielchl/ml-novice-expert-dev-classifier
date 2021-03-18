import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]<38)
            {
                System.out.println(a[i]);
            }
            else
            {
                if(a[i]>=38&&((a[i]+2)%5==0))
                {
                    System.out.println(a[i]+2);
                }
                else if(a[i]%5==0)
                {
                    System.out.println(a[i]);
                }
                else if(a[i]>=38&&((a[i]+1)%5==0))
                {
                    System.out.println(a[i]+1);
                }
                else
                {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
