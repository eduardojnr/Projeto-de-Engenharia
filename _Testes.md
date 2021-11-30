
# Plano de teste
* Nome da aplicação: SCEAPP – Sistema de Controle de Experimentação em Animais
* Alvo do teste
* Tipo de teste: Performance e Stress
* Objetivo
  * Performance: Verificar se o sistema suporta o acesso de 50 usuários pesquisadores simultâneos.
  * Stress: Identificar o limite máximo de usuários pesquisadores simultâneos no sistema.
* Período de teste: 15/11/2021 
* Ambiente de teste:
* Sistema acessível no Vercel com banco PostgreSQL.
* Ferramenta JMeter
* Servidor(Pessoal): Windows 16GB, 1TB, i7 6700
* Cenário de teste funcional exploratório para perfis e interfaces.


## Cenários
### Cenário de teste de performance – Principal
* Nome: Teste PF cenário 1
* Descrição: Testar a tela principal do sistema
* Protocolo: HTTPS
* Endereço:
* Quantidade de usuários simultâneos: 50
* Tempo de inicialização 5 segundos
* Interações: 3
### Cenário de teste de stress - Principal
* Nome: Teste ST cenário 1
* Descrição: Testar a tela principal do sistema
* Protocolo: HTTPS
* Endereço:
* Quantidade de usuários simultâneos: 70
* Tempo de inicialização 5 segundos
* Interações: 5


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
 ![image](https://user-images.githubusercontent.com/89170559/143966975-4e99db0b-bf7b-4dd9-8eb0-343d678aa8dd.png)
* Tela está com dois idiomas, português e inglês:
* Nas informações para login o nome de usuário está como “Username” e o restante da tela está em português.
* O campo “Senha” não está com o asterisco “* “de campo obrigatório.
* O campo “Data de Nascimento” não está com o formato correto e não exibe o número “0” dos dias e meses que necessitam da sua exibição:
 ![image](https://user-images.githubusercontent.com/89170559/143966998-08a82aab-636f-4b15-acdd-5ebc9eda9cc0.png)
* Ao Preencher todos os campos exceto o campo “senha” da tela “Criar conta”, o usuário é cadastrado com sucesso.
 ![image](https://user-images.githubusercontent.com/89170559/143967006-b22ae1f1-5b61-438f-9616-8d4c02b3ef79.png)


* Tela: https://projeto-de-engenharia-lyart.vercel.app/recovery (Recuperar Senha) 
 ![image](https://user-images.githubusercontent.com/89170559/143967056-b1b39c86-2691-4614-8d76-d811b2e24533.png)
* O campo para preenchimento do e-mail não é totalmente visível só se torna levemente visível quando há um click sobre o campo e não é possível realizar o preenchimento do campo, o mesmo está bloqueado para preenchimento.


## Teste de Carga utilizando o Jmeter:

<div align="justify">
  **Plano de teste**
</div>

Nome da aplicação: SCEAPP

<div align="justify">
  **Alvo do teste**
</div>

Tipo de teste: Performance e Stress

<div align="justifyr">
  **Objetivo**
</div>

Performance: Verificar se o sistema atende sem perda de pacotes, o acesso simultâneo de 100 usuários.
Stress: Identificar o limite máximo de usuários simultâneos no sistema sem perda de pacote.
Período de teste: 29.11.2021 (20h às 21:35h)

**Ambiente de teste:**

Teste realizado em ambiente de produção a partir do link: https://projeto-de-engenharia-lyart.vercel.app/
Ferramenta: JMeter
Cenário de teste funcional exploratório

### **Cenário de teste de performance**

* Nome: Teste de performance Cenário 1
* Descrição: Testar requisições HTTP da tela principal de login do SCEAPP
* Protocolo: http
* Endereço: https://www.loom.com/share/b68753dd117347c9a61c2ff2e73873f2
* Quantidade de usuário simultâneos: 60
* Tempo de inicialização: 60 segundos
* Interações: 5

* Nome: Teste de performance Cenário 2
* Descrição: Testar requisições HTTP da tela principal de login do SCEAPP
* Protocolo: http
* Endereço: https://www.loom.com/share/b68753dd117347c9a61c2ff2e73873f2
* Quantidade de usuário simultâneos: 100
* Tempo de inicialização: 1 segundos
* Interações: 5



* Nome: Teste de performance Cenário 3
* Descrição: Teste de carga na tela de cadastrar protocolos.
* Protocolo: http
* Endereço: https://projeto-de-engenharia-lyart.vercel.app/protocolos
* Quantidade de usuário simultâneos: 20
* Tempo de inicialização: 1 segundos
* Interações: 4

* Nome: Teste de performance Cenário 4
* Descrição: Teste de carga na tela de atualizar cadastro.
* Protocolo: http
* Endereço: https://projeto-de-engenharia-lyart.vercel.app/atualizarCadastro
* Quantidade de usuário simultâneos: 100
* Tempo de inicialização: 1 segundos
* Interações: 5


<div align="justify">
  **Relatório de execução**
</div>

* Cenário 1:
* Vídeo capturado: https://www.loom.com/share/b68753dd117347c9a61c2ff2e73873f2
* Percentual de erro: 0,00%
* Vazão: 4,6/sec

* Cenário 2:
* Vídeo capturado: https://www.loom.com/share/c6c9d84d525f43148edb93489e75b874
* Percentual de erro: 0,00%
* Vazão: 21,7/sec

* Cenário 3:
* Vídeo capturado: https://www.loom.com/share/cac6169baccc4991bc1fa8dd70606de0
* Percentual de erro: 0,00%
* Vazão: 12,9/sec

* Cenário 4:
* Vídeo capturado: https://www.loom.com/share/15f06a8d8cf64e4dad96e23918051188
* Percentual de erro: 0,00%
* Vazão: 8,2/sec



 

