n1 = int(input('Insira o primeiro número: '))
n2 = int(input('Insira o segundo número: '))
c = 0
while c != 5:
    c = int(input("""
[1]Somar
[2]Multiplicar
[3]Maior
[4]Novos números
[5]Sair do Programa
Escolha a opção: """))
    if c == 1:
        print('A soma de {} e de {} é {}'.format(n1, n2, n1+n2))
    elif c == 2:
        print('A multiplicação de {} por {} é {}'.format(n1, n2, n1*n2))
    elif c == 3:
        if n1 > n2:
            print('O maior número é {}'.format(n1))
        elif n2 > n1:
            print('O maior número é {}'.format(n2))
        else:
            print('Ambos são iguais')
    elif c == 4:
        n1 = int(input('Insira o primeiro número: '))
        n2 = int(input('Insira o segundo número: '))
    
    elif c == 5:
        print('FIM')
