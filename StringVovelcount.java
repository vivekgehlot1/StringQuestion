
package com.mycompany.stringoperation;


public class StringVovelcount {
    public static void main(String[] args) {
    String str=" what are you doing in know day a";
    char count[]=str.toCharArray();
    char vowel[]={'a','e','i','o','u'};
    int vowelcount=0;
    
    int charactercount=0;
//        for(char num1:count){
//            for(char num2:vowel){
//                if(num1==num2){
//            punctuationcount++;
//                }
//        }
//        }
for(int cha:count){
            if(cha>=65 && cha<=90 || cha>=97 && cha<=122 ){
            
            charactercount++;
            }
        }
    for (int i = 0; i <= vowel.length-1; i++) {
           for (int j = 0; j <= count.length-1; j++) {
            if(vowel[i]==count[j]){
                vowelcount++;
            }
            
        }
  
         }
    int consonentcount=charactercount-vowelcount;
    System.out.println(" total vowel count "+vowelcount);
         System.out.println(" total consonet count "+consonentcount);
}
}
