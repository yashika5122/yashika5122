class Test:
    # so static method do not operate on instance or class
    @staticmethod
    def is_weekend(day):
        if day.weekday() == 5 or day.weekday() == 6:
            return True
        else:
            return False



import datetime
my_date = datetime.date(2022, 6, 12)

ex = Test
print(ex.is_weekend(my_date))
