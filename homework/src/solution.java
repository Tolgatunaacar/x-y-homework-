import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Üssü alıncak sayı:");
        int x = input.nextInt();
        System.out.println("Üs olacak sayı:");
        int y = input.nextInt();
        int total =1;

        for (int i =1; i<=y; i++){
            total *= x;
        }
        System.out.println("Cevap:"+ total);
    }
}
