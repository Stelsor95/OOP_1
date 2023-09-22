def addition(x, y):
    return x + y


def subtraction(x, y):
    return x - y


def multiplication(x, y):
    return x * y


def division(x, y):
    if y != 0:
        return x / y
    else:
        raise ZeroDivisionError("Деление на ноль невозможно")


def calculator():
    while True:
        print("Выберите операцию:")
        print("1. Сложение")
        print("2. Вычитание")
        print("3. Умножение")
        print("4. Деление")
        print("5. Выйти")

        choice = input("Введите номер операции (1/2/3/4/5): ")

        if choice == '5':
            print("Выход из калькулятора")
            break

        try:
            num1 = float(input("Введите первое число: "))
            num2 = float(input("Введите второе число: "))
        except ValueError:
            print("Ошибка: Некорректный ввод числа")
            continue

        if choice == '1':
            print("Результат:", addition(num1, num2))
        elif choice == '2':
            print("Результат:", subtraction(num1, num2))
        elif choice == '3':
            print("Результат:", multiplication(num1, num2))
        elif choice == '4':
            try:
                print("Результат:", division(num1, num2))
            except ZeroDivisionError as e:
                print("Ошибка:", e)
        else:
            print("Неверный выбор операции")

calculator()
