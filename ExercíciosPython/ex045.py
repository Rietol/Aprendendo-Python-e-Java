import random
n = int(input("""========JOKENPÔ========
Escolha a sua opção:
    [1]Pedra
    [2]Papel
    [3]Tesoura
    """))
ncp = random.randrange(1,3)
if n == ncp:
    print('Empate!')
elif n == 1 and ncp == 2:
    print('Jogador perdeu para o computador: Pedra vs Papel!')
elif n == 1 and ncp == 3:
    print('Jogador ganhou do computador: Pedra vs Tesoura!')
elif n == 2 and ncp == 1:
    print('Jogador ganhou do computador: Papel vs Pedra!')
elif n == 2 and ncp == 3:
    print('Jogador perdeu para o computador: Papel vs Tesoura!')
elif n == 3 and ncp == 1:
    print('Jogador perdeu para o computador: Tesoura vs Pedra!')
elif n == 3 and ncp == 2:
    print('Jogador ganhou do computador: Tesoura vs Papel!')
