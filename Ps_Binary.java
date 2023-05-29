public class Ps_Binary {
    public static void main(String[] args) {

        int arry[] = {2 , 4 , 6, 1, 55, 7, 23};
        
        System.out.println(binarySearch(arry, 55));
        
    }

    public static int binarySearch(int[] arry , int target){
        int low = 0 , high = arry.length - 1 ;
      
        while(low <= high){
            int mid = (low+high)/2;
            int midPos = arry[mid];
            if(midPos == target){
                return mid;
        }
        if(midPos > target){
            high = midPos -1;
        }
        else{
            low = midPos + 1;
            // return -1;
        }
        
    }
    return -1;
    }
}
