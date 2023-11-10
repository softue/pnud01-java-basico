import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
    	
    	JOptionPane.showMessageDialog(
    			null, 
    			"Mensagem que será exinida",
    			"Título",
    			0
		);
    	
    	String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
    	String input2 = (String) JOptionPane.showInputDialog(null,
    			"Esta é uma pergunta?",
    			"Título da Caixa de Diálogo",
    			2,
    			null,
    			acceptableValues,
    			acceptableValues[1]);

        String input = (String) JOptionPane.showInputDialog(
        		null, // parentComponent
        		"Esta é uma pergunta?", // message 
        		"Título da Caixa de Diálogo", // title
        		1, // 0: x vermelho; 1: i de informação azul; 2: exclamação amarela; 3: interrogação verde  
        		null, // icon
        		null, // selectionValues?
        		"Digite algo aqui." // initialSelectionValue
		);        
        
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String userInput = JOptionPane.showInputDialog("Digite um numero aí", "String");
        System.out.println(userInput);
        
        //Parse the input as an int.
        //Print its value +1
        int intUserInput = Integer.parseInt(userInput);
        System.out.println(++intUserInput);
                
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int oneLineInfo = Integer.parseInt(JOptionPane.showInputDialog("Digite um número aí novamente, por favor"));
        System.out.println(oneLineInfo);
        

        
    }
}
