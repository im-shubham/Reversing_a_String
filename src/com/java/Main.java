//Reversing a String Program in java
package com.java;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    String name;//Declaring String variable.
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Your Name: ");      //Taking Name as input from user
        name=sc.nextLine();
        String reverse="";     //initialising empty String so that we can store reverse character in this empty string.

        int length=name.length();        //determine length of char in name so that we can use it in for loop.

        for (int i=length-1;i>=0;i--){

            reverse=reverse+name.charAt(i);         //name.charAt() is a method of String
        }
        System.out.println("Your name after reversing is : "+reverse);

    }
}
