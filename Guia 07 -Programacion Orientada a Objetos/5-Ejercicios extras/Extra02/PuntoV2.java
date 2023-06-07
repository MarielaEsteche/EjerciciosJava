package punto;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class PuntoV2 {

//generamos atributos
    private int x1, y1, x2, y2;
//Generamos los constructores vacios

    public PuntoV2() {
        setX1(0);
        setY1(0);
        setX2(0);
        setY2(0);
    }
    //generamos los contructores por parametro

    public PuntoV2(int x1, int y1, int x2, int y2) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }

    //Getters y1 Setters
    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    private void setX1(int x1) {
        if (x1 < 0) {
            this.x1 = 0;
        } else {
            this.x1 = x1;
        }
    }

    private void setX2(int x2) {
        if (x2 < 0) {
            this.x2 = 0;
        } else {
            this.x2 = x2;
        }

    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    private void setY1(int y1) {
        if (y1 < 0) {
            this.y1 = 0;
        } else {
            this.x1 = y1;
        }
    }

    private void setY2(int y2) {
        if (y2 < 0) {
            this.y2 = 0;
        } else {
            this.x1 = y2;
        }

    }

    public double modulo1() {
        return Math.sqrt((this.x1 * this.x1) + (this.y1 * this.y1));
    }

    public double modulo2() {
        return Math.sqrt((this.x2 * this.x2) + (this.y2 * this.y2));
    }

    public double fase1() {
        return Math.atan((double) this.x1 / this.y1);
    }

    public double fase2() {
        return Math.atan((double) this.x2 / this.y2);
    }

    @Override
    public String toString() {
        return " Coordenada x: " + this.x1 + "\n Coordenada y: " + this.y1 + "\n Coordenada x: " + this.x2 + "\n Coordenada y: " + this.y2;
    }

    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el valor de x1: ");
        x1 = leer.nextInt();
        System.out.println("Ingresa el valor de y1: ");
        y1 = leer.nextInt();
        System.out.println("Ingresa el valor de x2: ");
        x2 = leer.nextInt();
        System.out.println("Ingresa el valor de y2: ");
        y2 = leer.nextInt();
        System.out.println("------------------------------------------");
    }

    public double calcularDistancia() {
        double distancia;
        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }
}
