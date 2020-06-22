cont = ()
lista = []
while True:
    valor = int(input('Insira um valor: '))
    lista.append(valor)
    cont = str(input('Quer continuar [S]/[N]'))
    if cont in ('Nn'):
        break
lista.sort(reverse=True)
print(f'Foram inseridos {len(lista)} valores \n A lista em ordem decrescente: \n {lista}')
if 5 in lista:
    print('O valor 5 está na lista')
else:
    print('O valor 5 está ausente na lista')
