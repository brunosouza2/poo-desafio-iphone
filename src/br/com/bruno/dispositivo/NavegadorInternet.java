package br.com.bruno.dispositivo;

import java.util.Scanner;

public interface NavegadorInternet {

    void exibirPagina(String nomePaginaWeb);
    void adicionarNovaAba(String nomePaginaWeb);
    void atualizarPagina();
    void internetMenu(Scanner input);
    void exibirAbasAbertas();

}
