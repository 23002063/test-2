

package test2;

import java.util.Scanner;
public class Test2 {


public static void main(String[] args) {
    
      Scanner scanner = new Scanner(System.in);
       int [] productIDs = new int[7];
      for(int i=0; i<7; i++){
        System.out.println("Enter value" + (i + 1) + ":");
           productIDs[i] = scanner.nextInt();
      }
        System.out.println("Enter the ID of the poduct to find its index :");
              int targetID = scanner.nextInt();
              int foundIndex = findProductIndex(productIDs, targetID); 
             if(foundIndex != -1){
               System.out.println("The inserted ID of the product is found at" + foundIndex);
             } else{
               System.out.println("The inserted ID of the product in not found on the database");
             }
}
public static int findProductIndex (int productIDs[], int targetID){
      
     int left = 0;
     int right = productIDs.length - 1;
   while(right - left > 1){
     int midV = (right + left) / 2;
    if(productIDs[right] < targetID) {
       left = midV + 1;
    } else{
      right = midV;
    }
   }
    if(productIDs[left] == targetID){
       return left;
    } else if(productIDs[right] == targetID){
       return right;
    } else 
    return -1;
}
}
