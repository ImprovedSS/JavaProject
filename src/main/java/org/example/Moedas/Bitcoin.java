package org.example.Moedas;

import org.example.Banco.Moedas;
import org.example.Banco.TipoMoedas;

public class Bitcoin extends Moedas {
    private static final double VALOR_MOEDA = 313134.75;
    private static final float QTD_MOEDAS = 18850000;

    public Bitcoin() {
        this.nomeMoeda = TipoMoedas.BITCOIN;
    }

    @Override
    public double getValorMoeda() {
        return VALOR_MOEDA;
    }

    public float getQtdMoedas() {
        return QTD_MOEDAS;
    }
}
