valores = []
while True:
    v = int(input('Insira um valor: '))
    if v in (valores):
        print('Este valor já foi registrado, insira outro... ')
    else:
        valores.append(v)
        print('Valor adicionado com sucesso...')
    cont = str(input('Quer continuar [S]/[N]: '))
    if cont in ('Nn'):
               break
valores.sort()
print(valores)
