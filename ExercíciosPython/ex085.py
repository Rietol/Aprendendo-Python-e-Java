valores = [[],[]]
for c in range(1, 8):
    va = int(input(f'Digite o {c}° valor: '))
    if va%2 == 0:
        valores[0].append(va)
    elif va%2 != 0:
        valores[1].append(va)
print('-='*30)
valores[0].sort()
valores[1].sort()
print(f'Os valores pares digitados foram: {valores[0]}')
print(f'Os valores ímpares digitados foram: {valores[1]}')
