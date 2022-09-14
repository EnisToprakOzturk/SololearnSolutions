fruits = ["apple", "cherry", "banana", "kiwi",
          "lemon", "pear", "peach", "avocado"]
num = int(input())

if num < 0 or num > 7:
    print("Wrong number")
else:
    print(fruits[num])
