'''
Created on 28 oct. 2022

@author: moral  1,1,2,3,5,8,13
'''
'''
cantidad=int(input("Cantidad de numeros que imprime: "))

numero_primero=1
numero_segundo=0
numero_tercero=0
lista=[]

for i in range (0,cantidad+1):

        numero_tercero=numero_primero+numero_segundo
        numero_primero=numero_segundo
        numero_segundo=numero_tercero 
        
        lista.append(numero_tercero)     
  
print(lista)
'''

cadena=""
telefono=9
while telefono>0:
    numero=int(input("Introduce un digito:"))
    cadena+=str(numero)
    telefono-=1
print("+34",cadena)
    











  
    
        
    
        