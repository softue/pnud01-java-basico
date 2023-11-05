public class Cell {
    private String name;
    private boolean doorIsOpen;
    private String securityCode;

    Cell(String name, boolean doorIsOpen) {
        this.name = name;
        this.doorIsOpen = false;
        this.securityCode = "1234";
    }

    public boolean getIsOpen() {
        return this.doorIsOpen;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // modela uma pessoa que inseriu um código de segurança
    public boolean setIsOpen(boolean isOpen, String securityCode) {
        if ( this.securityCode.equals(securityCode) ){
            this.doorIsOpen = isOpen;
            return true;
        } else {
            System.out.println("Código de segurança é inválido");
            return false;
        }
    }


}
