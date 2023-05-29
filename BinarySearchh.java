// public class BinarySearchh {
//     public static int binarySearch(int[] arr, int target) {
//         int low = 0;
//         int high = arr.length - 1;
        
//         while (low <= high) {
//             int mid = (low + high) / 2;
            
//             if (arr[mid] == target) {
//                 return mid;
//             }
            
//             if (arr[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
        
//         return -1;
//     }
    
//     // Example usage
//     public static void main(String[] args) {
//         int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
//         int targetNumber = 11;
        
//         int result = binarySearch(numbers, targetNumber);
        
//         if (result != -1) {
//             System.out.println("Element found at index " + result);
//         } else {
//             System.out.println("Element not found in the list.");
//         }
//     }
// }


// revision 

public class BinarySearchh{
    public static int binarySearch(int[] data , int target){
        int low = 0;
        int high = data.length -1;

        while(low <= high){
            int mid = (low + high)/2;
            
            if(data[mid] == target){
                return mid;
            }
            if(data[mid]< target){
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] data = {2 , 4 , 1, 6 ,14, 11 , 12};
        int target = 22;

       int result =  binarySearch(data, target);

       if(result != -1){
        System.out.println("Item found at location " + result);
       }

       else{
        System.out.println("Item dosn't found");
       }
        
    }
}



/*  Binary Search theory
 *
 * -->It follows a divide-and-conquer approach by repeatedly dividing the search space in half until the target element is found or determined to be absent.
 * --> Binary search has a time complexity of O(log n)
 * --> If the target element is equal to the middle element, the search is successful.
 * --> If the target element is less than the middle element, the search continues in the lower half of the search space.
 * --> If the target element is greater than the middle element, the search continues in the upper half of the search space.
 * --> This process of halving the search space is repeated until the target element is found or the search space is empty. 
 */