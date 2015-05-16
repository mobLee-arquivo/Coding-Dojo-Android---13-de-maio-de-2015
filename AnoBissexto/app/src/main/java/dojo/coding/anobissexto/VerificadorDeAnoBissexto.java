package dojo.coding.anobissexto;

public class VerificadorDeAnoBissexto {

    public boolean ehAnoBissexto(int ano) {
        return ano % 400 == 0 || ano % 100 != 0 && ano % 4 == 0;
    }
}
