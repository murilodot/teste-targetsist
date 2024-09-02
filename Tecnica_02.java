import java.util.Scanner;

public class Tecnica_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input da frase do usuário
        System.out.print("Informe uma string: ");
        String frase = scanner.nextLine();

        // verificação da quantidade de letras 'a'
        int resp = totLetraA(frase);

        // output para o usuário
        if (resp > 0) {
            System.out.println("Se mostrou a letra 'a' na String um total de: "+resp+" vezes");
        } else {
        	 System.out.println("não foi encontrada a letra 'a' na string");
        }
        scanner.close();
    }

    // contagem da letra 'a'
    private static int totLetraA (String frase) {
        int resp = 0;
        for (char c : frase.toCharArray()) {
            if (c == 'a' || c == 'A') {
                resp++;
            }
        }
        return resp;
    }
}
