from time import sleep
def contador(início, fim, passo):
    print('-='*18)
    print(f'Contagem de {início} até {fim} de {passo} em {passo}')
    if passo == 0:
        passo = 1
    if início > fim and (passo > 0):
        passo = -(passo)
    if fim > 0:
        fim += 1
    elif fim <= 0:
        fim -= 1
    for c in range(início, fim, passo):
         print(c, end = ' ')    #Na versão mais nova a função recebe um buffer de tela,
         sleep(1)               #Para corrgir isso é só colocar no print(,flush = True)
    print(f'FIM!')
    

#Programa Principal
contador(1, 10, 1)
contador(10, 0, -2)
print('Agora é sua vez de personalizar a contagem!')
contador(int(input('Início: ')),
         int(input('Fim: ')),
         int(input('Passo: ')))
    
