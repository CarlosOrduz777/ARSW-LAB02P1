Escuela Colombiana de Ingeniería

# Arquitecturas de Software – ARSW
## Carlos Orduz Valentina Alvarado

####Taller – programación concurrente, condiciones de carrera y sincronización de hilos. EJERCICIO INDIVIDUAL O EN PAREJAS.

#####Parte I – Antes de terminar la clase.

Creación, puesta en marcha y coordinación de hilos.

1.Revise el programa “primos concurrentes” (en la carpeta parte1), dispuesto en el paquete edu.eci.arsw.primefinder. Este es un programa que calcula los números primos entre dos intervalos, distribuyendo la búsqueda de los mismos entre hilos independientes. Por ahora, tiene un único hilo de ejecución que busca los primos entre 0 y 30.000.000. Ejecútelo, abra el administrador de procesos del sistema operativo, y verifique cuantos núcleos son usados por el mismo.

![](https://github.com/CarlosOrduz777/ARSW-LAB02P1/blob/master/images/cores-1Thread.PNG)

2. Modifique el programa para que, en lugar de resolver el problema con un solo hilo, lo haga con tres, donde cada uno de éstos hará la tarcera parte del problema original. Verifique nuevamente el funcionamiento, y nuevamente revise el uso de los núcleos del equipo.

## Antes de ejecutar
![](https://github.com/CarlosOrduz777/ARSW-LAB02P1/blob/master/images/3Threads-before.PNG)

## Después de ejectutar

![](https://github.com/CarlosOrduz777/ARSW-LAB02P1/blob/master/images/3threads-after.PNG)

### Se observó como la utilización en la CPU y el espacio de memoria aumentó, la cantidad de procesadores lógicos (8) y físicos (4) que se usan durante la ejecución del programa.

3. Lo que se le ha pedido es: debe modificar la aplicación de manera que cuando hayan transcurrido 5 segundos desde que se inició la ejecución, se detengan todos los hilos y se muestre el número de primos encontrados hasta el momento. Luego, se debe esperar a que el usuario presione ENTER para reanudar la ejecución de los mismo.

