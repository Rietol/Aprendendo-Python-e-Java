a18 = int(0)
h = int(0)
mm20 = int(0)
while True:
    ida = int(input('Digite a idade: '))
    sex = str(input('Digite o sexo [M/F]: '))
    if (ida > 18):
        a18 += 1
    if sex.upper() == 'M':
        h += 1
    if sex.upper() == 'F':
        if ida < 20:
            mm20 += 1
    fim = str(input('Quer inserir outra pessoa? [S/N]: '))
    if fim in ('Nn'):
            break
print(f'{a18} pessoas tem mais de 18 anos, {h} homens foram cadastrados e {mm20} mulheres tem menos de 20 anos.')
