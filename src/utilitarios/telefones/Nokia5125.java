package utilitarios.telefones;

public class Nokia5125 implements AparelhoTelefonico{

    public void ligar(String numero) {
        System.out.println("Fazendo ligação para o número "+ numero +" no Nokia5125");
    }

    public void atender() {
        System.out.println("Atendendo telefone no Nokia5125");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz no Nokia5125");

    }

}
