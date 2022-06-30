age = int(input())

if age in range(0, 12):
    print("Child")
elif age in range(12, 18):
    print("Teen")
elif age in range(18, 65):
    print("Adult")

"""
if age >= 0 and age <= 11:
    print("Child")
elif age >= 12 and age <= 17:
    print("Teen")
elif age >= 18 and age <= 64:
    print("Adult")
"""
