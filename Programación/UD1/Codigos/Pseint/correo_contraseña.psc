Algoritmo Correo
	Definir usuario, usuario2 Como Caracter
	Definir contrase�a, contrase�a2  Como Caracter
	contrase�a2 = "popeye1"
	usuario2 = "popeye"
	Escribir "Pon tu correo"
	leer usuario
	Escribir "Pon la contrase�a"
	leer contrase�a
	Si usuario = usuario2 Entonces
		
		Si contrase�a= contrase�a2 Entonces
			escribir "�Bienvenido " ,usuario "!"
		SiNo
			Escribir "Contrase�a Incorrecta"
		Fin Si
		
	SiNo
		Escribir "Usuario Incorrecto" 
	Fin Si
FinAlgoritmo
