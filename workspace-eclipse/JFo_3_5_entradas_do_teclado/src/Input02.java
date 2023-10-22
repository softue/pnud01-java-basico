import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "O valor de PI é " + Math.PI,
                "Input02",
                3);
        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                null,
                "Type something here.");
        
        
        String[] acceptableValues = {"0.1", "0.5", "0.9"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Seleciona a taxa a ser aplicada",
                "Comércio eletrônico",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
        System.out.println(100 * Double.parseDouble(input2));
    }
}
