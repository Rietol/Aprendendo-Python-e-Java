#num = [2, 5, 9, 1] #Colchetes definem listas, listas podem ser mutadas
#num[2] = 3
#num[4] = 7         #Porém precisam de um método para adicionar novos elementos
#num.append(7)      #Esse módulo permite adicionar um novo valor
#num.sort()         #Vai organizar em ordem crescente
#num.sort(reverse=True) #irá organizar em ordem decrescente
#num.insert(2, 3)   #Irá adicionar o valor 2 na 3° posição 
#num.pop(2)         #Vai eliminar o valor na segunda posição
#if 4 in num:
#    num.remove(4)  #Vai eliminar o primeiro valor 4 achado, caso não exista irá retorna erro
#else:
#   print('Não achei o valor 4')
#print(num)
#print(f'Essa lista tem {len(num)} elementos')

#valores = []       #Uma lista vazia foi criada
#valores.append(5)  #Vários valores foram adicionados
#valores.append(9)
#valores.append(4)

# a = [2, 4, 4, 7]
# b = a             #Você está criando uma ligação entre as duas listas, tudo que uma receber a outra será afetada
# b[2] = 8
# print(f'Lista A: {a})
# print(f'Lista B: {b}) # Ambas a listas irão retornar que o valor na posição 2 é 8

# b = a[:]          # b não irá ter ligação nenhuma com a, recebendo apenas todos os valores de A



valores = list()    #Outro método para se criar listas
for cont in range(0, 5): #Para o contador num alcance de 0-5
    valores.append(int(input('Digite um valor: '))) #Valores recebe o valor do input

for c, v in enumerate(valores): #Para a posição c, o valor v está na enumeração dos valores:
    print(f'Na posição {c} encontrei o valor {v}!')
print('Cheguei ao final da lista.')
