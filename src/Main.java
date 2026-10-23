import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o screen match");
        System.out.println("Filme Shin Godzilla");
        int anodeLancamento = 2016;
        System.out.println("Ano de Lançamento" + anodeLancamento);
        boolean incluidonoplano = true;
        double notaDoFilme = 8.1;


        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Shin Godzilla!
                Que Deus Nos Ajude
                Ano de Lançamento
                """ + anodeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}