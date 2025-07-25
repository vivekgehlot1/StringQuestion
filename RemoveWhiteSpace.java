
package com.mycompany.stringoperation;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
    String str=" what are you doing in know day a";
    char count[]=str.toCharArray();
    char space=' ';
    String newstr="";
        for(char num1:count){
            if(num1!=space){
                newstr=newstr+num1;
                
            }
        }
        System.out.println("without white space in string :"+newstr);
    }
}

