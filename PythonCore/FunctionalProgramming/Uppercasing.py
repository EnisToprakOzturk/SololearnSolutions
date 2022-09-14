text = input()


def uppercase_decorator(func):
    def wrapper(text):
        wrapper = text.upper()
        return wrapper
    return wrapper


@uppercase_decorator
def display_text(text):
    return(text)


print(display_text(text))
