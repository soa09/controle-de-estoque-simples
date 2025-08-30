package ConvertorDeMoedas;

public class Convertor {


    public static String resposta;
    public static String conti;
    public static double dollar;
    public static double reais;
    public static double cotacaoEmDolar = 5.42;
    public static double cotacaoEmReais = 5.20;


    public static double DolarPaReais() {
        return cotacaoEmReais * dollar;
    }

    public static double ReaisPaDollar() {
        return   reais / cotacaoEmDolar;
    }


}
