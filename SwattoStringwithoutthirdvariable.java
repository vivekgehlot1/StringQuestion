
package com.mycompany.stringoperation;
//24) Java Program to swap two string variables without using third or temp variable.

public class SwattoStringwithoutthirdvariable {
    public static void main(String[] args) {
        String str1="vivek ";
        String str2="gehlot";
        char local1[]=str1.toCharArray();
        char local2[]=str2.toCharArray();
        
        for (int i = 0; i <= local2.length-1; i++) {
        for(int n:local1){
            for(int v:local2){    
                    local1[i]=(char) (n+v);
                    local2[i]=(char) (n-v);
                    local1[1]=(char) (n-v);
//                   local1[i]= ((char)n);
//                   local2[i]= ((char)v);
                   
                }
            }
        }
        System.out.println("str1 =");
        System.out.print(local1);
        System.out.println("str2 =");
        System.out.print(local2);

        
            
        }
    }

