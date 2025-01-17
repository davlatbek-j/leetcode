import java.util.HashMap;
import java.util.Map;

class CountBadPairs
{
    public long countBadPairs(int[] nums)
    {
        long totalPairs;
        Map<Integer, Integer> freqMap = new HashMap<>();
        long goodPairs = 0;

        //    i < j and j - i != nums[j] - nums[i]
        //    nums[i] - i != nums[j] - j

        for (int i = 0; i < nums.length; i++)
        {
            int key = nums[i] - i; // nums[j] - j qiymati
            if (freqMap.containsKey(key))
            {
                goodPairs += freqMap.get(key); // Ushbu qiymatga mos juftliklar soni
            }
            freqMap.put(key, freqMap.getOrDefault(key, 0) + 1); // Xaritada yangilash
        }

        totalPairs = (long) nums.length * (nums.length - 1) / 2; // Umumiy juftliklar soni
        return totalPairs - goodPairs; // Yomon juftliklar = umumiy - yaxshi
    }
}