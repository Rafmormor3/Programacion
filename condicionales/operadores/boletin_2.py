#-*- coding: utf-8 -*-
'''
print("BOLETIN 2")

#Ejercicio1
print("\nEjercicio1")
#a)
sueldo_bruto=int(input("Introduce sueldo bruto: "))
sueldo_neto=int(input("Introduce sueldo neto: "))

retencion=sueldo_bruto*22/100

if retencion<=sueldo_neto:
    retencion= True
else:
    retencion=False
    
print("Es adecuado para una retencion del 22% ?", retencion)

#b)
dia=int(input("\nIntroduce el dia del mes de mayo: "))

if dia>0 and dia<=31:
    dia=True
else:
    dia=False

print("Dia del mes correcto?", dia )

#c)
num1=int(input("\nIntroduce el primer numero: "))
num2=int(input("Introduce el segundo numero: "))

if num1%3==0 and num2%3==0:
    multiplo=True
else:
    multiplo=False
    
print("Son múltiplos de 3?", multiplo)

#d)
nota=int(input("\nIntroduce tu nota: "))

if 5<=nota<=10 :
    nota=True
else:
    nota=False
    
print("Aprobado? ", nota)

#e)
nota1=int(input("\nIntroduce tu nota 1: "))
nota2=int(input("Introduce tu nota 2: "))
nota3=int(input("Introduce tu nota 3: "))

nota_media= (nota1 + nota2 + nota3)/3

if nota_media>=5:
    nota_media=True
else:
    nota_media=False

print("Media aprobada?", nota_media)

#Ejercicio2
print("\nEjercicio 2")

#a)
nota1=int(input("\nIntroduce tu nota 1: "))
nota2=int(input("Introduce tu nota 2: "))
nota3=int(input("Introduce tu nota 3: "))

print("Notas aprobadas?", nota1>=5 and nota2>=5 and nota3>=5)

#b)
from pickle import TRUE
saldo=int(input("\nIntroduce el saldo: "))
descubierto=int(input("Veces descubierto: "))

print("Usuario fiable?", saldo>=1000 and descubierto<=5 and descubierto<=0)

#c)
asignaturasAprobadas=int(input("\nNumero de asignaturas aprobadas: "))
asignaturasCurso=int(input("Numero de asignaturas en el curso: "))

print("Lleva aprobado el 30%?", asignaturasAprobadas>=(asignaturasCurso*30/100))
'''
#d)
mes=input("\nIntroduce mes (EN, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC): ")
dia=int(input("Introduce el dia del mes: "))

if (mes=="EN" or mes=="MAR" or mes=="MAY" or mes=="JUL" or mes=="AGO" or mes=="OCT" or mes=="DIC") and 1<=dia<=31:
    fecha=True
elif (mes=="ABR" or mes=="JUN" or mes=="SEP" or mes=="NOV") and 1<=dia<=30:
    fecha=True
elif mes=="FEB" and 1<=dia<=28:
    fecha=True
else:
    fecha=False

print("Fecha válida?", fecha)











