def find_prime ():
    from math import *
    ##Returns the 1000th prime number
    count = 1
    num = 3
    while count < 1000:
            divisor=2
            while divisor <num:
                    if num % divisor == 0:
                            break 
                    if num % divisor != 0:
                            divisor += 1
                            if divisor == num:
                                    count += 1
            num = num + 2	
    print num-2	