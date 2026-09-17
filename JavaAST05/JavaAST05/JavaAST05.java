package JavaAST05;

public class JavaAST05 {

    public static void main(String[] args) {
        imprimirCabecalhos();
        imprimirCorpoHtml();
    }

    private static void imprimirCabecalhos() {
        System.out.println("Content-Type: text/html");
        System.out.println();
    }

    private static void imprimirCorpoHtml() {
        System.out.println("<html>");
        System.out.println("<head>");
        System.out.println("<title>Java CGI</title>");
        System.out.println("</head>");
        System.out.println("<body>");
        System.out.println("<h1>Olá, Terráqueos!</h1>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}