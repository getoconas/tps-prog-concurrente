## Punto 3
En la siguiente imagen, extraída de un cruce de calles, cada auto desea seguir su ruta (a), y de no tener algún mecanismo de orden o control se producirá un choque, traducido, un interbloqueo (b).

Los cuatro cuadrantes de la intersección son los recursos compartidos sobre los que se demanda control, si los cuatro coches desean atravesar el cruce, las necesidades de recursos son las siguientes:

- El coche que va hacia el norte necesita los cuadrantes 1 y 2
- El coche que va hacia el oeste necesita los cuadrantes 2 y 3
- El coche que va hacia el sur necesita los cuadrantes 3 y 4
- El coche que va hacia el este necesita los cuadrantes 4 y 1

## Desarrollo
Para el desarrollo de este punto se van a definir cuatro semáforos, uno para cada cuadrante de la intersección, en donde se va a inicializar con el valor 1 que va a significar que la intersección va a estar libre

Definición de semáforos
```
semaforo_cuadrante1 = 1
semaforo_cuadrante2 = 1
semaforo_cuadrante3 = 1
semaforo_cuadrante4 = 1
```

Procedimiento para el automovil que va hacia el norte
```
Proceso1
  wait(semaforo_cuadrante1)
  wait(semaforo_cuadrante2)
  // Cruzar la calle
  signal(semaforo_cuadrante1)
  signal(semaforo_cuadrante2)
```

Procedimiento para el automovil que va hacia el oeste
```
Proceso2
  wait(semaforo_cuadrante2)
  wait(semaforo_cuadrante3)
  // Cruzar la calle
  signal(semaforo_cuadrante2)
  signal(semaforo_cuadrante3)
```

Procedimiento para el automovil que va hacia el sur
```
Proceso3
  wait(semaforo_cuadrante3)
  wait(semaforo_cuadrante4)
  // Cruzar la calle
  signal(semaforo_cuadrante3)
  signal(semaforo_cuadrante4)
```

Procedimiento para el automovil que va hacia el este
```
Proceso4
  wait(semaforo_cuadrante4)
  wait(semaforo_cuadrante1)
  // Cruzar la calle
  signal(semaforo_cuadrante4)
  signal(semaforo_cuadrante1)
```
