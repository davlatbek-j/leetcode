class Solution
{
    public int smallestNumber(int n)
    {
        for (int i = 0; i <= 10; i++)
        {
            int temp = powOf2(i);
            if (n < temp)
                return temp - 1;
        }
        return -1;
    }

    public int powOf2(int pow)
    {
        int start = 1;
        for (int i = 0; i < pow; i++)
        {
            start *= 2;
        }
        return start;
    }
}