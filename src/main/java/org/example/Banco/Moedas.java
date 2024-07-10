package org.example.Banco;

import java.util.HashMap;
import java.util.Map;

public abstract class Moedas implements Transacoes {
    public TipoMoedas nomeMoeda;
    public float qtdSelecionada;
    public double saldo;
    public Map<TipoMoedas, Double> moedasUser;
    public TipoMoedas comp1;
    public TipoMoedas comp2;

    public Moedas() {
        moedasUser = new HashMap<>();
    }

    public abstract double getValorMoeda();

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para definir o saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para adicionar uma moeda ao Map de moedas
    public void adicionarMoeda(TipoMoedas tipo, double quantidade) {
        moedasUser.put(tipo, moedasUser.getOrDefault(tipo, 0.0) + quantidade);
    }

    // Método para obter a quantidade de uma moeda específica
    public double getQuantidadeMoeda(TipoMoedas tipo) {
        return moedasUser.getOrDefault(tipo, 0.0);
    }

    @Override
    public void comprarMoeda() {
        double valorTotal = getValorMoeda() * qtdSelecionada;
        if (valorTotal <= getSaldo()) {
            setSaldo(getSaldo() - valorTotal);
            adicionarMoeda(nomeMoeda, qtdSelecionada);
            System.out.println("Comprando " + qtdSelecionada + " de " + nomeMoeda + " ao preço de " + getValorMoeda());
        } else {
            System.out.println("Saldo insuficiente para comprar " + qtdSelecionada + " de " + nomeMoeda);
        }
    }

    @Override
    public void venderMoeda() {
        double quantidadeAtual = getQuantidadeMoeda(nomeMoeda);
        if (qtdSelecionada <= quantidadeAtual) {
            setSaldo(getSaldo() + (getValorMoeda() * qtdSelecionada));
            adicionarMoeda(nomeMoeda, -qtdSelecionada);
            System.out.println("Vendendo " + qtdSelecionada + " de " + nomeMoeda + " ao preço de " + getValorMoeda());
        } else {
            System.out.println("Quantidade insuficiente para vender " + qtdSelecionada + " de " + nomeMoeda);
        }
    }

    @Override
    public void compararMoeda() {
        double valorComp1 = moedasUser.getOrDefault(comp1, 0.0);
        double valorComp2 = moedasUser.getOrDefault(comp2, 0.0);
        System.out.println("Comparação de Moedas:");
        System.out.println(comp1 + ": " + valorComp1);
        System.out.println(comp2 + ": " + valorComp2);
    }

    @Override
    public void imprimirMoedas() {
        System.out.println("Moedas do Usuário:");
        for (Map.Entry<TipoMoedas, Double> entry : moedasUser.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("Saldo: " + getSaldo());
    }
}
