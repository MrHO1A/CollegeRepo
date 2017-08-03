# Prime number appending problem codevita 2017(Sat) July


def Prime_Check(num):
    if num == 0 or num == 1:
        return False
    for x in range(2, num):
        if num % x == 0:
            return False
    else:
        return True

#To Make Prime Numbers
def prime_numbers(numbers):
    prime_num_list = []
    for number in range(2,numbers):
        if(Prime_Check(number)==True):
            prime_num_list.append(number)
    return prime_num_list

#def Number Concat
def make_numbers(number_list):
    return_list = []
    for number in number_list:
        for number2 in number_list:
             return_list.append(int(str(number)+str(number2)))
    return return_list

#Check Primes From List
def check_from_list(number_list):
    numbers = []
    for number in number_list:
        if(Prime_Check(number)==True):
            numbers.append(number)
    return numbers

def Main():
    max_number = int(raw_input())
    if(max_number>70):
        print "Please Enter A Number Less Then 70"
        exit(1)
    nums_list =check_from_list(make_numbers(prime_numbers(max_number)))
    print len(nums_list)

Main()