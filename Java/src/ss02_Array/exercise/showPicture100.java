package ss02_Array.exercise;

public class showPicture100 {
    public static void main(String[] args) {
        System.out.println(" The prime numbers from 1 to 100 are : ");
        int number = 100 ;
        int count;
        for (int i = 2; i < number; i++) {
            count = 0;
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(" " + i);
            }
        }
    }
}
