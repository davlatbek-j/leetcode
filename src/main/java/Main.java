import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Solution smallestNumber = new Solution();

        Date start = new Date();

        System.out.println("pow = " + smallestNumber.powOf2(5) );

        Date end = new Date();
        System.out.println("Time  ms :" + (end.getTime() - start.getTime()));

    }
}
