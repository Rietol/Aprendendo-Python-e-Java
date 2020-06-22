def ficha(nome='', gols=''):
    if nome == (''):
        nome = '<desconhecido>'
    if gols == (''):
        gols = 0
    print(f'O jogador {nome} fez {gols} gol(s) no campeonato')


print('-'*30)
ficha(str(input('Nome do Jogador: ')),
      str(input('Número de Gols: ' )))
