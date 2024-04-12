/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author aiman
 */
public class Panel2 extends JPanel {
    private JLabel etiqueta;
    
    // Constructor pasando un color, que llama al método initComponents(),
    // y luego al método cambiarColorFondo 
    public Panel2(Color color) {
        initComponents();
        cambiarColorFondo(color);
    }

    // Método que inicializa los elementos gráficos del formulario
    private void initComponents() {
        // Construimos la etiqueta con el texto que queremos que muestre
        etiqueta = new JLabel("Etiqueta de MiPanel");
        // Añade la etiqueta al contenedor MiPanel (al JPanel)
        this.add(etiqueta);
    }

    private void cambiarColorFondo(Color color) {
        // Establece el color de fondo del panel
        this.setBackground(color);
    }

    // Método getter
    public JLabel getEtiqueta() {
        return etiqueta;
    }
    public static void main(String[] args) {
         // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Aiman Harrar Daoud");

        // Establecemos posición y tamaño
        ventanaPrincipal.setBounds(250, 250, 800, 600);

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre 	
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        // Añadimos los paneles en cada posición del BorderLayout
        // Añadir panel amarillo en la posición superior (NORTH)
        Panel2 p1 = new Panel2(Color.white);
        Panel2 p2 = new Panel2(Color.green);
        Panel2 p3 = new Panel2(Color.red);
        Panel2 p4 = new Panel2(Color.cyan);
        Panel2 p5 = new Panel2(Color.DARK_GRAY);
        //---
        p1.etiqueta.setText("Hola");
        p2.etiqueta.setText("Soy");
        p3.etiqueta.setText("Aiman");
        p4.etiqueta.setText("Harrar");
        p5.etiqueta.setText("Daoud");

        ventanaPrincipal.add(p1, BorderLayout.NORTH);

        // Añadir panel rojo en la posición inferior (SOUTH)
        ventanaPrincipal.add(p2, BorderLayout.WEST);
        // Añadir panel gris en la posición central (CENTER)

        ventanaPrincipal.add(p3, BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
        ventanaPrincipal.add(p4, BorderLayout.EAST);

        // Añadir panel cián en la posición derecha (EAST)
        ventanaPrincipal.add(p5, BorderLayout.SOUTH);

        ventanaPrincipal.setResizable(false);
    }
}
