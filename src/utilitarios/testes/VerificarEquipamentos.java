package utilitarios.testes;

import utilitarios.browsers.Chrome;
import utilitarios.browsers.NavegadorInternet;
import utilitarios.musicas.ReprodutorMusical;
import utilitarios.musicas.Winamp;
import utilitarios.telefones.AparelhoTelefonico;
import utilitarios.telefones.Nokia5125;

public class VerificarEquipamentos {
    public static void main(String[] args) {
        NavegadorInternet chrome = new Chrome();
        chrome.adicionarNovaAba();
        chrome.exibirPagina("web.dio.me");
        chrome.atualizarPagina();

        ReprodutorMusical wmp = new Winamp();
        wmp.selecionarMusica("Scar Tissue");
        wmp.tocar();
        wmp.pausar();

        AparelhoTelefonico nk = new Nokia5125();
        nk.ligar("99999-9999");
        nk.atender();
        nk.iniciarCorreioVoz();


    }
}
