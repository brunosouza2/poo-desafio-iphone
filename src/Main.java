import br.com.bruno.dispositivo.Iphone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Iphone mobile = new Iphone();
        boolean running = true;

        do {
            System.out.printf("%s", """
                    
                    ============================
                        BEM VINDO AO IPHONE
                    ============================
                    1- Reprodutor Musical
                    2- Navegador Internet
                    3- Ligar
                    4- Atender
                    5- Iniciar Correio de Voz
                    6- Sair
                    ============================
                    """);

            System.out.print("Escolha: ");
            int opcInput = input.nextInt();

            switch (opcInput) {
                case 1:
                    mobile.menu(input);
                    break;

                case 2:
                    mobile.internetMenu(input);
                    break;

                case 3:
                    System.out.println("Digite o número para ligação: ");
                    String numero = input.nextLine();
                    mobile.ligar(numero);
                    break;

                case 4:
                    mobile.atender();
                    break;

                case 5:
                    mobile.iniciarCorreioVoz();
                    break;

                case 6:
                    System.out.println("Saindo...");
                    running = false;
                    break;

                default:
                    System.out.println("Selecione uma opção válida.");
                    break;

            }
        } while (running);

    }

}
