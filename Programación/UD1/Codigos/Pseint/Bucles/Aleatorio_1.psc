Algoritmo Aleatorio_1
	Definir maximo, minimo Como Entero
	
	Escribir "Alumnos:"
	Escribir "1. Jaime"
	Escribir "2. Daniel"
	Escribir "3. Adrián"
	Escribir "4. Jose"
	Escribir "5. Pablo"
	Escribir "6. Mario"
	Escribir "7. Roberto"
	Escribir "8. Carlos"
	Escribir "9. Felipe"
	Escribir "10. Maria"
	Escribir "11. Natalia"
	Escribir "12. Cristina"
	Escribir "13. Celia"
	Escribir "14. Fran"
	Escribir "15. Manuel"
	Escribir "16. Jacob"
	Escribir "17. Diego"
	Escribir "18. Marta"
	Escribir "19. Sergio"
	maximo = 19
	minimo = 1
	Repetir
		numeroAzar = AZAR(maximo+1);
	Hasta Que numeroAzar >= minimo Y numeroAzar <= maximo
	Escribir "El Alumno Aleatorio es: "
	Escribir numeroAzar
	
FinAlgoritmo


