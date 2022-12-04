'''
Created on 2 dic. 2022

@author: moral
'''

#USUARIOS
print("##############")
print("1-Crear nuevo usuario")
print("2-Identificarse")
print("3-Mostrar lista de usuarios registrados")
print("4-Salir del programa")
print("##############")

opcion=int(input("\nIntroduce la opcion que quieras: "))
bloqueo=False
cont=0
listaUs=["","","","","","","","","",""]
listaCon=["","","","","","","","","",""]


while opcion!=4 and bloqueo==False:
    
    if opcion==1:
        usuarios=input("\nIntroduce el usuario: ")
        
        if cont<11:
    
            if usuarios not in listaUs:
                contrasena=input("Introduce contrasena: ")
                contrasena2=input("Vuelve a introducirla: ")
                
                if contrasena==contrasena2:
                    listaUs[cont]=usuarios
                    listaCon[cont]=contrasena2
                    cont+=1
                else:
                    while contrasena!=contrasena2:
                        print("Contrasena no coincide. Vuelve a intentarlo")
                        contrasena2=input("Vuelve a introducirla: ")
            else:
                print("USUARIO YA EXISTENTE")
        else:
            print("La lista de usuarios ya esta llena")
        
        print("\n##############")
        print("1-Crear nuevo usuario")
        print("2-Identificarse")
        print("3-Mostrar lista de usuarios registrados")
        print("4-Salir del programa")
        print("##############")
        
        opcion=int(input("\nIntroduce la opcion que quieras: ")) 
         
           
    
    elif opcion==2:
        usuario=input("Introduce el usuario: ")
        
        if usuario in listaUs:
            contrasena=input("Introduce su contrasena: ")
            
            if contrasena not in listaCon:
                
                cont=0
                while cont<3 and contrasena not in listaCon:
                    cont+=1
                    contrasena=input("Vuelve a intentarlo:")
                
                if cont==3:
                    bloqueo=True
                    print("TU CUENTA HA SIDO BLOQUEADA")
                
                else:
                    contU=0
                    while listaUs[contU]!=usuario:
                        contU+=1
                
                    contC=0
                    while listaCon[contC]!=contrasena:
                        contC+=1
                
                    if contU==contC:
                        print("BIENVENIDO!!!!!!")
                    else:
                        while listaCon[contC]!=contrasena:
                            contC+=1
                        print("BIENVENIDO!!!!!!")
                    
            
            else:
                contU=0
                while listaUs[contU]!=usuario:
                    contU+=1
                
                contC=0
                while listaCon[contC]!=contrasena:
                    contC+=1
                
                if contU==contC:
                    print("BIENVENIDO!!!!!!")
                else:
                    while listaCon[contC]!=contrasena:
                        contC+=1
                    print("BIENVENIDO!!!!!!")
                
        
        print("\n##############")
        print("1-Crear nuevo usuario")
        print("2-Identificarse")
        print("3-Mostrar lista de usuarios registrados")
        print("4-Salir del programa")
        print("##############")
        
        opcion=int(input("\nIntroduce la opcion que quieras: "))
                    
    
    elif opcion==3:
        print(listaUs)
        
        print("\n##############")
        print("1-Crear nuevo usuario")
        print("2-Identificarse")
        print("3-Mostrar lista de usuarios registrados")
        print("4-Salir del programa")
        print("##############")
        
        opcion=int(input("\nIntroduce la opcion que quieras: "))
                    

print("HAS SALIDO DEL MENU")        
        




        