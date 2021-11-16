colors_list = ['red', 'orange', 'yellow', 'green', 'blue', 'indigo', 'violet']
with open('C:/Users/Serghei.Matura/Desktop/rainbow_colors.txt', 'w') as rainbow_colors: #'w' inseamna write
    for color in colors_list:
        print(color, file=rainbow_colors)

# colors_list = []
# with open('/Users/yuriyallakhverdov/Desktop/rainbow_colors.txt', 'r') as rainbow_colors:
#     for color in rainbow_colors:
#         colors_list.append(color.strip('\n'))
#
# print(colors_list)
#
# with open('C:/Users/Serghei.Matura/Desktop/rainbow_colors.txt', 'a') as rainbow_colors: #'a' inseamna apend a adauga
#     print('dark green', file=rainbow_colors)
#     print('dark blue', file=rainbow_colors)