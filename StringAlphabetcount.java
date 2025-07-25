
package com.mycompany.stringoperation;

public class StringAlphabetcount {
    public static void main(String[] args){
    String str=" what are you doing in know day ";
    char count[]=str.toCharArray();
    int charactercount=0;
        for(int cha:count){
          
            charactercount++;  
        }
        System.out.println("total alphabet "+charactercount);
    }
}

