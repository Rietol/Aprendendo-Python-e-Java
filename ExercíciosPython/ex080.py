lista = []
for c in range(0, 5):
    v = int(input('Insira um valor: '))
    if lista == [] or v > lista[-1]:
        lista.append(v)
        print('O valor foi adicionado ao fim da lista...')
    else:
        for m in range(0, 5):
            if v <= lista[m]:
                lista.insert(m, v)
                print(f'Foi adicionado um valor na posição {m}')
                break
print(lista)
            
