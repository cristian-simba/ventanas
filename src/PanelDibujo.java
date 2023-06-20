import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PanelDibujo extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int ancho = getWidth();
        int alto = getHeight();
        /*g.drawLine(20,20,250,20);
        g.drawLine(20,300,20,20);
        g.drawLine(20,300,250,300);*/

        Scanner ingreso = new Scanner(System.in);
        /*String nombre;
        System.out.print("Ingrese el nombre: ");
        nombre = ingreso.nextLine();

        g.drawString(nombre,50,50);*/

        float estatura;
        float peso;
        float imc;

        System.out.println("Ingrese su estatura: ");
        estatura = ingreso.nextFloat();
        System.out.println("Ingrese su peso: ");
        peso = ingreso.nextFloat();

        imc = peso / (estatura*estatura);

    }
}
