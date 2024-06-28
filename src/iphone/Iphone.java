package iphone;

import utilitarios.browsers.NavegadorInternet;
import utilitarios.musicas.ReprodutorMusical;
import utilitarios.telefones.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    public void atender() {
        System.out.println("Atendendo telefone no Iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz no Iphone");
    }

    public void ligar(String numero) {
        System.out.println("Fazendo ligação para o número "+ numero +" no Iphone");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do iPhone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador do iPhone");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página "+ url +" no navegador do iPhone");
    }

    public void pausar() {
        System.out.println("Pausando a música no iPhone");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica "+ musica +" no iPhone");
    }

    public void tocar() {
        System.out.println("Tocando música no iPhone");        
    }

    public static void main(String[] args) {
        Iphone ip3 = new Iphone();
        ip3.atender();
    }
}
