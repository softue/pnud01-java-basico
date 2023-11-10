public class Terminal {
    
    public void recarregarCartao(Cartao cartao, int dinheiro) {
        cartao.setSaldo(cartao.getSaldo() + (dinheiro * 2) );
    }

    public void consultarSaldoCartao(Cartao cartao) {
        System.out.println("O cartão " + cartao.getNumero() + " possui " + cartao.getSaldo() + " crédito(s)" );
    }

    public void transferirSaldo(Cartao cartaoOrigem, Cartao cartaoDestino, int creditos) {
        
        if ( creditos <=0 ) {
            System.out.println("Você deve transferir ao menos 1 crédito.");
            return;
        }

        if ( cartaoOrigem.getSaldo() < creditos ) {
            System.out.println("O cartão de origem não possui " + creditos + " crédito(s)");
            return;
        }

        int saldo1 = cartaoOrigem.getSaldo();
        int saldo2 = cartaoDestino.getSaldo();
        System.out.println("Cartão " +  cartaoOrigem.getNumero() + " possui " + saldo1 + " créditos.");
        System.out.println("Cartão " +  cartaoDestino.getNumero() + " possui " + saldo2 + " créditos.");
        cartaoOrigem.setSaldo(cartaoDestino.getSaldo() - creditos);
        cartaoDestino.setSaldo(cartaoDestino.getSaldo() + creditos);
        System.out.println("Cartão " +  cartaoOrigem.getNumero() + " agora possui  " + cartaoOrigem.getSaldo() + " créditos.");
        System.out.println("Cartão " +  cartaoDestino.getNumero() + " agora possui " + cartaoOrigem.getSaldo() + " créditos.");
    }

    //  Por último, os tíquetes podem ser trocados nos terminais por prêmios. Imprima uma mensagem de erro se o cartão não tiver tíquetes suficientes ou o terminal estiver sem um tipo específico de prêmio. Imprima quando um prêmio for concedido e o número restante desse prêmio aparecer no terminal.  Um terminal oferece três categorias de prêmios. 

}
