class ReprodutorMusical {
    String[] musicas = new String[5];

    void tocar(String musica) {
        selecionarMusica(musica);
        System.out.println("Tocando música: " + musica);
    }

    void pausar() {
        System.out.println("Música pausada");
    }

    void selecionarMusica(String musica) {
        if (musica.equals(musicas)) {
            System.out.println("Música selecionada: " + musica);
        } else {
            System.out.println("Música não encontrada");
        }
    }
}

class AparelhoTelefonico {
    String[] contatos = new String[5];
    boolean redeMovelDisponivel;

    boolean verifixarRedeMovel(boolean redeMovel) {
        if (redeMovel) {
            System.out.println("Rede móvel disponível");
            return true;
        } else {
            System.out.println("Rede móvel indisponível");
            return false;
        }
    }

    void ligar(String contato) {
        if (redeMovelDisponivel) {
            if (contato.equals(contatos)) {
                System.out.println("Ligando para: " + contato);
            } else {
                System.out.println("Contato não encontrado");
            }
        }
    }

    void atender() {
        System.out.println("Atendendo chamada...");
    }
}

class Navegador {
    boolean internetDisponivel;

    boolean verificarConexaoInternet(boolean internetDisponivel) {
        if (internetDisponivel) {
            System.out.println("Conexão com a internet disponível");
            return true;
        } else {
            System.out.println("Conexão com a internet indisponível");
            return false;
        }
    }

    void exibirPagina(String pagina) {
        if (internetDisponivel) {
            System.out.println("Exibindo página: " + pagina);
        } else {
            System.out.println("Sem conexão com a internet");
        }
    }

    void adicionarNovaPagina(String pagina) {
        if (internetDisponivel) {
            System.out.println("Adicionando página: " + pagina);
        } else {
            System.out.println("Sem conexão com a internet");
        }
    }

    void atualizarPagina() {
        if (internetDisponivel) {
            System.out.println("Atualizando página");
        } else {
            System.out.println("Sem conexão com a internet");
        }
    }
}

public class Iphone {
    public static void main(String[] args) throws Exception {
        // Reprodutor musical
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.musicas[0] = "Música 1";
        reprodutor.musicas[1] = "Música 2";
        reprodutor.musicas[2] = "Música 3";
        reprodutor.musicas[3] = "Música 4";
        reprodutor.musicas[4] = "Música 5";

        reprodutor.tocar("Música 1");
        reprodutor.pausar();

        // Aparelho telefônico
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.contatos[0] = "Contato 1";
        telefone.contatos[1] = "Contato 2";
        telefone.contatos[2] = "Contato 3";
        telefone.contatos[3] = "Contato 4";
        telefone.contatos[4] = "Contato 5";

        telefone.verifixarRedeMovel(true);
        telefone.ligar("Contato 1");
        telefone.atender();

        // Navegador
        Navegador navegador = new Navegador();
        navegador.internetDisponivel = true;

        navegador.verificarConexaoInternet(true);
        navegador.exibirPagina("Página 1");
        navegador.adicionarNovaPagina("Página 2");
        navegador.atualizarPagina();
    }
}
