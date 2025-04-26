package data;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    private static int valorContador = 0;

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Ventana");
        ventana.setVisible(true);
        ventana.setSize(500, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);

        JButton boton = new JButton("Pulsar");
        boton.setBounds(100, 100, 100, 100);
        ventana.add(boton);

        JLabel contador = new JLabel("Contador: 0");
        contador.setBounds(100, 220, 200, 30);
        ventana.add(contador);

        boton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        valorContador++;
        contador.setText("Contador: " + valorContador);
    }
});

    }
}
