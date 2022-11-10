'''
Created on 18 oct. 2022

@author: moral
'''
'''

#1
n1=int(input("Introduce el primer numero:"))
n2=int(input("Introduce el segundo numero:"))

while n1<=0 and n2<=0:
    n1=int(input("Dato incorrecto. Introduce el primer numero:"))
    n2=int(input("Dato incorrecto. Introduce el segundo numero:"))

if n1>n2:
    dividendo=n1
    divisor=n2
else:
    dividendo=n2
    divisor=n1


if dividendo==divisor:
    print("El cociente es 1 y el resto 0")
elif divisor==1:
    print(f"El cociente es {dividendo} y el resto 0")
else:
    cociente=0
    while dividendo>1:
        cociente+=1
        dividendo=dividendo-divisor
        
    print(f"El cociente es {cociente} y el resto es {dividendo}")
  
#2
inicio=int(input("Indique a partir de que numero contar: "))
num=int(input("Indique el numero: "))   
cantidad=int(input("Indique la cantidad que le sera mostrada: "))

contador=cantidad
acumulador=0
while contador>0:
    while acumulador<inicio:
        acumulador+=1
    if acumulador%num==0:
        print(acumulador)
        acumulador+=1
        contador-=1
    else:
        acumulador+=1

        

#cadena=""
#inicio=0
#for i in range (numero, numero+(multiplo*10)):
    #if i%multiplo==0:
        #cadena+=str(i)+", "
#print(cadena)        
   


#3
cifra=int(input("Introduce el numero que quieras: ")) 

while cifra!=0:
    mensaje=""
    if cifra%2==0:
        mensaje+="Es par." 
    else:
        mensaje+="Es impar." 
    if cifra>0:
        mensaje+="Es positivo."
    else:
        mensaje+="Es negativo."
    print(f"{mensaje}Y su cuadrado {cifra**2}")    

    cifra=int(input("Introduce el numero que quieras: "))

#4
tamano=int(input("Introduzca tamano de la siguiente secuencia: "))
#a
contador=1
n1=1
cadena=""
while contador<=tamano+1: 
    cadena+=str(n1)
    n1=n1*-5
    contador+=1
    if contador<=tamano+1:
        cadena+=", "
print(cadena)

cadena=""
for i in range(tamano+1):
    
    cadena += str((-5)**i)
    
    if i<=tamano-1:
        cadena+=", "
print(cadena)   

#b
cadena=""
for i in range(tamano+1):
    
    cadena+=str((i%-3)+1)
    
    if i<=tamano-1:
        cadena+=", "
print(cadena)

#c
contador=0  
n3=0
cadena=""
while contador<=tamano:
    n3=3**contador
    cadena+=str(n3)
    contador+=1
    if contador<=tamano:
        cadena+=", "
print(cadena)

#5
num1=int(input("Introduce el numero1 de donde empezaremos la secuencia: ")) 
num2=int(input("Introduce el numero2 de donde empezaremos la secuencia: "))

res=num1
#secuencia=str(res)+""
lista1=[]
lista1.append(res)
while res!=1:
    if res%2==0:
        res//=2
        #secuencia+=" -> "+str(res)
    else:
        res=3*res+1
        #secuencia+=" -> "+str(res)
    lista1.append(res)
#print(secuencia)
print("Lista 1 ->", lista1)

res=num2
#secuencia=str(res)+""
lista2=[]
lista2.append(res)
while res!=1:
    if res%2==0:
        res//=2
        #secuencia+=" -> "+str(res)
    else:
        res=3*res+1
        #secuencia+=" -> "+str(res)
    lista2.append(res)
#print(secuencia)
print("Lista 2 ->", lista2)


if len(lista1)==len(lista2):
    print("Misma longitud de lista")
elif len(lista1)>len(lista2):
    print("Lista 1 mayor que la lista 2")
else:
    print("Lista 2 mayor que la lista 1")


   
#7
numero=int(input("\nIntroduce el numero de la piramide: "))
for i in range(1,numero+1):
    print(str(numero)*i)        

#8
#CUADRADO
tamanoA=int(input("\nNumero para el tamano del cuadrado: "))
for i in range(1,tamanoA+1):
    print("+ "*tamanoA)

#PIRAMIDE
tamanoB=int(input("\nNumero para el triangulo: ")) 
for i in range(1,tamanoB+1):
    print((" "*(tamanoB-i))+("+"*((i*2)-1)))

#ROMBO    
tamanoC=int(input("\nNumero para el rombo: "))
elemento="+"
for i in range(1,tamanoC+1):
    print((" "*(tamanoC-i))+("+"*((i*2)-1)))
for i in range(tamanoC-1,0,-1):
    print(((tamanoC-i)*" ")+("+"*((i*2)-1)))
   
   
#6
edad=int(input("Introduce la edad de Juan: "))

while edad<0:
    edad=int(input("Edad incorrecta. Introduce la edad de Juan: "))

recibe_puzzle=1
acumula_puzzle=1
lista_puzzle=[]
recibe_dinero=0
acumula_dinero=0
lista_dinero=[]
cont=1
while cont<edad+1:
    
    if cont==1:
        lista_dinero.append(acumula_dinero)
        lista_puzzle.append(acumula_puzzle)
        cont+=1
    
    elif cont==2:
        recibe_dinero=20
        acumula_dinero=recibe_dinero
        lista_dinero.append(acumula_dinero)
        cont+=1
    
    elif cont%2!=0:
        recibe_puzzle=recibe_puzzle*2
        acumula_puzzle=acumula_puzzle+recibe_puzzle
        lista_puzzle.append(acumula_puzzle)

        cont+=1
    else:
        recibe_dinero=recibe_dinero+15
        acumula_dinero=acumula_dinero+recibe_dinero
        lista_dinero.append(acumula_dinero)
        cont+=1

print("Lista del dinero acumulado", lista_dinero)          
print("Lista de los puzzles acumulados", lista_puzzle)        
        
'''
#9 #10
#CUADRADO VACIO
cuadrado=4
simbolo=input("Introduzca el simbolo con el que haremos las figuras: ")

for i in range(cuadrado):
    
    if i==0 or i==cuadrado-1:
        cadena=(simbolo+" ")*cuadrado
    else:    
        cadena=(simbolo+" ")+"  "+"  "+simbolo
    print(cadena)        

print("-------------")       
#TRIANGULO VACIO 
triangulo=5

for i in range(1,triangulo+1):               
    
    if i==1 or i==triangulo:
        print( (" "*(triangulo-i)) + (simbolo*((i*2)-1)) )
    else:
        print( (" "*(triangulo-i)) + simbolo + " "*((i*2)-3) + simbolo)
        
    
        
      
print("-------------")  

#ROMBO VACIO                   
rombo=4
for i in range(1,rombo+1):               
    
    if i==1 :
        print( (" "*(rombo-i)) + (simbolo*((i*2)-1)) )
    else:
        print( (" "*(rombo-i)) + simbolo + " "*((i*2)-3) + simbolo)
  
for i in range(rombo-1, 0, -1):               
    if i==1 :
        print( (" "*(rombo-i)) + (simbolo*((i*2)-1)) )    
    else:
        print( (" "*(rombo-i)) + simbolo + " "*((i*2)-3) + simbolo)
  
  
  
  
    
     
        
    
    
    
    
    