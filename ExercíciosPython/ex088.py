import random
print('-'*31)
print(' '*6,'JOGA NA MEGA SENA',' '*7)
print('-'*31)
jogos = []
p = range(1,60)
vezes = int(input('Quantos jogs quer que eu sorteie? '))
for c in range(0, vezes):
    jogos.append(random.sample(p, 6))
print('-='*3,' SORTEANDO 4 JOGOS ', '-='*3)
for cont in range(0, vezes):
    print(f'Jogo {cont+1}: {jogos[cont]}')
print('-='*5, ' < BOA SORTE! > ', '-='*5)
