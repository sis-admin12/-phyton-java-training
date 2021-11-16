# x = 5

# while x >= 1:
#     print(x)
#     x -= 1 # x = x - 1

# while x < 10:
#     print(x)
#     x += 1 # x = x + 1

# while x < 10:
#     print(x)
#     x += 2
# print('Next code')

# x = 0
# while x < 10:
#     print(str(x) + ' x is less than 10')
#     x += 1
# else:
#     print(str(x) + ' x now is not less than 10')
#
# for x in range(10):
#     print(str(x) + ' x is less than 10')
# else:
#     x += 1
#     print(str(x) + ' x now is not less than 10')

# break, continue, pass

my_list = [1, 2, 3]

# for item in my_list:
#     pass # nu scrie nimic merge mai departe
# print('Another code')

# for item in my_list:
#     if item == 2:
#         break # daca ii egal cu 2 iese din bucla
#     print(item)
#
# print('Another code')

for item in my_list:
    if item == 2:
        continue # dupa ce a gasit ca este egal cu 2 nu iese ci verifica mai departe in lista
    print(item)

print('Another code')
