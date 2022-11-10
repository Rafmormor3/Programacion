'''
Created on 11 oct. 2022

@author: moral
'''
'''
#1
nota=int(input("Introduzca una nota del 1 al 100: "))

while nota<0 or nota>100:
    nota=int(input("Introduzca una nota del 1 al 100: "))

if 90<=nota<=100:
    print("Sobresaliente")
elif 70<=nota<90:
    print("Notable")
elif 60<=nota<80:
    print("Bien")
elif 50<=nota<60:
    print("Suficiente")
else:
    print("Suspenso")
'''
#2 
dia=int(input("\nIntroduce el dia: "))
mes=int(input("Introduce el mes: "))  
hemisferio=input("Indique hemisferio (Norte/Sur): ").upper()

while 0>=dia or dia>31:
    dia=int(input("Dia incorrecto. Introduce el dia (1 al 31): "))

while mes<=0 or mes>12:
    mes=int(input("Mes incorrecto. Introduce el mes (1 al 12): "))  

while hemisferio != "NORTE" and hemisferio!="SUR":
    hemisferio=input("Indique hemisferio (Norte/Sur): ").upper()
    
    
if hemisferio=="NORTE":
    
    if (mes==9 and 23<=dia<=30) or ((mes==10 and 1<=dia<=31) or (mes==11 and 1<=mes<=30)) or (mes==12 and 1<=dia<21):
        print("Otono")
    elif (mes==12 and 21<=dia<=31) or ((mes==1 and 1<=dia<=31) or (mes==2 and 1<=dia<=28)) or (mes==3 and 1<=dia<21):
        print("Invierno")
    elif (mes==3 and 21<=dia<=31) or ((mes==4 and 1<=dia<=30) or (mes==5 and 1<=dia<=31)) or (mes==6 and 1<=dia<21):
        print("Primavera")
    else:
        print("Verano")

else:

    if (mes==9 and 23<=dia<=30) or ((mes==10 and 1<=dia<=31) or (mes==11 and 1<=mes<=30)) or (mes==12 and 1<=dia<21):
        print("Primavera")
    elif (mes==12 and 21<=dia<=31) or ((mes==1 and 1<=dia<=31) or (mes==2 and 1<=dia<=28)) or (mes==3 and 1<=dia<21):
        print("Verano")
    elif (mes==3 and 21<=dia<=31) or ((mes==4 and 1<=dia<=30) or (mes=5 and 1<=dia<=31)) or (mes==6 and 1<=dia<21):
        print("Otono")
    else:
        print("Invierno")
'''         
#3  
dia=int(input("\nIntroduzca el dia: "))
mes=int(input("Introduzca el mes: "))
ano=int(input("Introduzca el ano:"))

bisiesto= (ano%100==0 and not(ano%400==0)) or (ano%100==0 and ano%400==0)   


while not(1<=dia<=31):
    dia=int(input("Dia incorrecto. Introduzca el dia: "))
while not(1<=mes<=12):
    mes=int(input("Mes incorrecto. Introduzca el mes: "))
while mes==2 and not(1<=dia<=29):
    dia=int(input("El mes de Febrero no contiene ese dia. Introduzca el dia: "))
  
if bisiesto==False:   
    if mes==1:
        dif_dias= dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias") 
    
    elif mes==2:
        dif_dias=31+dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    elif mes==3:
        dif_dias= 31 + 28 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
    
    elif mes==4:
        dif_dias= 31 + 28 + 31 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
    
    elif mes==5:
        dif_dias= 31 + 28 + 31 + 30 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    elif mes==6:
        dif_dias= 31 + 28 + 31 + 30 + 31 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    elif mes==7:
        dif_dias= 31 + 28 + 31 + 30 + 31 + 30 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    elif mes==8:
        dif_dias= 31 + 28 + 31 + 30 + 31 + 30 + 31 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    elif mes==9:
        dif_dias= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    elif mes==10:
        dif_dias= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    elif mes==11:
        dif_dias= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    else:
        dif_dias= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")

else:
    if mes==1:
        dif_dias= dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias") 
    
    elif mes==2:
        dif_dias=31+dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    elif mes==3:
        dif_dias= 31 + 29 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
    
    elif mes==4:
        dif_dias= 31 + 29 + 31 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
    
    elif mes==5:
        dif_dias= 31 + 29 + 31 + 30 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    elif mes==6:
        dif_dias= 31 + 29 + 31 + 30 + 31 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    elif mes==7:
        dif_dias= 31 + 29 + 31 + 30 + 31 + 30 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    elif mes==8:
        dif_dias= 31 + 29 + 31 + 30 + 31 + 30 + 31 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    elif mes==9:
        dif_dias= 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    elif mes==10:
        dif_dias= 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    elif mes==11:
        dif_dias= 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
        
    else:
        dif_dias= 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + dia
        print(f"Desde 1/1/{ano} hasta {dia}/{mes}/{ano} hay {dif_dias} dias")
'''
#4
grupo1=input("\nIntroduce el grupo sanguineo 1 (A,B,AB,0): ").upper()
grupo2=input("Introduce el grupo sanguineo 2: ").upper()
rh1=input("Introduce si es - o + el grupo 1: ")
rh2=input("Introduce si es - o + el grupo 2: ")


while grupo1!="A" and grupo1!="B" and grupo1!="AB" and grupo1!="0":
    grupo1=int(input("Opcion incorrecta. Introduce el grupo sanguineo 1 (A,B,AB,0): ")).upper()
    
while grupo2!="A" and grupo2!="B" and grupo2!="AB" and grupo2!="0":
    grupo2=int(input("Opcion incorrecta. Introduce el grupo sanguineo 2: ")).upper()
    
while rh1!="+" and rh1!="-" and rh2!="+" and rh2!="-":
    rh=input("Opcion incorrecta. Introduce si es - o + : ")
    

if rh1=="+" and rh2=="+":
    if grupo1=="A":
        if grupo2=="A" or grupo2=="AB":
            print(f"{grupo1}{rh1} puede donar a {grupo2}{rh2} ")
        else: 
            print(f"{grupo1}{rh1} no puede donar a {grupo2}{rh2} ")
        if grupo2=="A" or grupo2=="0":
            print(f"{grupo1}{rh1} puede recibir de {grupo2}{rh2} ")
        else:
            print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")
    
    elif grupo1=="B":
        if grupo2=="B" or grupo2=="AB":
            print(f"{grupo1}{rh1} puede donar a {grupo2}{rh2} ")
        else: 
            print(f"{grupo1}{rh1} no puede donar a {grupo2}{rh2} ")
        if grupo2=="B" or grupo2=="0":
            print(f"{grupo1}{rh1} puede recibir de {grupo2}{rh2} ")
        else:
            print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")     
    
    elif grupo1=="AB":    
        if grupo2=="AB":
            print("AB+ solo recibe de AB+")
        else:
            print(f"{grupo1}{rh1} puede donar a {grupo2}{rh2} ")
            print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")
    
    else: 
        if grupo2=="A" or grupo2=="B" or grupo2=="AB" or grupo2=="0":
            print(f"{grupo1}{rh1} puede donar a {grupo2}{rh2} ")
        if grupo2=="0":
            print(f"{grupo1}{rh1} puede recibir de {grupo2}{rh2} ")
        else: 
            print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")
                   
elif rh1=="+" and rh2=="-":
    if grupo1=="A":
        print(f"{grupo1}{rh1} no puede donar a {grupo2}{rh2} ")
        if grupo2=="A" or grupo2=="0":
            print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")
        else:
            print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")
    
    elif grupo1=="B":
        print(f"{grupo1}{rh1} no puede donar a {grupo2}{rh2} ")
        if grupo2=="B" or grupo2=="0":
            print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")
        else:
            print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")   
    
    elif grupo1=="AB":
        print(f"{grupo1}{rh1} no puede donar a {grupo2}{rh2} ")
        print("Recibe de todos los grupos")    
        
    
    else: 
        print(f"{grupo1}{rh1} no puede donar a {grupo2}{rh2} ")
        if grupo2=="0":
            print(f"{grupo1}{rh1} puede recibir de {grupo2}{rh2} ")
        else: 
            print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")
    
elif rh1=="-" and rh2=="+":
    if grupo1=="A":
        if grupo2=="A" or grupo2=="AB":
            print(f"{grupo1}{rh1} puede donar a {grupo2}{rh2} ")
        else:
            print(f"{grupo1}{rh1} no puede donar a {grupo2}{rh2} ")    
        
        print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")
    
    elif grupo1=="B":
        if grupo2=="B" or grupo2=="AB":
            print(f"{grupo1}{rh1} puede donar a {grupo2}{rh2} ")
        else:
            print(f"{grupo1}{rh1} no puede donar a {grupo2}{rh2} ")    
        
        print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")  
    
    elif grupo1=="AB":
        if grupo2=="AB":
            print(f"{grupo1}{rh1} puede donar a {grupo2}{rh2} ")
        
        print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")   

    else: 
        print(f"{grupo1}{rh1} puede donar a {grupo2}{rh2} ")
        print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")
    
else:
    if grupo1=="A":
        if grupo2=="A" or grupo2=="AB":
            print(f"{grupo1}{rh1} puede donar a {grupo2}{rh2} ")
        else:
            print(f"{grupo1}{rh1} no puede donar a {grupo2}{rh2} ")    
        if grupo2=="A" or grupo2=="0":
            print(f"{grupo1}{rh1} puede recibir de {grupo2}{rh2} ")
        else:
            print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")
            
    elif grupo1=="B":
        if grupo2=="B" or grupo2=="AB":
            print(f"{grupo1}{rh1} puede donar a {grupo2}{rh2} ")
        else:
            print(f"{grupo1}{rh1} no puede donar a {grupo2}{rh2} ")    
        if grupo2=="B" or grupo2=="0":
            print(f"{grupo1}{rh1} puede recibir de {grupo2}{rh2} ")
        else:
            print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")  
    
    elif grupo1=="AB":
        if grupo2=="AB":
            print(f"{grupo1}{rh1} puede donar a {grupo2}{rh2} ")
        
        print(f"{grupo1}{rh1} puede recibir de {grupo2}{rh2} ")   

    else: 
        print(f"{grupo1}{rh1} puede donar a {grupo2}{rh2} ")
        if grupo2=="0":
            print(f"{grupo1}{rh1} puede recibir de {grupo2}{rh2} ")
        else:   
            print(f"{grupo1}{rh1} no puede recibir de {grupo2}{rh2} ")

'''       



   
        
        

 

    
    
    
             
            
            
            
            
            
            
            
            
            
            
    

    