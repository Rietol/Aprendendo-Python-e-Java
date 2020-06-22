n = int(input('Insira o número o qual você queira ver o fatorial: '))
c = n-1
f = n
while c != 1:
    f = f*c
    c = c-1
print('O fatorial de {} é igual a {}'.format(n, f))
        
