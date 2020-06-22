gols = []
jogadores = []
total  = 0
jogador = {}
while True:
    jogador['nome'] = str(input('Nome do Jogador: '))
    partidas = int(input(f'Quantas partidas {jogador["nome"]} jogou? '))
    for c in range(0, partidas):
        gols.append(int(input(f'Quantos gols na partida {c}? ')))
        total += gols[c]
    jogador['gols'] = gols[:]
    jogador['total'] = total
    jogadores.append(jogador.copy())
    gols.clear()
    total = 0
    del jogador
    jogador = {}
    cont = str(input('Quer continuar? [S]/[N] '))
    if cont in ('Nn'):
        break
print('-='*30)
print('cod nome           gols           total')
print('-'*40)
for e in jogadores:
    for k, v in e.items():
        if k == 'nome':
            print(f' {jogadores.index(e):<3}', end = '')
            print(f'{(v):<15}', end = '')
        elif k == 'gols':
            print(f'{(str(v)):<16}', end = '')
        elif k == 'total':
            print(f'{v}')
print('-'*40)
while True:
    el = int(input('Mostrar dados de qual jogador? '))
    if el == 999:
        break
    elif el not in range(0, len(jogadores)):
        el = str(input(f'ERRO! Não existe o jogador com o código {el}! Tente novamente!'))
        print('-'*45)
    elif el in range(0, len(jogadores)):
        print(f'------- Levantamento do jogador {jogadores[el]["nome"]} -------')
        for pos, va in enumerate(jogadores[el]['gols']):
            print(f'No jogo {pos} fez {va} gols.')
        print('-'*45)
print('<< Volte Sempre >>')
