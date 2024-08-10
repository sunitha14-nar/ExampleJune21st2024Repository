package StringDemo;
class Prime
{
    void Primenum()
    {
        int num=50;
        int n;
        for(int i=1;i<=num;i++)
        {
            n=0;
            for(int j=2;j<i/2;j++)
            {
                if(i%j==0)
                {
                    n++;
                    break;
                }
            }
            if(n==0)
            {
                System.out.println(i);
            }
        }
    }
}
public class Primenum {
    public static void main(String[] args) {
        System.out.println("prime number from 1 to 50:");
        Prime o=new Prime();
        o.Primenum();
    }
}
