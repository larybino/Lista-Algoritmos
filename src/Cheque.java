import java.text.DecimalFormat;

public class Cheque {
    public static void main(String[] args) {
        double valor1 = 15415.16;
        double valor2 = 0.05;
        double valor3 = 2.25;

        System.out.println("Valor: " + new DecimalFormat("#,##0.00").format(valor1) + " - " + valorPorExtenso(valor1));
        System.out.println("Valor: " + new DecimalFormat("#,##0.00").format(valor2) + " - " + valorPorExtenso(valor2));
        System.out.println("Valor: " + new DecimalFormat("#,##0.00").format(valor3) + " - " + valorPorExtenso(valor3));
    }

    public static String numeroEscrito(long numero) {
        String[] UNIDADES = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] DEZENAS = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        String[] CENTENAS = {"", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
        String[] MILHARES = {"", "mil", "milhão", "bilhão"};
        String resultado = "";
        int grupo = 0;
        if (numero == 100) {
            return "cem";
        }
        while (numero > 0) {
            int parte = (int) (numero % 1000);
            if (parte > 0) {
                String partePorExtenso = "";
                if (parte >= 100) {
                    partePorExtenso += CENTENAS[parte / 100];
                    parte %= 100;
                    if (parte > 0) {
                        partePorExtenso += " e ";
                    }
                }
                if (parte >= 20) {
                    partePorExtenso += DEZENAS[parte / 10];
                    parte %= 10;
                    if (parte > 0) {
                        partePorExtenso += " e ";
                    }
                }
                if (parte > 0) {
                    partePorExtenso += UNIDADES[parte];
                }
                if (!resultado.isEmpty()) {
                    resultado = partePorExtenso + " " + MILHARES[grupo] + " e " + resultado;
                } else {
                    resultado = partePorExtenso + " " + MILHARES[grupo];
                }
            }
            numero /= 1000;
            grupo++;
        }
        return resultado.trim();
    }

    public static String valorPorExtenso(double valor) {
        if (valor == 0) {
            return "zero reais";
        }

        long parteInteira = (long) valor;
        int centavos = (int) Math.round((valor - parteInteira) * 100);

        String valorExtenso = "";
        if (parteInteira > 0) {
            valorExtenso += numeroEscrito(parteInteira) + (parteInteira > 1 ? " reais" : " real");
        }
        if (centavos > 0) {
            if (!valorExtenso.isEmpty()) {
                valorExtenso += " e ";
            }
            valorExtenso += numeroEscrito(centavos) + (centavos > 1 ? " centavos" : " centavo");
        }

        return valorExtenso;
    }
}
