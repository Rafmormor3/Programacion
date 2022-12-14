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
cont=0
listaUs=["","","","","","","","","",""]
listaCon=["","","","","","","","","",""]


while opcion!=4:
    
    if opcion==1:
        usuarios=input("\nIntroduce el usuario: ")
        
        if cont<10:
    
            if usuarios not in listaUs:
                contrasena=input("Introduce contrasena: ")
                contrasena2=input("Vuelve a introducirla: ")
            
                while contrasena!=contrasena2:
                    print("Contrasena no coincide. Vuelve a intentarlo")
                    contrasena2=input("Vuelve a introducirla: ")
                    
                listaUs.append(usuarios)
                listaCon.append(contrasena2)
                
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
                
                intentos=0
                while cont<3 and contrasena not in listaCon:
                    intentos+=1
                    contrasena=input("Vuelve a intentarlo:")
                
                if intentos==3:
                    for i in range(len(listaUs)):
                        if usuario==listaUs[i]:
                            contrasena[i]=""
                            print("TU CUENTA HA SIDO BLOQUEADA")
                else:
                    print("BIENVENIDO")        
        else:
            print("Usuario no existe")
            
            
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
        




        