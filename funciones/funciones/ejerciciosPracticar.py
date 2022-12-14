'''
Created on 8 dic. 2022

@author: moral
'''
#Boletin1 ejer1

'''
from random import randint

def generarNumeros():
    cont=0
    lista=[]
    while cont<10:
        numero=randint(0, 10)
        lista.append(numero)
        cont+=1
    return lista

lista=generarNumeros()
print(lista)

def mayorNumero(lista):
    mayor=0
    for numero in lista:
        if numero>mayor:
            mayor=numero
    return mayor

print(mayorNumero(lista))

def menorNumero(lista):
    menor=0
    cont=0
    while cont<len(lista):
        if cont==0:
            menor=lista[cont]
            cont+=1
        else:
            if lista[cont]<menor:
                menor=lista[cont]
            cont+=1
    return menor

print(menorNumero(lista))

def sumaNumeros(lista):
    suma=0
    for numero in lista:
        suma+=numero
    return suma

print(sumaNumeros(lista))

def media():
    return sumaNumeros(lista)/len(lista)

print(media())
        

def sustituirElemento(lista, elemento, sustituto):
    
    for i in range(len(lista)):
        if lista[i]==elemento:
            lista[i]=sustituto
    return lista

#elemento=int(input("Elemento que buscas: "))
#sustituto=int(input("Remplazo: "))             
print(sustituirElemento(lista, 5, 55))     


#Boletin 1 ejer2

def desplazarPosicion(lista):
    listaD=["","","","","","","","","",""]
    
    for i in range(len(lista)):
        if i==0:
            listaD[0]=lista[-1]
        else:
            listaD[i]=lista[i-1]

    return listaD

lista1=[0,1,2,3,4,5,6,7,8,9]
print(desplazarPosicion(lista1))


#Boletin 1 ejer6

def estaOrdenada(lista):
    cont=1
    ordenada=True
    while cont<len(lista) and ordenada==True:
        if lista[cont-1]>lista[cont]:
            ordenada=False 
        cont+=1
    return ordenada

print(estaOrdenada([1]))



#Boletin 2 ejer1

def computeFactorial(number):
    res=1
    if number==0:
        res
    if number>0:
        for i in range(1,number+1):
            res*=i
    else:
        res=None
    
    return res

print(computeFactorial(5))



#Boletin 2 ejer9

#aux
def esPrimo(number):
    primo=False
    cont, div = 1, 0
    while cont<=number and div<3:
        if number%cont==0:
            div+=1
        cont+=1
    if div==2:
        primo=True
    if number==1:
        primo=True
    return primo

assert(esPrimo(4)==False)
assert(esPrimo(5)) 

def getPrimeDivisor(number):
    l=[]
    for i in range(1,number+1):
        if number%i==0 and esPrimo(i)==True:
            l.append(i)
    return l

print(getPrimeDivisor(35))



#Boletin 2 ejer10

def isFriendsNumbers(number1, number2):
    res=False
    
    acum1, acum2 = 0, 0
    for i in range(1,number1):
        if number1%i==0:
            acum1+=i
    for i in range(1,number2):
        if number2%i==0:
            acum2+=i
    
    if acum1==acum2:
        res=True
     
    return res
   
print(isFriendsNumbers(4, 6))



#Boletin 3 ejer5

def esPalindromo(cadena):
    cadena=cadena.lower()
    
    cadenaSinEspacios=""
    if " " in cadena:
        for letra in cadena:
            if letra!=" ":
                cadenaSinEspacios+=letra
                cadena=cadenaSinEspacios
    
    cadenaInver=""
    for letra in cadena:
        cadenaInver=letra + cadenaInver
        
    return cadenaInver==cadena

print(esPalindromo("Dabale arroz a la zorra el abad"))


#Boletin 3 ejer6

def estaPalabra(cadena, palabra):
    cont, acum=0, 0
    
    while cont<len(cadena) and acum<len(palabra):
        if cadena[cont]==palabra[acum]:
            acum+=1
        cont+=1
        
    return acum==len(palabra)

print(estaPalabra("asdfasdr", "rafa"))


#Boletin 3 erjer7

def sustituir(frase, palabra, sustituto):
    resultado=""
    acum=""
    contP=0
    
    for letra in frase:
        
        if letra==palabra[contP]:
            acum+=palabra[contP]
            contP+=1
            
            if palabra==acum:
                contP=0
                acum=""
                resultado+=sustituto
            
        else:
            resultado+=acum+letra
            acum=""
            contP=0
    
    return resultado

frase="Flor de flores, flora, flor,  floral, flor de flores, florero"      
print(sustituir(frase, "flor", "girasoles"))


#Boletin 3 ejer10

def contadorPalabras(frase):
    cont,l = 0,1
    acum=0
    
    if " " not in frase:
        acum=1
    else:
        for i in range(1,len(frase)):
            if frase[i-1]!=" " and frase[i]==" ":
                acum+=1
        
        if frase[-1]!=" ":
            fraseI=frase[::-1]#invierte mediante indices
            while cont<1:
                if fraseI[l-1]!=" " and fraseI[l]==" ":
                    cont+=1
                    acum+=1
                else:
                    l+=1
    return acum
   
print(contadorPalabras(frase))     



#DNI

LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE"
NUMEROS = "0123456789"        

def esValidoDni(cadena):
    res=False
    
    numeros_correctos=True
    for i in range(len(cadena)-1):
        if cadena[i] not in NUMEROS:
            numeros_correctos=False
    
    if (len(cadena)==8 or len(cadena)==9) and numeros_correctos and (cadena[-1].upper() in LETRAS) and (LETRAS[int(cadena[:-1])%23]==cadena[-1]):
        res=True
        
    
    return res

assert(esValidoDni("48120019V"))
assert(esValidoDni("11111111H"))
assert(esValidoDni("1111111G"))
    
assert(not esValidoDni("11111111X"))
assert(not esValidoDni("ABCDEFGH9"))
assert(not esValidoDni("X1111111"))
assert(not esValidoDni("123456789J"))
print("Todo correcto")



#MENU USUARIOS

#enruezmon6754
#raflesmor0019 --> 48120019v

def generaUsuario(nom, ap1, ap2, dni):
    usuario=""
    usuario+=nom[:3]+ap1[-3:]+ap2[:3]+dni[4:-1]
    return usuario

assert(generaUsuario("rafa", "morales", "moreno", "48120019V")=="raflesmor0019")


print("#################################")
print("1-Introducir Usuarios")
print("2-Eliminar usuario")
print("3-Genera usuario y lo introduce")
print("4-Mostrar lista usuarios")
print("5-Limpiar lista")
print("6-Salir del programa")
print("#################################")

opcion=int(input("Seleccione una de las opciones:"))

listaUsu=["","","","",""]
cont=0  

while opcion!=6:
    if opcion==1:
        usuario=input("Introduce el usuario: ")
        if cont<5:
            listaUsu[cont]=usuario
            cont+=1
        else:
            listaUsu[cont%5]=usuario
            cont+=1
        
        opcion=int(input("Seleccione una de las opciones:"))
        
    elif opcion==2:
        eliminado=input("Que usuario quiere eliminar: ")
        if eliminado in listaUsu:
            listaUsu.remove(eliminado)
        else:
            print("Usuario no existe.")
        
        opcion=int(input("Seleccione una de las opciones:"))
    
    elif opcion==3:
        nombre=input("Introduce tu nombre: ")
        apellido1=input("Introduce tu primer apellido: ")
        apellido2=input("Introduce tu segundo apellido: ")
        dni=input("Introduce su dni: ")
        
        usuario = generaUsuario(nombre, apellido1, apellido2, dni)
        
        if cont<5:
            listaUsu[cont]=usuario
            cont+=1
        else:
            listaUsu[cont%5]=usuario
            cont+=1
        
        opcion=int(input("Seleccione una de las opciones:"))
    
    
    elif opcion==4:
        print(listaUsu)
        opcion=int(input("Seleccione una de las opciones:"))
        
    elif opcion==5:
        listaUsu=[]
        print(listaUsu)
        opcion=int(input("Seleccione una de las opciones:"))




LETRAS="qwertyuiopasdfghjklzxcvbnm"

def contar_palabras(cadena):
    contador=0
    if cadena[0].lower() in LETRAS:
        contador+=1
    
    for i in range(1, len(cadena)):
        if cadena[i-1]==" " and cadena[i].lower() in LETRAS:
            contador+=1
   
    return contador
            
assert(contar_palabras("Hola   buenas tardes ")==3)
assert(contar_palabras("  Hola  ")==1)
assert(contar_palabras("hola")==1)
assert(contar_palabras("hola adios")==2)




LETRAS="qwertyuiopasdfghjklzxcvbnm"
frase="Flor de flores, flora, flor,  floral, flor de flores, florero"

def sustituir(frase, palabra, sust):
    frase=frase.lower()
    
    oracion=""
    acum=""
    cont, contP = 0, 0
    
    for letra in frase:
        if letra==palabra[contP]:
            acum+=letra
            cont+=1
            contP+=1
            
            if acum==palabra:
                oracion+=sust
                acum=""
                contP=0
        
        else:  
            oracion+=acum+letra
            cont+=1
            contP=0
            acum=""
    
    return oracion  
        
print(sustituir(frase, "flores", "girasoles"))


'''

#usuario y contrasena hasta 10 veces.
#puede crear usuario si no existe.
#puedes logearte con 3 intentos.
#mostrar usuarios en la lista

opcion =int(input("Elija opcion: "))

usuarios=[]
contrasenias=[]

while opcion!=4:
    if opcion==1:
        user=input("\nIntroduce tu usuario: ")
        if user not in usuarios:
            print("No se encuentra registrado, para ellos Opcion 2.")
        else:
            passw=input("Introduce su contrasenia:")
            if passw not in contrasenias:
                cont=0
                while cont<3 and passw not in contrasenias:
                    passw=input("No valida, Introduce su contrasenia:")
                    cont+=1
                if cont==3:
                    print("USUARIO BLOQUEADO")
                    for i in range(len(usuarios)):
                        if user == usuarios[i]:
                            usuarios[i]="BLOQUEADO"
                else:
                    print("BIENVENIDO")     
        
        opcion =int(input("Elija opcion: "))    
    
    
    elif opcion==2:
        if len(usuarios)<10:
            print("\nBIENVENIDO")
            user=input("Introduce tu nuevo usuario: ") 
            while user in usuarios:
                print("Este usuario ya exite, vuelve a intentarlo")
                user=input("Introduce tu nuevo usuario: ") 
            passw=input("Introduce su contrasenia:")
            passw2=input("Vuelve a repetirla: ")  
            if passw != passw2:
                print("No coincide")
            else:
                usuarios.append(user)
                contrasenias.append(passw2)
        else:
            print("La lista esta llena, vuelva en otro momento.")
        
        opcion =int(input("Elija opcion: "))   
    
    
    elif opcion==3:
        print(f"\n{usuarios}")
        opcion =int(input("Elija opcion: "))
        
                   
    






























