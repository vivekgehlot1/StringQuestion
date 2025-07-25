
package com.mycompany.stringoperation;


public class replacelowercasetoupercase {
    public static void main(String[] args) { 
    String str="My Name is Vivek and you ? What are you doing in know day";
    char convert[]=str.toCharArray();
    String con="";
    int i=0;
    int j=0;
   
              
      System.out.println("befor the string :");  
      System.out.println(convert);
    for (int c : convert) {
          if (c>=65 && c<=90) {
            convert[i]=((char)(c+32)); 
    }   
           i++;
           
        }
        
   
        System.out.println("after  the string all lower case:");  
        System.out.println(convert);
        for (int c : convert) {
          if (c>=97 && c<=122) {
            convert[j]=((char)(c-32)); 
    }   
           j++;
           
        }
        System.out.println("after  the string all upper case:");  
        System.out.println(convert);
//    for(char t:convert){
//        str=str+t;
//    }
    }
}
    