package com.company;

import java.util.Scanner;

import java.util.Collections;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

	// write your code here
        int item;

        int i=1;
        Scanner scan;
        scan = new Scanner(System.in);
        stack p;
        p = new stack();//object p of class stack is created
        while(i!=0)//will iterate till i is not 0 by input
        {


            System.out.println("enter 1 to use Push");
            System.out.println("enter 2 to use Pop");
            System.out.println("enter 3 to use Peek");
            System.out.println("enter 4 to use contains");
            System.out.println("enter 5 to use size");
            System.out.println("enter 6 to use Reverse");
            System.out.println("enter 7 to use Iterator");
            System.out.println("enter 8 to use Print");
            System.out.println("enter 0 to use EXIT");

            int choice;
            choice = scan.nextInt();
           if(choice==1)
           {
               System.out.println("Enter the item to be pushed :");
               item =scan.nextInt();//enter number to be inserted in stack

               p.Push(item);//call push method
               System.out.println("Element is pushed :");
           }
           else if(choice==2)
           {

               int k = p.pop();//call pop method
               System.out.println("Removed item is " + k);
           }
           else if(choice == 3)
           {
               System.out.println("Item at the top is :");

               item = p.peek();//call peek method
               System.out.println(item);
           }
           else if(choice == 4)
           {
               System.out.println("Enter Item to check :");
               item = scan.nextInt();

               if(p.contains(item))//contains returns boolean type
               {
                   System.out.println("Item is present :");
               }
               else
               {
                   System.out.println("Item is not present :");
               }
           }
           else if(choice == 5)
           {

               System.out.println("The size of stack is :" + p.size());//return number of elements present in stack
           }
           else if(choice == 6)
           {

               p.reverse();//reverses the order of stack elements
               System.out.println("The Stack is reversed" );
           }
           else if(choice == 7)
           {
                p.iterator();//Lets the user iterate thorough the stack
           }
           else if(choice == 8)
           {
               System.out.println("Items in Stack are :");

               p.print();//prints all the elements in stack

           }

           else if(choice==0)
           {
               i=0;//terminates the method
           }


        }

    }




}
