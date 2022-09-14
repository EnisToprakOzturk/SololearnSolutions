s = input()


def hashtagGen(text):
    withoutspace = text.replace(" ", "")
    hashtag = ("#" + withoutspace)
    return hashtag


print(hashtagGen(s))
