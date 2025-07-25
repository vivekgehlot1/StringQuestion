
package com.mycompany.stringoperation;
//12) Java Program to replace the spaces of a string with a specific character

public class replacewhiteSpacetoSpecialCharacter {
    public static void main(String[] args) {
        String str= "vivek gehlot";
        char newchar[]=str.toCharArray();
        str="";
        int i=0;
        for(char j:newchar){
            if(j==' '){
                newchar[i]='?';
            }else{
            newchar[i]=j;
            
            }
            i++;
        }
        for(char k:newchar){
            str=str+k;
        }
        System.out.println(newchar);
        
        
    }
}
