'''
Created on 29 oct. 2022

@author: moral
'''

#1
'''
for i in range(1,101):
    if i%7==0 and i%13==0:
        print(f"{i} es multiplo de 7 y 13")
    elif i%7==0:
        print(f"{i} es multiplo de 7")
    elif i%13==0:
        print(f"{i} es multiplo de 13")
    else:
        print(i)

cont=0
while cont<=100:
    if cont%7==0 and cont%13==0:
        print(f"{cont} es multiplo de 7 y 13")
        cont+=1
    elif cont%7==0:
        print(f"{cont} es multiplo de 7")
        cont+=1
    elif cont%13==0:
        print(f"{cont} es multiplo de 13")
        cont+=1
    else:
        print(cont)
        cont+=1

#2 
tabla=int(input("\nIntroduce el numero de la tabla de multiplicar: "))

while tabla<0 or tabla>10:
    tabla=int(input("No esta dentro de los limites. Introduce el numero de la tabla de multiplicar: "))

for i in range(0,11):
    multiplicacion=i*tabla
    print(f"{tabla}*{i}={multiplicacion}")
cont=0

while cont<=10:
    multiplicar=cont*tabla
    print(f"{tabla}*{cont}={multiplicar}")
    cont+=1

#3
contador=int(input("Cuantos numeros quieres meter?: "))

while contador<=0:
    contador=int(input("Nuumero incorrecto. Cuantos numeros quieres meter?: "))


while contador>0:
    parImpar=int(input("Introduce un numero mayor que 0: "))
    contador-=1
    
    while parImpar<=0:
        parImpar=int(input("Introduce un numero mayor que 0: "))
    
    if parImpar%2==0:
        print(f"El numero {parImpar} es par.") 
    else:
        print(f"El numero {parImpar} es impar.")

#4
n=int(input('Introduce un numero mayor que 0: '))

while n<0:
    n=int(input('Incorrecto. Introduce un numero mayor que 0: '))

suma=0   

for i in range(0, n+1):
    suma=suma+i
print(f"La suma de los primeros {n} numeros es {suma}")        
          
acum, cont=0, 0
while cont<n:
    cont+=1
    acum=acum+cont
print(f"La suma de los primeros {n} numeros es {acum}")    
    
#5
positivos=int(input("Introduce numeros positivos (negativo para parar): "))

acum=0
while positivos>0:
    acum+=1
    positivos=int(input("Introduce numeros positivos (negativo para parar): "))    
    
print(f"Ha entrado en el programa {acum} numeros positivos")    

#6
nA=int(input("Introduce el numA: "))#veces
nB=int(input("Introduce el numB: "))#numero

multi=0
cont=nA
while cont>0:
    multi=multi+nB
    cont-=1
print(f"{nA} por {nB} es {multi}")    

b=0    
for i in range(nA):
    b=b+nB
print(f"{nA} por {nB} es {b}")    
    
#7
pregunta=int(input("Cuantos numeros vas a introducir? "))
while pregunta<0:
    pregunta=int(input("Incorrecto. Cuantos numeros vas a introducir? "))
    
acum, cont=0, 0
while cont<pregunta:
    
    numero=int(input("Introduce un numero mayor que 0: "))
    while numero<0:
        numero=int(input("Numero incorrecto. Introduce un numero mayor que 0: "))
    
    acum=acum+numero    
    cont+=1

print(f"La media de los numeros introducidos es {acum/pregunta}")
    
#8
cifra=int(input("Introduce un numero: "))
pregunta=input("Quieres introducir mas numeros?(Y/N) ").upper()

while pregunta!="Y" and pregunta!="N":
    pregunta=input("Respuesta Incorrecta. Quieres introducir mas numeros?(Y/N) ").upper()

if pregunta=="Y":
    menor=cifra
    while pregunta!="N":
        cifra2=int(input("Introduce un numero: "))
        if menor<cifra2:
            print(f"{menor} es menor que {cifra2}")
            pregunta=input("Quieres introducir mas numeros?(Y/N) ").upper()
        else:
            print(f"{cifra2} es menor que {menor}")
            menor=cifra2
            pregunta=input("Quieres introducir mas numeros?(Y/N) ").upper()
    
else:
    print(f"El menor numero es {cifra}")
    
#9
perfecto=int(input("Introduce un numero: "))
while perfecto<0:
    perfecto=int(input("Numero Incorrecto. Introduce un numero: "))
    
acum=0
for i in range(1,perfecto):
    if perfecto%i==0:
        acum+=i
if acum==perfecto:
    print(f"El numero {perfecto} es perfecto")
else:
    print(f"El numero {perfecto} no es perfecto")    
    
#9  Factorial 6=6*5*4*3*2*1
factorial=int(input("Introduce el numero del que queremos saber el factorial: "))
while factorial<0:
    factorial=int(input("Numero no valido. Introduce el numero del que queremos saber el factorial: "))

total=1
cont=0
if factorial==0:
    print(f"El factorial de {factorial} es {total}")

else:    
    
    #for i in range(1,factorial+1):
        #total=total*i
    #print(f"El factorial de {factorial} es {total}")

    while cont<factorial:
        cont+=1
        total=total*cont
    print(f"El factorial de {factorial} es {total}")
    

#1 Bucles avanzados   10-2=8-2=6-2=4-2=2-2=0
numero1=int(input("Introduce numero 1: "))
numero2=int(input("Introduce numero 2: "))

if numero1>numero2:
    dividendo=numero1
    divisor=numero2
else:
    dividendo=numero2
    divisor=numero1
    
if numero1==0 or numero2==0:
    print(f"{dividendo} entre {divisor} es 0 y resto 0")

else:    
    acum=0
    resto=dividendo
    while resto>=divisor:
        resto=resto-divisor
        acum+=1
    print(f"{dividendo} entre {divisor} es {acum} y resto {resto}")

       
#2 bucles avanzados   13 y 7 ⇒ 14, 21, 28, 35, 42, 49, 56, 63, 70, 77  
comienzo=int(input("Indica el comienzo de la serie: "))
while comienzo<0:
    comienzo=int(input("Incorrecto. Indica el comienzo de la serie: "))
    
multiplos=int(input("Indica el multiplo: "))
while multiplos<0:
    comienzo=int(input("Incorrecto. Indica el comienzo de la serie: "))
    

cont, acum=10,0
cadena=""
lista=[]
while cont>0:
    while acum<comienzo:
        acum+=1
    
    if acum%multiplos==0:
        cadena+=str(acum)+","
        lista.append(acum)
        acum+=1
        cont-=1
    else:
        acum+=1

print(f"Los 10 primeros multiplos de {multiplos} desde {comienzo} son {cadena}")
print(f"Los 10 primeros multiplos de {multiplos} desde {comienzo} son {lista}")  
    
    
#3 bucles avanzados   4 ⇒ es par, positivo y su cuadrado es 16

numero=int(input("Dime un numero: "))
while numero!=0:
    cadena=""
    if numero%2==0:
        cadena+="Es par."
    else:
        cadena+="Es impar."
    
    if numero>0:
        cadena+="Es positivo."
    else:
        cadena+="Es negativo."
    
    print(f"{numero} => {cadena}Y su curadrado es {numero**2}")
    numero=int(input("\nDime un numero: "))
    
        
'''
serie=5
multi=1
cad=""
for i in range(serie):
    if i==0:
        cad+=str(1)+","
    else:
        multi=multi*(-5)
        cad+=str(multi)+","
print(cad)
    
    

    
    

        

    
    
    
    
    
    
    
    
    
    