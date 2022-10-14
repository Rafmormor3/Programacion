#-*- coding: utf-8 -*-
'''
Created on 4 oct. 2022

@author: moral
'''
'''
En el gimnasio Jacafitness tienen el siguiente horario: Los Lunes, Miercoles y Viernes imparten Spinning de 12 a 14, Yoga de 16 a 20 y Body combat de 20 a 22; 
Los Martes y Jueves La sesion de Spinning y Yoga se intercambian.
Elabora un programa que d� la bienvenida al gimnasio Jacafitness y tras preguntar por la hora y el d�a de la semana te indique la actividad que puedes realizar.

'''

print("BIENVENIDO AL GIMNASIO JACAFITNES")

dia=input("Introduzca el dia de la semana : ").upper()
hora=int(input("Introduzca la hora: "))

if (dia=="LUNES" or dia=="MARTES" or dia=="MIERCOLES" or dia=="JUEVES" or dia=="VIERNES") and 12<=hora<=22:
    
    if dia=="lunes" or dia=="miercoles" or dia=="viernes":
        if 12<=hora<=14:
            print("Se imparte clases de Spinning")
        elif 16<=hora<=20:
            print("Se imparten clases de Yoga")
        elif 20<=hora<=22:
            print("Se imparten clases de Body Combat")
        else:
            print("No se imparte nada")
    else:
        if 12<=hora<=14:
            print("Se imparte clases de Yoga")
        elif 16<=hora<=20:
            print("Se imparten clases de Spinning")
        elif 20<=hora<=22:
            print("Se imparten clases de Body Combat")
        else:
            print("No se imparte nada")
    
else:
    print("No esta disponible la informacion") 
    
    
    