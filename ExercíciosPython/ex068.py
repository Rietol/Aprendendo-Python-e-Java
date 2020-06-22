import random
total = int(0)
while True:
    numeropc = int(random.randrange(1, 10))
    maoj = int(input('PAR ou ÍMPAR: \n [1]Par \n [2]Ímpar \n '))
    numeropl = int(input('Insira um número: '))
    nfinal = numeropl + numeropc
    if (maoj == 1):
        if (nfinal %2 == 0):
            total += 1
            print('Jogador venceu {} vez(es)'.format(total))
        elif (nfinal %2 != 0):
            print('Jogador perdeu!')
            print('Total de vitórias consecutivas {}'.format(total))
            break
    elif (maoj == 2):
        if (nfinal %2 != 0):
            total += 1
            print('Jogador venceu {} vez(es)'.format(total))
        if (nfinal %2 == 0):
            print('Jogador perdeu!')
            print('Total de vitórias consecutivas {}'.format(total))
            break
