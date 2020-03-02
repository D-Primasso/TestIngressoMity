package fase1;

public class Utils {

    long fibonacci(long n){
        if (n==1 || n==2){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}
