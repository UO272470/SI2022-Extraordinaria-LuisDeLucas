--Datos para carga inicial de la base de datos
delete from "Almacen";
INSERT INTO "Almacen" ("idAlmacen" , "Nombre", "Direccion", "Ciudad", "Provincia") VALUES 
	(1, "Oviedo", "C/Prueba1", "Oviedo", "Asturias"),
	(2, "Gijon", "C/Prueba2", "Gijon", "Asturias"),
	(3, "Madrid", "C/Prueba3", "Madrid", "Madrid");
	
DELETE FROM "Cliente";
INSERT INTO "Cliente" ("idCliente", "Nombre", "Direccion", "Ciudad", "Provincia") VALUES
	(1, "Pedro Gonzalez", "C/clienteprueba 1", "Noreña", "Asturias");
	
DELETE FROM "Paquete";
INSERT INTO "Paquete" ("idPaquete", "Peso", "Precio") VALUES
	(1, 5, 25),
	(2, 2, 15),
	(3, 1, 4);
	
DELETE FROM "Entrega";
INSERT INTO "Entrega" ("idRepartidor","idCliente","idPaquete","nEntregas","Entregado","Aceptado") VALUES
	(1, 1, 1,0, FALSE, TRUE),
	(1, 1, 3, 0, FALSE, TRUE);
	
DELETE FROM "Deposita";
INSERT INTO "Deposita" ("idPaquete", "idRepartidor", "idAlmacen", "Depositado") VALUES
	(2, 1, 1, FALSE);
	
DELETE FROM "Recoge";
INSERT INTO "Recoge" ("idCliente", "idAlmacen", "idPaquete", "Recogido") VALUES
	(1, 1, 2, FALSE);