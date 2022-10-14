'''
Created on 30 sept. 2022

@author: moral
'''


'''
#1
number=1
while number<=100:
    number+=1
    
    if number%7==0 and number%13==0:
        print(f"The number {number} is a multiple of 7.")
        print(f"The number {number} is a multiple of 13.")
    elif number%7==0:
        print(f"The number {number} is a multiple of 7.")
    elif number%13==0:
        print(f"The number {number} is a multiple of 13.")
    
    else:
        print(number) 
        
#2
table=int(input("\nQue tabla de multiplicar quieres: "))

for num in range(0,11):
    print(f"{table} por {num} es {table*num}")  

#3
cantidad=int(input("\nHow many numbers do you want input? "))

while cantidad > 0: 
    cantidad = cantidad -1
    numero=int(input("Enter one number greater than 0: ")) 
    
    while numero<=0:
        numero=int(input("Incorrect number. Enter one number greater than 0: "))     
    
    if numero%2==0:
        print(f"The number {numero} is even")
    else:
        print(f"The number {numero} is odd")
 
#4   
numeros=int(input("\nEnter one number greater than 0: "))

while numeros<0:
    print("The number is not right, try again.")
    numeros=int(input("Enter one number greater than 0: "))

b=0
for n in range(0, numeros+1):
    print(n)
    b=b+n
print(f"The sum of the {numeros} first numbers is {b}")
          
#7
cantidad = int(input("\nHow many numbers do you want input? "))

while cantidad  <= 0:
    print("The number is not valid, it should be greater than 0")
    cantidad = int(input("How many numbers do you want input? "))

total, contador= 0, 0

while cantidad>contador:
    
    numero=int(input("Enter one number greater than 0:"))
    while numero<=0:
        numero=int(input("The number is not valid. Enter one number greater than 0:"))
    contador+=1    
    total+=numero # total=numero+total
    
print(f"The medium is {total/cantidad}")

#5
positivos=int(input("\nEnter a number (negative to finish): "))

cont=0
while positivos>=0:
    cont+=1
    positivos=int(input("Enter a number (negative to finish): "))

print(f"You have {cont} positives numbers.")
    

#6
numeroA=int(input("\nEnter the numberA: "))
numeroB=int(input("Enter the numberB: "))

producto=0
while numeroA!=0:
    producto=producto+numeroB
    numeroA-=1

print("The product is",producto)

#9
entero=int(input("Enter an integer positive number greater than 0: "))

while entero<0:
    entero=int(input("The number is not valid, try again: ")) 

cont=1
divisor=0   

while entero>cont:
    if entero%cont==0:
        divisor+=cont
    cont+=1

        
if divisor == entero:
    print("The number is perfect")
else:
    print("The number is not perfect")

#10
num=int(input("Enter an integer positive number: "))

while num<0:
    num=int(input("The number is not valid, try again: "))
 
total=1 
c=1
while num>=c:
    total*=c
    c+=1

print("The factorial is", total)

#8
menor=int(input("\nEnter a number: "))
respuesta=input("Do you want to enter more number (Y/N)? ") 

while respuesta.upper()=="Y":
    res=menor
    menor=int(input("Enter a number: "))
    respuesta=input("Do you want to enter more number (Y/N)? ") 
        
if res>menor:
    print(f"{menor} es menor que {res}")
else:
    print("El menor numero es", res)

print("---------")
print("\nBOLETIN 4")

#17
num1=int(input("Introduzca un primer numero: "))
num2=int(input("Introduzca un segundo numero: "))

print(f"Los numeros pares entre {num1} y {num2}:")

for i in range(num1, num2+1):
    if i%2==0:
        print(i)


#18
limite_menor=int(input("Introduce el limite menor: "))
limite_mayor=int(input("Introduce el limite mayor: "))

while limite_mayor<=limite_menor:
    print("Limite inferior incorrectos.")
    limite_menor=int(input("Introduce el limite menor: "))

numeros=int(input("Introduce numeros: "))

suma_intervalo=0
suma_fuera=0
igual=False

while numeros!=0:
    
    if numeros<limite_menor or numeros>limite_mayor:
        suma_fuera+=1   
    
    elif limite_menor<numeros<limite_mayor:
        suma_intervalo+=numeros
    
    else:
        igual=True
    
    numeros=int(input("Introduce numeros: ")) #para que no se quede con el 0

print("Suma numeros dentro intervalo:", suma_intervalo)
print("Fuera del intervalo hay:", suma_fuera)

if igual:
    print("Existen numeros iguales a los intervalos")
else:
    print("No coincide")
  


#19
base=int(input("Introduzca la base: "))
exponente=int(input("Introduzca el exponente: "))

while base<0 or exponente<0:
    base=int(input("Introduzca la base: "))
    exponente=int(input("Introduzca el exponente: "))

potencia=1
while exponente>0:
    potencia*=base
    exponente-=1
print(f"La potencia es {potencia}")

'''
#20

for i in range(0,20):
    i2=(2**i)*10
    total=i2+i2
    print("En el mes",i+1,"pagariamos",i2,"euros")
print("\nEl total de todos los meses es", total-10,"euros")
        
        
numero=0
total=(2**20)*10
print("Suma sin bucle:",total-10)

    
    


       
       
         
             
    


    
    
    
    
    
    
    
    
    
    
    
