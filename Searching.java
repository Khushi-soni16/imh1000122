/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searching;
import java.util.*;
public class Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int arraySize = sc.nextInt();

        
        int[] arr = new int[arraySize];

        
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        /*
        System.out.print("Enter the element to be searched: ");
        int searchElement = sc.nextInt();

        
        boolean found = false;
        for (int i = 0; i < arraySize; i++) {
            if (arr[i] == searchElement) {
                found = true;
                System.out.println("Element " + searchElement + " found at index " + i);
                break; 
            }
        }

        
        if (!found) {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
*/
       //duplicate
       System.out.println("duplicate element");
       int duplicateElement=sc.nextInt();
 
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j])
                   System.out.println(arr[j]);
               
           }
           
       }
    } 







      
    }
    

