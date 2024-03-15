package com.Inheritence1;

public class Test{
    public static void main(String[] args){
               parent  p1=new parent();
            p1.m1();
            p1.m2();
            p1.m3();
            
               
               Child c1=new Child();
           
               c1.m4(); 

               parent c2=new Child();
               c2.m1();
               c2.m2();
               c2.m3();
               //Child p2=new Parent(); not possible 
}}