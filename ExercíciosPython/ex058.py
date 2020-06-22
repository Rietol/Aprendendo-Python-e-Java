import random
nc = random.randrange(0,10)
pp = int(input('Insira um número de 0 a 10: '))
pt = 1
while (pp) != (nc) :
    pp = int(input('Você errou tente novamente: '))
    pt += 1
print('Você acertou, foi necessário {} palpite(s)'.format(pt))
