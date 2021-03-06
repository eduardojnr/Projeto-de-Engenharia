## Mapeamento & Test Cases – SCEAPP

* Cenário: Criar usuário. 
* Step: Selecionar Criar usuário. 
* Resultado esperado: Exibir tela de criação de usuário. 
* Resultado final: OK.
---
* Cenário: Criar usuário. 
* Step: Preencher somente o campo Nome de Usuário e criar clicar em cadastrar. 
* Resultado esperado: Não cadastrar o usuário e solicitar o preenchimento dos campos obrigatórios. 
* Resultado final: OK.
---
* Cenário: Criar usuário. 
* Step: Preencher somente o campo E-mail e criar clicar em cadastrar. 
* Resultado esperado: Não cadastrar o usuário e solicitar o preenchimento dos campos obrigatórios. 
* Resultado final: OK.
---
* Cenário: Criar usuário. 
* Step: Preencher somente o campo Senha e criar clicar em cadastrar. 
* Resultado esperado: Não cadastrar o usuário e solicitar o preenchimento dos campos obrigatórios. 
* Resultado final: OK.
---
* Cenário: Criar usuário. 
* Step: Preencher somente o campo Nome e criar clicar em cadastrar. 
* Resultado esperado: Não cadastrar o usuário e solicitar o preenchimento dos campos obrigatórios. 
* Resultado final: OK.
---
* Cenário: Criar usuário. 
* Step: Preencher somente o campo CPF e criar clicar em cadastrar. 
* Resultado esperado: Não cadastrar o usuário e solicitar o preenchimento dos campos obrigatórios. 
* Resultado final: OK.
---
* Cenário: Criar usuário. 
* Step: Preencher somente o campo Data de Nascimento e criar clicar em cadastrar. 
* Resultado esperado: Não cadastrar o usuário e solicitar o preenchimento dos campos obrigatórios. 
* Resultado final: OK.
---
* Cenário: Criar usuário. 
* Step: Preencher somente o campo Sexo e criar clicar em cadastrar. 
* Resultado esperado: Não cadastrar o usuário e solicitar o preenchimento dos campos obrigatórios. 
* Resultado final: OK.
---
* Cenário: Criar usuário. 
* Step: Preencher todos os campos da tela exceto o campo Senha e criar clicar em cadastrar. 
* Resultado esperado: Não cadastrar o usuário e solicitar o preenchimento do campo senha. 
* Resultado final: O cadastro do usuário é concluído sem preenchimento do campo Senha.
---
* Cenário: Criar usuário. 
* Step: Preencher Todos os campos e criar clicar em cadastrar. 
* Resultado esperado: Cadastrar novo usuário. 
* Resultado final: OK
---
* Cenário: Logar usuário. 
* Step: Preencher o Nome do Usuário e a Senha e clicar em Login. 
* Resultado esperado: Realizar login de usuário. 
* Resultado final: OK.
---
* Cenário: Logar usuário. 
* Step: Preencher o Nome do Usuário e a Senha com usuário e senha inválidos. 
* Resultado esperado: Não realizar login de usuário e informar que o usuário é inválido.
* Resultado final: OK.
---
* Cenário: Recuperar Senha.
* Step: Preencher campo E-mail e clicar em Solicitar Recuperação
* Resultado esperado: Enviar e-mail solicitando recuperação de senha para o e-mail cadastrado.
* Resultado final: O campo de E-mail não é visível e não é possível preenche-lo.
---
* Cenário: Acessar Menu.
* Step: Clicar no Ícone de Menu 
* Resultado esperado: Exibir o Menu do Sistema.
* Resultado final: O botão de menu não é funcional.
---
* Cenário: Atualizar Cadastro. 
* Step: Preencher somente o campo Senha e clicar em Atualizar Dados.
* Resultado esperado: Exibir mensagem para preencher os demais campos da tela.
* Resultado final: Nenhuma ação é realizada pelo sistema.
---
* Cenário: Atualizar Cadastro. 
* Step: Preencher somente o campo E-mail e clicar em Atualizar Dados.
* Resultado esperado: Exibir mensagem para preencher os demais campos da tela.
* Resultado final: Nenhuma ação é realizada pelo sistema.
---
* Cenário: Atualizar Cadastro. 
* Step: Preencher somente o campo Campo de Atuação e clicar em Atualizar Dados.
* Resultado esperado: Exibir mensagem para preencher os demais campos da tela.
* Resultado final: Nenhuma ação é realizada pelo sistema.
---
* Cenário: Atualizar Cadastro. 
* Step: Preencher todos os campos e clicar em Atualizar Dados.
* Resultado esperado: Atualizar os dados com sucesso.
* Resultado final: Nenhuma ação é realizada pelo sistema.
---
* Cenário: Cadastrar Protocolos. 
* Step: Preencher somente o campo Data prevista para início do experimento e clicar em cadastrar.
* Resultado esperado: Exibir mensagem para preencher os demais campos obrigatórios da tela.
* Resultado final: OK.
---
* Cenário: Cadastrar Protocolos. 
* Step: Preencher somente o campo Data prevista para término do experimento e clicar em cadastrar.
* Resultado esperado: Exibir mensagem para preencher os demais campos obrigatórios da tela.
* Resultado final: OK.
---
* Cenário: Cadastrar Protocolos. 
* Step: Preencher somente o campo Justificativa para uso dos animais e clicar em cadastrar.
* Resultado esperado: Exibir mensagem para preencher os demais campos obrigatórios da tela.
* Resultado final: OK.
---
* Cenário: Cadastrar Protocolos. 
* Step: Preencher somente o campo Resumo do trabalho em português e clicar em cadastrar.
* Resultado esperado: Exibir mensagem para preencher os demais campos obrigatórios da tela.
* Resultado final: OK.
---
* Cenário: Cadastrar Protocolos. 
* Step: Preencher somente o campo Resumo do trabalho em inglês e clicar em cadastrar.
* Resultado esperado: Exibir mensagem para preencher os demais campos obrigatórios da tela.
* Resultado final: OK.
---
* Cenário: Cadastrar Protocolos. 
* Step: Preencher Todos os campos da tela e clicar em cadastrar.
* Resultado esperado: Cadastrar o experimento.
* Resultado final: Botão cadastrar não cadastra o experimento.
---
* Cenário: Voltar para tela anterior.
* Step: Clicar no ícone de voltar.
* Resultado esperado: Voltar para tela anterior.
* Resultado final: OK.
---
* Cenário: Exibir informações.
* Step: Clicar no ícone de Informações.
* Resultado esperado: Exibir Informações do Sistema.
* Resultado final: Nenhuma ação é executada.
---
* Cenário: Sair da conta de usuário.
* Step: Clicar no ícone de sair.
* Resultado esperado: Executar o logout do usuário e voltar para tela de login.
* Resultado final: OK.

## Melhorias:

* Tela: https://projeto-de-engenharia-lyart.vercel.app/cadastro (criar conta)


<p align="center" width="100%">
    <img width="90%" src="https://user-images.githubusercontent.com/89170559/143966975-4e99db0b-bf7b-4dd9-8eb0-343d678aa8dd.png">
</p>

 
* Tela está com dois idiomas, português e inglês:
* Nas informações para login o nome de usuário está como “Username” e o restante da tela está em português.
* O campo “Senha” não está com o asterisco “* “de campo obrigatório.
* O campo “Data de Nascimento” não está com o formato correto e não exibe o número “0” dos dias e meses que necessitam da sua exibição:


<p align="center" >
    <img  src="https://user-images.githubusercontent.com/89170559/143966998-08a82aab-636f-4b15-acdd-5ebc9eda9cc0.png">
</p>


* Ao Preencher todos os campos exceto o campo “senha” da tela “Criar conta”, o usuário é cadastrado com sucesso.


<p align="center" >
    <img  src="https://user-images.githubusercontent.com/89170559/143967006-b22ae1f1-5b61-438f-9616-8d4c02b3ef79.png">
</p>


* Tela: https://projeto-de-engenharia-lyart.vercel.app/recovery (Recuperar Senha)
 

<p align="center">
    <img  src="https://user-images.githubusercontent.com/89170559/143967056-b1b39c86-2691-4614-8d76-d811b2e24533.png">
</p>


* O campo para preenchimento do e-mail não é totalmente visível só se torna levemente visível quando há um click sobre o campo e não é possível realizar o preenchimento do campo, o mesmo está bloqueado para preenchimento.
