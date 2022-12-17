package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        char[] ch = String.valueOf(number).toCharArray();
        String s = "";
        for(int i=ch.length-1; i>=0;i-- ){
            s=s.concat(String.valueOf(ch[i]));
        }
        System.out.println(s);
    }

}
