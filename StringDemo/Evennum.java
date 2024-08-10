package StringDemo;
class Even
{
    void EvenNumber()
    {
        int count = 0;
        for (int i = 1; i <= 500; i++)
        {
            if (i % 2 == 0)
                count++;
        }
        System.out.println(count);
    }
}
public class Evennum {
    public static void main(String[] args) {
        Even o=new Even();
        o.EvenNumber();
    }
}
