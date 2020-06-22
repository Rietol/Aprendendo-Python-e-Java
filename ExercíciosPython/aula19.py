#pessoas = {'nome': 'Gustavo', 'sexo': 'M', 'idade': 22}
#print(pessoas)         #Irá retornar->{'nome': 'Gustavo', 'sexo': 'M', 'idade': 22}
#print(pessoas[0])      #Irá retornar erro
#print(pessoas['nome']) #Irá retornar o valor categorizado por essa categoria
#print(f'O {pessoas["nome"]} tem {pessoas["idade"]} anos.')
#print(pessoas.keys())  #Irá retornar as categorias
#print(pessoas.values())#Irá retornar os valores atribuídos
#print(pessoas.items()) #Irá retornar os valores com as categorias
#for k in (pessoas.values/keys()):
    #print(k)           #Vai retornar a informação pedida
#for k, v in pessoas.items():
    #print(f'{k} = {v}) #Vai retornar primeiro a categoria e depois o valor atribuído a ela
#del pessoas['sexo']    #Apagou o elemento sexo
#pessoas['nome'] = 'Leandro' #Troca o valor de nome para Leandro
#pessoas['peso'] = 98.5 #irá funcionar como um append()



#-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
#brasil = []
#estado1 = {'uf': 'Rio de Janeiro', 'sigla': 'RJ'}
#estado2 = {'uf': 'São Paulo', 'sigla': 'SP'}
#brasil.append(estado1)
#brasil.append(estado2)
#print(estado1)          #Irá retornar o dicionário
#print(brasil[0])        #Irá retornar o dicionário 0 da lista
#print(brasil[0]['uf'])  #Do dicionário 0, vai retornar o valor categorizado por 'uf'


estado = dict()
brasil = list()
for c in range(0, 3):
    estado['uf'] = str(input('Unidade Federativa: '))
    estado['sigla'] = str(input('Sigla do Estado: '))
#   brasil.append(estado)       #Vai atribuir o mesmo valor várias vezes
#   brasil.append(estado[:])    #Dicionário não pode ser fatiado, retorna erro
    brasil.append(estado.copy()) #Utiliza o método próprio para conseguir copiar, já que não pode ser fatiado
for e in brasil:
    for k, v in e.items():
        print(f'O campo {k} tem valor {v}.')







    
