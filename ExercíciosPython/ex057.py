sexo = str(input('Insira o sexo da pessoa: ')).upper()
while sexo not in ('MF'):
    sexo = str(input('Digite novamente [M]/[F]: ')).upper()
print('FIM')
