--Primero se deben borrar todas las tablas (de detalle a maestro) y lugo anyadirlas (de maestro a detalle)
--(en este caso en cada una de las aplicaciones (tkrun y descuento) se usa solo una tabla, por lo que no hace falta)

--Para giis.demo.tkrun:
drop table Paquete;
CREATE TABLE IF NOT EXISTS "Paquete" (
	"idPaquete"	INTEGER,
	"Peso" INTEGER,
	"Precio" INTEGER,
	PRIMARY KEY("idPaquete" AUTOINCREMENT)
);

drop table Repartidor;
CREATE TABLE IF NOT EXISTS "Repartidor" (
	"idRepartidor"	INTEGER,
	"Nombre" TEXT,
	PRIMARY KEY("idRepartidor" AUTOINCREMENT)
);


DROP TABLE Cliente;
CREATE TABLE IF NOT EXISTS "Cliente" (
	"idCliente" INTEGER,
	"Nombre" TEXT,
	"Direccion" TEXT,
	"Ciudad" TEXT,
	"Provincia" TEXT,
	PRIMARY KEY("IdCliente" AUTOINCREMENT)
);

DROP TABLE Almacen;
CREATE TABLE IF NOT EXISTS "Almacen" (
	"idAlmacen" INTEGER,
	"Nombre" TEXT,
	"Direccion" TEXT,
	"Ciudad" TEXT,
	"Provincia" TEXT,
	PRIMARY KEY("IdAlmacen" AUTOINCREMENT)
);

DROP TABLE Entrega;
CREATE TABLE IF NOT EXISTS "Entrega" (
	"idRepartidor" INTEGER,
	"idCliente" INTEGER,
	"idPaquete" INTEGER,
	"nEntregas" INTEGER,
	"Entregado" BOOLEAN,
	"Aceptado" BOOLEAN,
	FOREIGN KEY("idRepartidor") REFERENCES "Repartidor"("idRepartidor"),
	FOREIGN KEY("idCliente") REFERENCES "Cliente"("idCliente"),
	FOREIGN KEY("idPaquete") REFERENCES "Paquete"("idPaquete")
);

DROP TABLE "Deposita";
CREATE TABLE IF NOT EXISTS "Deposita" (
	"idPaquete" INTEGER,
	"idRepartidor" INTEGER,
	"idAlmacen" INTEGER,
	"Depositado" BOOLEAN,
	FOREIGN KEY("idPaquete") REFERENCES "Paquete"("idPaquete"),
	FOREIGN KEY("idRepartidor") REFERENCES "Repartidor"("idRepartidor"),
	FOREIGN KEY("idAlmacen") REFERENCES "Almacen"("idAlmacen")
);

DROP TABLE "Recoge";
CREATE TABLE IF NOT EXISTS "Recoge" (
	"idCliente" INTEGER,
	"idAlmacen" INTEGER,
	"idPaquete" INTEGER,
	"Recogido" BOOLEAN,
	FOREIGN KEY("idCliente") REFERENCES "Cliente"("idCliente"),
	FOREIGN KEY("idPaquete") REFERENCES "Paquete"("idPaquete"),
	FOREIGN KEY("idAlmacen") REFERENCES "Almacen"("idAlmacen")
);