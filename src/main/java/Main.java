import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź dowolny tekst:");
        String tekst = scanner.nextLine();
        String wynik = "";

        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);

            
            if (Character.isLowerCase(znak)) {
                wynik += Character.toUpperCase(znak);
            } 
            
            else if (Character.isUpperCase(znak)) {
                wynik += Character.toLowerCase(znak);
            } 
            
            else {
                wynik += znak;
            }
        }

        System.out.println("Tekst po zamianie: " + wynik);

        scanner.close();
    }
}