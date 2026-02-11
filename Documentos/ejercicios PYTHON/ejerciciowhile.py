#ingredar dinero hasta que se complete para el cafe y si quedan vueltas ps se las da"
vueltas = 0 
total = 0
precio = 10
while total < precio:
    dinero = int (input("ingrese el dinero: "))
    total += dinero
    print(f"total ingresado: {total}")
if total < precio :
    print (f"le hace falta: {precio-dinero}")
elif total > precio :
    print(f"sus vueltas son: {dinero-precio} ")
print("disfruta tu cafe")