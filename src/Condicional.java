public class Condicional {
    public static void main (String[] args) {
        int anodelancamento = 2022;
        boolean incluidonoplano = true;
        double notadofilme= 8.1;
        String tipoPlano = "Plus";

        if (anodelancamento >= 2022) {
            System.out.println("Lançamento que os cliente estão curtindo");
        }else {
            System.out.println("Filme retro que vale a pena (?)");
        }

        if (incluidonoplano =true || tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
