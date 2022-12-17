package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1, j = cathetusLength - i; i <= cathetusLength; i++, j--) {
            String s = "";
            for (int k = cathetusLength - j; k > 0; k--) {
                s = s.concat(k + "");
            }
            for (int a = 2; a <= cathetusLength - j; a++) {
                s = s.concat(a + "");
            }
            int moveRight=cathetusLength-i;
            System.out.println(" ".repeat(moveRight) + s);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
