import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio04{

    private static DecimalFormat df2 = new DecimalFormat(".##");
    
    public static void main(String[] args) {
        
        String disciplina = JOptionPane.showInputDialog(null, "Digite sua disciplina", "Boletim", JOptionPane.PLAIN_MESSAGE);

        double[] notas = new double[4];
        notas[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 01", "Boletim", JOptionPane.PLAIN_MESSAGE));
        notas[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 02", "Boletim", JOptionPane.PLAIN_MESSAGE));
        notas[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 03", "Boletim", JOptionPane.PLAIN_MESSAGE));
        notas[3] = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 04", "Boletim", JOptionPane.PLAIN_MESSAGE));

        double soma = (notas[0]+notas[1]+notas[2]+notas[3]);

        double media = (soma/notas.length);
        
        JOptionPane.showMessageDialog(null, "BOLETIM" + "\n"
        + "\nDisciplina: " + disciplina
        + "\nNota 01: " + notas[0]
        + "\nNota 02: " + notas[1]
        + "\nNota 03: " + notas[2]
        + "\nNota 04: " + notas[3] + "\n"
        + "\nMédia: " + df2.format(media)
        );
    }
}