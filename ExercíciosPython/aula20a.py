#def soma(a, b):
#    print(f'A = {a} e B = {b}')
#    s = a + b
#    print(f'A soma A + B = {s}')


#Programa Principal
#soma(4, 5)
#soma(2, 1)
#soma(4)            #Retorna erro pois está esperando 2 parâmetros, não apenas um
#soma(a= 4, b =5)   #Tu pode especificar qual valor va aonde
#soma(4, 5, 9)      #Retorna erro pois recebeu um valor extra


#def contador(*núm):         #Colocando o asterisco você define que não sabe quantos valores vão ser desempacotados
#    tam = len(núm)
#    print(f'Recebi os valores {núm} e são ao todo {tam} números')


#contador(2, 1, 7)
#contador(8, 0)
#contador(4, 4, 7, 6, 2)


def dobra(lst):
    pos = 0
    while pos < len(lst):
        lst[pos] *= 2
        pos += 1


valores = [6, 3, 9, 1, 0, 2]            #Utilizando=se de lista ao invés do desempacotamento padrão
dobra(valores)
print(valores)
