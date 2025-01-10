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
        return 1 << pow;
    }
}