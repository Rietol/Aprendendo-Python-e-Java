def fatorial(num, show=False):
    fatorial = 1
    for c in range(num, 0, -1): 
        fatorial *= c
        if show == True:
            if c != (1):
                print(f'{c} x', end = ' ')
            else:
                print(f'{c} =', end = ' ')
    return(fatorial)


print(fatorial(5, show=True))
