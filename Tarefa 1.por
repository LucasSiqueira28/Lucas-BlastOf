programa
{ /*
	Uma Empresa de desenvolvimento de softwares paga a seu vendedor um fixo de R$ 500,00 por mês, 
	mais um bônus de R$ 50,00 por sistema vendido. Faça um programa que leia quantos softwares o funcionário 
	vendeu e determine o salário total do funcionário. Mostre o salário final do vendedor.
*/
	
	funcao inicio()
	{
		inteiro quantidade, resultado
		escreva("Digite quantos sistemas o funcionario vendeu: ")
		leia(quantidade)
		escreva("Esse funcionario recebeu R$ ", resultado = calculo_salario(quantidade))
	}

	funcao inteiro calculo_salario(inteiro quantidade){
		inteiro salarioFinal = 0
		salarioFinal = ((quantidade * 50) + 500)
		retorne salarioFinal
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 685; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */