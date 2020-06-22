a1 = float(input('Insira o primeiro termo: '))
r = float(input('Insira a razão: '))
c = 0
x = 10
while x != 0:
    if c == x:
        x = int(input('Insira outro termo para a progressão,  0 para encerrar: '))
    while c < x:
        print(a1+r*(c))
        c += 1
    
