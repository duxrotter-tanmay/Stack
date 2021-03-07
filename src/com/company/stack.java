package com.company;

import java.util.Scanner;

import java.util.Arrays;

public class stack {

    int stack_arr[] = new int[100000];//declare Memory
    int top = -1;
    public void Push(int item)
    {
        if(isFull())//will check if stack overflows
        {
            System.out.println("Stack overflow");

        }
        this.top = this.top +1;
        stack_arr[this.top]=item;//will insert the item in stack
    }
    public  boolean isFull()
    {
        if(this.top==99999)//because size of the stack we used is 100000
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public Boolean isEmpty()
    {
        if(this.top == -1)//if top is -1 than stack is empty
        {
            return true;
        }
        else
        {
            return false;
        }
    }



    public int pop()
    {
        int item;
        if(isEmpty())//check is element is there in stack
        {
            System.out.println("Stack Underflow");
        }
        item=stack_arr[this.top];
        this.top=this.top-1;
        return item;
    }

    public int peek()//returns the top element of stack
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            return stack_arr[this.top];
        }

    }


    public void print()//print the stack in first on last out format
    {
        int i;
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
        }
        System.out.println("Stack Elements :");
        for(i=this.top;i>=0;i--)
        {
            System.out.println(stack_arr[i]);
        }
    }
    public boolean contains(int item)//checks for an item if it is present in stack
    {
        for(int i = this.top;i>=0;i--)
        {
            if(stack_arr[i]==item)
            {
                return true;
            }
        }
        return false;
    }
    public int size()//returns number of elements present in stack
    {
        int t=top+1;
        return t;
    }
    public void reverse()//reverses the stack order
    {
        int arr[];
        arr = new int[stack_arr.length];
        int j=0;
        for(int i = this.top;i>=0;i--)
        {
            arr[j]=stack_arr[i];
            j++;
        }
        stack_arr=arr;
    }
    public void iterator()//allows the user to iterate the stack
    {
        int k=1;
        int i = this.top;
        while(k!=0)
        {
            //System.out.println("top element = " + stack_arr[this.top]);

            System.out.println("enter 0 to Close");
            System.out.println("enter 1 to perform next()");
            System.out.println("enter 2 to perform has_next()");
            Scanner scan;
            scan = new Scanner(System.in);
            int choose = scan.nextInt();

            if(choose==1)
            {
                if(i>=0)
                {

                    System.out.println("top element = " + stack_arr[i]);
                    i--;
                }
                else
                {
                    System.out.println("NoSuchElementException");
                }
            }
            else if(choose==2)
            {
                if(i-1>=0)
                {
                    System.out.println(" true" );
                }
                else
                {

                    System.out.println("false");
                }
            }
            else if(choose==0)
            {
                i=0;
                break;
            }
            else
            {
                System.out.println("wrong input" );
            }
        }
    }
}
