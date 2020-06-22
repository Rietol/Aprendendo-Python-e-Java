lista = []
mv = 0
mev = 0
for c in range(0, 5):
    lista.append(int(input(f'Insira um valor para a posição {c}: ')))
print(lista)
for c, v in enumerate(lista):
    if mv == 0:
        mv = v
        mev = v
    elif v > mv:
        mv = v
    elif v < mev:
        mev = v
print(f'O maior valor foi {mv} na posição ', end='')
for c, v in enumerate(lista):
    if v == mv:
            print(c, end='...')
print(f'\n O menor valor foi {mev} na posição ', end='')
for c, v in enumerate(lista):
    if v == mev:
            print(c, end='... ')
