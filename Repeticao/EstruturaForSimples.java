import javax.swing.JOptionPane;

public class EstruturaForSimples {
    public static void main(String[] args) {
        double nota1, nota2;
        for (int contador=1; contador<=5; contador++){
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
            JOptionPane.showMessageDialog(null, "A média é: " + (nota1 + nota2) / 2);
        }
    }
}
