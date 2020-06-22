pilha = []
conte = 0
contf = 0
exp = str(input('Digite a expressão: '))
for c, v in enumerate(exp):
    if v == ('('):
        pilha.append(v)
    elif v == (')'):
        pilha.append(v)
pa = pilha.count('(')
pf = pilha.count(')')
for c, v in enumerate(pilha):
    if c == 0 and v!= ('('):
        conte += 1
        print('Começou errado')
        break
    elif v == ('('):
        for c, v in enumerate(pilha):
            if v == (')'):
                contf += 1
                pilha.remove(')')
                break
if pa != pf:
    conte+=1
elif  pa != contf:
    conte += 1
print(pa)
print(pf)
print(conte)
print(contf)
if conte == 0:
    print('Parabéns! Sua expressão está certa')
elif conte > 0:
    print('Sua expressão está errada')
