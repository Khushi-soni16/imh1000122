/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

import java.util.*;
public class Assignment {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("enter the size of an array");
        size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Array elements are:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        //Question 2(insrtion)
        System.out.print("Enter the position for insertion: ");
        int position = sc.nextInt();

        System.out.print("Enter the element to be inserted: ");
        int element = sc.nextInt();
           
            for (int i = size - 1; i >= position - 1; i--) {
                arr[i + 1] = arr[i];
                size++;
            }
            System.out.println("Array after insertion:");
            for (int i = 0; i < size+1; i++) {
                System.out.print(arr[i] + " ");
            }
        } 
           
        }

        
    




        
    
    

