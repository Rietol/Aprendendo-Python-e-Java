np = 0
n = int(input('Insira um número: '))
for c in range(1, n+1):
        if n%c == 0:
            np = np+1
if np == 2:
        print('É um número primo')
else:
    print('Não é um número primo')
