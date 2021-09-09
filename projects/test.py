# stuff = int(input("Please input a number: "))
digits = str(input("Please input a number: "))

sentinel = 0
anotherSentinel = 0
for number in digits:
    sentinel += int(number) # sentinel = sentinel + int(n)

if sentinel > 10:
    for number in (str(sentinel)):
        anotherSentinel += int(number)

print("outcome")
print(anotherSentinel)