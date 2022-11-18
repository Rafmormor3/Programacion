'''
Created on 17 oct. 2022

@author: moral
'''

nombre ="Rafa Morales"
inversa, normal="", ""
tmp=""

for i in range(len(nombre)):
    inversa = nombre[i] + inversa
    normal = normal + nombre[i]
    
for a in nombre:
    tmp= a + tmp
    
print(inversa, normal, tmp)