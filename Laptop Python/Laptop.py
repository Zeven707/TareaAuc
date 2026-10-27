class Pantalla:
    def _init_(self, tipo="LED", ancho=1920, alto=1080):
        self.tipo = tipo
        self.ancho = ancho
        self.alto = alto
    def _str_(self):
        return f"Tipo: {self.tipo}, Ancho: {self.ancho}, Alto: {self.alto}"
class Aplicacion:
    def _init_(self, nombre="Desconocida", tamanio=0):
        self.nombre = nombre
        self.tamanio = tamanio 
    def _str_(self):
        return f"App: {self.nombre} ({self.tamanio} MB)"
class Laptop:
    def _init_(self, modelo="Genérico", pantalla=None):
        self.modelo = modelo
        self.cantApps = 0
        self.apps = [None] * 50  
        self.pantalla = pantalla if pantalla else Pantalla()

    def agregar_aplicacion(self, app):
        if self.cantApps < 50:
            self.apps[self.cantApps] = app
            self.cantApps += 1
            return True
        else:
            print(f"La laptop {self.modelo} no tiene espacio para mas aplicaciones.")
            return False
    def eliminar_todas_apps(self):
        self.cantApps = 0
        self.apps = [None] * 50
    def ordenar_aplicaciones(self):
        n = self.cantApps
        for i in range(n - 1):
            for j in range(n - i - 1):
                intercambiar = False
                if self.apps[j].tamanio < self.apps[j + 1].tamanio:
                    intercambiar = True
                elif self.apps[j].tamanio == self.apps[j + 1].tamanio:
     
                    if self.apps[j].nombre > self.apps[j + 1].nombre:
                        intercambiar = True

                if intercambiar:
                    aux = self.apps[j]
                    self.apps[j] = self.apps[j + 1]
                    self.apps[j + 1] = aux

    def _str_(self):
        return f"Laptop modelo: {self.modelo} | Nro apps: {self.cantApps} | Ancho  Pantalla: {self.pantalla.ancho}]"
    def mostrar_detalle(self):
        print(self)
        print("  aplicaciones instaladas:")
        if self.cantApps == 0:
            print("    (Ninguna)")
        else:
            for i in range(self.cantApps):
                print(f"    - {self.apps[i]}")