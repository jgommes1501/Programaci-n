Algoritmo year_bisiesto
	Definir year Como entero
	Escribir "Introduce tu A�o: "
	Leer year
	Si (year mod 4) = 0 y (year mod 100) = 0 o (year mod 400)= 0 Entonces
		Escribir "Su a�o: ", year " es bisiesto"
	SiNo
		Escribir "Su a�o: ", year " no es bisiesto"
	Fin Si
	
	
FinAlgoritmo
