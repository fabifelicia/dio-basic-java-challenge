# ContaBanco

Este projeto, criado pela [DIO](https://dio.me) tem como objetivo exercitar os conceitos de sintaxe em Java, entrada de dados via terminal e manipulação de strings.

## Descrição do Desafio

Criar um programa Java que simula a criação de uma conta bancária via terminal, solicitando informações ao usuário e exibindo uma mensagem de confirmação com os dados fornecidos.

## Estrutura do Projeto

O projeto contém a classe `ContaTerminal.java`, responsável por:

- Solicitar ao usuário os seguintes dados:
  - **Número da Conta** (Inteiro)
  - **Agência** (Texto)
  - **Nome do Cliente** (Texto)
  - **Saldo** (Decimal)
- Exibir uma mensagem final com os dados informados.

## Tecnologias Utilizadas

- **Java** (versão 8 ou superior)
- **Classe Scanner** para entrada de dados via terminal

## Como Executar

1. Certifique-se de ter o **Java** instalado na sua máquina.
2. Clone este repositório ou baixe os arquivos.
3. Compile o programa:
   ```
   javac ContaTerminal.java   
   ```
4. Execute o programa:
   ```
   java ContaTerminal   
   ```
5. Insira os dados conforme solicitado no terminal.
##### Exemplo de Entrada e Saída

###### Entrada no Terminal:
 ```
  Digite o número de sua Agência:
  067-8
  Digite o número de sua Conta:
  1021
  Digite seu Nome:
  MARIO ANDRADE
  Por favor, digite o Saldo inicial:
  237.48
 ```

###### Saída Eperada:
  ```
   Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
  ```

## Conceitos Revisados

- Declaração de variáveis e tipos de dados.

- Entrada e saída de dados com Scanner.

- Uso do método concat da classe String.

- Manipulação de dados no terminal.