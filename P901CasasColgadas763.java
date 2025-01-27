import java.util.Scanner;

public class P901CasasColgadas763 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int casos = teclado.nextInt();

        for (int i = 0; i <= casos; i++) {
            String palabra = teclado.nextLine().toLowerCase();

            if (palabra.equals("colgadas")) {
                System.out.println("Bien");
            } else if (palabra.equals("colgantes")) {
                System.out.println("Mal");
            }
        }
    }
}
