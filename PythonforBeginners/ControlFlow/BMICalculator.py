weight = int(input())
height = float(input())

bmı = weight / height ** 2

if bmı < 18.5:
    print("Underweight")
elif bmı >= 18.5 and bmı < 25:
    print("Normal")
elif bmı >= 25 and bmı < 30:
    print("Overweight")
elif bmı >= 30:
    print("Obesity")
