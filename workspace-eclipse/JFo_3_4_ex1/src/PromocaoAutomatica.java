
public class PromocaoAutomatica {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Cuidado com a promoção automática!!!
		 * 
		 * Antes de ser atribuído a uma variável, o resultado de uma equação é armazenado em um local
		 * temporário na memória. O tamanho desse local sempre é igual ao tamanho de um tipo int ou ao
		 * tamanho do maior tipo de dados usado na expressão ou na instrução. Por exemplo, se sua equação
		 * multiplicar dois tipos int, o tamanho do recipiente será um tipo int em tamanho ou 32 bits.
		 * 
		 */
		int num1 = 55555;
		int num2 = 66666;
		long num3;
		num3 = num1 * num2;
		System.out.println(num3); // retorna -591337666
		
		/*
		 * Possível correção
		 * 
		 * Se os dois valores que você multiplica resultarem em um valor que está além do escopo de um tipo int
		 * (como 55555 * 66666 = 3.703.629.630, que é muito grande para caber em um tipo int), o valor int
		 * deverá ser truncado para que o resultado caiba no local temporário na memória. Esse cálculo acaba
		 * resultando em uma resposta incorreta porque a variável da sua resposta recebe um valor truncado,
		 * independentemente do tipo usado para sua resposta. Para resolver esse problema, defina pelo menos
		 * uma das variáveis na sua equação como o tipo long para garantir o maior tamanho de recipiente
		 * temporário possível.
		 * 
		 */
		int num4 = 55555;
		long num5 = 66666;
		long num6;
		num6 = num4 * num5;
		System.out.println(num6); // retorna 3703629630
		
		
	}

}
