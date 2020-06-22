mp = float(0)
mep = float(0)
for c in range (0,5):
    p = float(input('Insira o peso: '))
    if mep == 0:
        mep = p
    if p > mp:
        mp = p
    elif mep > p:
        mep = p
print('O maior peso foi {} e o menor peso foi {}'.format(mp, mep))
