package br.com.bruno.dispositivo;

public abstract class AparelhoTelefonico implements NavegadorInternet, ReprodutorMusical {

    void ligar(String numero) {
        System.out.printf("""
                 =======================
                 Ligando...
                 Número: %s
                 =======================
                
                """, numero);
    }

    void atender() {
        System.out.println("""
                 =======================
                 Atendendo...
                 =======================
                
                """);
    }

    void iniciarCorreioVoz() {
        System.out.println("""
                 =========================
                 Iniciando Correio de Voz
                 =========================
                
                """);
    }



}
