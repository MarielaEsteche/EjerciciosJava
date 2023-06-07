package extra05;

/**
 *
 * @author TKBio
 */
public class Cuenta {
    //Atributos 

    private double saldo;
    private String titular;

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void retirarDinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Saldo insuficiente ! ");
        } else {
            saldo -= cantidad;
       
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}
