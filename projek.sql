--------------------------------------------------------
--  File created - Jumat-Juli-03-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table FILM_07074
--------------------------------------------------------

  CREATE TABLE "AZRUL7_07074"."FILM_07074" 
   (	"KODE_FILM" VARCHAR2(20 BYTE), 
	"NAMA_FILM" VARCHAR2(20 BYTE), 
	"GENRE" VARCHAR2(20 BYTE), 
	"RATING" VARCHAR2(10 BYTE), 
	"HARGA" NUMBER(20,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN" ;
--------------------------------------------------------
--  DDL for Table JADWAL_07074
--------------------------------------------------------

  CREATE TABLE "AZRUL7_07074"."JADWAL_07074" 
   (	"KODE_TAYANG" VARCHAR2(20 BYTE), 
	"JAM_TAYANG" VARCHAR2(20 BYTE), 
	"RUANG" VARCHAR2(10 BYTE), 
	"TANGGAL_TAYANG" DATE, 
	"KODE_FILM" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN" ;
--------------------------------------------------------
--  DDL for Table PEMBELI_07074
--------------------------------------------------------

  CREATE TABLE "AZRUL7_07074"."PEMBELI_07074" 
   (	"ID" NUMBER(*,0), 
	"PASSWORD" VARCHAR2(20 BYTE), 
	"ID_REG" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN" ;
--------------------------------------------------------
--  DDL for Table REGISTER_07074
--------------------------------------------------------

  CREATE TABLE "AZRUL7_07074"."REGISTER_07074" 
   (	"ID_REG" NUMBER(*,0), 
	"NAMA" VARCHAR2(20 BYTE), 
	"ALAMAT" VARCHAR2(100 BYTE), 
	"NO_TELP" NUMBER(*,0), 
	"ID" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN" ;
--------------------------------------------------------
--  DDL for Table SET_07074
--------------------------------------------------------

  CREATE TABLE "AZRUL7_07074"."SET_07074" 
   (	"KODE_TIKET" NUMBER(*,0), 
	"KODE_TAYANG" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN" ;
--------------------------------------------------------
--  DDL for Table TIKET_07074
--------------------------------------------------------

  CREATE TABLE "AZRUL7_07074"."TIKET_07074" 
   (	"KODE_TIKET" NUMBER(*,0), 
	"BANGKU" VARCHAR2(20 BYTE), 
	"JUMLAH" NUMBER(20,0), 
	"TOTAL" NUMBER(20,0), 
	"ID" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN" ;
REM INSERTING into AZRUL7_07074.FILM_07074
SET DEFINE OFF;
Insert into AZRUL7_07074.FILM_07074 (KODE_FILM,NAMA_FILM,GENRE,RATING,HARGA) values ('null','loli','ROMANCE','y','1500');
Insert into AZRUL7_07074.FILM_07074 (KODE_FILM,NAMA_FILM,GENRE,RATING,HARGA) values ('A01','doraemon','komedi','g','50000');
Insert into AZRUL7_07074.FILM_07074 (KODE_FILM,NAMA_FILM,GENRE,RATING,HARGA) values ('A02','sinchan','sci-fi','g','5');
Insert into AZRUL7_07074.FILM_07074 (KODE_FILM,NAMA_FILM,GENRE,RATING,HARGA) values ('A03','hamtaro','animasi','g','30000');
Insert into AZRUL7_07074.FILM_07074 (KODE_FILM,NAMA_FILM,GENRE,RATING,HARGA) values ('A04','TheNun','horror','pg','45000');
Insert into AZRUL7_07074.FILM_07074 (KODE_FILM,NAMA_FILM,GENRE,RATING,HARGA) values ('A05','alita','action','r','27000');
REM INSERTING into AZRUL7_07074.JADWAL_07074
SET DEFINE OFF;
Insert into AZRUL7_07074.JADWAL_07074 (KODE_TAYANG,JAM_TAYANG,RUANG,TANGGAL_TAYANG,KODE_FILM) values ('#Z11','10.00','A',to_date('01-02-2001','DD-MM-RRRR'),'A01');
Insert into AZRUL7_07074.JADWAL_07074 (KODE_TAYANG,JAM_TAYANG,RUANG,TANGGAL_TAYANG,KODE_FILM) values ('#Z22','11.00','B',to_date('02-03-2003','DD-MM-RRRR'),'A02');
Insert into AZRUL7_07074.JADWAL_07074 (KODE_TAYANG,JAM_TAYANG,RUANG,TANGGAL_TAYANG,KODE_FILM) values ('#Z33','12.00','C',to_date('11-12-2003','DD-MM-RRRR'),'A03');
Insert into AZRUL7_07074.JADWAL_07074 (KODE_TAYANG,JAM_TAYANG,RUANG,TANGGAL_TAYANG,KODE_FILM) values ('#Z44','13.30','D',to_date('12-01-2004','DD-MM-RRRR'),'A04');
Insert into AZRUL7_07074.JADWAL_07074 (KODE_TAYANG,JAM_TAYANG,RUANG,TANGGAL_TAYANG,KODE_FILM) values ('#Z55','14.30','E',to_date('15-04-2005','DD-MM-RRRR'),'A05');
REM INSERTING into AZRUL7_07074.PEMBELI_07074
SET DEFINE OFF;
Insert into AZRUL7_07074.PEMBELI_07074 (ID,PASSWORD,ID_REG) values ('1','pluto','1');
Insert into AZRUL7_07074.PEMBELI_07074 (ID,PASSWORD,ID_REG) values ('2','uranus','2');
Insert into AZRUL7_07074.PEMBELI_07074 (ID,PASSWORD,ID_REG) values ('3','neptunus','3');
Insert into AZRUL7_07074.PEMBELI_07074 (ID,PASSWORD,ID_REG) values ('4','merkurius','4');
Insert into AZRUL7_07074.PEMBELI_07074 (ID,PASSWORD,ID_REG) values ('5','venus','5');
REM INSERTING into AZRUL7_07074.REGISTER_07074
SET DEFINE OFF;
Insert into AZRUL7_07074.REGISTER_07074 (ID_REG,NAMA,ALAMAT,NO_TELP,ID) values ('1','elannor','antaris','1122334455','1');
Insert into AZRUL7_07074.REGISTER_07074 (ID_REG,NAMA,ALAMAT,NO_TELP,ID) values ('2','eva','carano','1223344551','2');
Insert into AZRUL7_07074.REGISTER_07074 (ID_REG,NAMA,ALAMAT,NO_TELP,ID) values ('3','toro','jungle','2233445511','3');
Insert into AZRUL7_07074.REGISTER_07074 (ID_REG,NAMA,ALAMAT,NO_TELP,ID) values ('4','crest','ocean','2334455112','4');
Insert into AZRUL7_07074.REGISTER_07074 (ID_REG,NAMA,ALAMAT,NO_TELP,ID) values ('5','violet','norman','3344551122','5');
Insert into AZRUL7_07074.REGISTER_07074 (ID_REG,NAMA,ALAMAT,NO_TELP,ID) values ('6','roui','sky','4455112233','6');
REM INSERTING into AZRUL7_07074.SET_07074
SET DEFINE OFF;
Insert into AZRUL7_07074.SET_07074 (KODE_TIKET,KODE_TAYANG) values ('111','#Z11');
Insert into AZRUL7_07074.SET_07074 (KODE_TIKET,KODE_TAYANG) values ('222','#Z22');
Insert into AZRUL7_07074.SET_07074 (KODE_TIKET,KODE_TAYANG) values ('333','#Z33');
Insert into AZRUL7_07074.SET_07074 (KODE_TIKET,KODE_TAYANG) values ('444','#Z44');
Insert into AZRUL7_07074.SET_07074 (KODE_TIKET,KODE_TAYANG) values ('555','#Z55');
REM INSERTING into AZRUL7_07074.TIKET_07074
SET DEFINE OFF;
Insert into AZRUL7_07074.TIKET_07074 (KODE_TIKET,BANGKU,JUMLAH,TOTAL,ID) values ('111','A','2','25000','1');
Insert into AZRUL7_07074.TIKET_07074 (KODE_TIKET,BANGKU,JUMLAH,TOTAL,ID) values ('222','B','3','35000','2');
Insert into AZRUL7_07074.TIKET_07074 (KODE_TIKET,BANGKU,JUMLAH,TOTAL,ID) values ('333','C','5','55000','3');
Insert into AZRUL7_07074.TIKET_07074 (KODE_TIKET,BANGKU,JUMLAH,TOTAL,ID) values ('444','D','6','75000','4');
Insert into AZRUL7_07074.TIKET_07074 (KODE_TIKET,BANGKU,JUMLAH,TOTAL,ID) values ('555','E','9','95000','5');
--------------------------------------------------------
--  DDL for Index PK_FILM
--------------------------------------------------------

  CREATE UNIQUE INDEX "AZRUL7_07074"."PK_FILM" ON "AZRUL7_07074"."FILM_07074" ("KODE_FILM") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN" ;
--------------------------------------------------------
--  DDL for Index PK_JADWAL
--------------------------------------------------------

  CREATE UNIQUE INDEX "AZRUL7_07074"."PK_JADWAL" ON "AZRUL7_07074"."JADWAL_07074" ("KODE_TAYANG") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN" ;
--------------------------------------------------------
--  DDL for Index PK_PEMBELI
--------------------------------------------------------

  CREATE UNIQUE INDEX "AZRUL7_07074"."PK_PEMBELI" ON "AZRUL7_07074"."PEMBELI_07074" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN" ;
--------------------------------------------------------
--  DDL for Index PK_REGISTER
--------------------------------------------------------

  CREATE UNIQUE INDEX "AZRUL7_07074"."PK_REGISTER" ON "AZRUL7_07074"."REGISTER_07074" ("ID_REG") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN" ;
--------------------------------------------------------
--  DDL for Index PK_TIKET
--------------------------------------------------------

  CREATE UNIQUE INDEX "AZRUL7_07074"."PK_TIKET" ON "AZRUL7_07074"."TIKET_07074" ("KODE_TIKET") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN" ;
--------------------------------------------------------
--  DDL for Index SYS_C007247
--------------------------------------------------------

  CREATE UNIQUE INDEX "AZRUL7_07074"."SYS_C007247" ON "AZRUL7_07074"."TIKET_07074" ("BANGKU") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN" ;
--------------------------------------------------------
--  Constraints for Table FILM_07074
--------------------------------------------------------

  ALTER TABLE "AZRUL7_07074"."FILM_07074" ADD CONSTRAINT "PK_FILM" PRIMARY KEY ("KODE_FILM")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN"  ENABLE;
  ALTER TABLE "AZRUL7_07074"."FILM_07074" MODIFY ("KODE_FILM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table JADWAL_07074
--------------------------------------------------------

  ALTER TABLE "AZRUL7_07074"."JADWAL_07074" ADD CONSTRAINT "PK_JADWAL" PRIMARY KEY ("KODE_TAYANG")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN"  ENABLE;
  ALTER TABLE "AZRUL7_07074"."JADWAL_07074" MODIFY ("KODE_TAYANG" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PEMBELI_07074
--------------------------------------------------------

  ALTER TABLE "AZRUL7_07074"."PEMBELI_07074" ADD CONSTRAINT "PK_PEMBELI" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN"  ENABLE;
  ALTER TABLE "AZRUL7_07074"."PEMBELI_07074" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table REGISTER_07074
--------------------------------------------------------

  ALTER TABLE "AZRUL7_07074"."REGISTER_07074" ADD CONSTRAINT "PK_REGISTER" PRIMARY KEY ("ID_REG")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN"  ENABLE;
  ALTER TABLE "AZRUL7_07074"."REGISTER_07074" MODIFY ("ID_REG" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TIKET_07074
--------------------------------------------------------

  ALTER TABLE "AZRUL7_07074"."TIKET_07074" ADD UNIQUE ("BANGKU")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN"  ENABLE;
  ALTER TABLE "AZRUL7_07074"."TIKET_07074" ADD CONSTRAINT "PK_TIKET" PRIMARY KEY ("KODE_TIKET")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LAPORAN"  ENABLE;
  ALTER TABLE "AZRUL7_07074"."TIKET_07074" MODIFY ("KODE_TIKET" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table JADWAL_07074
--------------------------------------------------------

  ALTER TABLE "AZRUL7_07074"."JADWAL_07074" ADD CONSTRAINT "FK_KODE_FILM" FOREIGN KEY ("KODE_FILM")
	  REFERENCES "AZRUL7_07074"."FILM_07074" ("KODE_FILM") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PEMBELI_07074
--------------------------------------------------------

  ALTER TABLE "AZRUL7_07074"."PEMBELI_07074" ADD CONSTRAINT "FK_ID_REG" FOREIGN KEY ("ID_REG")
	  REFERENCES "AZRUL7_07074"."REGISTER_07074" ("ID_REG") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table SET_07074
--------------------------------------------------------

  ALTER TABLE "AZRUL7_07074"."SET_07074" ADD CONSTRAINT "FK_KODE_TAYANG" FOREIGN KEY ("KODE_TAYANG")
	  REFERENCES "AZRUL7_07074"."JADWAL_07074" ("KODE_TAYANG") ENABLE;
  ALTER TABLE "AZRUL7_07074"."SET_07074" ADD CONSTRAINT "FK_KODE_TIKET" FOREIGN KEY ("KODE_TIKET")
	  REFERENCES "AZRUL7_07074"."TIKET_07074" ("KODE_TIKET") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TIKET_07074
--------------------------------------------------------

  ALTER TABLE "AZRUL7_07074"."TIKET_07074" ADD CONSTRAINT "FK_ID" FOREIGN KEY ("ID")
	  REFERENCES "AZRUL7_07074"."PEMBELI_07074" ("ID") ENABLE;