import math
frase = str(input('Insira uma frase: '))
fraseu = frase.upper()
frases = fraseu.split()
frasest = fraseu.strip('-')
frasej = ('').join(frasest)
tam = len(frasej)
s = 0
cp = 0
cn = 0
for c in range(0, tam):
    cp == c
    cn == -c
    i = frasej[cp]
    f = frasej[cn]
    if i == f:
        s = s+1
if s == tam:
    print('A frase é um palíndromo')
else:
    print('A frase não é um palíndromo')
    print(frasej)
    print(s)
