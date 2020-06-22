from datetime import date
dados = {}
lista = []
anoatual = date.today().year
dados['nome'] = (str(input('Nome: ')))
ano = (int(input('Ano de Nascimento: ')))
dados['idade'] = ((anoatual) - (ano))
dados['ctps'] = (int(input('Carteira de Trabalho (0 não tem): ')))
if dados['ctps'] != 0:   
    dados['contratação'] = (int(input('Ano de contratação: ')))
    dados['salario'] = (float(input('Salário: R$ ')))
    dados['aposentadoria'] = (dados['contratação']+35)-(ano)
print('-='*30)
lista.append(dados.copy())
print(dados.items())
for e in lista:
    for k, v in e.items():
        print(f'{k} tem o valor {v}')
