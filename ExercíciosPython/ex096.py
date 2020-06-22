def área():
    print('  Controle de Terrenos')
    print(' ', '-'*15)
    largura = float(input('LARGURA (m): '))
    comprimento = float(input('COMPRIMENTO (m): '))
    print(f'A área entre {largura}x{comprimento} é de {(largura*comprimento):.2f}')


área()
