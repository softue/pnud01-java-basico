module br.jus.trt13.javafxmain {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.jus.trt13.javafxmain to javafx.fxml;
    exports br.jus.trt13.javafxmain;
}
