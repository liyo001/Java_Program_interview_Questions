import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPairOfIntegerWhoseSumIsEqualToSum {

    static int [] nums={3,9,1,7,5,2,4,8 };
    static int target=10;

    public static void main(String[] args)
    {

        for (int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    System.out.println(nums[i]+" "+nums[j]);
                }
            }
        }
System.out.println("===========================================================");

        // {3,9,1,7,5,2,4,8};
        //target=10
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(target - nums[i]))
            {
                System.out.println(nums[map.get(target - nums[i])] +" "+ nums[i]);
            }
            map.put(nums[i], i);
        }
    }
}
