import javax.swing.*;

public class PruebaPanelDibujo {
    public static void main(String[] args) {
        // Crear instancia de la clase PanelDibujo y se la llama panel
        PanelDibujo panel = new PanelDibujo();
        // Pa crear un marco en la ventana
        JFrame aplicacion = new JFrame();
        // Poner un botón pa cerrar la ventana
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(panel); // Agregar el panel a la ventana
        aplicacion.setSize(420,400); // Definir el tamaño de la ventana
        aplicacion.setVisible(true); // Pa que se pueda ver la ventana
    }
}
