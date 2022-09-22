class Example:
    raise_amount = 1.04  # it is class variable

    def __init__(self, first, last, pay):
        self.firstname = first
        self.lastname = last
        self.payCheck = pay
        print("{} {} {}".format(self.firstname, self.lastname, self.payCheck))

    def email(selff):  # we can give any name instead of "self"
        print("{}{}@abc.com".format(selff.firstname, selff.lastname))

    def apply_raise(self):
        # this line give error coz exp don't have "raise_amount" defination
        # self.payCheck = self.payCheck * raise_amount
        self.payCheck = self.payCheck * Example.raise_amount
        # or "self.raise_amount"
        # self.payCheck = self.payCheck * self.raise_amount
        print(self.payCheck)

    @classmethod
    def from_raise_mount(cls, amount):
        cls.raise_amount = amount


exp = Example("yashika", "chandra", 50000)
exp2 = Example("manoj", "pandey", 60000)
# first way of calling method directly by class , but here we need to pass instance(in this case instace is "exp")
Example.email(exp)
# second way to call method with help of instance
exp.email()

print(exp.firstname)  # directly access the variable

# Class Variable
print(Example.raise_amount);
print(exp.raise_amount)

# if raise any specific instance
exp.raise_amount =1.07
print("if raise any specific instance ")
print(Example.raise_amount);
print(exp.raise_amount)
print(exp2.raise_amount)

print(Example.__dict__)  # we can see the "raise_amount" class variable here
print(exp.__dict__)  # but here no "raise_amount" variable
exp.apply_raise()

# class method
# if value increase by class method it will effective to all instance, and it can we set by class as well as instance
print("class method")

Example.from_raise_mount(1.05)
# exp.from_raise_mount(1.05)

print(Example.raise_amount);
print(exp.raise_amount)
print(exp2.raise_amount)
