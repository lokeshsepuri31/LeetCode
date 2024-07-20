class Hard4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int k = n+m;
        int[] mergedArray = new int[k];
        int i=0,j=0;

        while(j < k){
            if(j < m){
                mergedArray[j] = nums2[j];
            }else{
                mergedArray[j] = nums1[i];
                i++;
            }
            j++;
        }

        quickSort(mergedArray, 0, k-1);

        if(k % 2 != 0){
            return (double) mergedArray[ (k - 1)/2 ];
        }else{
            int index = k/2;
            return (double) ((mergedArray[index - 1]+mergedArray[index])/2.0);
        }

    }

    public void quickSort(int [] arr,int low, int high){
        if(low < high){
            int pi = partitionIndex(arr,low,high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public int partitionIndex(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low;
        int j = low;

        while(j <= high - 1){

            if(pivot > arr[j]){
                arr = swap(arr,i,j);
                i++;
            }
            j++;
        }
        arr = swap(arr,i,high);
        return i;
    }

    public int[] swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

}