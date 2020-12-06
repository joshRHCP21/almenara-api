INSERT INTO role(name) values("ROLE_ADMIN")
INSERT INTO role(name) values("ROLE_USER")

insert into user(username,password,name,last_name,status) values("andony","$2a$10$V4PPljRqDQCNVay7jYxmx.xtwV6IxR1bQbkuItyIAKSpcy1b1y2Ce","Aimar Andony", "Berrocal Coaquira", 1)

insert into user_roles values(1,1)
insert into user_roles values(1,2)

insert into city(name) values("AREQUIPA")
insert into city(name) values("CAJAMARCA")
insert into city(name) values("LA LIBERTAD")
insert into city(name) values("LAMBAYEQUE")
insert into city(name) values("JUNIN")
insert into city(name) values("LIMA")
insert into city(name) values("PASCO")
insert into city(name) values("PIURA")

insert into school(name,short_name,status) VALUES("Universidad Catolica de Santa Maria","UCSM",1)
insert into school(name,short_name,status) VALUES("Universidad Nacional de Cajamarca","UNC",1)
insert into school(name,short_name,status) VALUES("Universidad Nacional de Trujillo","UNT",1)
insert into school(name,short_name,status) VALUES("Universidad Nacional Pedro Ruiz Gallo","UNPRG",1)
insert into school(name,short_name,status) VALUES("Universidad Privada de Huancayo Franklin Roosevelt","UPHFR",1)
insert into school(name,short_name,status) VALUES("Universidad Nacional Mayor de San Marcos","UNMSM",1)
insert into school(name,short_name,status) VALUES("Universidad Ricardo Palma","URP",1)
insert into school(name,short_name,status) VALUES("Universidad Nacional Daniel Alcides Carrion","UNDAC",1)
insert into school(name,short_name,status) VALUES("Universidad de Piura","UP",1)
insert into school(name,short_name,status) VALUES("Universidad de San Martín de Porres","USMP",1)
insert into school(name,short_name,status) VALUES("Universidad Peruana Cayetano Heredia","UPCH",1)
insert into school(name,short_name,status) VALUES("Universidad Nacional Federico Villarreal","UNFV",1)

insert into school_agreement(city_id,school_id,subscribed,expiration) values(1,1,'2019-03-22','2020-12-06')
insert into school_agreement(city_id,school_id,subscribed,expiration) values(2,2,'2020-01-24','2021-01-08')
insert into school_agreement(city_id,school_id,subscribed,expiration) values(3,3,'2017-07-19','2020-08-23')
insert into school_agreement(city_id,school_id,subscribed,expiration) values(4,4,'2020-02-13','2022-11-20')
insert into school_agreement(city_id,school_id,subscribed,expiration) values(5,5,'2019-07-02','2020-11-07')
insert into school_agreement(city_id,school_id,subscribed,expiration) values(6,6,'2019-04-19','2021-12-21')
insert into school_agreement(city_id,school_id,subscribed,expiration) values(6,7,'2022-07-19','2022-01-30')
insert into school_agreement(city_id,school_id,subscribed,expiration) values(7,8,'2020-02-11','2022-04-04')
insert into school_agreement(city_id,school_id,subscribed,expiration) values(8,9,'2020-04-20','2022-12-21')
insert into school_agreement(city_id,school_id,subscribed,expiration) values(6,10,'2020-04-20','2022-12-21')
insert into school_agreement(city_id,school_id,subscribed,expiration) values(6,11,'2020-04-20','2022-12-21')
insert into school_agreement(city_id,school_id,subscribed,expiration) values(6,12,'2020-04-20','2022-12-21')

insert into specialty(name) values("Medicina de Emergencias y Desastres")
insert into specialty(name) values("Medicina de Enfermedades Infecciosas y Tropicales")
insert into specialty(name) values("Radiología")
insert into specialty(name) values("Anatomía Patológica")
insert into specialty(name) values("Anestesiología")
insert into specialty(name) values("Patología Clínica")
insert into specialty(name) values("Ginecología y Obstetricia")
insert into specialty(name) values("Urología")
insert into specialty(name) values("Medicina Interna")
insert into specialty(name) values("Medicina Oncológica")
insert into specialty(name) values("Psiquiatría")
insert into specialty(name) values("Gastroenterología")
insert into specialty(name) values("Cirugía General")
insert into specialty(name) values("Cardiología")
insert into specialty(name) values("Medicina Intensiva")
insert into specialty(name) values("Medicina Emergencia")
insert into specialty(name) values("Neumología")
insert into specialty(name) values("Otorrinología")

insert into plaza(name) values("Libre")
insert into plaza(name) values("Cautiva Essalud")

insert into campus(name) values("HNGAI")

insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("70441638","Max Felix","Alarcon","Urbina",10,1,1,1,"1991-07-07","Av. Oscar R. Benavides 351 Block 11 B Dpto 2 Lima Cercado","80447","max.alarcon.urbina@gmail.com","932881461",1,"01")
insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("46187517","Angel Andreé","Altamirano","Beltran",11,2,1,1,"1990-01-25","Av. Simón Bolivar 2150 Edif. 21 Dpto 101","67574","andree.altamirano2150@gmail.com","943800008",1,"01")
insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("43958363","Alfredo Ernesto","Alvarado","Cueva",12,3,1,1,null,null,"67574","ELDBRD1@GMAIL.COM","978971508",1,"01")
insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("46690856","Lourdes Patricia","Alvarez","Sanchez",10,4,1,1,"1991-04-26","Calle Mariano Necochea 251 Maranga","74243","lu.alvarezs@gmail.com","969016470",1,"01")
insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("46655623","Rómulo Henry","Alvarez","Zuñiga",10,5,1,1,"1990-07-25","Jr. Cangallo 123","79656","rhalvarez257@gmail.com","957508703",1,"01")
insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("73249484","Daniella","Arenas","Siles",6,6,1,1,"1993-02-22","Calle Carlos Arrieta 253 Dpto 102 Barranco","80312","darenassiles@gmail.com","923401939",1,"01")
insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("40693834","Ronnie Josseph","Arizaca","Paca",6,7,2,1,"1980-11-12","Jr. Manuel Candamo 751 Lince","48419","ronnie_ap@hotmail.com","987547476",1,"01")
insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("74120529","Freddy Eduardo","Arone","Huachaca",10,8,1,1,"1994-01-20","Av. Imperial 320 Santa Anita","80906","freduardo94@hotmail.com","953300081",1,"01")
insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("73597198","Jecsmael Cesar","Baez","Herrera",6,9,1,1,"1994-12-30","Jr. Pimentel Jimenez 2117","80202","jcbh_1995@hotmail.com","958421808",1,"01")
insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("43814570","Daniel Junior","Barragan","Rivas",10,9,1,1,"1986-10-27","Av. Exequiel Gonzalez  Cáceda 488 Chepén","74735","dannybr9@hotmail.com","950273343",1,"01")
insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("42378973","Paul Gerald","Barrantes","Garcia",12,10,1,1,"1983-02-06","Ca. Conde Juan Moore 558 Urb. Los Robles Santa Anita","66360","paulbarrantesgar@gmail.com","954809732",1,"01")
insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("46827523","Jessica Mercedes","Barreto","Castillo",6,11,1,1,"1991-02-03","Urb. Los Jardines de San Juan Mz C Lote 54 San Juan de Lurigancho","77491","bcjessica3@gmail.com","963354917",1,"01")
insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("71435566","Jackeline Amparo","Barrientos","Perez",6,12,1,1,"1992-08-13","Jr. Huiracocha 1416 Int. 808 Jesús María","78067","jackeline_jk27@hotmail.com","940158059",1,"01")
insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("73700513","Angela Daniela","Basurco","Valer",12,13,1,1,"1993-05-04","Av. Arenales 1686 Dpto 202 Lince","77840","ange_x04@hotmail.com","958310722",1,"01")
insert into doctor(document,name,paternal_surname,maternal_surname,school_agreement_id,specialty_id,plaza_id,campus_id,birth_date,address,cmp,email,phone,status,num_group) values("43967147","Ana De los Angeles","Bedoya","Cardenas",12,14,1,1,"1986-12-30","Jr. Huiracocha 1844 Jesús María","72668","anybc_@hotmail.com","947437303",1,"01")