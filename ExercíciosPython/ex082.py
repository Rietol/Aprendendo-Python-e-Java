lista = []
listapar = []
listaimpar = []
cont = str('S')
while True:
    n = int(input('Insira um valor aqui: '))
    lista.append(n)
    cont = str(input('Quer continuar? [S]/[N]: '))
    if cont in ('Nn'):
        break
for c in range(len(lista)):
    if lista[c] %2 == 0:
        listapar.append(lista[c])
    else:
        listaimpar.append(lista[c])
print(f'Os números  digitados foram: \n {lista}')
print(f'Os números  pares foram: \n {listapar}')
print(f'Os números  ímpares foram: \n {listaimpar}')
