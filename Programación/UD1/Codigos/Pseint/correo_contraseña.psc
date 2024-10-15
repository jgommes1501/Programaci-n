Algoritmo Correo
	Definir usuario, usuario2 Como Caracter
	Definir contraseña, contraseña2  Como Caracter
	contraseña2 = "popeye1"
	usuario2 = "popeye"
	Escribir "Pon tu correo"
	leer usuario
	Escribir "Pon la contraseña"
	leer contraseña
	Si usuario = usuario2 Entonces
		
		Si contraseña= contraseña2 Entonces
			escribir "¡Bienvenido " ,usuario "!"
		SiNo
			Escribir "Contraseña Incorrecta"
		Fin Si
		
	SiNo
		Escribir "Usuario Incorrecto" 
	Fin Si
FinAlgoritmo
