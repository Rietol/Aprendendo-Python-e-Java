alt = float(input('Insira sua altura: '))
peso = float(input('Insira a sua massa corporal: '))
imc = peso/(alt*alt)
if imc < 18.5:
    print('Você está abaixo do peso.')
elif 18.5 < imc < 25:
    print(' Você está no peso ideal!')
elif 25 < imc < 30:
    print('Você está com sobrepeso.')
elif 30 < imc < 40:
    print('Você está com obesidade')
elif 40 < imc:
    print('Você está com obesidade mórbida')
    
    
