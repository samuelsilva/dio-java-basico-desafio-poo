package utilitarios.browsers;

public class Chrome implements NavegadorInternet{

    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url + " no Chrome");        
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Chrome");        

    }

    public void atualizarPagina() {
        System.out.println("Atualizando Página no Chrome");        

    }

}
