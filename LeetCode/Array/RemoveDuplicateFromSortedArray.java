
//import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {

    }

/* 

public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> al = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++)
        {            al.add(nums[i]);
            nums[0]=0;
        }
        Object o[]=al.toArray();
         
             for(int i=0;i<o.length;i++)
                nums[i]=(int)o[i];
            return  al.size();
         
    }  

   }
*/
//we create below  method because above code is too slow 
        public int removeDuplicates(int[] nums) {

            
            int pos=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[pos]!=nums[i])
                {
                    nums[++pos]=nums[i];
                }
                return pos+1;
            }

        }
}