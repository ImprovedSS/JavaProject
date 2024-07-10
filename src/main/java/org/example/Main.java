package org.example;

import org.example.Banco.Moedas;
import org.example.Banco.TipoMoedas;
import org.example.Moedas.Bitcoin;
import org.example.Moedas.Cardano;
import org.example.Moedas.Dogecoin;
import org.example.Moedas.Etherium;
import org.example.Moedas.Solana;

public class Main {
    public static void main(String[] args) {

        Users user = new Users() {};

        user.setNome("João");
        user.setCpf("12345678900");
        user.setIdConta("001");
        user.setSenha("senha123");
        user.setSaldo(10);

        Moedas bitcoin = new Bitcoin();
        bitcoin.qtdSelecionada = 2;
        bitcoin.setSaldo(user.getSaldo());
        bitcoin.comprarMoeda();
        user.setSaldo(bitcoin.getSaldo());

        bitcoin.qtdSelecionada = 1;
        bitcoin.venderMoeda();
        user.setSaldo(bitcoin.getSaldo());


        bitcoin.comp1 = TipoMoedas.BITCOIN;
        bitcoin.comp2 = TipoMoedas.ETHERIUM;
        bitcoin.compararMoeda();

        bitcoin.imprimirMoedas();
        bitcoin.imprimirSaldo();
    }
}
