Algoritmo calculadora
	Definir num1, num2, num3, suma, resta, multi Como Entero
	Definir dividir Como Real
	Escribir "Calculadora"
	Escribir "1. Suma"
	Escribir "2 .Resta"
	Escribir "3 .Multi"
	Escribir "4 .Dividir"
	

	Leer num1
	//Leer suma, resta, multi, dividir 
	si num1 = 1 Entonces
		Escribir "Suma"
		Escribir "Primer número: "
		Leer num2
		Escribir "Segundo número: "
		leer num3
		suma = num2 + num3
		Escribir "El resultado es: " suma  
	FinSi
	
	si num1 = 2 Entonces
		Escribir "Resta"
		Escribir "Primer número: "
		Leer num2
		Escribir "Segundo número: "
		leer num3
		resta = num2 - num3
		Escribir "El resultado es: " resta 
	FinSi
	
	si num1 = 3 Entonces
		Escribir "Multiplica"
		Escribir "Primer número: "
		Leer num2
		Escribir "Segundo número: "
		leer num3
		multi = num2 * num3
		Escribir "El resultado es: " multi 
	FinSi
	
	si num1 = 4 Entonces
		Escribir "Dividir"
		Escribir "Primer número: "
		Leer num2
		Escribir "Segundo número: "
		leer num3
		dividir = num2 / num3
		Escribir "El resultado es: " dividir  
	FinSi
	
	
FinAlgoritmo
