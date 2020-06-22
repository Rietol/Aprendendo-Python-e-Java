a1 = float(input('Insira o primeiro termo da progressão aritmética: '))
r = float(input('Insira a razão da progressão aritmética: '))
sn = a1
a = a1
for c in range(1, 10):
    a += r
    sn += a
print('A soma de todos os termos da PA é: {}'.format(sn))
