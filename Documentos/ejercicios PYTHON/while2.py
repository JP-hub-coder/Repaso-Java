#AQUI MOSTRAMOS COMO SE PUEDE CREAR UN BUCLE CON WHILE HASTA...

contador = 0

while True: 
     contador -= 1
     print (contador) #"HASTA ACÁ SE HACE UN CONTADOR SIN FIN"
     if contador == -50: # " DE AQUI PARA ABAJO SE UTILIZA PARA DECIRLE AL BUCLE QUE HASTA AHI DEJA EL PROGRAMA"    
        print ("fin del bucle")
        break