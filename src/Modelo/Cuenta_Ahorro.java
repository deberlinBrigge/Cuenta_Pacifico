package Modelo;

/**
 *
 * @author Miguel
 */
public class Cuenta_Ahorro extends Cuenta {

    private double interes;
    private double saldo;

    public Cuenta_Ahorro(int id) {
        super(id);
    }

    public Cuenta_Ahorro() {
    }

    @Override
    public void depositar() {
        super.depositar();

        System.out.println(String.format("Cta. Ahorro  valor $  %s", this.getValor_deposito()));
        System.out.println(String.format("titular $  %s", this.getTitula()));

    }

    @Override
    public void retirar() {
        super.retirar();

        System.out.println(String.format("Cta. Ahorro  valor $  %s", this.getValor_retiro()));
    }

    @Override

    public void consultar_saldo() {
        super.consultar_saldo();
        saldo = this.getValor_deposito() - this.getValor_retiro();

        System.out.println(String.format("Cta. Ahorro  valor  $  %s", saldo));
    }

}

