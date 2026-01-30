num = input("Enter a number: ")
nth = int(input("Enter nth number: "))

for i in range(nth):
    numberAsList = list(num) #convert number to list
    counter = 0 #
    for i in numberAsList: #
        counter += int(str(i)) #
    counter += int(num)
    num = str(counter)
print(num)
   