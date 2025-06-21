public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("Michael Jackson - Smooth Criminal ");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        meuIphone.ligar("1234-5678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador
        meuIphone.exibirPagina("https://www.youtube.com/watch?v=h_D3VFfhvs4");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
