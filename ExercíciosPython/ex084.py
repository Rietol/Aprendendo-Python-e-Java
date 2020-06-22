pessoas = []
nomepes = []
contpessoas = 0
maipeso = 0
menpeso = 0
while True:
    nomepes.append(str(input('Nome: ')))
    nomepes.append(int(input('Peso: ')))
    if nomepes[1] >= maipeso:
        maipeso = nomepes[1]
    if menpeso == 0:
        menpeso = nomepes[1]
    elif nomepes[1] < menpeso:
        menpeso = nomepes[1]
    pessoas.append(nomepes[:])
    nomepes.clear()
    contpessoas += 1
    cont = str(input('Quer continuar?[S]/[N] '))
    if cont in ('Nn'):
        print('-='*30)
        break
print(f'Ao todo você cadastrou {contpessoas} pessoas.')
print(f'O maior peso foi de {maipeso}Kg. Peso de ', end='')
for c, v in enumerate(pessoas):
    if v[1] == maipeso:
        print(f'[{pessoas[c][0]}]', end=' ')
print(f'\nO menor peso foi de {menpeso}Kg. Peso de ', end ='')
for c, v in enumerate(pessoas):
    if v[1] == menpeso:
        print(f'[{pessoas[c][0]}]', end =' ')
        
    
    
