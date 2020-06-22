s = 0
for c in range(1, 500):
    if (c%2) != 0 and (c%3) == 0:
        s += c
print('A soma de todos os números ímpares e múltiplos de 3 entre 1 e 500 é {}'.format(s))
