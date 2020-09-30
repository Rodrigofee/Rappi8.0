# Rappi8.0
Projeto direcionado a cadeira de Programação Avançada, confeccionado para AV1. 

Start projeto(git);

1° fase:

Montar as class de dados;
Mostrar as informações de nivél e pontuação;
Mostrar o histórico de compra.

2° fase:

Confirmar transação;
Inserir transação.

3° fase:

Mostrar historico de transações;
(traser a class com os dados)
Nova pontuação;
Nivél.

-----------------------Atributos------------------------
Class Cliente

id;
nome;
cpf;
nivel;
tipo_beneficios;
--------------------------------------------------------
Class Transacoes

id
cliente_id
tipo_pagamento
valor
data
--------------------------------------------------------
Class Beneficos

id
nome
descricao
--------------------------------------------------------
Class Cliente_Beneficios

cliente_id
beneficios_id
data_ini_benef
data_fim_benef
