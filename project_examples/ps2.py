##6a + 9b + 20c = n.
##ps2

###
### template of code for Problem 4 of Problem Set 2, Fall 2008
###

bestSoFar = 0     # variable that keeps track of largest number
 #n = 51                 # of McNuggets that cannot be bought in exact quantity
packages = (6,9,20)
packages1 = (20,6,9)# variable that contains package sizes
packages2 = (9,20,6)
#for n in range(1, 150):   # only search for solutions up to size 150
        ## complete code here to find largest size that cannot be bought
        ## when done, your answer should be bound to bestSoFar


##a = packages[0]
##b = packages[1]
##c = packages[2]
##n = 51
## 
##while (6*a) + (9*b) + (20*c) != n:
##    a = + 1
##    b = + 2
##    c = + 3
##    if n == 51:
##        print (a, b, c)
##    else:
##        print 'done3'

        
possible = []
notPossible = []

for n in range(1, 70):
    for c in (0,1,2):
        for b in (0,1):
            for a in range(0,40):
                if (6*a + 9*b + 20*c) == (n):
                    if n not in possible:
                        possible.append(n)
                        #print "adding to possible"
                    elif n not in notPossible:
                         notPossible.append(n)
                         #print "adding to Not possible"
                         print "not Possible",len(notPossible)
print "possible list",len(possible)
for l in possible:
    if l in notPossible:
        notPossible.remove(l)
        #print "removing possibilities"
print "new size for Not",len(notPossible)
print "Largest number of McNuggets that cannot be bought in exact quantity:",notPossible.pop()
