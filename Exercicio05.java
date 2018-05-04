import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio05{

    private static DecimalFormat df2 = new DecimalFormat(".##");
    
    public static void main(String[] args) {
        
        double[] pesos = new double[5];
        pesos[0] =Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso 01", "CADASTRO", JOptionPane.PLAIN_MESSAGE));
        pesos[1] =Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso 02", "CADASTRO", JOptionPane.PLAIN_MESSAGE));
        pesos[2] =Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso 03", "CADASTRO", JOptionPane.PLAIN_MESSAGE));
        pesos[3] =Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso 04", "CADASTRO", JOptionPane.PLAIN_MESSAGE));
        pesos[4] =Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso 05", "CADASTRO", JOptionPane.PLAIN_MESSAGE));

        double soma = pesos[0]+pesos[1]+pesos[2]+pesos[3]+pesos[4];

        double media = soma/pesos.length;

        JOptionPane.showMessageDialog(null, "Pesos" + "\n"
        +"\nSoma total dos pesos: " + df2.format(soma)
        +"\nMédia dos pesos: " + df2.format(media)
        );
    }
}