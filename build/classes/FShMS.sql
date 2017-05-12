CREATE DATABASE FShMS;
USE FShMS;
CREATE TABLE Stoku(
	ID_Stoku INT PRIMARY KEY IDENTITY(1,1),
	Emri VARCHAR(50) NOT NULL
);

CREATE TABLE Prodhuesi(
	ID_Prodhuesi int PRIMARY KEY IDENTITY(1,1),
	Emri_Prodhuesit varchar(50) not null,
	Shteti varchar(50) not null,
	Qyteti varchar(50) not null,
	Rruga varchar(50) not null,
	Kodi_Postar int not null
);
 CREATE TABLE Kontakti_Prodhuesit(
	ID_Kontakti_Prodhuesit int primary key identity(1,1),
	Tel1 nvarchar(30) not null,
	Tel2 nvarchar(30),
	Tel3 nvarchar(30),
	Email1 varchar(30) not null,
	Email2 varchar(30),
	Email3 varchar(30),
	ID_Prodhuesi int foreign key references Prodhuesi(ID_Prodhuesi)
 );
 drop table Prodhuesi;
 drop table Stoku;
CREATE TABLE Produkti(
	ID_Produkti int primary key identity(1,1),
	Barkodi int not null,
	Emri varchar(30) not null,
	Madhesia varchar(4) not null,
	ID_Ngjyra  int unique foreign key references Ngjyra(ID_Ngjyra)not null,
	Gjinija char(1) not null,
	Sasia int not null,
	Cmimi int not null,
	ID_Prodhuesi int foreign key references Prodhuesi(ID_Prodhuesi),
	ID_Stoku int foreign key references Stoku(ID_Stoku)
);
CREATE TABLE Ngjyra(
	ID_Ngjyra int primary key identity(1,1),
	Ngjyra varchar(10) not null
);

CREATE TABLE Stafi(
	ID_Stafi int primary key identity(1,1),
	Emri varchar(50) not null,
	Mbiemri varchar(50) not null,
	Mosha int not null,
	Gjinija char(1) not null,
	Shteti varchar(50) not null,
	Qyteti varchar(50) not null,
	Rruga varchar(50) not null,
	Kodi_Postar int not null,
	ID_Kompania int foreign key references Kompania(ID_Kompania)
);

CREATE TABLE Kontakti_Stafit(
	ID_Kontakti_Stafit int primary key identity(1,1),
	Tel nvarchar(30) not null,
	Email varchar(30) not null,
	ID_Stafi int foreign key references Stafi(ID_Stafi)
 );
 CREATE TABLE Mengajeri(
	ID_Stafi int foreign key references Stafi(ID_Stafi),
	ID_Mengajeri  int unique identity(1,1),
	constraint pk_menagjeri primary key (ID_Stafi,ID_Mengajeri)
 );
 ALTER TABLE Mengajeri
 ADD  Sektori varchar(20);

 CREATE TABLE Puntori(
	ID_Stafi int primary key foreign key references  Stafi(ID_Stafi),
	Pozita varchar(30) not null,
	Sektori varchar(30) not null,
	ID_Mengajeri int foreign key references Mengajeri(ID_Mengajeri) not null 
 );
CREATE TABLE Arka(
	ID_Arka int primary key identity(1,1),
	ID_Stafi int foreign key references Stafi(ID_Stafi)
);
CREATE TABLE Orari_Stafi(
	ID_Orari int primary key identity(1,1),
	Data Date not null,
	Koha_Fillimit Time not null,
	Koha_Mbarimit Time not null,
	ID_Stafi int foreign key references Stafi(ID_Stafi)
);
CREATE TABLE Kompania(
	ID_Kompania int primary key identity(1,1),
	Emri varchar(50) not null,
	Shteti varchar(50) not null,
	Qyteti varchar(50) not null,
	Rruga varchar(50) not null,
	Kodi_Postar int not null,
	ID_Stoku int unique Foreign key references Stoku(ID_Stoku)
);
ALTER TABLE Kompania
ADD ID_Mengajeri  int unique foreign key references Mengajeri(ID_Mengajeri);


CREATE TABLE Kontakti_Kompania(
	ID_Kontakti_Kompanis int primary key identity(1,1),
	Tel nvarchar(30) not null,
	Email varchar(30) not null,
	ID_Kompania int foreign key references Kompania(ID_Kompania)
 );

 CREATE TABLE Blerjet(
	ID_Blerjet int primary key identity(1,1),
	ID_Produkti int foreign key references Produkti(ID_Produkti),
	Sasia int not null,
	Cmimi int not null,
	ID_Kompania int foreign key references Kompania(ID_Kompania)
 );
 ALTER TABLE Blerjet
 ADD Data date not null;

 drop table Blerjet;
 CREATE TABLE  Blerjet_Prodhuesi(
	ID_Prodhuesi int  foreign key references Prodhuesi(ID_Prodhuesi),
	ID_Blerjet int  foreign key references Blerjet(ID_Blerjet),
	Constraint pk_blerjet_prodhuesi primary key(ID_Prodhuesi,ID_Blerjet)
 );
  drop table Blerjet_Prodhuesi;
CREATE TABLE Klienti(
	ID_Klienti int  primary key identity(1,1),
	Emri varchar(50) not null,
	Mbiemri varchar(50) not null,
	Ditelindja date not null,
	Gjinija char(1) not null,
	Shteti varchar(50) not null,
	Qyteti varchar(50) not null,
	Rruga varchar(50) not null,
	Kodi_Postar int not null,
);

CREATE TABLE Kontakti_Klienti(
	ID_Kontakti_Klienti int primary key identity(1,1),
	Tel nvarchar(30) not null,
	Email varchar(30) not null,
	ID_Klienti int foreign key references Klienti(ID_Klienti)
 );
 drop table Kontakti_Klienti;
 drop table Klienti;
 drop table Faktura;
 drop table Shitje;
 drop table Bonuset;
 CREATE TABLE Bonuset(
	ID_Klienti int primary key foreign key references Klienti(ID_Klienti),
	Piket int not null
 );

CREATE TABLE Faktura(
	ID_Faktura int primary key identity(1,1),
	Cmimi_Total int not null,
	ID_Kompania  int foreign key references Kompania(ID_Kompania),
	ID_Klienti int foreign key references Klienti(ID_Klienti)
);


CREATE TABLE Shitje(
	ID_Shitje int primary key identity(1,1),
	ID_Produkti  int foreign key references Produkti(ID_Produkti),
	Sasia int not  null,
	ID_Faktura  int foreign key references Faktura(ID_Faktura),
	ID_Klienti int foreign key references Klienti(ID_Klienti)
);
drop table Shitje;
