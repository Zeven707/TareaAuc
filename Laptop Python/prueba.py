if _name_ == "_main_":
    vector_laptops = []
    p1 = Pantalla("IPS", 1366, 768)
    p2 = Pantalla("OLED", 1920, 1080)
    p3 = Pantalla("Retina", 2560, 1600)

    lap1 = Laptop("Lenovo ThinkPad", p1)
    lap1.agregar_aplicacion(Aplicacion("Word", 500))
    lap1.agregar_aplicacion(Aplicacion("Excel", 500))
    lap1.agregar_aplicacion(Aplicacion("Zoom", 300))

    lap2 = Laptop("Asus ROG", p2)
    lap2.agregar_aplicacion(Aplicacion("Photoshop", 2000))
    lap2.agregar_aplicacion(Aplicacion("Steam", 1500))

    lap3 = Laptop("MacBook Pro", p3)
    lap3.agregar_aplicacion(Aplicacion("Final Cut", 4000))

    vector_laptops.extend([lap1, lap2, lap3])

    print("ESTADO INICIAL DE LAS LAPTOPS")
    for lap in vector_laptops:
        lap.mostrar_detalle()
        print()
    print(" b / e. LAPTOP CON MaS APLICACIONES")
    if len(vector_laptops) > 0:
        max_apps = vector_laptops[0].cantApps
        laptop_max = vector_laptops[0]
        for lap in vector_laptops:
            if lap.cantApps > max_apps:
                max_apps = lap.cantApps
                laptop_max = lap
        print(f"La laptop con mas aplicaciones es: {laptop_max.modelo} ({max_apps} apps)\n")
    print("c. AGREGAR APLICACION A MODELO 'Asus ROG'")
    modelo_x = "Asus ROG"
    nueva_app = Aplicacion("Valorant", 3500)
    for lap in vector_laptops:
        if lap.modelo == modelo_x:
            lap.agregar_aplicacion(nueva_app)
    for lap in vector_laptops:
        if lap.modelo == modelo_x:
            lap.mostrar_detalle()
    print()
    print("d. ELIMINAR APPS DE LAPTOPS CON ANCHO DE PANTALLA 1366")
    ancho_y = 1366
    for lap in vector_laptops:
        if lap.pantalla.ancho == ancho_y:
            lap.eliminar_todas_apps()
            print(f"Se vaciaron las aplicaciones de la laptop: {lap.modelo}")
    print()
    print("f. ORDENAR APLICACIONES DE CADA LAPTOP")
    lap1.agregar_aplicacion(Aplicacion("Access", 500)) 
    lap1.agregar_aplicacion(Aplicacion("Paint", 100))
    for lap in vector_laptops:
        lap.ordenar_aplicaciones()
        lap.mostrar_detalle()
        print()