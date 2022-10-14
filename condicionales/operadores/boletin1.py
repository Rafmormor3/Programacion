#-*- coding: utf-8 -*-

'''
Created on 20 sept. 2022

@author: moral
'''


#boletin 1 ejer1
print("EJERCICIO 1")

print(7>=27 and not (7<=2))
print( 24>5 and 10<=10 or 10==5)
print((10>=15 or 23==13) and not (8==8))
print(not(6/3>3) or 7>7)



#boletin 1 ejer5
print("\nEJERCICIO 5")

A=True
B=True
print("\nPara A=", A, " y B=", B)
print("(A or B) and not (A) =", (A or B) and not (A))
print("not (A or B) and B =", not (A or B) and B)
print("A or not (B) =", A or not (B))
print("not((A and B) and (B or A)) =", not((A and B) and (B or A)))

print("--------------")

A=True
B=False
print("Para A=", A, " y B=", B)
print("(A or B) and not (A) =", (A or B) and not (A))
print("not (A or B) and B =", not (A or B) and B)
print("A or not (B) =", A or not (B))
print("not((A and B) and (B or A)) =", not((A and B) and (B or A)))

print("--------------")

A=False
B=True
print("Para A=", A, " y B=", B)
print("(A or B) and not (A) =", (A or B) and not (A))
print("not (A or B) and B =", not (A or B) and B)
print("A or not (B) =", A or not (B))
print("not((A and B) and (B or A)) =", not((A and B) and (B or A)))

print("--------------")

A=False
B=False
print("Para A=", A, " y B=", B)
print("(A or B) and not (A) =", (A or B) and not (A))
print("not (A or B) and B =", not (A or B) and B)
print("A or not (B) =", A or not (B))
print("not((A and B) and (B or A)) =", not((A and B) and (B or A)))


#Boletin 1 ejercicio3
print("\nEJERCICIO 3")


#Verdadera si precio es mayor o igual a 60 pero igual o menor a 420
precio=int(input("\nDime el precio: "))
'''
if precio>=60 and precio<=420:
    precio=True
else:
    precio=False
'''
print("El precio es mayor o igual a 60 pero igual o menor a 420?", precio>=60 and precio<=420)

print("--------------")

#Verdadera si el numero es impar
numero=int(input("Dime un numero: "))
'''
if numero%2 == 0:
    numero=True
else:
    numero=False
'''   
print("El numero es impar?", numero%2 != 0)

print("--------------")

#Verdadera si saldo y dineroSacar son validas

saldo=int(input("Saldo en la cuenta: "))
dineroSacar=int(input("Dinero a sacar: "))
'''
if saldo>=dineroSacar:
    dineroSacar=True
else:
    dineroSacar=False
'''    
print("Hay mas saldo que dinero a sacar?", saldo>=0 and saldo>=dineroSacar and dineroSacar>=0)

print("--------------")


#Verdadera si Horas y Minutos son correctas, comprendidos entre 0:0 y 23:59
horas=int(input("Elige una hora comprendida entre 0 y 23: "))
minutos=int(input("Elige los minutos comprendidos entre 0 y 59: "))
'''
if (horas>=0 and horas<=23) and (minutos>=0 and minutos<=59):
    Hora=True
else:
    Hora=False

print("Las", horas, ":", minutos, " es", Hora)
'''
print("Hora válida:", (horas>=0 and horas<=23) and (minutos>=0 and minutos<=59))

print("--------------")

#Verdadera si estadoCivil es correcta (S-Soltero, C-Casado, V-Viudo, D-Divorciado)

estadoCivil=input("Dime Estado Civil con la letra correspondiente (S-Soltero, C-Casado, V-Viudo, D-Divorciado): ")
'''
if not(estadoCivil == "S" or estadoCivil == "C" or estadoCivil == "V" or estadoCivil == "D"):
    estadoCivil=True
else:
    estadoCivil=False
'''    
print("Estado civil:", not(estadoCivil == "S" or estadoCivil == "C" or estadoCivil == "V" or estadoCivil == "D"))



#Boletin 1 ejercicio4
print("\nEJERCICIO 4")


#Falsa cuando cantidad es mayor de 300 o negativa

cantidad=int(input("\nDime la cantida a sacar del cajero: "))

if cantidad>=300 or cantidad<0:
    cantidad=False
else:
    cantidad=True
   
print("Cantidad mayor que 0 o menor que 300?", cantidad)

print("--------------")


#Falsa si edad esta entre 16-22 anos

edad=int(input("Introduce la edad: "))

if edad>=16 and edad<=22:
    edad=False
else:
    edad=True
    
print("Eres adolescente (16-22 anos)", edad)

print("--------------")

#Falsa si numero es multiplo de 7 o de 3

n=int(input("Introduce un numero: "))

if n%3==0 or n%7==0:
    n=False
else:
    n=True
    
print("No es multiplo de 3 o de 7?", n)

print("--------------")



#Boletin 1 ejer2
print("\nEJERCICIO 2")

r1=27%4 + 15/4
print("r1:", r1, type(r1))

r2=37/4**2-2
print("r2:", r2, type(r2))

r3=9*2/3*10*3
print("r3:", r3, type(r3))

r4= (7*3-4*4)**2/4*2
print("r4:", r4, type(r4))




