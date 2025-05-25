import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CountSubarraysWhereMaxElementAppearsAtLeastKTimes
{
    public static void main(String[] args)
    {
        System.out.println(getMD5Hash("@hacker"));
    }


    public static String getMD5Hash(String input)
    {
        try
        {
            // Get MD5 digest instance
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Calculate the digest, returns byte array
            byte[] digest = md.digest(input.getBytes());

            // Convert byte array into hex string
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest)
            {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();

        } catch (NoSuchAlgorithmException e)
        {
            throw new RuntimeException(e);
        }
    }

}

class Solution
{
    //        [1,3,2,3,3]   k=2 , max=3
    // index to = 5-2 = 3
    // length = 5
    public long countSubarrays(int[] nums, int k)
    {
        long count = 0;
        while (k < nums.length)
        {

            k++;
        }
        return 0;
    }

    public int findMax(int[] nums)
    {
        int max = nums[0];
        for (int num : nums)
            max = Math.max(num, max);

        return max;
    }
}
