# Introducción a Algoritmos y Java

### 1 Vamos a practicar operaciones básicas con números

<ol type="a">
  <li>Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
y “b”.
Su código puede arrancar (por ejemplo):

.

```java
int numeroInicio = 5;
int numeroFin = 14;
// Se deberían mostrar los números:
5,6,7,8,9,10,11,12,13,14
```

</li>
  <li > A lo anterior, solo muestre los números pares.</li>
  <li> A lo anterior, con una variable extra, elija si se deben mostrar los números
pares o impares.</li>
<li>Utilizando la sentencia for, hacer lo mismo que en b pero invirtiendo el orden</li>
</ol>   
2. Dado el siguiente texto, vamos a atacar el siguiente problema: “determinar si una
persona pertenece al segmento de ingresos altos”. Del i al iii, la idea es hacerlo en
papel y lápiz y sólo implementar el cuarto.

```
“Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a
todas y todos los convivientes:
- Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
(3,5 canastas básicas para un hogar tipo 2 según el INDEC).
- Tener 3 o más vehículos con una antigüedad menor a 5 años.
- Tener 3 o más inmuebles.
- Poseer una embarcación, una aeronave de lujo o ser titular de activos
societarios que demuestren capacidad económica plena.”
```

Tomado de [argentina.gob](https:/ www.argentina.gob.ar/subsidios) el 07/12/2022

<ol type="a">
    <li>
    Lea atentamente el texto, primero que nada piense cuáles son las variables de
entrada.
    </li>
    <li>
    Ordene las entradas y salidas como vimos en la tabla del ejemplo Monotributo
en clase, también puede consultar este [link](https://es.frwiki.wiki/wiki/Table_de_d%C3%A9cision)
    </li>
    <li>
    Piense en un arbol de decision, tambien como se vio en clase si puede resolver
el problema, dadas las entradas
    </li>
    <li>
    Finalmente, vea si puede resolver el problema utilizando código Java. Por
ejemplo si estuviésemos intentando resolver el ejemplo de monotributo
tendríamos el código que se muestra más abajo, y cambiando las variables

```java

//pueden cambiar estas variables para ir probando

float ingresos = 299000;
int superficie = 20;
int energia = 900;
/**********************\***********************/
if ( (ingresos <= 748382.07) &&
( superficie <= 30) &&
(energia <= 3330) ) {
System.out.println("Categoría A");
} else if((ingresos <= 1112459.83) &&
(superficie <= 45) &&
(energia <= 5000) ) {
System.out.println("Categoría B");
}
```


</ol>