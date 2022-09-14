password = input()
repeat = input()


def validate(text1, text2):
    if password == repeat:
        print("Correct")
    else:
        print("Wrong")


validate(password, repeat)
