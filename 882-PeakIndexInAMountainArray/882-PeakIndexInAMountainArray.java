// Last updated: 14/07/2026, 14:16:44
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int si=1,li=arr.length-2,mid=0;
        while(si<=li){
            mid=(si+li)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid-1]){
                si=mid+1;
            }else{
                li=mid-1;
            }
        }
        return 0;
    }
}
 