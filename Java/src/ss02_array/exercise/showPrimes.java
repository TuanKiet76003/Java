package ss02_array.exercise;

public class showPrimes {
    public static void main(String[] args) {
        System.out.println(" The first twenty primes are: ");
        int number = 20 ;
        int count;
        int result = 0 ;
        for (int i = 2; ; i++) {
            count = 0 ;
            for (int j = 1 ; j <= i ; j++) {
                    if (i % j == 0){
                        count++;
                    }
            }
            if (count == 2){
                System.out.println(" " + i);
                result ++;
                if (result > number){
                    break;
                }
            }
        }
    }
}
