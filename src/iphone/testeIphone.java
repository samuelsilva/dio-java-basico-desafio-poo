package iphone;


public class testeIphone {
    public static void main(String[] args) {
        Iphone iPhone3 = new Iphone();
        // Acessar internet
        iPhone3.adicionarNovaAba();
        iPhone3.exibirPagina("web.dio.me");
        iPhone3.atualizarPagina();

        // Realizar ligação
        iPhone3.atender();
        iPhone3.ligar("99879-8787");
        iPhone3.iniciarCorreioVoz();

        // Executar música
        iPhone3.selecionarMusica("Stand by me");
        iPhone3.tocar();
        iPhone3.pausar();
    }
}
