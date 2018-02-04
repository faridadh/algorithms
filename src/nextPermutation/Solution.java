
package nextPermutation;

class Solution {
    public void nextPermutation(int[] nums) {
        int index = findLastAsc(nums);
        if( index==-1){
            reverse(nums, 0, nums.length-1);
        } else {
            int leastLargerIndex = findLeastLarger(nums, index);
            swap(nums, index, leastLargerIndex);
            reverse(nums, index+1, nums.length-1);
        }
    }

    public int findLastAsc(int[] nums){
        int last=-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                last = i;
            }
        }

        return last;
    }

    public void reverse(int[] a, int begin, int end){
        while(begin<end){
            swap(a, begin, end);
            begin++;
            end--;
        }
    }

    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    private int findLeastLarger(int[] a, int i){
        int leastLarger= i+1;
        for(int j=i+1; j<a.length; j++){
            if(a[j]>a[i] && a[j]<=a[leastLarger]){
                leastLarger = j;
            }
        }

        return leastLarger;
    }
}