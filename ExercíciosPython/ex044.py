pre = float(input('Insira o preço do produto: '))
fp = int(input("""Escolha a forma de pagamento:
    [1]À vista dinheiro/cheque:10% de Desconto
    [2]À vista no cartão:5% de Desconto
    [3]Em até 2x no cartão:Preço normal
    [4]3x ou mais no cartão:20% de Juros
    """))
if fp == 1:
    print('O preço final a ser pago é: {:.2f}R$'.format(pre*0.9))
elif fp == 2:
    print('O preço final a ser pago é: {:.2f}R$'.format(pre*0.95))
elif fp == 3:
    print('O preço final a ser pago e: {:.2f}R$ em 2 prestações de {:.2f}'.format(pre, pre/2))
elif fp == 4:
    print('O preço final a ser pago é: {:.2f}R$'.format(pre*1.2))
