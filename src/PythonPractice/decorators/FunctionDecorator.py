def decorator_func(original_func):  # now instead of passing message we are passing function
    def wrapper_func():
        print("add functionality directly to wrapper ")  # here we add functionality without touching original function.
        return original_func()

    return wrapper_func


def display():
    print("under display function")


decorator_output = decorator_func(display)  # passing display function and it will return wrapper_func
decorator_output()  # now if we run wrapper_func it will execute display function from inside


# now if we use decoration annotation

def decorator_example(original_func):  # now instead of passing message we are passing function
    def wrapper_func():
        print("inside wrapper")
        return original_func()

    return wrapper_func


'''@decorator_Example is equal to , show = decorator_Example(show)
so we can directly call the wrapper by show() '''


@decorator_example
def show():
    print("under show function")


show()

# Now suppose original function has some argument

'''1) if same decorator is define above then there is no need to add annotation again, by commenting this we can run 
2) But if we add to annotation it will throw error "wrapper_func() takes 0 positional arguments but 2 were given"
so resolve this we need add *args and **kwargs(name would be any thing) in wrapper function'''


def decorator_example_parameter(original_func):
    def wrapper_func(*args, **kwargs):
        print("inside wrapper")
        return original_func(*args, **kwargs)

    return wrapper_func


@decorator_example_parameter
def report():
    print("under report function")


@decorator_example_parameter # we can run after commenting this and in that case no need to pass args and kwargs
def report_info(name, age):
    print("{} is {} year old".format(name, age))


report_info("yashika", 30)
report()
