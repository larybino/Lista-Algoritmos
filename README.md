# Engenharia de Software - Algoritmos II

**Disciplina:** Algoritmos II  
**Professor(a):** Frank Willian  
**Data:** 19/07/2024  

---

## Exercícios para estudos e revisão de Algoritmos I e II

1. [**Gerador de Senhas**](src/GeradorSenhas.java)<br>
**Problema**: Implemente um gerador de senhas que crie senhas aleatórias seguras com base em critérios fornecidos pelo usuário. <br>
**Entrada**: Comprimento: 12, Incluir Números: Sim, Incluir Símbolos: Sim<br>
**Saída**: Senha: "A1b2@c3d4#e5"

2. [**Analisando URLs**](src/AnalisandoURLs.java)<br>
**Problema**: dada uma URL, desenvolva um programa que indique se a URL é válida ou não e, caso seja válida, retorne as suas partes constituintes.<br>
**Entrada**: http://www.google.com/mail/user=fulano<br>
**Saída**:<br>
protocolo: http<br>
host: www<br>
domínio: google.com<br>
path: mail<br>
parâmetros: user=fulano<br>
**Entrada**: ssh://fulano%senha@git.com/<br>
**Saída**:<br>
protocolo: ssh<br>
usuário: fulano<br>
senha: senha<br>
dominio: git.com<br>

3. [**Sequência de Cinco**](src/SequenciaCinco.java)<br>
**Problema**: Dado uma matriz de números inteiros positivos de dimensões n x n, onde n >= 5, encontre o maior produto de uma seqüência de 5 números consecutivos (a seqüência pode estar na vertical, na horizontal ou na diagonal).<br>
**Entrada**:<br>
2 1 1 1 1<br>
1 2 1 1 1<br>
1 1 2 1 1<br>
1 1 1 2 1<br>
1 1 1 1 2<br>
**Saída**: 32<br>

4. [**Caixa Eletrônico**](src/CaixaEletronico.java)<br>
**Problema**: Desenvolva um programa que simule a entrega de notas quando um cliente efetuar um saque em um caixa eletrônico. Os requisitos básicos são os seguintes:<br>
Entregar o menor número de notas;<br>
É possível sacar o valor solicitado com as notas disponíveis;<br>
Saldo do cliente infinito;<br>
Quantidade de notas infinito (pode-se colocar um valor finito de cédulas para aumentar a dificuldade do problema);<br>
Notas disponíveis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00<br>
**Entrada**: R$ 30,00<br>
**Saída**: Resultado Esperado: Entregar 1 nota de R$20,00 e 1 nota de R$ 10,00.<br>
**Entrada**: R$ 80,00<br>
**Saída**: Resultado Esperado: Entregar 1 nota de R$50,00 1 nota de R$ 20,00 e 1 nota de R$ 10,00.<br>

5. [**Cheque por Extenso**](src/Cheque.java)<br>
**Problema**: Apesar de o volume de cheques emitidos tenha diminuído drásticamente nos últimos anos, principalmente devido a popularização dos cartões de crédito e débito, eles ainda são utilizados em muitas compras, especialmente a de valores altos. E para auxiliar no seu preenchimento, vários estabelecimentos possuem máquinas que dado o valor da compra, preenchem o cheque com o seu valor por extenso.
Desenvolva um programa que dado um valor monetário, seja retornado o valor em reais por extenso.<br>
**Entrada**: 15415,16 - **Saída**: quinze mil quatrocentos e quinze reais e dezesseis centavos<br>
**Entrada**: 0,05 - **Saída**: cinco centavos<br>
**Entrada**: 2,25 - **Saída**: dois reais e vinte e cinco centavos<br>
