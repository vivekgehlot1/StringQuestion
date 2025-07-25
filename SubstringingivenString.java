
package com.mycompany.stringoperation;
//Java Program to find all subsets of a string
public class SubstringingivenString {
       public static void main(String[] args) {
    String str="what are you doing in know day a";
    char count[]=str.toCharArray();
    char space=' ';
    
    int charactercount=0;
        for(char num1:count){
            if(num1!=space){
                
                System.out.print("remov all white space  "+num1); 
            }
}
    
}
}
