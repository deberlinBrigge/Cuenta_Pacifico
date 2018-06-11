/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_pacifico;

import Modelo.Cuenta;
import Modelo.Cuenta_Ahorro;
import Modelo.Cuenta_corriente;
import Modelo.Cuenta_juvenil;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Banco_Pacifico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta_Ahorro ahorro = new Cuenta_Ahorro();
        ahorro.setValor_deposito(100);
        ahorro.setTitula("Deberlin Brigge Maldonado Vasquez");
        ahorro.setValor_retiro(50);

        Cuenta_juvenil juvenil = new Cuenta_juvenil();
        juvenil.setValor_deposito(300);
        juvenil.setTitula("Jose Carlos Andrades Moran");
        juvenil.setValor_retiro(200);
        Cuenta_corriente corriente = new Cuenta_corriente();
        corriente.setValor_deposito(1000);
        corriente.setTitula("Ericka  veronica Vera Acosta");
        corriente.setValor_retiro(200);

        List<Cuenta> cuenta = new ArrayList<Cuenta>();

        cuenta.add(ahorro);
        cuenta.add(juvenil);
        cuenta.add(corriente);

        for (Cuenta cuentas : cuenta) {
            cuentas.depositar();
            cuentas.retirar();
            cuentas.consultar_saldo();
            corriente.Reintegro(0);

        }

        Scanner s = new Scanner(System.in);
        s.nextLine();
    }

}
