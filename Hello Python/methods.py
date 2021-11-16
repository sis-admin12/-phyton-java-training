# class Car:
#
#     wheels_number = 4
#
#     def __init__(self, name, color, year, is_crashed):
#         self.name = name
#         self.color = color
#         self.year = year
#         self.is_crashed = is_crashed
#
#     def drive(self, city):
#         print(self.name + ' is driving to ' + city)
#
#     def change_color(self, new_color):
#         self.color = new_color
#
#
# opel_car = Car('Opel Tigra', 'grey', '1999', True)
# opel_car.drive('London')
# mazda_car = Car('Mazda CX7', 'black', 2014, False)
# mazda_car.drive('Paris')
# mazda_car.change_color('yellow')
# print(mazda_car.color)
#
#
#
#
# # print(opel_car.drive)
# # print(opel_car.wheels_number)
# # print(opel_car.name)
# # print(opel_car.color)
# # print(opel_car.year)
# # print(opel_car.is_crashed)


# class Circle:
#     pi = 3.14
#
#     def __init__(self, radius=1):
#         self.radius = radius
#         self.circumference = 2 * Circle.pi * self.radius
#
#     def get_area(self):                       #method - metode
#         return self.pi * (self.radius ** 2)

    # def get_circumference(self):
    #     return 2 * self.pi * self.radius



# circle_1 = Circle(100)
# print(circle_1.get_area())
# print(circle_1.circumference)
# print(circle_1.get_circumference())
# circle_2 = Circle(3)
# print(circle_2.get_area())
# print(circle_2.get_circumference())
# circle_3 = Circle(5)
# circle_area = circle_3.get_area()
# print(circle_area)
# print(circle_3.get_circumference())

class BankAccount:

    def __init__(self, client_id, client_first_name, client_last_name):
        self.client_id = client_id
        self.client_first_name = client_first_name
        self.client_last_name = client_last_name
        self.balance = 0.0

    def add(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        self.balance -= amount


account_1 = BankAccount(1, 'John', 'Brown')
account_2 = BankAccount(2, 'Jim', 'White')

account_1.add(1000)
print(account_1.balance)
account_1.withdraw(500)
print(account_1.balance)
print(account_2.balance)
account_2.add(1234)
print(account_2.balance)
account_2.withdraw(213)
print(account_2.balance)