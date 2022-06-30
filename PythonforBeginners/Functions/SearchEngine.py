def search(a, b):
    if b in a:
        return("Word found")
    else:
        return("Word not found")


text = str(input())
word = str(input())

print(search(text, word))
