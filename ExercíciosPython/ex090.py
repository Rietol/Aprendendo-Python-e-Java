aluno = {}
aluno['nome'] = str(input('Nome: '))
aluno['média'] = float(input(f'Média de {aluno["nome"]}: '))
print(f'Nome é igual a {aluno["nome"]}')
print(f'Média é igual a {aluno["média"]}')
if aluno['média'] >= 6:
    print('Situação é igual a Aprovado')
else:
    print('Situação é igual a Reprovado')
