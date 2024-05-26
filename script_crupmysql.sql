create database bdpersona;
use bdpersona;

create table estudiante(
id int not null auto_increment primary key,
nombres nvarchar(50),
apellidos nvarchar(50)
);

/Insertar/
insert into estudiante (nombres,apellidos) values ('Yennifer','Gaspar');

/Mostrar/
select *from estudiante

/Actualizar/
UPDATE estudiante SET estudiante.nombres = 'Hilary', Estudiante.apellidos ='Vivanco' WHERE Estudiante.id=2;

/Eliminar/
DELETE FROM estudiante WHERE  Estudiante.id=5;