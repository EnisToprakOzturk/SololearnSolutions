names = ["John", "Oscar", "Jacob"]

file = open("names.txt", "w+")

for i in names:
    file.write(i + "\n")

file.close()

file = open("names.txt", "r")
print(file.read())

file.close()
