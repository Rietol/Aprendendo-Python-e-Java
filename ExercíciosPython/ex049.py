n = int(input('Insira o número o qual você queira ver a tabuada: '))
ate = int(input('Insira até qual número você queira ver a tabuada: '))
for c in range(1, ate+1):
    print('{}x{}={}'.format(c, n, c*n))
