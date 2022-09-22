# to use function as variable, we use first class function

def square(n):
    return n * n;


f = square  # assigning function to variable and use that variable as function
print(f(5))


def cube(n):
    return n ** 3


# how to pass function as an argument
def my_map(func, argList):  # passing function and list as an argument
    result = []
    for i in argList:
        result.append(func(i))  # calling function
    return result


out = my_map(square, [1, 2, 3, 4, 5])
print(out)

out = my_map(cube, [1, 2, 3, 4, 5])  # if we are calling cube it should be define above
print(out)


# How to return a function from another function
def logger(msg):
    def log_message():
        print("log message : ", msg)

    return log_message


log = logger("hi")
print(log)
log()


# tag pass to the second method also
def html_tag(tag):
    def wrap_text(msg):
        print('<{0}>{1}</{0}>'.format(tag, msg))

    return wrap_text


h1 = html_tag("h1")
h1("this is header")
h1("Another header")

p1 = html_tag("p")
p1("this is paragraph")
