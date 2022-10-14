'''
Created on 26 sept. 2022

@author: moral
'''

temp=int(input("Dime temperatura: "))

if temp>25:
    print("Enciendo el aire acondicionado")
    print("A refrescarse")

elif temp>15 and temp<=25:
    print("Encendemos ventilador")
    
elif temp <= 15:
    print("Calefaccion")