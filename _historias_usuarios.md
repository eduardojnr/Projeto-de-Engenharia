# Cenários

### Variáveis

String: nome  
String: Username  
String: senha  
String: cpf  
String: e-mail  
String: data de nascimento  
String: Sexo  


------------------------------------------------------------------

## Usuário
### Cadastro

Cenário:
Dado que eu clique em cadastro de pesquisador  
Quando eu digitar o  ```Nome```  
E digite o ```Username```  
E digite a ```Senha desejada```  
E digite o ```CPF```  
E digite o ```E-mail```  
E digite a ```Data de nascimento```  
E selecione o ```Sexo```  
E digite o ```Campo de atuação```  
Então o sistema irá retornar uma tela de Cadastro Efetuado com sucesso e em Análise / Cadastro não Efetuado Motivo  

------------------------------------------------------------------

Cenário de aceite:  
Dado que eu abra a tela de cadastro de usuário  
Quando eu digitar o  ```johnny```  
E digite o ```johnnyS``` como username  
E digite a ```scrum123``` como senha  
E digite o ```012.345.678-91``` como cpf  
E digite o ```scrum@gmail.com``` como e-mail  
E digite a ```02/03/2001``` como data  
E selecione o ```Masculino``` como sexo  
E digite o ```Tecnolagia da Informação``` como campo de atuação  
Então o sistema irá retornar uma tela de Cadastro Efetuado com sucesso e em Análise  
 
------------------------------------------------------------------

Cenário de **NÃO** aceite (1):  
Dado que eu abra a tela de cadastro de usuário  
Quando eu digitar o  ```eduardo```  
E digite o ```erduardopesquisador``` como username  
E digite a ```eduardo123``` como senha  
E digite o ```512.345.678-91``` como cpf  
E digite o ```eduardo@gmail.com``` como e-mail  
E digite a ```12/03/2001``` como data  
E selecione o ```Masculino``` como sexo  
E digite o ```Ciências Biológicas``` como campo de atuação  
Então o sistema irá retornar uma tela de Cadastro não Efetuado Motivo, **CPF** já cadastrado  

------------------------------------------------------------------

Cenário de **NÃO** aceite (2):  
Dado que eu abra a tela de cadastro de usuário  
Quando eu digitar o  ```eduardo```  
E digite o ```erduardopesquisador``` como username  
E digite a ```eduardo123``` como senha  
E digite o ```512.345.678-91``` como cpf  
E digite o ```eduardo@gmail.com``` como e-mail  
E digite a ```12/03/2001``` como data  
E selecione o ```Masculino``` como sexo  
E digite o ```Ciências Biológicas``` como campo de atuação  
Então o sistema irá retornar uma tela de Cadastro não Efetuado Motivo, **E-mail** já cadastrado  

------------------------------------------------------------------

Cenário de **NÃO** aceite (3):  
Dado que eu abra a tela de cadastro de usuário  
Quando eu digitar o  ```eduardo```  
E digite o ```erduardopesquisador``` como username  
E digite a ```eduardo123``` como senha   
E digite o ```512.345.678-91``` como cpf  
E digite o ```eduardo@gmail.com``` como e-mail  
E digite a ```12/03/2001``` como data  
E selecione o ```Masculino``` como sexo  
E digite o ```Ciências Biológicas``` como campo de atuação  
Então o sistema irá retornar uma tela de Cadastro não Efetuado Motivo, **Username** já cadastrado  

## Login

Cenário:
Dado que eu clique em login na tela inicial  
Quando eu digitar o  ```Username```  
E digite a ```Senha```  
Então o sistema irá retornar uma tela de Login efetuado com sucesso / Erro ao efetuar o login **Motivo**  

------------------------------------------------------------------

Cenário de aceite:  
Dado que eu clique em login na tela inicial  
Quando eu digitar o  ```johnnyS```  
E digite a ```scrum123```  
Então o sistema irá retornar uma tela de Login efetuado com sucesso  

------------------------------------------------------------------

Cenário de **NÃO** aceite (1):  
Dado que eu clique em login na tela inicial  
Quando eu digitar o  ```angelo```  
E digite a ```angelo123```  
Então o sistema irá retornar uma tela de Erro ao efetuar o login **Usuário não cadastrado**  

