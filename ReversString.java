
package com.mycompany.stringoperation;
//Java Program to find Reverse of the string
public class ReversString {
    public static void main(String[] args) {
        
    
   String str="my name is vivek and you ? what are you doing in know day";
    char convert[]=str.toCharArray();
    String con="";
    for (int i = str.length()-1; i >= 0; i--) {
            con=con+convert[i];
        }
        System.out.println("revers Stirng is :"+con);
    }
}
