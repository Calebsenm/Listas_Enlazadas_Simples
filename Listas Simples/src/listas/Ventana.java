// creame la ventenaa grafica 

import javax.swing.JFrame;

public class Ventana extends JFrame {

    public Ventana() {

        super("Lista Simples");
        setBounds(100, 100, 500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
    }


}
