// Last updated: 14/07/2026, 14:20:34
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                arr[k]=nums2[j];
                j++;
            }else{
                arr[k]=nums1[i];
                i++;
            }
            k++;
        }
        while(i<nums1.length){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        int n=arr.length;
        double median=0;
        if(arr.length%2!=0){
            median=arr[n/2];
        }else{
            median=(arr[(n/2)-1] + arr[n/2])/2.0;
        }
        return median;
    }
}