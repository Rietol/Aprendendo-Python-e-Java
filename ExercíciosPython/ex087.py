matriz = [[],[],[]]
somapar = 0
mvsec = 0
soma3 = 0
for c in range(0, 3):
    for cont in range(0, 3):
        v = int(input(f'Insira o valor para [{c}, {cont}]: '))
        matriz[c].append(v)
print('-='*30)
for c in range(0, 3):

    soma3 += matriz[c][2]               #Linha para identificar a soma dos valores da terceira coluna

    for cont in range(0, 3):
        if matriz[c][cont]%2 == 0:          #Linha para identificar a soma dos valores pares
            somapar += matriz[c][cont]  

        if cont != 2:
            print(f'[ {matriz[c][cont]} ]', end='')
        else:
            print(f'[ {matriz[c][cont]} ] \n', end='')
            
        if matriz[1][cont] >= mvsec:    #Linha para identificar o maior valor da segunda linha
            mvsec = matriz[1][cont]
            
print('-='*30)
print(f'A soma dos valores pares é {somapar}')
print(f'A soma dos valores da terceira coluna é {soma3}')
print(f'O maior valor da segunda linha é {mvsec}')
