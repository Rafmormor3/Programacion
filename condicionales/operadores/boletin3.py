#-*- coding: utf-8 -*-
'''
Created on 26 sept. 2022
@author: moral
'''
'''
print("BOLETIN 3")
#1
numero=int(input("Introdzca el numero: "))

if numero%2==0:
    print("El numero %s es par y su cuadrado es %s"%(numero, numero**2))
else:
    print("El numero %s es impar y su cuadrado es %s"%(numero, numero**2))
    
#2
n1=int(input("\nInserte n1: "))
n2=int(input("Inserte n2: "))

if n1==n2:
    print("Son iguales.")
elif n1>n2:
    print("n1 mayor que n2")
else:
    print("n1 menor que n2")

#3
num=int(input("\nIntroduzca un numero: "))

if num%2==0 and num%3==0:
    print("El numero", num, "es multiplo de 2 y 3.")
elif num%2==0:
    print("El numero", num, "es multiplo de 2.")
elif num%3==0:
    print("El numero", num, "es multiplo de 3.")
else:
    print("No es multiplo ni de 2 ni de 3.")

#4
edad=int(input("\nCual es tu edad: "))

if edad> 100 or edad<0:
    print("No se puede.")
elif 0<=edad<=12:
    print("Eres un niño.")
elif 13<=edad<=17:
    print("Eres un adolescente.")
elif 18<=edad<=29:
    print("Eres un joven")
else:
    print("Eres adulto.")
    
#5
num1=int(input("\nIntroduce numero 1: "))    
num2=int(input("Introduce numero 2: "))     
num3=int(input("Introduce numero 3: "))
num4=int(input("Introduce numero 4: "))

media=(num1+num2+num3+num4)/4    

if media<num1:
    print("Media %s y numero mayor %s"%(media, num1))    
if media<num2:
    print("Media %s y numero mayor %s"%(media, num2))
if media<num3:
    print("Media %s y numero mayor %s"%(media, num3))
if media<num4:
    print("Media %s y numero mayor %s"%(media, num4))
  
#6 
   
l=input("\nIntroduce una letra:")
letra=l.lower()

if letra=="a" or letra=="e" or letra=="i" or letra=="o" or letra=="u":
    print("Es vocal")
    if letra=="a":
        print("Primera vocal (A)")
    elif letra=="e":
        print("Segunda vocal (E)")
    elif letra=="i":
        print("Tercera vocal (I)")
    elif letra=="o":
        print("Cuarta vocal (O)")
    elif letra=="u":
        print("Quinta vocal (U)")
else:
    print("No es vocal")
'''
#7
estado=input("\nIntroduzca su estado (S-Soltero, C-Casado, V-Viudo y D-Divorciado): ")
  
edad=int(input("Introduzca su edad: ")) 

if estado=="S" and estado=="C" and estado=="V" and estado=="D" or edad>0: 
    
    if edad<=35:
        if (estado=="S" or estado=="D"):
            print("Porcentaje de retencion es de 12%")
        elif (estado=="V" or estado=="C"):
            print("Porcentaje de retencion es de 11.3%")
   
    elif edad>=50:
        print("Porcentaje de retencion es de 8.5%")
    
    else:
        print("Porcentaje de retencion es de 10.5%")

else:
    print("No valido")    

#8 
h1=int(input("\nHoras 1:")) 
h2=int(input("Horas 2:"))   
m1=int(input("Minutos 1:"))   
m2=int(input("Minutos 2:"))   
s1=int(input("Segundos 1:"))   
s2=int(input("Segundos 2:"))   

print("Hora 1: %s:%s:%s"%(h1, m1, s1))
print("Hora 2: %s:%s:%s"%(h2, m2, s2))

if 0<=h1<=23 and 0<=h2<=23 and 0<=m1<=59 and 0<=m2<=59 and 0<=s1<=59 and 0<=s2<=59:

    if h1>h2:
        print("Hora 1 es mayor") 
    elif h2>h1:
        print("Hora 2 es mayor")
    else:
        if m1>m2:
            print("Hora 1 es mayor")
        elif m2>m1:
            print("Hora 2 es mayor")
        else:
            if s1>s2:
                print("Hora 1 es mayor")
            elif s2>s1:
                print("Hora 2 es mayor")
            else:
                print("Hora 1 igual Hora 2")
else:
    print("No es hora correcta")

#9
producto=input("\nTipo de producto (A, B, C): ")
precio=float(input("Introduzca el precio original: "))

if producto=="A" or producto=="B" or producto=="C": 
    if producto=="A":
        print("Precio final sera (7%):", precio - (precio*7/100))
    elif producto=="C" or 0<=precio<500:
        print("Precio final sera (12%):", precio - (precio*12/100))
    elif producto=="B" or precio>=500:
        print("Precio fina sera (9%):", precio-(precio*9/100))
else:
    print("Error")

#10
caracter=input("Inserte un caracter: ")
o1=int(input("Introduce el primer numero: "))
o2=int(input("Introduce el segundo numero: "))

if caracter=="*":
    print("Multiplicacion:", o1*o2)
elif caracter=="/":
    print("Division:", o1/o2)
elif caracter=="+":
    print("Suma:", o1+o2)
elif caracter=="-":
    print("Resta:", o1-o2)
elif caracter=="%":
    print("Modulo:", o1%o2)
else:
    print("Caracter no valido: ", caracter)
























    
    