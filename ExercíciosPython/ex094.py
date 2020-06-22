pessoas = []
c = 0
somaidade = 0
while True:
    c += 1
    pessoa = {}
    pessoa['nome'] = str(input('Nome: '))
    pessoa['sexo'] = str(input('Sexo: [M]/[F] '))
    pessoa['idade'] = int(input('Idade: '))
    pessoas.append(pessoa.copy())
    del(pessoa)
    cont = str(input('Quer continuar? [S]/[N] '))
    if cont in ('Nn'):
        break
for e in pessoas:
    for k, v in e.items():
        if k == 'idade':
            somaidade += v    
print('-='*30)
print(f'- O grupo tem {c} pessoas.')
print(f'- A média de idade é de {((somaidade)/c):.2f} anos.')
print('- As mulheres cadastradas foram: ', end = '')
for e in pessoas:
    for k, v in e.items():
        if k == 'sexo':
            if v in ('Ff'):
                print(e['nome'], end = ' ')
print('\n- Lista das pessoas que estão acima da média: ')
for e in pessoas:
    for k, v in e.items():
        if k == 'idade':
            if v > ((somaidade)/(c)):
                for ch, va in e.items():
                    print(f'{ch} = {va}; \n')
print('\n<< ENCERRADO >>')

            
