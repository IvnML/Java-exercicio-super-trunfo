## Exercício:

Implementar um jogo de super-trunfo entre 2 jogadores.
* Cada jogador tem 6 cartas diferentes.
* Uma rodada tem 6 jogadas ( [jogador1, carta1] vs [jogador2,carta1] , ..... ).
* A sequência de atributos segue a ordem do slide anterior.
* Jogada 1 -> atributo comparado: velocidade máxima.
* Jogada 2 -> atributo comparado: cilindradas.
* Ganha a jogada, o jogador que tiver a carta com o maior valor do atributo.
* Mostre, ao final das 6 jogadas, quantas vitórias teve cada jogador, e quantos empates houveram.

##Observações:
Este exercício foi desenvolvido para estimular a riação de classes e as interações entre elas.
Por tal motivo, foi utilizado a classe random para sortear as cartas e atributos a serem comparados na partida. 
Assim, demonstrando de maneira clara a resolução da partida e imprimindo as rodadas e o resultado no terminal.
