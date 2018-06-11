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
public class Cuenta_juvenil extends Cuenta {

    private double saldo;

    public Cuenta_juvenil(int id) {
        super(id);
    }

    public Cuenta_juvenil() {
    }

    @Override
    public void depositar() {
        super.depositar();
   
        System.out.println(String.format("Cta. Juveni  valor $  %s", this.getValor_deposito()));
        System.out.println(String.format("titular $  %s", this.getTitula()));
    }

    @Override
    public void retirar() {
        super.retirar();

        System.out.println(String.format("Cta. Juvenil  valor $  %s", this.getValor_retiro()));
    }

    @Override

    public void consultar_saldo() {
        super.consultar_saldo();
        saldo = this.getValor_deposito() - this.getValor_retiro();

        System.out.println(String.format("Cta.Juvenil  valor  $  %s", saldo));
    }

}
