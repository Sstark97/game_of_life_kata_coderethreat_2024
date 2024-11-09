# Game of Life

Empiezas con una cuadrícula bidimensional de celdas, donde cada celda está viva o muerta. En esta 
versión del problema, la cuadrícula es finita, y no puede existir vida fuera de los bordes. Al 
calcular la siguiente generación de la cuadrícula, sigue estas reglas:
1.	Cualquier celda viva con menos de dos celdas vecinas vivas muere, como si fuera por baja población.
2.	Cualquier celda viva con más de tres celdas vecinas vivas muere, como si fuera por sobrepoblación.
3.	Cualquier celda viva con dos o tres celdas vecinas vivas sigue viva en la siguiente generación.
4.	Cualquier celda muerta con exactamente tres celdas vecinas vivas se convierte en una celda viva.

Debes escribir un programa que pueda aceptar una cuadrícula arbitraria de celdas y que devuelva una 
cuadrícula similar mostrando la siguiente generación.