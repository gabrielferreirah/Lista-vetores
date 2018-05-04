import javax.swing.JOptionPane;

public class Exercicio02{
    
    public static void main(String[] args) {
        
        String[] nomes = new String[10];
        nomes[0] = "Ana";
        nomes[1] = "Alda";
        nomes[2] = "Alisson";
        nomes[3] = "Crislaine";
        nomes[4] = "Felipe";
        nomes[5] = "Francisco";
        nomes[6] = "Gabriel";
        nomes[7] = "Jéssica";
        nomes[8] = "Karoline";
        nomes[9] = "Miguel";

        JOptionPane.showMessageDialog(null, "Nomes"
        +"\nNome 01: " + nomes[0] + "\n"
        +"\nNome 02: " + nomes[1] + "\n"
        +"\nNome 03: " + nomes[2] + "\n"
        +"\nNome 04: " + nomes[3] + "\n"
        +"\nNome 05: " + nomes[4] + "\n"
        +"\nNome 06: " + nomes[5] + "\n"
        +"\nNome 07: " + nomes[6] + "\n"
        +"\nNome 08: " + nomes[7] + "\n"
        +"\nNome 09: " + nomes[8] + "\n"
        +"\nNome 10: " + nomes[9] + "\n"
        );
    }
}