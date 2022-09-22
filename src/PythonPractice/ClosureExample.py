def outer_function():
    msg = "hello "

    def inner_function():
        print("inner function ", msg)  # inner function remember the msg variable from outer function

    return inner_function


p = outer_function()
p()


# ----------------------------
def outer_function_wih_parameter(message):
    msg = message

    def inner_function_without():
        print("inner function ", msg)  # inner function remember the msg variable from outer function

    return inner_function_without


hi_func = outer_function_wih_parameter("hi")
hello_func = outer_function_wih_parameter("hello")
hi_func()
hello_func()


# more example


def out_func(func):
    def in_func(*args):  # * means any number of argument
        print('Running {} with arguments {}'.format(func.__name__, args))
        print(func(*args))

    return in_func


def add(x, y):
    return x + y


def sub(x, y):
    return x - y


add_loger = out_func(add)
add_loger(3, 4)

sub_loger = out_func(sub)
sub_loger(10, 4)
