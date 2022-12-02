'''
Created on 1 dic. 2022

@author: moral
'''

NUMEROS="1234567890"
LETRAS="TRWAGMYFPDXBNJZSQVHLCKE"

dni="48120019V"


def validarDNI(cadena):
    
    res=True
    for c in cadena[:8]:
        if c in LETRAS:
            res=False
    
    if cadena[-1] not in LETRAS:
        res=False    
    
    if len(cadena)!=9:
        res=False
        
    if res==True:
        numeros= cadena[:8]
        division=int(numeros)%23 
        letra=LETRAS[division]
        
        if letra==cadena[-1]:
            res=True
    
    return res

assert(validarDNI("48120019V"))
assert(validarDNI("-48120019V")==False)
assert(validarDNI("-48120019")==False)
assert(validarDNI("481A0019V")==False)
assert(validarDNI("34AB3418V")==False)
assert(validarDNI("48120019$")==False)
assert(validarDNI("34A")==False)
assert(validarDNI("47428339Q"))


