Story:
	Como programador
	Eu desejo testar um metodo para concatenar dois campos

Narrative:
	Tenho dois campos
	Onde irei passar nome e sobrenome
	para concatenar 
	Exibirei o nome concatenado com um espaço e o sobrenome

Scenario: Concatecar dois nomes

Given o usuario ira preencher os campos de nome e sobrenome
When selecionar botao exibir nome completo
Then imprimir nome e sobrenome concatenados que sera Claudio Neiva