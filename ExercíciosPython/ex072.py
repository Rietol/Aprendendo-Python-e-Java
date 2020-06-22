números = ('zero', 'um', 'dois', 'três', 'quatro', 'cinco', 'seis', 'sete', 'oito', 'nove', 'dez', 'onze', 'doze', 'treze', 'quartoze', 'quinze', 'dezesseis', 'dezessete', 'dezoito', 'dezenove', 'vinte')
cheque = int(input('Escreva um número de 0 a 20: '))
while ( 0 > cheque) or (cheque > 20):
    cheque = int(input('Tente novamente. Escreva um número de 0 a 20: '))
else:
    print(f'O número escolhido foi {números[cheque]}')
