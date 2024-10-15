Algoritmo year_bisiesto
	Definir year Como entero
	Escribir "Introduce tu Año: "
	Leer year
	Si (year mod 4) = 0 y (year mod 100) = 0 o (year mod 400)= 0 Entonces
		Escribir "Su año: ", year " es bisiesto"
	SiNo
		Escribir "Su año: ", year " no es bisiesto"
	Fin Si
	
	
FinAlgoritmo
