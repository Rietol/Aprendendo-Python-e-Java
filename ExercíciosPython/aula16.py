lanche = ('Hambúrger', 'Suco', 'Pizza', 'Pudim', 'Batata Frita')
# Tuplas são imutáveis
#lanche[1] = 'Refrigerante'
#A linha 3 irá retornar um erro caso seja executada

#for comida in lanche:
#    print(f'Eu vou comer {comida} ')


#Os abaixo são para mostrar o índice do item

#for pos, comida in enumarate(lanche):
#    print(f'Eu vou comer {lanche[comida] na posição {comida}}')
#print('Comi para caramba')


#for comida in range(0, len(lanche)):
#    print(f'Eu vou comer {lanche[comida] na posição {comida}}')
#print('Comi para caramba')

#Para odernar use o comando: sorted

#print(sorted(lanche))
#print(lanche)

#Não mudou, continua o mesmo.

a = (2, 5 , 4)
b= (5, 8, 1, 2)
c = a + b
# c receberá a união das tuplas, a ordem em que é somada altera a posição dos elementos
#print (c.count(5)) irá retornar quantas vezes apareceu o elemento na tupla
#a propriedade index mostra em qual posição estão o elemento.
#print(c.index(4)) print(c.index(5, 1)) <--- mesma coisa só que começando procurar a partir da posição 1

pessoa = ('Gustavo', 39, 'M', 99.88) #Pode ter vários tipos de váriavel numa tupla

#a tupla é imutável exceto quando apagada

del(pessoa)

#Mas você não pode deletar um item individual, apenas a tupla no seu todo
