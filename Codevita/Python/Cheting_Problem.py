#Main Decoder Function
def Decoder(message,depth):
    # Constructing Matrix
    metrix = [["-" for x in range(len(message))] for y in range(depth)]
    # Init Some Variable
    row,col,index,decoded_text=0,0,0,""
    # Defining If Can Go Down In Rows
    down = False
    # Looping and setting all possible points with *
    for x in range(len(message)):
        if row == 0:
            down = True
        if row == depth-1:
            down=False
        metrix[row][col]="*"
        col=col+1
        if(down==True):
            row=row+1
        else:
            row=row-1
    # Replacing * With Characters From Encoded String
    for x in range(depth):
        for y in range(len(message)):
            if(metrix[x][y]=="*"):
                metrix[x][y],index=message[index],index+1
    row, col, index, decoded_text = 0, 0, 0, ""
    # Reading Matrix In Same Pattern
    for x in range(len(message)):
        if row == 0:
            down = True
        if row == depth-1:
            down=False
        if(metrix[row][col]!="-"):
            decoded_text = decoded_text+metrix[row][col]
        if(down==True):
            row=row+1
        else:
            row=row-1
        col = col+1
    return decoded_text;
def Main():
    depth,message = raw_input("Enter Depth -> "),raw_input("Enter Message -> ")
    print Decoder(message,int(depth))
#Running Main Function
Main()
