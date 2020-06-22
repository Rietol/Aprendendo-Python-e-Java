ida = int(input('Insira seu ano de nascimento: '))
ali = (2019-ida)
if ali < 18:
    print('Você ainda vai se alistar ao serviço militar, em {} ano(s)'.format(18-ali))
elif ali == 18:
    print('Já está na hora de alistar-se')
elif ali > 18:
    print('Passou-se {} anos do tempo de alistamento'.format(ali-18))
