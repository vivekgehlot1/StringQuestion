
package com.mycompany.stringoperation;
//13) Java Program to determine whether a given string is palindrome

public class GivenStringisPalindromorNot {
    public static void main(String[] args) {  
    String str="level";
    char newchar[]=str.toCharArray();
    String newstr="";

        for (int j = newchar.length-1; j >= 0; j--) {
              newstr=newstr+newchar[j];
            }
        if(newstr.equals(str)) {
            System.out.println("given String is palindrom");
        }else{
            System.out.println("given String is notpalindrom");        
        }
            
        }
    
   
        
   
        
    }

