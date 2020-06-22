matriz = [[],[],[]]
for c in range(0, 3):
    for cont in range(0, 3):
        v = int(input(f'Insira o valor para [{c}, {cont}]: '))
        matriz[c].append(v)
print('-='*30)
for c in range(0, 3):
    for cont in range(0, 3):
        if cont != 2:
            print(f'[ {matriz[c][cont]} ]', end='')
        else:
            print(f'[ {matriz[c][cont]} ] \n', end='')
