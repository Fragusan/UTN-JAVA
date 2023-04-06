# HomeWork Class 12

## Consignas

 1. Realizar el modelo relacional del enunciado propuesto. 
 2. Generar el modelo en algún motor de DB (oracle, mysql, sqlite, etc.) 
 3. Realizar las consultas para: 
	- a) Insertar un empleado nuevo en la nómina de trabajo. 
	- b) Modificar la nacionalidad de algún empleado. 
	- c) Eliminar un departamento. 
	- d) Conocer los empleados que trabajan en el departamento de “logística” (puede ser cualquiera de los que agreguen). 
	- e) Mostrar todos los departamentos. 
---
## Soluciones

3. 
	> - a)  INSERT INTO `empleado` (`DNI`, `Nombre`, `Apellido`, `Nacionalidad`, `Departamento`) VALUES ('37456963', 'Franco', 'Sánchez', '54', '6'); 
	> - b)   UPDATE `empleado` SET `Nacionalidad` = '54' WHERE `empleado`.`DNI` = 38256321;
	> - c)   DELETE FROM departamento WHERE `departamento`.`ID_departamento` = 7;
	> - d) SELECT * FROM `empleado` WHERE `Departamento` = 6;
	> - e) SELECT `ID_departamento` AS `ID`, `Nombre` FROM `departamento`;

