s = 0
cn = 0
while True:
    n = int(input('Digite um número (999 para parar): '))
    if n == 999:
        break
    s += n
    cn += 1
print(f'A soma dos números {cn} digitados foi {s}!')
