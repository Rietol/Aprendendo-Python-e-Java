#Listas podem receber listas

#pessoas = [['Pedro', 25], ['Maria', 19], ['Joao', 32]]
#         |   0       1   |   0      1   |  0      1    |
#-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|
#         |       0       |      1       |      2       |

#print(pessoas[0][0]) #Dentro do índice zero de pessoas, mostre o índice 0 (Pedro)
#print(pessoas[1][1]) #Dentro do índice 1 de pessoas, mostre o índice 1 (19)
#print(pessoas[2][0]) #Dentro do índice 2 de pessoas, mostre o índice 0 (João)
#print(pessoas[1]) #Mostre o índice 1 de pessoas (Maria, 19)
#for p in galera:
    #print(p[1]) #Irá imprimir apenas a idade(índice 1) de todo o grupo galera
    #print(f'{p[0]} tem {p[1]} anos de idade.')

#teste = list()
#teste.append('Gustavo')
#teste.append(40)
#galera = list()
#galera.append(teste)
#galera.append(teste[:])
#teste[0] = 'Maria'
#teste[1] = 22
#galera.append(teste) #Vai criar um link entre as listas, assim indexandon 2 vezes o valor de 'Maria', 22
#galera.append(teste[:]) #Não vai criar o link, e irá indexar o valor novo
#print(galera)

galera = list()
dado = list()
totmaior = totmenor = 0
for c in range(0, 3):
    dado.append(str(input('Nome: ')))
    dado.append(int(input('Idade: ')))
    galera.append(dado[:]) #criar cópia não criar um elo
    dado.clear()   #Vai limpar a lista
#print(galera)
for p in galera:
    if p[1] >= 21:
        print(f'{p[0]} é maior de idade.')
        totmaior += 1
    else:
        print(f'{p[0]} é menor de idade.')
        totmenor += 1
print(f'Temos {totmaior} maior(es) e {totmenor} menor(es) de idade')
