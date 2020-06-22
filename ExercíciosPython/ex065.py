me = 0
mav = 0
n = 0
nm = 0
c = 's'
mev = 0
while c not in ('Nn'):
    n = int(input('Digite um valor inteiro: '))
    me += n
    if mev == 0:
        mev = n
    if n > mav:
        mav = n
    elif mev > n:
        mev = n
    nm += 1
    c = str(input('Quer continuar [S]/[N]: '))
print('O maior valor foi {}, o menor {} e a média entre os números digitados foi {:.1f}'.format(mav, mev, me/nm))
