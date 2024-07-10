package org.example.Moedas;

import org.example.Banco.Moedas;
import org.example.Banco.TipoMoedas;

public class Dogecoin extends Moedas {
    private static final double VALOR_MOEDA = 0.58;
    private static final float QTD_MOEDAS = 145000000;

    public Dogecoin() {
        this.nomeMoeda = TipoMoedas.DOGECOIN;
    }

    @Override
    public double getValorMoeda() {
        return VALOR_MOEDA;
    }

    public float getQtdMoedas() {
        return QTD_MOEDAS;
    }
}
