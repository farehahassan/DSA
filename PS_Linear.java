// public class PS_Linear {

//     public static void main(String[] args) {
//         int item[] = {2 , 4 , 16, 7, 10 , 3 , 15};
//         int target = 2;
//         int loc = -1;

//         for(int i = 0 ; i < item.length ; i++){
//             if(item[i] == target){
//                 loc = i;
//                 System.out.println(item[i] + " found at location " + i);
//                 // break;
//         }
//     }
//     if(loc == -1){
//     System.out.println( "item not found");
// }

//     }
// }


//revision code 
                 
 public class PS_Linear{
    public static void main(String[] args) {
        int[]  data = {2 , 4 , 1 , 15 , 12 , 10 };
        int target = 15;
        int loc = -1;

        for(int i = 0 ; i < data.length ; i++){
            if(data[i] == target){
                loc = i ;
                System.out.println(target + " found at location " + i);
            }
        }
        if(loc == -1){
            System.out.println("Item dosn't found");
        }
    }
 }

/* Linear Search theory
 * 
 * --> also known as serial search
 * --> step through array of records, one at a time
 * --> search stops when : 1)record with matching key is found, 2)or search has examined all record without success
 * --> Worst case : O(n)
 * --> target number appears in the last position of the array OR dosn't appear
 * --> Average case : O(n)
 * --> Disadvantage : slow for large data sets 
 * --> Advantage : Fast for searches of small to medium data sets
 * --> usefull for data structures that do not have random access (Linked lists)
*/

































