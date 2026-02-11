#if, elif, else
#si, sino, finsi
#cuando tenemos condiciones del mismo tipo siempre se utiliza el elif
Edad = 30

if Edad >= 18 and Edad < 25:
    print ("puede pasar")

elif Edad >=25 and Edad < 41:
    print ("puede pasar al segundo nivel")
else:
    print ("debe tener 18 años para pasar")





nivelruido = 10

if nivelruido == 0:
    print("Silencio")
elif nivelruido<= 20:
    print("ambiente silencioso")
elif nivelruido <= 60:
    print ("ambiente poco ruidoso")
else:
    print("Ambiente insoportable")    