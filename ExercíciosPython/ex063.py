n = int(input('Quantos termos da sequência Fibonacci você deseja ver? '))
t1 = 0
t2 = 1
t3 = t1 + t2
c = 0
while c < n :
    print(t1)
    t3 = t1 + t2
    t1 = t2
    t2 = t3
    c += 1
