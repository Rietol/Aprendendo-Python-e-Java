c = 0
t = 0
s = 0
while c != 999:
    c = int(input('Insira um número (999 para parar): '))
    if c != 999:
        s += c
        t += 1
print('No total foram digitados {} números, sendo a soma total {}'.format(t, s))
