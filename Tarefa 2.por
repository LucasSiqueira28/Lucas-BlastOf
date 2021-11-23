programa
{
	/*
	Realizarei uma viagem de vários dias em meu automóvel, e gostaria de saber a quilometragem média por litro de gasolina. 
	Para isto, anotarei a quilometragem no velocímetro ao sair de viagem, e depois ao chegar; 
	também vou somar toda a gasolina que comprar para o carro. Faça uma página que com estes dados mostre quantos km fiz, 
	em média, por litro de gasolina.
	*/
	funcao inicio()
	{
		inteiro kminicio, kmfim, diferenca, gasolina
		
		faca{
			escreva("Digite o KM inicial: " )
			leia(kminicio)
			
		} enquanto (kminicio < 0)

		faca{
			escreva("Digite o KM final: " )
			leia(kmfim)
			
		} enquanto (kmfim <= kminicio)

		escreva("Digite quantos litros de gasolina você comprou: ")
		leia(gasolina)

		calculo_km_litro (gasolina,  kminicio, kmfim) 
		
	}

	funcao calculo_km_litro (inteiro litro, inteiro kminicio, inteiro kmfim) {
		inteiro diferenca = kmfim - kminicio
		inteiro kmlitro = diferenca / litro
		escreva("Você andou ", diferenca, " KM, e fez ", kmlitro, "KM por litro de gasolina.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1030; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */