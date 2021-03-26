# language: pt

Funcionalidade: Validação de CPF
	Fizemos no curso um sitema que vaz uma validação de cpf 
	com isso estamos criando um teste para automatizar o processo de validação
	
	Cenario: Testando CPF valido
	Quando eu acesso o sistema de validacao de CPF
	  E digito no campo nome "Maria"
	  E digito no campo cpf "076.967.824-60"
	  E clico no botão validar
	  Então eu devo ver a mensagem "CPF validado com sucesso!"
	  
	Cenario: Testando CPF invalido
		Quando eu acesso o sistema de validacao de CPF
	  E digito no campo nome "Maria"
	  E digito no campo cpf "076.aaa.967-60"
	  E clico no botão validar
	  Então eu devo ver a mensagem "CPF não foi validado!"
