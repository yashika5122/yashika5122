from functools import wraps


def my_logger(orignal_function):
    # import logging
    # logging.basicConfig(filename='{}.log'.format(orignal_function.__name__), level=logging.INFO)

    def wrapper(*args, **kwargs):
        print('Run with args {} and krwgs {}'.format(args, kwargs))
        return orignal_function(*args, **kwargs)

    return wrapper


def my_timer(orignal_function):
    import time

    def wrapper(*args, **kwargs):
        t1 = time.time()
        result = orignal_function(*args, **kwargs)
        t2 = time.time() - t1
        print('{} run in {} sec'.format(orignal_function.__name__, t2))
        return result

    return wrapper


import time


@my_logger
@my_timer
def display(name, age):
    time.sleep(1)
    print('display run with {} and {} argument'.format(name, age))


display("manoj", 35)

'''
@my_logger
@my_timer
means that
display = my_logger(my_timer(display))

if we change the sequence of decorator it will reverse
'''

# we can check this by using

display = my_timer(display)
print(display.__name__)  # output - wrapper


# so display the original function name we use wraps from functools


def my_logger_tool(original_function):

    @wraps(original_function)
    def wrapper(*args, **kwargs):
        print('Run with args {} and krwgs {}'.format(args, kwargs))
        return original_function(*args, **kwargs)

    return wrapper


def my_timer_tool(original_function):
    import time

    @wraps(original_function)
    def wrapper(*args, **kwargs):
        t1 = time.time()
        result = original_function(*args, **kwargs)
        t2 = time.time() - t1
        print('{} run in {} sec'.format(original_function.__name__, t2))
        return result

    return wrapper


@my_logger_tool
@my_timer_tool
def display_tool(name, age):
    time.sleep(1)
    print('display_tool run with {} and {} argument'.format(name, age))


# now if we check method name

display_tool = my_timer_tool(display_tool)
print(display_tool.__name__)  # output - display_tool

display_tool("tom", 20)
