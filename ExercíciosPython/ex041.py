ano = int(input('Insira a idade do atleta: '))
if ano <= 9:
    print('A categoria do atleta é MIRIM')
elif ano > 9 and ano <= 14:
    print('A categoria do atleta é INFANTIL')
elif ano > 14 and ano <= 19:
    print('A categoria do atleta é JÚNIOR')
else:
    print('A categoria do atleta é MASTER')
    
