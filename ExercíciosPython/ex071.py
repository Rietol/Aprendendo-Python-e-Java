import math
while True:
    print("""--------------------
--CAIXA ELETRÔNICO--
--------------------""")
    v = int(input('Qual é o valor que você quer sacar? '))
    vr = v
    if (v/50) >= 1:
        print(f'Total de {math.floor((v)/50)} cédulas de R$50')
        vr = v%50
    if ((vr)/20) >= 1:
        print(f'Total de {math.floor((vr)/20)} cédulas de R$20')
        vr = vr%20 
    if ((vr)/10) >= 1:
        print(f'Total de {math.floor((vr)/10)} cédulas de R$10')
        vr = vr%10
    if ((vr)/5) >= 1:
        print(f'Total de {math.floor((vr)/5)} cédulas de R$5')
        vr = vr%5
    if ((vr)/1) >= 1:
        print(f'Total de {math.floor((vr)/1)} cédulas de R$1')
    fim = str(input('Quer sacar de novo? [S/N]: '))
    if fim in ('Nn'):
        break
