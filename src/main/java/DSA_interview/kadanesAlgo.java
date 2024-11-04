package DSA_interview;

//Java Program to find the maximum subarray sum using nested loops 



class kadanesAlgo {

 // Function to find the sum of subarray with maximum sum
 static int maxSubarraySum(int[] arr) {
     int res = arr[0];

     // Outer loop for starting point of subarray
     for (int i = 0; i < arr.length; i++) {
         int currSum = 0;
   
         // Inner loop for ending point of subarray
         for (int j = i; j < arr.length; j++) {
             currSum = currSum + arr[j];
             //System.out.println(arr[j]);
             
             //System.out.println(currSum);
             // Update res if currSum is greater than res
             res = Math.max(res, currSum);
            // System.out.println("currSum " + currSum);
            // System.out.println("result " +res);
         }
         //System.out.println("------------");
     }
     return res;
 }

 public static void main(String[] args) {
     int[] arr = {2, 3, -8, 9, 7, -1, 2, 3, -6};
     System.out.println("---------" + maxSubarraySum(arr) + "---------");
 }
}