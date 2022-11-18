'''
Created on 21 oct. 2022

@author: moral
'''
peso=float(input("Introduce el peso: "))

while peso>250:
    peso=float(input("Peso erroneo. Introduce el peso: "))

while peso>0:
    
    edad=int(input("Introduce la edad: "))
    while 0>edad or edad>100:
        edad=float(input("Dato incorrecto. Introduce la edad: "))
    
    tipoVida=input("Que tipo de vida lleva (Sedentaria/Activa/Muy Activa): ").upper()
    while tipoVida!="SEDENTARIA" and tipoVida!="ACTIVA" and tipoVida!="MUY ACTIVA":
        tipoVida=input("Dato incorrecto. Que tipo de vida lleva (Sedentaria/Activa/Muy Activa): ").upper()  
    
    if (edad>70 and tipoVida=="SEDENTARIA") or (peso>100) or (peso>74.4 and edad>50):
        print("Es recomendable acudir al medico")
    else:
        print("No es urgente que acuda al medico si no tiene problemas de salud")
        
    peso=float(input("\nIntroduce el peso de la siguiente persona: "))

    

