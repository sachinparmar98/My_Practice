import java.util.List.*;
import java.util.Set.*;

class Sample

{
    
    public static void main(String args[]) {
        Sample s=new  Sample();
    int nums[]={3,2,1,5,6,4};int k=2;
    System.out.println(    s.kthLargest(nums, k));

    }

  

    public int quickSelect(int nums[], int l, int r) {
        int pivot = nums[l];
        int i = l + 1;
        int j = r;
        while (i <= j) {
            if (nums[i] < pivot && nums[j] > pivot) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            if (nums[i] >= pivot)// equal duplicate case ka liya use kiya ha
            {
                i++;

            }
            if (nums[j] <= pivot) {
                j--;
            }
        }
        nums[l] = nums[j];
        nums[j] = pivot;

        return j;
    }

    public int kthLargest(int nums[], int k) {

        int l = 0;
        int r = nums.length - 1;
        int pivotIndex=0;
        while (true) {
            pivotIndex = quickSelect(nums, l, r)
            if (pivotIndex == k - 1) {
                break;
            } else if (pivotIndex> k-1) {
                r = pivotIndex - 1;
            } else {
                l = pivotIndex + 1;
            }
            

        }
        return nums[j];

    }

}
