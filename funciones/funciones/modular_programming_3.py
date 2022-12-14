'''
Created on 24 nov. 2022

@author: moral
'''
#1


def charactersInString(cadena, character):
    acum=0
    for i in range(len(cadena)):
        if cadena[i] == character.upper() or cadena[i]==character.lower():
            acum+=1
    return acum

assert(charactersInString("Hola me llamo Rafa", "a")==4)
assert(charactersInString("MUNDO mudo", "o")==2)

#2
LETRAS="abcdefghijklmnopqrstuvwxyz"
MINUSCULAS=LETRAS.lower()
MAYUSCULAS=MINUSCULAS.upper()

def lowCaseInString(cadena):
    acum=0
    for letra in cadena:
        if letra in MINUSCULAS:
            acum+=1
    return acum

assert(lowCaseInString("Hola Me LLamo Rafa")==10)
assert(lowCaseInString("OrDeNaDoR")==4)
assert(lowCaseInString("12345")==0)

#3

def upperCaseInString(cadena):
    acum=0
    for letra in cadena:
        if letra in MAYUSCULAS:
            acum+=1
    return acum

assert(upperCaseInString("Hola Me LLamo Rafa")==5)
assert(upperCaseInString("OrDeNaDoR")==5)
assert(upperCaseInString("12345")==0)


#4

NUMEROS="1234567890"

def numberInString(cadena):
    acum=0
    for i in range(len(cadena)):
        if cadena[i] in NUMEROS:
            acum+=1
    return acum

assert(numberInString("43556732Q")==8)
assert(numberInString("tengo 3l y 4kg")==2)


#5

#aux
def quitWhites(cadena):
    cadenaSinEspacios=""
    
    for i in range(len(cadena)):
        if cadena[i]!=" ":
            cadenaSinEspacios+=cadena[i]
    return cadenaSinEspacios

#aux
def reverse(cadena):
    invertida=""
    for i in cadena:
        invertida = i + invertida
    return invertida


def palindrome(cadena):
    res=False
   
    if " " in cadena:
        cadena=quitWhites(cadena)
    
    cadenaInvertida=reverse(cadena)
    
    if cadena.lower() == cadenaInvertida.lower():
        res=True
    
    return res

assert(palindrome("anilina"))
assert(palindrome("Dabale arroz a la zorra el abad"))


#6

def estarPalabra(cadena1, cadena2):
    res=False
    i2=0
    acum=""
    cont=0
    
    cadena1=cadena1.lower()
    cadena2=cadena2.lower()
    
    while cont<len(cadena1) and i2!=len(cadena2):
        if cadena1[cont]==cadena2[i2]:
            acum+=cadena2[i2]
            i2+=1
        cont+=1
       
    if acum==cadena2 :
        res=True   

    return res

assert(estarPalabra("shybaoxlnaa", "Hola"))
assert(estarPalabra("shybaxlna", "hola")==False)
assert(estarPalabra("Que flores mas bonitas", "flores"))


#7
'''
def buscarPalabra(frase, palabra):
    cont=0
    pal=0
    acum=0
    l=[]
    while acum==0:
        if frase[cont]==palabra[pal]:
            l.append(cont)
            cont+=1
            pal+=1
                
            if pal==len(palabra):
                acum+=1
                
        else:
            l=[]
            cont+=1
            pal=0
    
    return l
    
def sustituirPalabra(frase, palabra, sustituto):
    
    oracion="La palabra buscada no se encuentra"
    
    if len(palabra)==1:
        palabra=" "+palabra+" "
    
    if estarPalabra(frase, palabra):
        
        l=buscarPalabra(frase, palabra)
        
        oracion=""
        for i in range(l[0]):
            oracion+=frase[i]
        
        oracion=oracion + sustituto
        
        for i in range(l[-1]+1,len(frase)):
            oracion+=frase[i]
        
        oracion
        
    return oracion
'''

def sustituirPalabra(frase, palabra, sustituto):
    
    cont=0
    oracion=""
    tmp=""
    
    if len(palabra)==1:
        palabra=" "+palabra+" "
    
    for i in range(len(frase)):
        if frase[i]==palabra[cont]:
            if cont==len(palabra)-1:
                tmp=""
                oracion+=sustituto
                cont=0
            else:
                tmp+=frase[i]
                cont+=1
        else:
            oracion+=tmp+frase[i]
            cont=0
            tmp=""
    return oracion
                
 
print(sustituirPalabra("Que flores mas bonitas flores", "flores", "amapolas"))

print(sustituirPalabra("hola a todos", "a", "guapos"))



#8

VOCALES="aeiou"

def vocalesDiferentes(cadena):
    l=[]
    acum=0
    
    for i in range(len(cadena)):
        if (cadena[i].lower() in VOCALES) and (cadena[i].lower() not in l):
            l.append(cadena[i].lower())
            acum+=1
    return acum

assert(vocalesDiferentes("Abaco")==2)
 

#9

def ordenarPorConsonantesVocales(cadena):
    c=""
    cadena1=""
    
    if " " in cadena:
        for letra in cadena:
            if letra!=" ":
                cadena1+=letra    
        cadena=cadena1
   
    for letra in cadena:
        if letra not in (VOCALES or VOCALES.upper()):
            c+=letra
    for letra in cadena:
        if letra in (VOCALES or VOCALES.upper()):
            c+=letra

    return c

assert(ordenarPorConsonantesVocales("Hola")=="Hloa")
assert(ordenarPorConsonantesVocales("curso de programacion")=="crsdprgrmcnuoeoaaio")


#10

def numeroPalabras(cadena):
    acum=0
    if " " in cadena:
        if cadena[-1]==" ":
            for i in range(1, len(cadena)):
                if (cadena[i-1] in LETRAS and cadena[i]==" "):
                    acum+=1
        else:
            for i in range(1, len(cadena)):
                if (cadena[i-1] in LETRAS and cadena[i]==" "):
                    acum+=1
             
            cadenaR=reverse(cadena)
            cont=0
            t=0
            while t==0:
                if cadenaR[cont] in LETRAS and cadenaR[cont+1]==" ":
                    cont+=1
                    t+=1
                else:
                    cont+=1
                    
            acum=acum+t
    else:
        acum=1
    
    return acum  

assert(numeroPalabras("Hola todos los muchachos")==4)
assert(numeroPalabras("Hola a todos los muchachos")==5)







