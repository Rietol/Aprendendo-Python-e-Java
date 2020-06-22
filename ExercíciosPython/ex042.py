a = float(input('Insira o valor do primeiro lado: '))
b = float(input('Insira o valor do segundo lado: '))
c = float(input('Insira o valor do terceiro lado: '))
if (((b-c)**2)**1/2) < a < b+c:
    print('Há formação de triângulos')
    if a == b and a == c:
        print('O triângulo formado será Equilátero')
    elif a == b or b == c or c == b:
        print('O triângulo formado será Isósceles')
    else:
        print('Todos os lados são diferentes, é Escaleno')
else:
    print('Não há formação de triângulos')
