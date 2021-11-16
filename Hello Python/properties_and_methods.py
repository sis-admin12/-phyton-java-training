# Immutable
first_name = 'Jane'
print(first_name[2])
# first_name[2] = 'n'
# print(first_name)

first_two_letters = first_name[:2]
print(first_two_letters)
last_letter = first_name[-1:]
print(last_letter)

# Concatenable
new_first_name = first_two_letters + 'l' + last_letter
print(new_first_name)

greeting = 'Hello'
greeting = greeting + ' Python!'
print(greeting)

# Multiplication
yummy = 'YumEE '
print(yummy * 3)

print(yummy.upper())
print(yummy.lower())
print(yummy)

long_string = 'This is the long string'
print(long_string.split('s'))
