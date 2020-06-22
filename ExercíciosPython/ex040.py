n1 = float(input('Insira a primeira nota: '))
n2 = float(input('Insira a segunda nota: '))
m = (n1+n2)/2
if m < 5.0:
    print('Reprovado')
elif m >= 5 and m < 7:
    print ('Recuperação')
else:
    print('Aprovado')
