/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ques.pkg2.ass3;
import java.util.*;
public class Ques2Ass3 {

    static void check(String name){
        int flag =-1;

for(int i =0; i<name.length();++ i ){

char x = name.charAt(i);

if (x<'a' || x>'z'){
    flag = -1;
break;
}
}
if(flag==1) System.out.println(name +" is Valid");
else System.out.println(name+" is NOT Valid");

    }

static void check(int age) {

if(age>3 && age<15)

System.out.println(age+" is Valid");

else 
    System.out.println(age+" is not Valid");
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.println("Enter name");
        String name = sc.next();

System.out.println("Enter age");

int age=sc.nextInt();

check (name);
check (age);
    }
}
   
    

