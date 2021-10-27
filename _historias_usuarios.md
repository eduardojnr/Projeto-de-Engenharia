# Cenários

## Pesquisador
### Variáveis

String: nome  
Username  
String: senha  
cpf  
String: e-mail  
data de nascimento  
Check: Sexo  
Check: Campo de atuação  

### Cenários
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
