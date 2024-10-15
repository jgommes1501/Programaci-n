Algoritmo maximo_comun_divisor
	Definir a, b Como entero
	Escribir "Introduzca dos números mayores que 0"
	Leer a
	leer b
	Mientras b <> 0 Hacer
		si a > b Entonces
			a = a - b 
		sino b = b - a
		FinSi
	Fin Mientras
	Escribir a
FinAlgoritmo
