import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio03{

    private static DecimalFormat df2 = new DecimalFormat(".##");
    
    public static void main(String[] args) {
        
        String[] nomes = new String[7];
        double[] precos = new double[7];
        
        nomes[0] = "Teclado Mecanico";
        precos[0] = 150;

        nomes[1] = "Mouse gamer";
        precos[1] = 150;

        nomes[2] = "Headset 7.1";
        precos[2] = 200;

        nomes[3] = "Monitor 120Hz";
        precos[3] = 900;

        nomes[4] = "Cadeira DxRacer";
        precos[4] = 600;

        nomes[5] = "Placa mãe";
        precos[5] = 300;

        nomes[6] = "Processador";
        precos[6] = 800;

        JOptionPane.showMessageDialog(null, "Loja" + "\n" +
        "\n" + nomes[5] + "  R$" + df2.format(precos[5]) +
        "\n" + nomes[6] + "  R$" + df2.format(precos[6]) +
        "\n" + nomes[0] + "  R$" + df2.format(precos[0]) +
        "\n" + nomes[1] + "  R$" + df2.format(precos[1]) +
        "\n" + nomes[2] + "  R$" + df2.format(precos[2]) +
        "\n" + nomes[3] + "  R$" + df2.format(precos[3]) +
        "\n" + nomes[4] + "  R$" + df2.format(precos[4])
        );
    }
}