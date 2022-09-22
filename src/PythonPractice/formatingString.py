for i in range(1, 13):
    # print ("No. {0} squared is {1} cube is {2}".format(i, i ** 2, i ** 3))
    # print ("No. {0:2} squared is {1:3} cube is {2:4}".format(i, i ** 2, i ** 3)) # just for  right side
    print ("No. {0:2} squared is {1:<3} cube is {2:^4}".format(i, i ** 2, i ** 3)) # just for formating left side
