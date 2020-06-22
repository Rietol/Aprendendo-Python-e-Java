def escreva(msg):
    print('~'*(len(msg)+2))
    print(f' {msg} ') 
    print('~'*(len(msg)+2))


#Programa Principal
escreva(str(input('Insira a mensagem a ser formatada: ')))
