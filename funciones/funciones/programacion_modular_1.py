from random import *

#1
def genera_lista_numeros_aleatorios(size=100):
    listaAleatorio=[]
    for i in range (10):
        listaAleatorio.append(randint(0, 1000))
    return listaAleatorio

#a
def mayor_numero(lista):
    
    mayor=lista[0]
    for i in range (len(lista)):      
   
        if lista[i]>mayor:
            mayor=lista[i]
    
    return mayor

#b
def menor_numero(lista):
    menor = lista[0]
    for i in range(len(lista)):
        if lista[i]<menor:
            menor=lista[i]
    return menor 


#c
def suma_total(lista):
    suma=0
    for i in range(len(lista)):
        suma+=lista[i]
    return suma

#d
def media(lista):
    return suma_total(lista)/len(lista)
     
#e
def remplazar(lista, lugar, remplazo):
    
    for i in range(len(lista)):
        if lugar==lista[i]:
            lista[i]=remplazo
    return lista


def sustituirPrimero(lista,numero,sustituto):
    contador=0
    for i in range(len(lista)):
        if lista[i]==numero:
            while contador!=1:
                contador+=1
                lista[i]=sustituto

    return lista


def sustituirUltimo(lista,numero,sustituto):
    lista.reverse()
    contador=0
    for i in range(len(lista)):
        if lista[i]==numero:
            while contador!=1:
                contador+=1
                lista[i]=sustituto
    lista.reverse()
    return lista

       
#4
def mostrarMayor(lista4):
    return mayor_numero(lista4)

def par(numero):
    return numero%2==0

def mostrarPares(lista4):
    pares=[]
    for i in range(len(lista4)):
        if par(lista4[i]):
            pares.append(lista4[i])
    return pares

#5
def reverse(lista):
    invertida=[]
    for i in lista:
        invertida = [i] + invertida
    
    return invertida

    

#6
def estaOrdenada(lista):
    cont=0
    for i in range(1,len(lista)):
        res=False
        if lista[i-1]<lista[i]: 
            cont+=1
        
        if cont==len(lista)-1:
            res=True
    
    return res

#2
def desplazarDerecha(lista):
    
    listaEditada=[]
    escribir=1
    guardar=0
    
    for i in range(len(lista)+1):
        if i==0:
            listaEditada.append(escribir)
        
        elif i==1:
            escribir=lista[i-1]
            guardar=lista[i]
            listaEditada.append(escribir) 
        
        elif i==len(lista):
            listaEditada[0]=guardar
    
        else:
            escribir=guardar
            guardar=lista[i]
            listaEditada.append(escribir)  
    
    return listaEditada 

#7
def comparar(cadena1, cadena2):
    res="No encajan"
    if (cadena1[1] or cadena1[3]) == (cadena2[1] or cadena2[3]):
        res="Si encajan"
    return res

#8
#aux
def contarNumeroDivisores(numero):
    acum=0
    cont=1
    while cont<=numero:
        res=numero%cont
        cont+=1
        if res==0:
            acum+=1
    return acum

#aux
def esPrimo(numero):
    
    resultado=False
    if contarNumeroDivisores(numero)==2:
        resultado=True
    
    return resultado

#primos
def listarPrimos(lista):
    p=[] 
    for i in range(len(lista)):
        if esPrimo(lista[i])==True:
            p.append(lista[i])
    return p  

#aux
def factorial(numero):
    total=1 
    for i in range(numero+1):
        if i==0:
            total=1
        else:
            total*=i
    return total



#factorial
def listarFcatorial(lista):
    l=[]
    for i in range(len(lista)):
        nfactorial=factorial(lista[i])
        l.append(nfactorial)
    return l


#9
def numerosMayores(lista,k):
    l=[]
    for i in range(len(lista)):
        if lista[i]>k:
            l.append(lista[i])
    return l

def numerosMenores(lista,k):
    l=[]
    for i in range(len(lista)):
        if lista[i]<k:
            l.append(lista[i])
    return l
  
def numerosMultiplos(lista, k): 
    l=[]
    for i in range(len(lista)):
        if lista[i]%k==0:
            l.append(lista[i])
    return l 

#10

def convertirBinario(cadena):
    b=0
    invertida=cadena[::-1]
    for i in range(len(invertida)):
        b+=(2**i)*(int(invertida[i]))
    return b

def convertirDecimal(numero):
    result=""
    divisor=2
    dividendo=numero
    while dividendo>=1:
        resto=dividendo%divisor
        dividendo=dividendo//divisor
        result=str(resto)+result
    return result
    
 
#11
def quitarRepes(lista):
    listaSin=[]
    for i in range(len(lista)):
        if lista[i] not in listaSin:
            listaSin.append(lista[i])
    return listaSin

def intersect(lista1, lista2):
    lista=[]
    almacen=0
    for i in range(len(lista1)):
        almacen=lista1[i]
        cont=0
        while cont<len(lista2):
            if lista2[cont]==almacen:
                lista.append(lista2[cont])
                cont+=1
            else:
                cont+=1
   
    return quitarRepes(lista)


#12
def unionListas(lista1, lista2):
    lista=[]
    for i in range(len(lista1)):
        if lista1[i] not in lista2:
            lista.append(lista1[i])
    
    for i in range(len(lista2)):
        if lista2[i] not in lista1:
            lista.append(lista2[i])
   
    return quitarRepes(lista)


#13
def listarNombres(lista, letra):
    listaNom=[]
    for i in range(len(lista)):
        if lista[i][0]==letra.upper() or lista[i][0]==letra.lower():
            listaNom.append(lista[i])
    return listaNom


#14
def mostrarCadenaMasLarga(cadena1, cadena2):
    lista=[]
    
    if len(cadena1)>len(cadena2):
        lista.append(cadena1)
    
    elif len(cadena1)==len(cadena2):
        l1=[]
        l2=[]
        
        for i in range(len(cadena1)):
            if cadena1[i] not in l1:
                l1.append(cadena1[i])
        
        for i in range(len(cadena2)):
            if cadena2[i] not in l2:
                l2.append(cadena2[i])
                
        if len(l1)<len(l2):
            lista.append(cadena1)
        elif len(l1)==len(l2):
            lista.append(cadena1)
            lista.append(cadena2)
        else:
            lista.append(cadena2)
            
    else:
        lista.append(cadena2)
    
    return lista



'''

#---------------------------------------------------------------------------------
#1
listaNumeros=genera_lista_numeros_aleatorios(10)
print(listaNumeros)
print(f"\nMayor numero: {mayor_numero(listaNumeros)}")
print(f"\nMenor numero: {menor_numero(listaNumeros)}")
print(f"\nSuma Total: {suma_total(listaNumeros)}") 
print(f"\nLa media de los numeros: {media(listaNumeros)}") 
print(f"\n{remplazar([3,3,3,5,6,'Hola','Adios',True], 3, 7)}")

lista1=[1,2,2,2,2,2,2,2,2,3,4]
print("\n", lista1)

numero=int(input("\nNumero elegido: "))
sustituto=int(input("Numero sustituto: "))

print("\nLista sustituido el primero:", sustituirPrimero(lista1, numero,sustituto)) 
lista1=[1,2,2,2,2,2,2,2,2,3,4]
print("\nLista sustituido el ultimo:", sustituirUltimo(lista1, numero,sustituto))    


print("\n"+"----"*10)

#4
elementos=int(input("Introduzca elementos en la lista: "))
lista4=[]
while elementos>0:
    lista4.append(elementos)
    elementos=int(input("Introduzca elementos en la lista: "))
print(lista4)
print("\nNumero mayor de la lista:", mostrarMayor(lista4))
print("Lista numeros pares:", mostrarPares(lista4))


print("\n"+"----"*10)

#5
listaBien=['Di','buen','dia','a','papa']
print(listaBien)
print(reverse(listaBien))


print("\n"+"----"*10)

#6
print(['a','b','c'])
print("Lista ordenada?",estaOrdenada(['a','b','c']))
print([1,3,6,5,2,6])
print("Lista ordenada?", estaOrdenada([1,3,6,5,2,6]))


print("\n"+"----"*10)

#2
lista2=[1,3,5,7,14]
print(lista2)
print("Lista desplazada:", desplazarDerecha(lista2))


print("\n"+"----"*10)

#7
pieza1="[0,3]"
pieza2="[3,6]"
print(pieza1)
print(pieza2)
print(comparar(pieza1, pieza2))


print("\n"+"----"*10)

#8
lista8=[]
numero=int(input("Introduce numeros (negativo para terminar):"))
while numero>=0:
    lista8.append(numero)
    numero=int(input("Introduce numeros:"))   
print(lista8)

print("\nLista de primos:", listarPrimos(lista8))
print("La suma es:", suma_total(lista8))
print("la media", media(lista8))
print("Lista de factorial de los primos:", listarFcatorial(lista8))


print("\n"+"----"*10)

#9
lista9=[3,4,5,6,7,8,9,10]
k9=6
print("Lista:",lista9)
print("Numero escogido;", k9)
print("Lista numeros mayores que", k9, ":", numerosMayores( lista9, k9))
print("Lista menores que", k9,":", numerosMenores(lista9, k9))
print("Lista multiplos de", k9,":", numerosMultiplos(lista9, k9))


print("\n"+"----"*10)
'''
#10
numeroBin=input("Introduce numero binario: ")
for i in range(len(numeroBin)):
    while str(numeroBin[i]) != "0" and str(numeroBin[i]) != "1":
        numeroBin=input("No valido, Introduce numero binario: ")
        
print(f"El numero {numeroBin} en decimal es {convertirBinario(numeroBin)}")

numDec=int(input("Introduzca un numero decimal:"))
while numDec<0:
    numDec=int(input("No valido, Introduzca un numero decimal:"))
    
print(f"El numero {numDec} en decimal es {convertirDecimal(numDec)}")


print("\n"+"----"*10)

#11
print("[1,2,2,3,4,3]") 
print("[1,2,3,3,4,4,1]") 
print("La interseccon entre las dos listas es:",intersect([1,2,2,3,4,3], [1,2,3,3,4,4,1]))


print("\n"+"----"*10)

#12
print([1,2,3])
print([2,3,4,5])
print("La union de las dos listas:",unionListas([1,2,3], [2,3,4,5]))


print("\n"+"----"*10)

#13
print(["Ana", "rafa", "antonio", "maria", "Laura"])
print("Lista de nombres que empiezan por a:", listarNombres(["Ana", "rafa", "antonio", "maria", "Laura"], "a"))


print("\n"+"----"*10)

#14
cadena1="Holaaaaaaaaa buenas tardes"
cadena2="haaa33333333333333 buenas tardes"
print(cadena1)
print(cadena2)
print("Cadena mas larga: ",mostrarCadenaMasLarga(cadena1, cadena2))


