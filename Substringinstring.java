
package com.mycompany.stringoperation;

public class Substringinstring {
    public static void main(String[] args) {
        String name="my name is vivek and currenlly i am doing B.tech cse";
        char newchar[]=name.toCharArray();
        int i=12;
        int j=22;
        
        String str="";
        
        for (int k = i; k <= j; k++) {
            str=str+newchar[k];
        }
        
        System.out.println("sub string is :"+str);
    }
}
