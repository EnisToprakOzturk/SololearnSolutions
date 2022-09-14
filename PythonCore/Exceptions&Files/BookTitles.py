file = open("/usercode/files/books.txt", "r")

for line in file:
    ch = line[0]

    num = len(line)

    if line[-1] == "\n":
        num -= 1

    dv = str(num)
    print(ch+dv)

file.close()
