casa = float(input('Insira o valor da casa que você está interessado em comprar: '))
sal = float(input('Insira o valor do seu salário mensal: '))
anos = int(input('Insira a quantia em anos a qual você pretende pagar as prestações: '))

meses = anos*12
prest = casa/meses

if prest > (0.3*sal):
    print('Empréstimo negado, valor excendente à renda')
else:
    print('Seu empréstimo pode ser aprovado, sua prestação será no valor {:.2f}R$'.format(prest))
    
