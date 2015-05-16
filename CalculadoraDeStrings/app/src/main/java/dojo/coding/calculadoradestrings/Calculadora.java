package dojo.coding.calculadoradestrings;

/**
 * Created by glauco on 5/13/15.
 */
public class Calculadora {
    public int soma(String numeros) {
        String delimitador = "\n";
        if (numeros.equals(""))
            return 0;

        if (numeros.startsWith("//")) {
            int posicaoBarraN = numeros.indexOf("\n");
            delimitador = numeros.substring(2, posicaoBarraN);
            numeros = numeros.substring(posicaoBarraN + 1);
        }

        numeros = numeros.replace(delimitador, ",");

        String[] arrayDeNumeros = numeros.split(",");

        int soma = 0;
        for (String num : arrayDeNumeros) {
            soma += Integer.parseInt(num);
        }

        return soma;
    }
}
