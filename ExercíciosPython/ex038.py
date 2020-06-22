n = int(input('Escreva um número inteiro a ser convertido:'))
c = int(input("""Escolha a base a ser convertido:
    [1]Binário
    [2]Octal
    [3]Hexadecimal
    :"""))
if c == 1:
    print('{} convertido para BINÁRIO é igual a {}'.format(n, bin(n)[2:]))
elif c == 2:
    print('{} convertido para OCTAL é igual a {}'.format(n, oct(n)[2:]))
elif c == 3:
    print('{} convertido para HEXADECIMAL é igual a {}'.format(n, hex(n)[2:]))
else:
    print('Opção inválida, tente novamente.')
