## Teste de Carga utilizando o Jmeter:

### __Plano de teste__

* Nome da aplicação: SCEAPP

### __Alvo do teste__

* Tipo de teste: Performance e Stress

### __Objetivo__

* Performance: Verificar se o sistema atende sem perda de pacotes, o acesso simultâneo de 100 usuários.
* Stress: Identificar o limite máximo de usuários simultâneos no sistema sem perda de pacote.
* Período de teste: 29.11.2021 (20h às 21:35h)

### __Ambiente de teste__

* Teste realizado em ambiente de produção a partir do link: https://projeto-de-engenharia-lyart.vercel.app/
* Ferramenta: JMeter
* Cenário de teste funcional exploratório

### __Cenário de teste de performance__

* Nome: Teste de performance Cenário 1
* Descrição: Testar requisições HTTP da tela principal de login do SCEAPP
* Protocolo: http
* Endereço: https://www.loom.com/share/b68753dd117347c9a61c2ff2e73873f2
* Quantidade de usuário simultâneos: 60
* Tempo de inicialização: 60 segundos
* Interações: 5
---
* Nome: Teste de performance Cenário 2
* Descrição: Testar requisições HTTP da tela principal de login do SCEAPP
* Protocolo: http
* Endereço: https://www.loom.com/share/b68753dd117347c9a61c2ff2e73873f2
* Quantidade de usuário simultâneos: 100
* Tempo de inicialização: 1 segundos
* Interações: 5
---
* Nome: Teste de performance Cenário 3
* Descrição: Teste de carga na tela de cadastrar protocolos.
* Protocolo: http
* Endereço: https://projeto-de-engenharia-lyart.vercel.app/protocolos
* Quantidade de usuário simultâneos: 20
* Tempo de inicialização: 1 segundos
* Interações: 4
---
* Nome: Teste de performance Cenário 4
* Descrição: Teste de carga na tela de atualizar cadastro.
* Protocolo: http
* Endereço: https://projeto-de-engenharia-lyart.vercel.app/atualizarCadastro
* Quantidade de usuário simultâneos: 100
* Tempo de inicialização: 1 segundos
* Interações: 5

### __Relatório de execução__

* Cenário 1:
* Vídeo capturado: https://www.loom.com/share/b68753dd117347c9a61c2ff2e73873f2
* Percentual de erro: 0,00%
* Vazão: 4,6/sec
---
* Cenário 2:
* Vídeo capturado: https://www.loom.com/share/c6c9d84d525f43148edb93489e75b874
* Percentual de erro: 0,00%
* Vazão: 21,7/sec
---
* Cenário 3:
* Vídeo capturado: https://www.loom.com/share/cac6169baccc4991bc1fa8dd70606de0
* Percentual de erro: 0,00%
* Vazão: 12,9/sec
---
* Cenário 4:
* Vídeo capturado: https://www.loom.com/share/15f06a8d8cf64e4dad96e23918051188
* Percentual de erro: 0,00%
* Vazão: 8,2/sec
