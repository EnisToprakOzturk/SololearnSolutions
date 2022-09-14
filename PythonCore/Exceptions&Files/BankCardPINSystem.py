pin = input()

try:
    int(pin)
    print("PIN code is created")

except ValueError:
    print("Please enter a number")
