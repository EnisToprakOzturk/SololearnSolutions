names = ["David", "John", "Annabelle", "Johnathan", "Veronica"]


def long(text):
    if len(text) > 5:
        return True
    else:
        return False


longNames = filter(long, names)

newNames = list(longNames)

# newNames = list(filter(lambda x: len(x) > 5), names))

print(newNames)
