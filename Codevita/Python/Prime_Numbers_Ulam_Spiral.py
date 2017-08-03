import time


# Creating Prime Numbers
def Create_Prime_Numbers(maxlength):
    not_primes = []
    primes = []
    for i in range(2, maxlength + 1):
        if i not in not_primes:
            primes.append(i)
            for j in range(i * i, maxlength + 1, i):
                if(j>maxlength):
                    break
                not_primes.append(j)
    return primes


# Creating Spiral Square Coord
def Square_Spiral(W, H):
    # Return List
    coord_list = []
    # Starting From 0,0
    x = y = 0
    dx = 0  # Initial Direction on X Axis
    dy = -1  # Initial Direction On Y Axis Negative Y
    for i in range(max(W, H) ** 2):
        if (-W / 2 < x <= W / 2) and (-H / 2 < y <= H / 2):
            coord_list.append("{},{}".format(x, y))
            # Fired When Number Is Inside Bounds
        if x == y or (x < 0 and x == -y) or (x > 0 and x == 1 - y):
            dx, dy = -dy, dx
            # Cor Hit Change Direction Right,Up,Left,Down,Right
        x, y = x + dx, y + dy
    return coord_list


# Main Function
def Main(ittr):
    Output = []  # Output List
    start_time = time.time()
    # Get Prime Numbers
    prime_numbers = Create_Prime_Numbers(ittr)
    coords = Square_Spiral(ittr, ittr)
    for prime_number in prime_numbers:
        coord_loc = coords[int(prime_number) - 1]
        Output.append("{}({})".format(prime_number, coord_loc))
    print Output
    print "Execution Took {} Seconds".format(time.time() - start_time)
    exit(0)


# This Is Out To Prefectly Recored Time
ittr = int(raw_input("Enter Ittr Count -> "))
Main(ittr)
