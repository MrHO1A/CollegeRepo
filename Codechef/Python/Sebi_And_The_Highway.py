# Codechef Problem
# Url - > https://www.codechef.com/problems/SEBIHWY
def winner(carspeed,sebiG,fatherG,Dashes,Time):
    length_of_dash = 50
    speed_of_other_car = (((Dashes*length_of_dash)/1000.0)*float(Time))+float(carspeed)
    SG = abs(speed_of_other_car-sebiG)
    FG = abs(speed_of_other_car - fatherG)
    if(SG<FG):
        return "SEBI"
    elif(FG<SG):
        return "FATHER"
    else:
        return "DRAW"

def Main():
    inputs = raw_input().split()
    print winner(int(inputs[0]),int(inputs[1]),int(inputs[2]),int(inputs[3]),int(inputs[4]))
Main()