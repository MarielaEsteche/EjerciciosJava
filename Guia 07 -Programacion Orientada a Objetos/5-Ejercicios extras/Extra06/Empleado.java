package extra06;

/**
 *
 * @author TKBio
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void calcular_aumento() {
        if (edad > 30) {
            salario = salario * 1.1;
        } else {
            salario = salario * 1.05;
        }

    }

    public void info() {
        System.out.println("-------------------------------------------");
        System.out.println("El/la empleado/a : " + nombre);
        System.out.println("De : " + edad + " años de edad ");
        System.out.println("Con un salario de : $ " + salario);
        System.out.println("-------------------------------------------");

    }
}
     /*De esta manera el metodo no necesita tanto sout
    @Override
    public String toString() {
        return "-------------------------------------------" + "\n"
                + "El/la empleado/a : " + nombre + "\n"
                + "De : " + edad + " años de edad " + "\n"
                + "Con un salario de : $ " + salario + "\n"
                + "-------------------------------------------";
         */