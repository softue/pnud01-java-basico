package br.jus.trt13.javafxmain;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXMain2 extends Application{

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
        Button btn1 = new Button();
        btn1.setText("Clicar aqui");
        
        /*
         * A interação do Botão utiliza uma "classe interna anônima"
         * −Expressões Lambda do Java SE 8 são uma alternativa elegante
         * 
         */
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Obrigado por clicar!");
            }
        });

        Button btn2 = new Button();
        btn2.setText("Outro botão");
        Button btn3 = new Button("Botão 3");

        // Cada Painel determina o layout dos Nós
        HBox vboxpanel = new HBox();
        vboxpanel.setLayoutY(570);
        //VBox root = new VBox();
        // não adicione o mesmo Nó mais de uma vez
        vboxpanel.getChildren().addAll(btn1, btn2, btn3);
        //vboxpanel.setLayoutY(200); // não funciona
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
        Group root = new Group();
        root.getChildren().addAll(vboxpanel);
        
        btn1.setMinWidth(800/3);
        btn2.setMinWidth(800/3);
        btn3.setMinWidth(800/3);
        //btn2.setLayoutY(100);

        /*
         * A Scene e o Stage
         * − Uma Scene (que contém o Root Node)
         * − Um Stage (veio no parâmetro lá em cima, que contém a Scene)
         */
        Scene scene = new Scene(root, 800, 600, Color.BLACK);
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
