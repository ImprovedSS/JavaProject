package org.example.Moedas;

import org.example.Banco.Moedas;
import org.example.Banco.TipoMoedas;

public class Etherium extends Moedas {
    private static final double VALOR_MOEDA = 16528.1;
    private static final float QTD_MOEDAS = 117765776;

    public Etherium() {
        this.nomeMoeda = TipoMoedas.ETHERIUM;
    }

    @Override
    public double getValorMoeda() {
        return VALOR_MOEDA;
    }

    public float getQtdMoedas() {
        return QTD_MOEDAS;
    }
}
