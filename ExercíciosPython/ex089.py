nomeno = []
aluno = []
while True:
    nomeno.append(str(input('Insira o nome: ')))
    nomeno.append(float(input('Insira a primeira nota: ')))
    nomeno.append(float(input('Insira a segunda nota: ')))
    aluno.append(nomeno[:])
    nomeno.clear()
    cont = str(input('Quer continuar? [S]/[N] '))
    if cont in ('Nn'):
        break
print('-='*30)
print('-'*8, ' < BOLETIM > ', '-'*9)
print('No.   NOME         MÉDIA')
print('-'*32)
for c in range(0, len(aluno)):
    print(f'{c:<6}{aluno[c][0]:<12} {((aluno[c][1]+aluno[c][2])/2):.2f}')
print('-'*36)
while True:
    maluno = int(input('Mostrar as notas de qual aluno? (999 interrompe): '))
    print(f'Notas de {aluno[maluno][0]} são {aluno[maluno][1]}{aluno[maluno][2]}')
    if maluno == 999:
        print('FINALIZANDO...')
        break
print('<<< VOLTE SEMPRE >>>')

