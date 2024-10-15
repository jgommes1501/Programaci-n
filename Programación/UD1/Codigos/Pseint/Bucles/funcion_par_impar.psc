Algoritmo funcion_par_impar
	Definir result2, num Como Entero
	Escribir "Escribe un número:"
	leer num
	
	parimpar(num) 
FinAlgoritmo

Funcion parimpar(num)
	si (num mod 2) = 0 Entonces
		Escribir "su número es par"
		sino escribir "Su número es Impar"
	FinSi
FinFuncion


