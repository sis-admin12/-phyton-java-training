def get_number_from_range():
    for number in range(10):
        yield number


counter = get_number_from_range()

print(counter)
# print(next(counter))
# print(next(counter))
# print(next(counter))
# print(next(counter))
# print(next(counter))
# print(next(counter))
# print(next(counter))
# print(next(counter))
# print(next(counter))
# print(next(counter))
# print(next(counter))

counter1 = (number for number in range(10))
print(counter1)
# print(next(counter1))
# print(next(counter1))
# print(next(counter1))
# print(next(counter1))
# print(next(counter1))
# print(next(counter1))
# print(next(counter1))
# print(next(counter1))

# print([number for number in range(10)])


