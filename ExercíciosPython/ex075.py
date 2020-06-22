nums = tuple()
ap = tuple()
bp = tuple()
cp = tuple()
dp = tuple()
a = int(input('Insira o primeiro valor: '))
b = int(input('Insira o segundo valor: '))
c = int(input('Insira o terceiro valor: '))
d = int(input('Insira o quarto valor: '))
nums = (a, b, c, d)
print(nums)
v9 = (nums.count(9))
print('O número 9 aparece {} vezes'.format(v9))
if 3 in nums:
    v3 = (nums.index(3)) + 1
    print('O valor 3 aparece na posição {}'.format(v3))
else:
    print('O valor 3 não aparece nessa sequência')
print(f'Os valores pares foram:', end= '')
for n in nums:
    if n % 2 == 0:
        print(n, end=' ')
