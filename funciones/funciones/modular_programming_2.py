'''
Created on 21 nov. 2022

@author: moral
'''
#1
from math import sqrt


def computeFactorial(num):
    res=1
    if num<0:
        res=None
    else:
        for i in range(num):
            res*=i+1
    return res

#TEST--------------------------------------------
assert(computeFactorial(0)==1)
assert(computeFactorial(-5)==None)
assert(computeFactorial(5)==120)
print("Funcion computefactorial Correcto")


#2

def is_leap_year(year):
    return (year%4==0) or (year%100!=0 and year%400==0)

#TEST--------------------------------------------
assert(is_leap_year(2024))
assert(not is_leap_year(2023))
assert (is_leap_year(2000))
assert (is_leap_year(2004))
print("Funcion bisiesto bien")


#3

def computeDaysInMonth(month, year):
    listaDay=[31,28,31,30,31,30,31,31,30,31,30,31]
    
    if 1<=month<=12 and 0<=year:
        for i in range(len(listaDay)):
            day=listaDay[month-1]
            
            if listaDay[month-1]==28 and is_leap_year(year):
                day=29
    else:
        day=-1
        
    return day
    
#TEST--------------------------------------------
assert(computeDaysInMonth(2, 2024)==29) 
assert(computeDaysInMonth(2, 2023)==28) 
assert(computeDaysInMonth(3, 2024)==31) 
assert(computeDaysInMonth(4, 2024)==30)  
assert(computeDaysInMonth(24, 400)==-1)
print("Funcion de computo de dias bien")    


#5

def powerlt(num1, num2=0):
    res=1
    for i in range(1,num2+1):
        res*=num1
    return res   

#TEST--------------------------------------------
assert(powerlt(2)==1)
assert(powerlt(2,2)==4)
print("Funcion de potencia bien")



#6

def esValidoDecimales(cadena):
    listacaracteresValidos=["0","1","2","3","4","5","6","7","8","9",".","-"]
    res=True
    
    acumPunto=0
    acumNeg=0
    for i in range(len(cadena)):
        if cadena[i]==".":
            acumPunto+=1
        elif cadena[i]=="-":
            acumNeg+=1
        
    if "-" in cadena and (cadena[0]!="-" or acumNeg>1):
        res=False
    if "." in cadena and (cadena[0]=="." or cadena[-1]=="." or acumPunto>1):
        res=False
    
    for i in range(1,len(cadena)):
        if (cadena[-i]=="." and cadena[i]=="-") or (cadena[i-1]=="-" and cadena[i]=="."):
            res=False
    
    for i in range(len(cadena)):
        if cadena[i] not in listacaracteresValidos:
            res=False
    return res

assert(esValidoDecimales("12345")==True)
assert(esValidoDecimales("2.5")==True)
assert(esValidoDecimales("-56")==True)
assert(esValidoDecimales("5-6")==False)
assert(esValidoDecimales(".98")==False) 
assert(esValidoDecimales("34.a")==False)
assert(esValidoDecimales("23.")==False)
assert(esValidoDecimales("23*+&")==False)
assert(esValidoDecimales("-.34")==False)
assert(esValidoDecimales(".-34")==False)
print("esValido")  

def esValidoHexadecimal(cadena): 
    
    listacaracteresValidos=["0","1","2","3","4","5","6","7","8","9",".","-", "A","a","B","b","C","c","D","d","E","e","F","f"]
    res=True
    
    acumPunto=0
    acumNeg=0
    for i in range(len(cadena)):
        if cadena[i]==".":
            acumPunto+=1
        elif cadena[i]=="-":
            acumNeg+=1
        
    
    if "-" in cadena and (cadena[0]!="-" or acumNeg>1):
        res=False
    if "." in cadena and (cadena[0]=="." or cadena[-1]=="." or acumPunto>1):
        res=False
    for i in range(len(cadena)):
        if cadena[i] not in listacaracteresValidos:
            res=False
    for i in range(1,len(cadena)):
        if (cadena[-i]=="." and cadena[i]=="-") or (cadena[i-1]=="-" and cadena[i]=="."):
            res=False
    return res
        
def getNumberOfDigits(num):
    cadena=str(num)
    listDigits=["0","1","2","3","4","5","6","7","8","9","A","a","B","b","C","c","D","d","E","e","F","f"]
    
    acum=0
    if esValidoDecimales(cadena)==True:
        for i in range(len(cadena)):
            if cadena[i] in listDigits:
                acum+=1
    
    elif esValidoHexadecimal(cadena)==True:
        for i in range(len(cadena)):
            if cadena[i] in listDigits:
                acum+=1
    else:
        acum=None
    
    return acum       
    
#TEST--------------------------------------------
assert(getNumberOfDigits(3.56)==3)
assert(getNumberOfDigits(3456)==4)
assert(getNumberOfDigits(-45)==2)
assert(getNumberOfDigits(1001011)==7)
assert(getNumberOfDigits("Hola")==None)
assert(getNumberOfDigits(".98")==None)
assert(getNumberOfDigits("34.")==None)
assert(getNumberOfDigits("?45..")==None)
assert(getNumberOfDigits("4.4.4")==None)
assert(getNumberOfDigits("123456af")==8)
print("Funcion decir numero digitos bien")



#7

def contDivisors(num):
    acum=0
    for i in range(1,num+1):
        if num%i==0:
            acum+=1
    return acum

def isPrime(num):
    if num>0:   
        res=True
        if contDivisors(num)>2:
            res=False
    else:
        res=None
    
    return res
    
#TEST--------------------------------------------
assert(isPrime(5))
assert(isPrime(4)==False)
assert(isPrime(-7)==None)
print("Funcion es primo bien")



#8 A no puede ser 0 ya que si es 0 ya no es una ecuacion de 2 grado

def solveSecondOrderEcuation(a,b,c):
    if a>0 and b>=0 and c>=0:
        
        x1= (-b + sqrt(((b)**2)-4*a*c))/2*a
        x2= (-b - sqrt(((b)**2)-4*a*c))/2*a
    
    else:
        x1=None
        x2=None
        
    return x1, x2

#TEST--------------------------------------------
assert(solveSecondOrderEcuation(1, 3, 2)==(-1, -2))
assert(solveSecondOrderEcuation(1, 4, 0)==(0,-4))
#assert(solveSecondOrderEcuation(2, 5, 2)==-0.5, -2)
assert(solveSecondOrderEcuation(-5, 0, -7)==(None, None))
print("Ecuancion segundo grado bien")



#9

def getPrimeDivisors(num):
    list=[]
    if num>0:
        for i in range(1,num+1):
            if num%i==0 and isPrime(i):
                list.append(i)
    else:
        list=None
        
    return list  

#TEST--------------------------------------------
assert(getPrimeDivisors(4)==[1,2])
assert(getPrimeDivisors(10)==[1,2,5])
assert(getPrimeDivisors(-5)==None) 
print("Divisores Primos bien")



#10

def sumDivisors(num):
    acum=0
    for i in range(1,num):
        if num%i==0:
            acum+=i
    return acum

def isFriendsNumber(n1, n2):
    if n1>0 and n2>0:   
        res=False
        if n1==sumDivisors(n2) or n2==sumDivisors(n1):
            res=True
    else:
        res=None
    
    return res

assert(isFriendsNumber(6, 6))
assert(isFriendsNumber(1, 11))
assert(isFriendsNumber(4, 5)==False)
assert(isFriendsNumber(-4, 6)==None)
print("Friends Numbers good")

















