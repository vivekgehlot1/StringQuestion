
package com.mycompany.stringoperation;
//Java Program to count the total number of punctuation characters exists in a String

public class puctuationcout {
    public static void main(String[] args) {
     String str=" what@ are !!you doing? in k*now day$$ ";
    char count[]=str.toCharArray();
    char punctuation[]={'!','@','#','$','%','^','&','*','(',')','-','+','<','>','.',',','?'};
    int punctuationcount=0;
    

        for(char num1:count){
            for(char num2:punctuation){
                if(num1==num2){
            punctuationcount++;
                }
        }
        }

    System.out.println(" total punctuation count"+punctuationcount);
}
        
}

    
    

