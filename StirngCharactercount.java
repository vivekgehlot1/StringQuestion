
package com.mycompany.stringoperation;
//Java Program to count the total number of characters in a string

public class StirngCharactercount {
    public static void main(String[] args) {
        
    
    String str="what are you doing in know day bro";
    char count[]=str.toCharArray();
    int charactercount=0;
    
        for(int cha:count){
            if(cha>=65 && cha<=90 || cha>=97 && cha<=122 ){
            
            charactercount++;
            }
        }
        System.out.println("tatal character "+charactercount);
    }
}

