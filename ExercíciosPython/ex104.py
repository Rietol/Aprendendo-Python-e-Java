def leiaInt(n):
    num = (input(n))
    while num.isdigit() != True:
        print('ERRO! Digite um número inteiro válido')
        num = input('Digite um número: ')
        if num.isdigit() == True:
             break
    return(num)


#Programa Principal
n = leiaInt('Digite um número: ')
print(f'Você acabou de digitar o número {n}')
