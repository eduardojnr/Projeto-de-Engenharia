
Documento sujeito a modificações de acordo a decisão da equipe.
# Perfis
- [Pesquisador Explained](#pesquisador)
- [Secretária Explained](#secretaria)
- [Presidente Explained](#presidente)
- [Administrador Explained](#adm)

## Telas de acesso para cada perfil

<a name="pesquisador"></a>
### Pesquisador
1. Tela para atualização de cadastro (Épico 3 História 2)  
-> Aqui será uma tela para atualização dos dados do usuário


#### 2. Tela protocolo  

#### 2.2 Emissão de protocolo  (Épico 3 História 3)  
-> Uma tela onde será feito um novo protocolo para emissão onde serão digitados: Justificativa para uso dos animais, Resumo do trabalho em português, Resumo do trabalho em inglês, Data prevista para início do experimento, Data prevista para término do experimento, Quantidade de animais de cada espécie e suas proveniências.  

#### 2.2 Verificar status protocolo (Épico 3 História 4)   
-> Esta tela listará todos os procolocos e consequentemente o status dos mesmos. Exemplo de exibição:  

|ID|Nome|Status|
|--------|---------|-------|
|1| Nome do protocolo | Em Espera
|2| Nome do protocolo | Em análise
|3| Nome do protocolo | Aprovado
|4| Nome do protocolo | Reprovado
|5| Nome do protocolo | Em aguardo de decisão do presidente  

#### 2.2 Protocolos que foram designados (Épico 3 História 5)    
-> Protocolos em que o usuário for designado como parecerista

<a name="secretaria"></a>
### Secretária
#### 1. Tela para atualização de cadastro
-> Aqui será uma tela para atualização dos dados do usuário
#### 2. Tela para analisar todos os dados dos pesquisadores  
-> Aqui vai ser possível ver todos os dados dos usuários menos a senha.

|Nome|Usuário|CPF|Email|Data de Nascimento|Sexo|Campo de atuação|
|--------|---------|-------|--------|---------|-------|-------|
|Johnny| jownao | 00000000000 | jownao@email.com | 02/03/2001 | Masculino | Ciência física|
|Eduardo| jnnr | 00000000000 | jnnr@email.com | 29/11/2000 | Masculino | Ciência biológica |



#### 3. Tela para analisar todos protocolos  
#### 3.1 Protocolos em espera  
#### 3.2 Protocolos em análise  
#### 3.3 Protocolos Aprovados  
#### 3.4 Protocolos Reprovados  
#### 3.5 Protocolos em aguardo de decisão do presidente  

-> Esta tela pode ficar em conjunto com a tela de analisar todos os protocolos, e apartir de uma filtragem os protocolos serem separados por status.  


|| Em espera| |
|--------|---------|-------|
|ID|Nome|Status
|1| Nome do protocolo | Em Espera

|| Em análise| |
|--------|---------|-------|
|ID|Nome|Status
|2| Nome do protocolo | Em análise

|| Aprovado| |
|--------|---------|-------|
|ID|Nome|Status
|3| Nome do protocolo | Aprovado

|| Reprovado| |
|--------|---------|-------|
|ID|Nome|Status
|4| Nome do protocolo | Reprovado

|| Em análise| |
|--------|---------|-------|
|ID|Nome|Status
|5| Nome do protocolo | Em análise

|| Em aguardo de decisão do presidente| |
|--------|---------|-------|
|ID|Nome|Status
|6| Nome do protocolo | Em aguardo de decisão do presidente






<a name="presidente"></a>
### Presidente
1. Tela para atualização de cadastro
2. Todas telas que ``PESQUISADOR`` tem
3. Tela para analisar protocolos em estado final de votação ( EMPATE )

<a name="adm"></a>
### Administrador
1. Tela para listar todos os usuários do sistema
2. Tela para gerenciar todos usuários do sistema
3. Tela para cadastrar ou excluir secretária
4. Tela para administrar cargo de presidente  
4.1 Iniciar votação  
4.2 Processo de votação  
4.3 Finalizar votação  
