
import javax.swing.JOptionPane;

public class InputDados_01 {
    public static void main(String[] args) {
        int nun01;
        int nun02;
        String aux;
        int total;

        aux = JOptionPane.showInputDialog("Digite um numero: ");
        nun01 = Integer.parseInt(aux);
        nun02 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        total = nun01+nun02;

        JOptionPane.showMessageDialog(null, "O resultado da soma é: "+total);
    //aqui, usamos o conversor de joptionpane (que é string) para int para podermos fazer a soma dos dois valores da variavel
    
    }
}