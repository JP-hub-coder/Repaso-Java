def validaro(minV: int, maxV: int):
    while True:
        resultado = int(input(f"ingrese un valor entre {minV} y {maxV}: "))
        if resultado < minV or resultado > maxV:
            print(f"debe ingresar un valor valido para el rango de {minV} y {maxV}")
        else:
            return resultado



while True:
    print("     ===MENU===")
    print("\t1. registrar notas")
    print("\t2. calcular promedio")
    opcionS = validaro (1,2)
    print(f"opcion : {opcionS}")
    if opcionS == 0:
        break

    
