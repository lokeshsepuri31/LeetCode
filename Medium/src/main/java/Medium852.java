public class Medium852 {

    public int peakIndexInMountainArray(int[] arr) {
        int i = 0,j = arr.length - 1;
        while (i != j){
            if(arr[i] < arr[i+1]){
                i++;
            }if (arr[j] < arr[j-1]){
                j--;
            }
        }

        return i;

    }

    //With Binary Search
//    public int peakIndexInMountainArray(int[] arr) {
//        int l=0,r=arr.length-1,m;
//        while(l<r){
//            m=(l+r)/2;
//            if(arr[m]<arr[m+1]){
//                l=m+1;
//            }
//            else{
//                r=m;
//            }
//        }
//        return l;
//    }
    public static void main(String[] args) {
        int[] nums = {0,10,5,2};
        Medium852 medium852 = new Medium852();
        System.out.println(medium852.peakIndexInMountainArray(nums));
    }
}
