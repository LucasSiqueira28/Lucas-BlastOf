programa
{
	/*
	 Fazer uma página que leia o saldo inicial de cliente do banco e leia também um cheque que entrou, 
	 ANALISE se o cheque poderá ser descontado ou não, já que este cliente não possui limite. 
	 Se o cheque não for descontado, mostre essa informação, caso contrário, desconte o cheque e informe o saldo ATUAL na tela.
	 */
	funcao inicio()
	{
		real saldo, cheque, saldoAtual
		escreva("Digite o saldo do cliente: ")
		leia(saldo)
		escreva("Digite o valor do cheque: ")
		leia(cheque)

		se(saldo <= 0 ou saldo < cheque){
			escreva("O cheque não pode ser descontado para esse cliente.")
		}
		senao{
			saldoAtual = saldo - cheque
			escreva("Saldo Atual de: R$ ", saldoAtual)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 708; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */