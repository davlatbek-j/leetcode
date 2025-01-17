public class Main
{
    public static void main(String[] args)
    {
        int[] a = new int[]{4, 1, 3, 3};

        CountBadPairs countBadPairs = new CountBadPairs();
        long l = countBadPairs.countBadPairs(a);
        System.out.println(l);
    }
}
/*
        Date start = new Date();
        Date end = new Date();
        System.out.println("Time  ms :" + (end.getTime() - start.getTime()));
*/
