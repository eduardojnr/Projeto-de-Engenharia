# Métricas

--------------------------------------------

## MÉTRICA DE ENGAJAMENTO

* Nome  
  * Engajamento
* Objetivo  
  * Medir o engajamento da equipe com o projeto
* Descrição  
  * A métrica vai ser determinada conforme a contagem dos commits e as interações no trello
* Sistema de medidas  
  * Contagem utilizando números inteiros  
* Formas de medidas
  * A medida deverá ser feita através do próprio github e seu sistema de commits
  * No trello deverá ser contado manualmente

### Medida (Direta)
  
Contribuidores | Github (Commits) | Trello (Interações)
---|---|---
Johnny William | 55 | 12
Kledyson Goes | 51 | 19
Paulo Vitor | 39 | 6
Matheus Barbosa | 24 | 1
Eduardo Carlos | 24 | 7
Vitor Santos | 18 | 5
Guilherme Vieira | 13 | 7

## FATOR DE PONDERAÇÃO
Parâmetro da medida | Contagem | Simples | Médio | Complexo | Resultado
---|---|---|---|---|---
Número de entradas externas | 8 | 3 | 4 | 6 | 32
Número de saídas externas | 6 | 4 | 5 | 7 | 30
Número de consultas externas | 2 | 3 | 4 | 6 | 8
Número de arquivos lógicos internos | 5 | 7 | 10 | 15 | 50
Número de arquivos de interfaces externas | 0 | 5 | 7 | 10 | 0
| | | | | |== 120

## AJUSTES DE PONDERAÇÃO
* Levando em consideração a influência dps requisitos técnicos e de qualidade, podemos realizar uma verificação da importância de cada um desses requisitos, para que encontremos um ajuste de ponderação. Para tanto, serão respondidas 14 perguntas com uma pontuação de 0 a 5 e que constará no cálculo final.

Sem influência | Incidental | Moderado | Médio | Significativo | Essencial
---|---|---|---|---|---
0 | 1 | 2 | 3 | 4 | 5

N° | Requisitos | Ajuste
---|---|---
1 | O sistema requer backup e recuperação confiável? | 5
2 | São exigidas comunicações de dados? | 5
3 | Há funções de processamento distribuídas? |	3
4 | O desempenho é crítico? | 3
5 | O sistema funcionará num ambiente operacional existente, intensivamente utilizado? | 0
6 | O sistema requer a entrada de dados on-line? |	5
7 | A entrada de dados on-line exige que a transação de entrada seja elaborada em múltiplas telas ou operações? | 4
8 | Os arquivos-mestres são atualizados on-line? | 5
9 | A entrada, saída, arquivos ou consultas são complexos? | 3
10 | O processo interno é complexo? | 3
11 | O código foi projetado de forma a ser reusável?	| 5
12 | A conversão e a instalação estão incluídas no projeto? | 5
13 | O sistema é projetado para múltiplas instalações em diferentes organizações?	| 3
14 | A aplicação é projetada de forma a facilitar mudanças e o uso pelo usuário? | 4
 | | |  == 53
 
 ## CÁLCULO DO PONTO DE FUNÇÃO
 * Após encontrar o ajuste, foi realizado o cálculo para verificação do ponto de função do sistema:\
 **FP = Contagem Total x [0.65 + 0.01 x SOMA(Fi)]**\
  Logo,\
  **FP = 120 x [0.65 + 0.01 x 53]**\
  **FP = 141.6**\
  Através deste cálculo, é possível calcular alguns indicadores importantes para o desenvolvimento do sistema. São eles:
  * **Produtividade = FP / pessoa mês**\
  **FP = 141.6 / 7**\
  **FP = 20.22**
  * **Qualidade = Defeitos / FP**\
  **(Não foi possível estimar)**
  * **Custo = $ / FP**\
  **(Não foi possível estimar)**
  * **Documentação = Páginas de documentação / FP**\
  **FP = 20 / 141.6**\
  **FP = 0.14**
