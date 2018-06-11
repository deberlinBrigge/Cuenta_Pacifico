/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Miguel
 */
public abstract class Cuenta {

    private int id;
    private int numero_cuenta;
    private String titular;
    private double saldo;
    private double valor_deposito;
    private double valor_retiro;
    //private doublprivate double valor_deposito;e interes;

    public Cuenta(int id) {
        this.id = id;
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public void depositar() {
        System.out.println(String.format(" deposito de:"));
    }

    public void retirar() {
        System.out.println(String.format(" Retiro de:"));
    }

    public void consultar_saldo() {
        System.out.println(String.format(" Saldo de :"));

    }

    public void tranferir() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getTitula() {
        return titular;
    }

    public void setTitula(String titula) {
        this.titular = titula;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor_deposito() {
        return valor_deposito;
    }

    public void setValor_deposito(double valor_deposito) {
        this.valor_deposito = valor_deposito;
    }

    public double getValor_retiro() {
        return valor_retiro;
    }

    public void setValor_retiro(double valor_retiro) {
        this.valor_retiro = valor_retiro;
    }

}
