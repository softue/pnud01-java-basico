public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
    	//byte myByte = 128; // type mismatch: não pode converter de int para byte
    	
        
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
    	short myShort = 128;
    	System.out.println((byte) myShort);
        
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
    	byte myByte = 127;
    	System.out.println(++myByte); // -128 (estouro da variável)
    	System.out.println(++myByte); // -127 
    	
    	/*
    	 * 128 pode ser armazenado em um short, mas não pode em um byte (-128...127)
    	 * Tentar atribuir 128 a um byte é o mesmo que atribuir 127 e somar +1
    	 * Incrementar uma variável além de seu valor máximo resulta em seu valor mínimo
    	 * Quando isso ocorre, diz-se que houve o estouro de uma variável
    	 * 
    	 * 127 em binário é 01111111; 128 em binário é 10000000
    	 * O Java usa o primeiro bit em um número para indicar (+/-)
    	 * 
    	 */
        
        
    }    
}
