file = open("/usercode/files/pull_ups.txt")
n = int(input())

text = file.readlines()
print(text[n])

file.close()
