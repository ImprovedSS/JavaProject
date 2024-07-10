package org.example;

import org.example.Banco.TipoMoedas;

import java.util.HashMap;
import java.util.Map;

public abstract class Users {
    protected String nome;
    protected String cpf;
    protected String idConta;
    protected String senha;
    public double saldo;
    protected Map<TipoMoedas, Double> moedasUser;

    public Users() {
        moedasUser = new HashMap<>();
    }

    public Map<TipoMoedas, Double> getMoedasUser() {
        return moedasUser;
    }

    public void setMoedasUser(Map<TipoMoedas, Double> moedasUser) {
        this.moedasUser = moedasUser;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para adicionar uma quantidade de uma moeda específica
    public void adicionarMoeda(TipoMoedas tipo, double quantidade) {
        moedasUser.put(tipo, moedasUser.getOrDefault(tipo, 0.0) + quantidade);
    }

    // Método para obter a quantidade de uma moeda específica
    public double getQuantidadeMoeda(TipoMoedas tipo) {
        return moedasUser.getOrDefault(tipo, 0.0);
    }
}
