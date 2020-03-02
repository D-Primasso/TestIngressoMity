package fase1;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    List<Double> fibonacci = new ArrayList<>();
    List<Integer> fibonacciInt = new ArrayList<Integer>();

    public void calcola() {
        fibonacci.add(1.0);
        fibonacci.add(1.0);

        for (int i = 2; i < 1500; i++) {
            fibonacci.add((fibonacci.get(i - 1) + fibonacci.get(i - 2)));
            String s = fibonacci.get(i) + "";

            double num = fibonacci.get(i);
//            System.out.println(s + " " + QuanteCifre((int)num,1) +  " ind" + i);
            System.out.println(s + " " + i);
        }
    }

    public static Integer QuanteCifre(int n,int i) {

        if (n/10 != 0) {

            n = n/10;
            i++;
            System.out.print(".");
            QuanteCifre(n, i);
        } else {
            System.out.println("we: " + i);
        }
        return 0;
    }

//    public void trovaN10Cifre(){
//        long nFibonacci;
//        boolean ris = true;
//        long i = 1;
//        Utils utils = new Utils();
//        while(ris){
//            System.out.println("Indice: " + i);
//            nFibonacci = utils.fibonacci(i);
//            System.out.println("N Fibonacci: " + nFibonacci);
////            ris = numCifre(nFibonacci)<10;
//            String nFibonacciS = nFibonacci+"";
//            ris = nFibonacciS.length()<1000;
//            i++;
//        }
//        System.out.println(" Indice finale: " + i);
//    }

    long numCifre(long n) {
        int i = 1;

        if (n == 0)
            return 0;

        while (n > 10) {
            n /= 10;
            i++;
        }

        return i;
    }
}


