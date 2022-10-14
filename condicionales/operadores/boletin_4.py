#-*- coding: utf-8 -*-

'''
Created on 21 sept. 2022

@author: moral
'''
from math import sqrt

#BOLETIN 2 

print("BOLETIN 3 ")

#1
c1=float(input("Asigne un valor al cateto1: "))
c2=float(input("Asigne un valor al cateto2: "))

print("Hipotenusa:", sqrt(c1**2 + c2**2))

#2
gF=float(input("\nIntroduzca la temperatura en grados Fahrenheit: "))

print("Grados Celsius:", (gF - 32)*5/9)

#3
n1=int(input("\nIntroduzca un n1: "))
n2=int(input("Introduzca un n2: "))
n3=int(input("Introduzca un n3: "))

print("Media aritmetica de los 3 n:", (n1+n2+n3)/3)

#4
precio=float(input("\nPrecio total de la compra: "))

print("Precio con el 15% de descuento:", precio-(precio*15/100))

#5
numero1=float(input("\nIntroduzca un numero1: "))
numero2=float(input("Introduzca un numero2: "))

print("La distancia entre los dos numeros:", abs(numero1-numero2))

#6
x1=float(input("\nIntroduzca un numero x1: "))
y1=float(input("Introduzca un numero y1: "))

x2=float(input("Introduzca un numero x2: "))
y2=float(input("Introduzca un numero y2: "))

distanciax= x1 - x2
distanciay= y1 - y2

print("Distancia entre dos puntos (x1,y1) y (x2,y2):", sqrt(distanciax**2 + distanciay**2))

#7
num=float(input("\nPonga un numero: "))

print("Numero leido:", num)
print("Raiz cuadrada:", (num)**(1/2))
print("Raiz cubica:", (num)**(1/3))

#8
moneda2=int(input("\nCuantas monedas de 2 euros tienes? "))
moneda1=int(input("Cuantas monedas de 1 euros tienes? "))
moneda50=int(input("Cuantas monedas de 50 centimos tienes? "))
moneda20=int(input("Cuantas monedas de 20 centimos tienes? "))
moneda10=int(input("Cuantas monedas de 10 centimos tienes? "))

euros=moneda1+moneda2*2
centimos=moneda50*50+moneda20*20+moneda10*10

if moneda2<0 or moneda1<0 or moneda50<0 or moneda20<0 or moneda10<0:
    print("No puedes tener monedas negativas")
else:
    if centimos<100:
        print(f"Tienes {euros} euros y {centimos} centimos ")
    else:
        cent=centimos%100
        eu=euros+centimos//100
        print(f"Tienes {eu} euros y {cent} centimos ")
        
#9
base=float(input("\nIntroduzca la base: "))
exponente=float(input("Introduzca el exponente: "))

if exponente>0:
    print("Resultado:", base**exponente)
elif exponente == 0:
    print("Resultado es 1")
else:
    print("Resultado:", 1/(base**(abs(exponente))))

#10
A=float(input("\nLongitud lado A: "))
B=float(input("Longitud lado B: "))
C=float(input("Longitud lado C: "))

if C**2==A**2+B**2 or A**2==B**2+C**2 or B**2==A**2+C**2:
    print("Es un triangulo rectangulo")
elif A==B!=C or A==C!=B or B==C!=A:
    print("Es un triangulo isosceles")
elif A==B==C:
    print("Es un triangulo equilatero")
else:
    print("Es un triangulo escaleno")

#11
año=int(input("\nIntroduzca el año: "))

if (año%4==0 and año%100!=0) or (año%4==0 and año%100==0 and año%400==0):
    print(año, "es bisiesto.")
else:
    print(año, "no es bisiesto.")
#12
tipo=input("\nIndica el tipo de uva (A o B): ")
tamaño=int(input("Indica tamaño (1 o 2): "))

if (tipo=="A" or tipo=="B") and (tamaño==1 or tamaño==2):
    if tipo=="A" and tamaño==1:
        print("Se carga 20 cent")
    elif tipo=="A" and tamaño==2:
        print("Se carga 30 cent")
    elif tipo=="B" and tamaño==1:
        print("Se rebaja 30 cent")
    elif tipo=="B" and tamaño==2:
        print("Se rebaja 50 cent")        
    
else:
    print("No es correcto") 

#13
alumnos=int(input("\nNumero de alumnos: "))
bus=4000/alumnos

if alumnos>=100:
    print("Coste de cada alumno de %s euros"%(65+bus))
elif 50<=alumnos<=99:
    print("Coste de cada alumno de %s euros"%(70+bus))
elif 30<=alumnos<=49:
    print("Coste de cada alumno de %s euros"%(95+bus))
else:
    print("Coste de cada alumno de %s euros"%(bus))
 
#14
tiempo_llamada=int(input("\nTiempo de llamada: "))
dia=input("Dia de la semana en realizar la llamada: ")
momentoDia=input("Momento de la llamda (mañana o tarde): ")

if tiempo_llamada>=0:
    
    if 0<=tiempo_llamada<=5:
        costo=+1
    elif 5<tiempo_llamada<=8:
        costo=1+0.80
    elif 8<tiempo_llamada<=10:
        costo=1+0.80+0.70
    else:
        costo=1+0.80+0.70+0.50
    
    if dia=="domingo":
        costo1=costo + (costo*0.03)
        print("Coste de la llamada:", costo1)
    else:
        if momentoDia=="mañana":
            costo1=costo + (costo*0.15)
            print("Coste de la llamada:", costo1)
        elif momentoDia=="tarde":
            costo1=costo + (costo*0.1)
            print("Coste de la llamada:", costo1)
        else:
            print("Momento del dia incorrecto")   

else:
    print("ERROR ")

#15
dia=int(input("\nInserte el número del dia de la semana: "))

if 1<=dia<=7:
    if dia==1:
        print("Lunes")
    elif dia==2:
        print("Martes")
    elif dia==3:
        print("Miercoles")
    elif dia==4:
        print("Jueves")
    elif dia==5:
        print("Viernes")
    elif dia==6:
        print("Sabado")
    else:
        print("Domingo")
else:
    print("Dato incorrecto")

#16
mes=int(input("Introduzca número del mes: "))

if 1<=mes<=12:
    if mes==1 or mes==3 or mes==5 or mes==7 or mes==8 or mes==10 or mes==12:
        print(f"El mes {mes} tiene 31 dias")
    elif mes==2:
        print(f"El mes {mes} tiene 28 dias")
    else:
        print(f"El mes {mes} tiene 30 dias")
else:
    print("Mes incorrecto")












