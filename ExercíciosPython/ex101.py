from datetime import date
anoatual = date.today().year
def voto(ano):
    idade = anoatual - ano
    if (((idade)>= 16 and (idade)<18) or ((idade)> 65)) :
        return(f'Com {idade} anos: VOTO OPCIONAL')
    elif (idade)<16 :
        return(f'Com {idade} anos: VOTO NEGADO')
    else:
        return(f'Com {idade} anos: VOTO OBRIGATÓRIO')


print('-'*30)
print(voto(int(input('Em que ano você nasceu? '))))
