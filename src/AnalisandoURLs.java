public class AnalisandoURLs {
    public static void main(String[] args) throws Exception {
        String url1 = "http://www.google.com/mail/user=fulano";
        String url2 = "ssh://fulano:senha@git.com/";
        System.out.println("Analisando URL: " + url1);
        analisandoUrl(url1);
        System.out.println("\nAnalisando URL: " + url2);
        analisandoUrl(url2);
    }

    public static void analisandoUrl(String url){
        String protocolo = null;
        String usuario = null;
        String senha = null;
        String host = null;
        String dominio = null;
        String caminho = null;
        String parametros = null;

        int protocolotermina= url.indexOf("://");
        if (protocolotermina != -1){
            protocolo = url.substring(0, protocolotermina);
            url = url.substring(protocolotermina + 3);
        }
        int arrobatermina= url.indexOf('@');
        if (arrobatermina != -1){
            String infoUsuario = url.substring(0, arrobatermina);
            int indiceDoisPontos = infoUsuario.indexOf(':');
            if (indiceDoisPontos != -1) {
                usuario = infoUsuario.substring(0, indiceDoisPontos);
                senha = infoUsuario.substring(indiceDoisPontos + 1);
            } else {
                usuario = infoUsuario;
            }
            url = url.substring(arrobatermina + 1);
        }
        int barrafim = url.indexOf('/');
        if (barrafim != -1) {
            String hostEDominio = url.substring(0, barrafim);
            url = url.substring(barrafim);
            int indicePonto = hostEDominio.indexOf('.');
            if (indicePonto != -1) {
                host = hostEDominio.substring(0, indicePonto);
                dominio = hostEDominio.substring(indicePonto + 1);
            } else {
                host = hostEDominio;
            }
        } else {
            int indicePonto = url.indexOf('.');
            if (indicePonto != -1) {
                host = url.substring(0, indicePonto);
                dominio = url.substring(indicePonto + 1);
            } else {
                host = url;
            }
            url = "";
        }
        int interrogacao = url.indexOf('?');
        if (interrogacao != -1) {
            caminho = url.substring(0, interrogacao);
            parametros = url.substring(interrogacao + 1);
        } else {
            caminho = url;
        }

        System.out.println("Protocolo: " + (protocolo != null ? protocolo : "N/A"));
        System.out.println("Usuário: " + (usuario != null ? usuario : "N/A"));
        System.out.println("Senha: " + (senha != null ? senha : "N/A"));
        System.out.println("Host: " + (host != null ? host : "N/A"));
        System.out.println("Domínio: " + (dominio != null ? dominio : "N/A"));
        System.out.println("Caminho: " + (caminho != null ? caminho : "N/A"));
        System.out.println("Parâmetros: " + (parametros != null ? parametros : "N/A"));
    }
}
