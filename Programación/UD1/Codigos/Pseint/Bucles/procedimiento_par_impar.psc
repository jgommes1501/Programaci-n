Algoritmo funcion_par_impar
	Definir num Como Entero
	Escribir "Escribe un número:"
	leer num
	x =  esPar(num)
	si x = Verdadero
		Escribir "Es par"
	sino escribir "Es impar"
	FinSi
FinAlgoritmo

Funcion x = esPar(num)
	si (num mod 2) = 0 
		x = Verdadero
	sino
		x=  Falso
	FinSi
FinFuncion


