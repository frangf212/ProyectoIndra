CREATE TABLE USUARIO(
ID_usuario NUMBER(10) PRIMARY KEY,
nombre VARCHAR2 (20) NOT NULL,
correo VARCHAR2 (30) unique,
contraseña VARCHAR2 (10) NOT NULL
);

create table ORGANIZADOR (
ID_organizador number(10)primary key ,
Nombre_Organizador varchar2(20) NOT NULL,
Correo_electronico varchar2 (30) NOT NULL,
Telefono number (10) NOT NULL
);

create table UBICACIÓN(
ID_Ubicación NUMBER (10) PRIMARY KEY,
Dirección VARCHAR2(100) NOT NULL

);


CREATE TABLE CATEGORÍA (
ID_categoría number(10) primary key,
nombre VARCHAR2 (20) not null

);


CREATE TABLE EVENTO (
    ID_Evento NUMBER(10) PRIMARY KEY,
    Nombre_Evento VARCHAR2(20) NOT NULL,
    Fecha_Evento DATE NOT NULL,
    ID_organizador NUMBER(10) NOT NULL,
    ID_Ubicación NUMBER(10) NOT NULL,
    ID_categoría NUMBER(10) NOT NULL,
    CONSTRAINT fk_organizador FOREIGN KEY (ID_organizador) REFERENCES ORGANIZADOR(ID_organizador),
    CONSTRAINT fk_ubicación FOREIGN KEY (ID_Ubicación) REFERENCES UBICACIÓN(ID_Ubicación),
    CONSTRAINT fk_categoría FOREIGN KEY (ID_Categoría) REFERENCES CATEGORÍA(ID_categoría)
);


create table INSCRIPCIÓN(

ID_inscripción number(10) primary key,
fecha_inscripción date not null,
ID_usuario NUMBER(10) NOT NULL,
ID_Evento NUMBER(10) NOT NULL,
CONSTRAINT fk_usuario FOREIGN KEY (ID_usuario) REFERENCES USUARIO(ID_usuario),
CONSTRAINT fk_Evento FOREIGN KEY (ID_Evento) REFERENCES EVENTO(ID_Evento)


);