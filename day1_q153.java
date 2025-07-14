class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        for(int i=0;i<nums.length;i++){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid;
            }
       }
       return nums[end];
    }
}

//binary search is what clicked me , since the array is rotated, the minimum element will be at the point where the order breaks.
//if the mid element is greater than the end element, it means the minimum is in the right half, so we move the start to mid+1.
//if the mid element is less than or equal to the end element, it means the minimum is in the left half or could be mid itself, so we move the end to mid.
//this continues until start meets end, at which point end will be pointing to the minimum element.
//time complexity is O(log n) and space complexity is O(1).