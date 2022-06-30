total = 0

for i in range(0, 5):
    i = int(input())

    if i in range(0, 3):
        i += 1
    else:
        total += 100
        i += 1

print(total)
