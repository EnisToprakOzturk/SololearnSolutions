txt = input()

words = txt.split(" ")

for i in words:
    if i == words[0]:
        longest = i
    elif len(i) > len(longest):
        longest = i

print(longest)
