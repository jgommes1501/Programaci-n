Algoritmo triangulo
	Definir lado1, lado2, lado3 Como Real
	Escribir "Escribe la Longitud de los lados del triángulo"
	Escribir "Primer lado:"
	leer lado1
	Escribir "Segudo lado:"
	leer lado2
	Escribir "Tercer lado: "
	leer lado3
	si (lado1 + lado2) > lado3 y (lado1 + lado3) > lado2 y (lado2 + lado3) >  lado1  Entonces
		si (lado1 = lado2) y (lado2 =lado3) y (lado1 = lado3) Entonces
			Escribir "Es un triángulo equilátero"
		sino 
			si (lado1 = lado2) o (lado2 =lado3) o (lado1 = lado3) Entonces
				Escribir "Es un triángulo Isoceles"
			sino 
				Escribir "Escaleno"
			fin si
		fin si
	sino 
		escribir "No es un Triángulo"	
	FinSi
	
FinAlgoritmo


