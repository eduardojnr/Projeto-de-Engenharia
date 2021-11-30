
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

 

