from datetime import date
ano = date.today().year
cma = 0
cme = 0
for c in range(0, 7):
    m = int(input('Insira o ano de nascimento: '))
    if (ano-m) >= 18:
        cma = cma+1
    else:
        cme = cme +1
print('{} pessoas atingiram a maioridade e {} não'.format(cma, cme))
