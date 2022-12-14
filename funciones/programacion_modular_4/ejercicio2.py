'''
Created on 5 dic. 2022

@author: moral
'''
PRIMOS=[2,3,5,7,11,13,17]

def divisores(num):
    div=[]
    cont=0
    
    while num!=1:
        resto=num%PRIMOS[cont]
        if resto==0:
            num=num//PRIMOS[cont]
            div.append(PRIMOS[cont])
        else:
            cont+=1
    return div
    
print(divisores(104)) 
 
'''
def maxComunDiv(n1, n2):
    divisores1=divisores(n1)
    divisores2=divisores(n2)
    listaNumVeces=[]
    
    #Hacer 

print(maxComunDiv(8, 12))
'''    
    
           
        
        
    