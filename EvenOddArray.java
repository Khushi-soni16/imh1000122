/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package even.odd.array;
import java.util.*;
public class EvenOddArray {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int arraySize = sc.nextInt();

     
        int[]arr = new int[arraySize];

        
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        
        int[] evenArray = new int[arraySize];
        int[] oddArray = new int[arraySize];

       
        int evenCount = 0;
        int oddCount = 0;

        
        for (int i = 0; i < arraySize; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[evenCount++] = arr[i];
            } else {
                oddArray[oddCount++] = arr[i];
            }
        }

        
        System.out.println("Original array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Display the array of even elements
        System.out.println("Array of even elements:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        
        System.out.println("Array of odd elements:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
        //ques7
        System.out.println("Enter the position");
    int pos=sc.nextInt();
    int [] arr4=new int[pos];
    int [] arr5=new int[-pos];
    for(int i=0;i<pos;i++)
    {
        arr4[i]=arr[i];
    }
    for(int i=0;i<pos;i++)
    {
        System.out.print(arr4[i] + " ");
    }
    System.out.println();
    for(int i=pos;i<arraySize;i++)
    {
        arr5[i-pos]=arr[i];
    }
    for(int i=pos;i<arraySize;i++)
    {
        System.out.print(arr5[i-pos] + " ");
    }
     System.out.println();
    for(int i=0;i<pos;i++)
    {
        for(int j=i+1;j<pos;j++)
            if(arr4[i]==arr4[j])
               System.out.println("duplicate of"+arr4[i]+"is at"+j);
      
    }
    
     for(int i=pos;i<arraySize;i++)
    {
        for(int j=i+1;j<arraySize;j++)
            if(arr5[i-pos]==arr5[j-pos])
               System.out.println("duplicate of"+arr5[i-pos]+"is at"+(j-pos));
        
    }
    System.out.println();
    }
}

       
    


    
    
