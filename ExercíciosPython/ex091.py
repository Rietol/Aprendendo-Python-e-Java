ordenado = []
dados = {}
pos = 0
import random
from time import sleep
from operator import itemgetter
random.randint(1, 6)
for c in range(1, 5):
    dados[f'Jogador{c}'] = (random.randint(1, 6))
    print(f'Jogador {c} tirou {dados[f"Jogador{c}"]}')
    sleep(1)
print('-='*30)
print(' == RANKING DOS JOGADORES==')
ordenado = sorted(dados.items(), key=itemgetter(1), reverse=True)
for i, v in enumerate(ordenado):
        print(f'  {i+1}º lugar: {v[0]} com {v[1]}')
        sleep(1)
    
