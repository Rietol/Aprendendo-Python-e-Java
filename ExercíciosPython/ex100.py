import random
valores = []
def sorteia():
    print('Sorteando 5 valores da lista:', end = ' ')
    for cont in range(0, 5):
        valores.append(random.randint(1, 10))
        print(valores[cont], end = ' ')
    print('Pronto!')
    

def somaPar(valores):
    somapar = 0
    for c, v in enumerate(valores):
        if v % 2 == 0:
            somapar += v
    print(f'Somando os valores pares de {valores}, temos {somapar}')


#Programa Principal
sorteia()
somaPar(valores)
