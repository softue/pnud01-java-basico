package br.jus.trt13.javafxmain;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXMain extends Application {

    @Override
    // start() é o ponto de entrada de todos os aplicativos JavaFX
    // Considere-o como o método main do JavaFX
    public void start(Stage primaryStage) {
        
        /*
         * Objetos como esse são denominados Nós do JavaFX
         * −btn.getText()
         * −btn.setMinHeight()
         * −btn.setLayoutX() //definir a posição de x
         * −btn.setLayoutY() //definir a posição de y
         * −btn.isPressed()
         * 
         * Exemplos de nós:
         * - Button, Rectangle, ScrollBar, Text, PieChart, ImageView
         * 
         * Os objetos visuais que você criará muito provavelmente...
         * − Serão um Nó ou
         * − Incluirão um Nó como um campo
         * 
         * Depois que você instancia um Nó:
         * −Ele existe e a memória é alocada para armazenar o objeto
         * −Seus campos podem ser manipulados, e os métodos podem ser chamados
         * −Mas pode ser que não sejam exibidos por enquanto
         */
        Button btn = new Button();
        btn.setText("Clicar aqui");
        
        /*
         * A interação do Botão utiliza uma "classe interna anônima"
         * −Expressões Lambda do Java SE 8 são uma alternativa elegante
         * 
         */
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Obrigado por clicar!");
            }
        });

        Button btn2 = new Button();
        btn2.setText("Outro botão");

        // Cada Painel determina o layout dos Nós
        StackPane root = new StackPane();
        //VBox root = new VBox();
        // não adicione o mesmo Nó mais de uma vez
        root.getChildren().addAll(btn, btn2);
        btn.setLayoutY(200); // não funciona
        //root.getChildren().add(btn2);
        //root.getChildren().add(btn);

        /*
         * Um Group pode Conter um Painel
         * Os Painéis também são Nós
         * Um Painel pode ser uma boa opção para armazenar botões, caixas de diálogo de entrada de texto e outros elementos da interface gráfico do usuário
         * Você praticamente não pode mover Nós individuais em um Painel
         * Mas você pode mover todo o Painel em um Group
         * Mova o Painel como faria com qualquer outro Nó
         */
        Group root2 = new Group();
        root2.getChildren().addAll(btn, btn2);
        btn2.setLayoutY(100);

        Scene scene = new Scene(root2, 800, 600);

        primaryStage.setTitle("Primeira interface");
        primaryStage.setScene(scene);
        primaryStage.show();
        // to here to add your own code
    }

    // manin() continua sendo obrigatório em seus programas
    // Ele inicializa o aplicativo JavaFX
    public static void main(String[] args) {
        launch(args);
    }
}
