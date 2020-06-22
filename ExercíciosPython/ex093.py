gols = []
total  = 0
jogador = {}
jogador['nome'] = str(input('Nome do Jogador: '))
partidas = int(input('Quantas partidas Joelson jogou? '))
for c in range(0, partidas):
    gols.append(int(input(f'Quantos gols na partida {c}? ')))
    total += gols[c]
jogador['gols'] = gols
jogador['total'] = total
print('-='*30)
print(jogador)
print('-='*30)
for k, v in jogador.items():
    print(f'O campo {k} tem o valor {v}')
print('-='*30)
print(f'O jogador {jogador["nome"]} jogou {partidas} partidas.')
for c in range(0, partidas):
    print(f'  =>Na partida {c}, fez {gols[c]} gols.')
print(f'Foi um total de {jogador["total"]} gols.')
