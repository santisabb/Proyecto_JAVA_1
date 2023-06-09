package Recursividad;

import java.util.stream.IntStream;

public class recursividad {
    public static void main(String[] args) {
        System.out.println(recursionFuncional(4));
    }
    public static int sumaRecursiva(int n){
        if (n == 0) return 0;
        return n + sumaRecursiva(n - 1);
    }

    public static void tailRecursion(int x){  //recursividad de cola
        if (x == -1) return;
        System.out.println(x);
        tailRecursion(x - 1);
    }

    public static void headRecursion(int h){ //recursividad de cabeza
        if (h == -1) return;
        headRecursion(h - 1);
        System.out.println(h);
    }

    public static int recursionFuncional(int nro){
        return IntStream.rangeClosed(1 , 5).reduce(0 , (a , b) -> a + b);
    }

}
