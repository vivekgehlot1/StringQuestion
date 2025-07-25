
package com.mycompany.stringoperation;
//vovels frequancy count
public class vovelfreuancycount {
    public static void main(String[] args) {
    String str=" what are you doing in know day a";
    char count[]=str.toCharArray();
    char vowel[]={'a','e','i','o','u'};
    int a=1;
    int e=1;
    int i=1;
    int o=1;
    int u=1;
    for(int k=0;i<=count.length-1;i++){
        if('a'==count[k]){
            a++;
        }else if('e'==count[k]){
            e++;   
        }
        else if('i'==count[k]){
            i++;
        }
        else if('o'==count[k]){
            o++;
        }
        else if('u'==count[k]){
            u++;
        }
    }
        System.out.println("a ="+a);
        System.out.println("e ="+e);
        System.out.println("i ="+i);
        System.out.println("o ="+o);
        System.out.println("u ="+u);
    }
 
}
