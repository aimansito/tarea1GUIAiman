/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author aiman
 */
public class Panel1 extends JPanel {
    private JLabel etiqueta;
    
    // Constructor pasando un color, que llama al método initComponents(),
    // y luego al método cambiarColorFondo 
    public Panel1(Color color) {
        initComponents();
        cambiarColorFondo(color);
    }
    
    // Método que inicializa los elementos gráficos del formulario
    private void initComponents() {
        etiqueta = new JLabel("Aiman Harrar Daoud 1ºDAW");
        etiqueta.setForeground(Color.white);
        // Añado la etiqueta al contenedor MiPanel (al JPanel)
        this.add(etiqueta);
    }
    
    private void cambiarColorFondo(Color color) {
        this.setBackground(color);
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }
    
    public static void main(String[] args) {
        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Aplicación");

        // Establecemos tamaño y posición
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

        // Añadimos un objeto MiPanel al JFrame
        ventanaPrincipal.add(new Panel1(Color.black));

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
