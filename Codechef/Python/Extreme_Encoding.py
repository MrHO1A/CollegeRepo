# Question URL - > https://www.codechef.com/problems/KOL16B
# Author -> Aman Vishwakarma
def Decode_Array(number_of_elemens,modified_array,case):
    A,B = [],[]
    a,b ="",""
    for x in range(number_of_elemens):
        # 32768 because range of int is between 32768 && -32768
        A.append(modified_array[x]%32768)
        B.append(modified_array[x]>>16)
    print "Case "+case+":"
    for x in range(number_of_elemens):
        a,b = a+str(A[x])+" ",b+str(B[x])+" "
    print a
    print b
t = int(raw_input())
for x in range(t):
    n = int(raw_input())
    a = []
    for n in range(n):
        a.append(int(raw_input()))
    Decode_Array(int(n+1),a,str(x+1))