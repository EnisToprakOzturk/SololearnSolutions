def calc(list):
    if len(list) == 0:
        return 0
    else:
        return list[0] ** 2 + calc(list[1:])


list = [1, 3, 4, 2, 5]
x = calc(list)
print(x)
