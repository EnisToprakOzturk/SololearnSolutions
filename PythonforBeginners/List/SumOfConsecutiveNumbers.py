N = int(input())

x = list(range(1, N+1))
i = 0
toplam = 0

for a in x:
    toplam += x[i]
    i += 1

print(toplam)
