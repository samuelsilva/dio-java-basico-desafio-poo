package utilitarios.musicas;

public class Winamp implements ReprodutorMusical{

    public void tocar() {
        System.out.println("Tocando Música no Winamp");        

    }

    public void pausar() {
        System.out.println("Pausando Música no Winamp");        
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica + "no Winamp");        
    }

}
