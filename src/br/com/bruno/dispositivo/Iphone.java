package br.com.bruno.dispositivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Iphone extends AparelhoTelefonico {

    private final List<String> musicas = new ArrayList<>();
    private final List<String> abas = new ArrayList<>();
    int indexMusicaAtual = 0;
    private String paginaAtual = "";

    @Override
    public void ligar(String numero) {
        super.ligar(numero);
    }

    @Override
    public void atender() {
        super.atender();
    }

    @Override
   public  void iniciarCorreioVoz() {
        super.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina(String nomePaginaWeb) {
        System.out.printf("""
                ===============================
                              %s.com
                ===============================
                """, nomePaginaWeb);
        paginaAtual = String.format("""
                ===============================
                              %s.com
                ===============================
                """, nomePaginaWeb);
        abas.add(paginaAtual);
    }

    @Override
    public void adicionarNovaAba(String nomePaginaWeb) {
        exibirPagina(nomePaginaWeb);
        String aba = String.format("""
                ===============================
                              %s.com
                """, nomePaginaWeb);
        paginaAtual = String.format("""
                ===============================
                              %s.com
                ===============================
                """, nomePaginaWeb);
        abas.add(aba);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("""
                ==========================
                        ATUALIZANDO
                """);
        System.out.println(paginaAtual);
    }

    @Override
    public void internetMenu(Scanner input) {
        boolean running = true;

        do {
            System.out.printf("%s", """
                    ==================================
                    BEM VINDO AO NAVEGADOR DE INTERNET
                    ==================================
                    1- Exibir Página Web
                    2- Adicionar nova Aba
                    3- Atualizar Pagina
                    4- Abas abertas
                    5- Sair
                    ==================================
                    """);
            System.out.print("Escolha: ");
            int opcInput = input.nextInt();

            switch (opcInput) {
                case 1:
                    System.out.println("Insira o nome da página web: ");
                    input.nextLine();
                    String nomePagina = input.nextLine();
                    exibirPagina(nomePagina);
                    break;
                case 2:
                    System.out.println("Insira o nome da página web: ");
                    input.nextLine();
                    String novaPagina = input.nextLine();
                    adicionarNovaAba(novaPagina);
                    break;
                case 3:
                    atualizarPagina();
                    break;
                case 4:
                    exibirAbasAbertas();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    running = false;
                    break;

                default:
                    System.out.println("Selecione uma opção válida.");
                    break;
            }


        }while(running);

    }

    @Override
    public void exibirAbasAbertas() {
        for (String aba : abas) {
            if (!aba.equals(paginaAtual)){
                System.out.printf("""
                    =================================
                                   %s
                    =================================
                    """, aba);
            }
        }
    }

    @Override
    public void tocar(int numeroMusica) {
        System.out.printf("%s", """
                ====================
                      TOCANDO
                ====================
                """);
        System.out.println("Música: " + musicas.get(numeroMusica));
    }

    @Override
    public void pausar() {
        System.out.printf("%s", """
                ====================
                      PAUSANDO
                ====================
                """);
        System.out.println("Música: " + musicas.get(indexMusicaAtual));
    }

    @Override
    public int selecionarMusica(Scanner input) {
        System.out.printf("%s", """
                    =================================
                    ESCOLHA UMA MÚSICA
                    =================================
                    """);

        for (int i = 0; i < musicas.size(); i++) {
            System.out.printf("%d -> %s%n", i, musicas.get(i));
        }

        System.out.println("Escolha: ");
        return input.nextInt();
    }

    @Override
    public void adicionarMusica(String nome) {
        musicas.add(nome);
    }

    @Override
    public void menu(Scanner input) {
        boolean running = true;
        do {


            System.out.printf("%s", """
                    =================================
                    BEM VINDO AO REPRODUTOR DE MUSICA
                    =================================
                    1- Adicionar Música
                    2- Tocar
                    3- Pausar
                    4- Sair
                    =================================
                    """);
            System.out.print("Escolha: ");
            int opcInput = input.nextInt();


            switch (opcInput) {
                case 1:
                    System.out.println("Insira o nome da música que deseja adicionar: ");
                    input.nextLine();
                    String nomeMusica = input.nextLine();
                    adicionarMusica(nomeMusica);
                    break;
                case 2:
                    int indexMusic = selecionarMusica(input);
                    tocar(indexMusic);
                    indexMusicaAtual = indexMusic;
                    break;
                case 3:
                    pausar();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    running = false;
                    break;

                default:
                    System.out.println("Selecione uma opção válida.");
                    break;
            }

        }while (running);

    }

}
