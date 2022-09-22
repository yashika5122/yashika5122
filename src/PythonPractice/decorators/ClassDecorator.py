class decoator_class(object):
    def __init__(self, original_function):
        self.original_function = original_function

    def __call__(self, *args, **kwargs):
        print("call method execute this before {}".format(self.original_function.__name__))
        return self.original_function(*args, **kwargs)


@decoator_class
def display():
    print("inside class display")


@decoator_class
def display_info(name, age):
    print("{} is {} year old".format(name, age))


display()
display_info("yashika", 78)
