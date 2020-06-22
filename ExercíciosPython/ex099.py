def maior(*valores):
    print('-='*30)
    print('Analisando os valores passados...')
    mev = 0
    if (len(valores) == 1 and valores[0] == 0):
        print('Foram informados 0 valores ao todo.')
        print('O maior valor informado foi 0')
    else:
        for c, v in enumerate(valores):
            if v > mev:
                mev = v
            print(v, end=' ')
        print(f'Foram informados {len(valores)} valores ao todo.')
        print(f'O maior valor informado foi {mev}')


#Programa Principal
maior(2, 9, 4, 5, 7, 1)
maior(4, 7, 0)
maior(1, 2)
maior(6)
maior(0)
