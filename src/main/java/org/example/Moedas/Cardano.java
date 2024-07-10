package org.example.Moedas;

import org.example.Banco.Moedas;
import org.example.Banco.TipoMoedas;

public class Cardano extends Moedas {
    private static final double VALOR_MOEDA = 2.03;
    private static final float QTD_MOEDAS = 45000000;

    public Cardano() {
        this.nomeMoeda = TipoMoedas.CARDANO;
    }

    @Override
    public double getValorMoeda() {
        return VALOR_MOEDA;
    }

    public float getQtdMoedas() {
        return QTD_MOEDAS;
    }
}
