def guessnumber ():
#set the date with variable 
#year = int(2012)
#Determine if they have had a birthday this year
#raw_input ('have you had a Birthday yet this year?')
#if yes add 1 to the year
    year = int(raw_input ("Type 1 if you have had your birthday already this year, type 0 if you have not and press ENTER: "))
#Yearchange = raw_input ('Type 1 if you have had your birthday already this year, type 0 if you have not and press ENTER ')
#if no the year stays the same
    if year == int(1):
        year = 2012;
    elif year != int(1):
        year = 2011;
    else: 
        guessnumber ();
#walk user through number generation sequence
    raw_input ('On a piece of paper write down the four digit year you where born and hit enter')
    raw_input ('On a piece of paper write down the four year of a special even in your life and hit enter')
    raw_input ('On a piece of paper write down your age and hit enter')
    raw_input ('On a piece of paper write down the number of years that have passed since your special event and hit enter and hit enter')
    raw_input ('Now add up your four numbers and hit enter and I will atempt to guess your number')
#convert string to integer
    answer = int(year)
#Calculate the and answer by multiplying 2 and the date
    magic = (answer * int('2'))
#Convert the answer to string for output
    guess = str(magic)

#print out the guess
    print (guess + ' is your number')

