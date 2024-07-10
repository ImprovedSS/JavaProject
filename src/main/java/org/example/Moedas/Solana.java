package org.example.Moedas;

import org.example.Banco.Moedas;
import org.example.Banco.TipoMoedas;

public class Solana extends Moedas {
    private static final double VALOR_MOEDA = 142.45;
    private static final float QTD_MOEDAS = 464000000;

    public Solana() {
        this.nomeMoeda = TipoMoedas.SOLANA;
    }

    @Override
    public double getValorMoeda() {
        return VALOR_MOEDA;
    }

    public float getQtdMoedas() {
        return QTD_MOEDAS;
    }
}
