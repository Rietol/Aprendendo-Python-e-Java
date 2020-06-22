import random
n = (0, 1, 2, 3, 4 ,5 ,6, 7, 8, 9)
num = random.choices(n, k=5)
print(num)
print(f'O menor número foi {sorted(num)[0]} \nO maior número foi {sorted(num)[4]}')
