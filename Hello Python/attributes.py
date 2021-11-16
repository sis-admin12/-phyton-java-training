# class Car:
#
#     wheels_number = 4
#     doors_number = 5
#
#     def __init__(self, name, color, year, is_crashed):
#         self.name = name
#         self.color = color
#         self.year = year
#         self.is_crashed = is_crashed
#
#
# mazda_car = Car(name='Mazda CX7', color='red', year=2017, is_crashed=True)
#
# print(mazda_car.name)
# print(mazda_car.is_crashed)
# print(mazda_car.wheels_number)
# print(mazda_car.doors_number)
#
# bmw_car = Car(name='BMW', color='black', year=2018, is_crashed=False)
#
# print(bmw_car.name)
# print(bmw_car.year)
# print(bmw_car.wheels_number)

class BlogPost:                                           #calsa de obiecte si atribute
    def __init__(self, user_name, text, number_of_likes):
        self.user_name = user_name                       # atribute
        self.text = text
        self.number_of_likes = number_of_likes


post_about_politicians = BlogPost('John', 'I like politicians', 0) # obiecte
post_about_cats = BlogPost('Jane', 'I like cats', 0)

post_about_cats.number_of_likes = 1000


print(post_about_politicians.number_of_likes)
print(post_about_cats.number_of_likes)
print(post_about_politicians.text)