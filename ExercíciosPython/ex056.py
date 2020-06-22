midade = float(0)
contm20 = int(0)
hmv = 0
nhmv = str
for c in range(0, 4):
    nome = str(input('Insira o nome: '))
    idade = int(input('Insira a idade: '))
    sexo = str(input('Insira o sexo [F]/[M]: '))
    midade += idade
    if sexo.upper() == ('F') and idade < 20:
        contm20 += 1
    elif sexo.upper() == ('M') and idade > hmv:
        nhmv = nome
print('A média de idade do grupo foi {:.1f}, o nome do homem mais velho é {} e há {} mulhere(s) abaixo dos 20 anos'.format(midade/4, nhmv, contm20))
               
