# this is an example of using classmethod as constructor
class String_split:
    def __init__(self,first, last, salary):
        self.first = first
        self.last = last
        self.salary = salary

    @classmethod
    def from_string(cls, input):
        first, last, salary = input.split("-")
        return String_split(first, last, salary)

    def from_print(self):
        print("hello")

    # @classmethod
    # def from_date(cls, t):
    #     t = _time.time

# first way without classmethod

# input ="yashika-chandra-40000"
# first, last, salary = input.split("-")
# new1= String_split(first, last, salary)
# print(new1.salary)


# second way
output_recieve = String_split.from_string("yashika-chandra-40000")
print(output_recieve.salary)

# Third way
# classmethod which converts the methods to a class method and then we call the
# class function from_print without creating a function object.
String_split.from_print = classmethod(String_split.from_print)
String_split.from_print()