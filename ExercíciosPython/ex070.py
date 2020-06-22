total = int(0)
qmmil = int(0)
nmpb = str('0')
qt = int(0)
mp = int(0)
while True:
    print("""--------------------
--CAIXA ELETRÔNICO--
--------------------""")
    nome = str(input('Nome do Produto: '))
    preço = float(input('Preço: '))
    if qt == 0:
        qt += 1
        nmpb = nome
        mp = preço   
    if preço < mp:
        mp = preço
        nmpb = nome
    if preço > 1000:
        qmmil += 1
    total += preço
    fim = input(str('Continuar? [S/N]: '))
    if fim in ('Nn'):
        break
print(f'O total gasto foi de {total:.2f}, {qmmil} produtos custaram mais que 1000, e {nmpb} foi o produto mais barato')
