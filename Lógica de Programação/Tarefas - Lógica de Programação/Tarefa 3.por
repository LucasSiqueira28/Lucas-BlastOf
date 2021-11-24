programa
{
	
	funcao inicio()
	{
		real salario, financiamento, resultado 
		escreva("Digite o seu salário: ")
		leia(salario)
		escreva("Digite o valor do financiamento: ")
		leia(financiamento)

		se(financiamento <= (salario*5)){
			escreva("Financiamento Concedido") 
		}
		senao {
			escreva("Financiamento Negado")
		}

		escreva("\nObrigado por nos consultar.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */