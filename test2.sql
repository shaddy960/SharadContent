--------------------------------------------------------
--  DDL for Table ADDRESS
--------------------------------------------------------

  CREATE TABLE "ADDRESS" 
   (	"APPLICANTID" NUMBER(19,0), 
	"CURRENT_AREA" VARCHAR2(15 CHAR), 
	"CURRENT_CITY" VARCHAR2(15 CHAR), 
	"CURRENT_COUNTRY" VARCHAR2(15 CHAR), 
	"CURRENT_HOUSE_NUMBER" VARCHAR2(6 CHAR), 
	"CURRENT_LANDMARK" VARCHAR2(15 CHAR), 
	"CURRENT_PINCODE" VARCHAR2(6 CHAR), 
	"CURRENT_STATE" VARCHAR2(15 CHAR), 
	"CURRENT_STREET_NAME" VARCHAR2(15 CHAR), 
	"PERMANENT_AREA" VARCHAR2(15 CHAR), 
	"PERMANENT_CITY" VARCHAR2(15 CHAR), 
	"PERMANENT_COUNTRY" VARCHAR2(15 CHAR), 
	"PERMANENT_HOUSE_NUMBER" VARCHAR2(6 CHAR), 
	"PERMANENT_LANDMARK" VARCHAR2(15 CHAR), 
	"PERMANENT_PINCODE" VARCHAR2(6 CHAR), 
	"PERMANENT_STATE" VARCHAR2(15 CHAR), 
	"PERMANENT_STREET_NAME" VARCHAR2(15 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C008363
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C008363" ON "ADDRESS" ("APPLICANTID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table ADDRESS
--------------------------------------------------------

  ALTER TABLE "ADDRESS" ADD PRIMARY KEY ("APPLICANTID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "ADDRESS" MODIFY ("PERMANENT_STREET_NAME" NOT NULL ENABLE);
  ALTER TABLE "ADDRESS" MODIFY ("PERMANENT_STATE" NOT NULL ENABLE);
  ALTER TABLE "ADDRESS" MODIFY ("PERMANENT_PINCODE" NOT NULL ENABLE);
  ALTER TABLE "ADDRESS" MODIFY ("PERMANENT_HOUSE_NUMBER" NOT NULL ENABLE);
  ALTER TABLE "ADDRESS" MODIFY ("PERMANENT_COUNTRY" NOT NULL ENABLE);
  ALTER TABLE "ADDRESS" MODIFY ("PERMANENT_CITY" NOT NULL ENABLE);
  ALTER TABLE "ADDRESS" MODIFY ("PERMANENT_AREA" NOT NULL ENABLE);
  ALTER TABLE "ADDRESS" MODIFY ("CURRENT_STREET_NAME" NOT NULL ENABLE);
  ALTER TABLE "ADDRESS" MODIFY ("CURRENT_STATE" NOT NULL ENABLE);
  ALTER TABLE "ADDRESS" MODIFY ("CURRENT_PINCODE" NOT NULL ENABLE);
  ALTER TABLE "ADDRESS" MODIFY ("CURRENT_HOUSE_NUMBER" NOT NULL ENABLE);
  ALTER TABLE "ADDRESS" MODIFY ("CURRENT_COUNTRY" NOT NULL ENABLE);
  ALTER TABLE "ADDRESS" MODIFY ("CURRENT_CITY" NOT NULL ENABLE);
  ALTER TABLE "ADDRESS" MODIFY ("CURRENT_AREA" NOT NULL ENABLE);
  ALTER TABLE "ADDRESS" MODIFY ("APPLICANTID" NOT NULL ENABLE);
--------------------------------------------------------
--  DDL for Table CUSTOMERS
--------------------------------------------------------

  CREATE TABLE "CUSTOMERS" 
   (	"UCI" NUMBER(16), 
	"AADHAR_NUMBER" VARCHAR2(12 CHAR), 
	"ALTERNATE_MOBILE_NUMBER" VARCHAR2(10 CHAR), 
	"APPLICANT_ID" NUMBER(19,0), 
	"DOB" DATE, 
	"EMAIL_ID" VARCHAR2(35 CHAR), 
	"FATHER_NAME" VARCHAR2(40 CHAR), 
	"FIRST_NAME" VARCHAR2(20 CHAR), 
	"GENDER" VARCHAR2(20 CHAR), 
	"LAST_NAME" VARCHAR2(20 CHAR), 
	"LOGIN_COUNT" NUMBER(10,0), 
	"MOBILE_NUMBER" VARCHAR2(10 CHAR), 
	"MOTHER_NAME" VARCHAR2(40 CHAR), 
	"PAN_NUMBER" VARCHAR2(10 CHAR), 
	"PASSWORD" VARCHAR2(15 CHAR), 
	"USER_ID" VARCHAR2(15 CHAR), 
	"ADDRESS_APPLICANTID" NUMBER(19,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C008382
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C008382" ON "CUSTOMERS" ("UCI") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table CUSTOMERS
--------------------------------------------------------

  ALTER TABLE "CUSTOMERS" ADD PRIMARY KEY ("UCI")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "CUSTOMERS" MODIFY ("USER_ID" NOT NULL ENABLE);
  ALTER TABLE "CUSTOMERS" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "CUSTOMERS" MODIFY ("PAN_NUMBER" NOT NULL ENABLE);
  ALTER TABLE "CUSTOMERS" MODIFY ("MOTHER_NAME" NOT NULL ENABLE);
  ALTER TABLE "CUSTOMERS" MODIFY ("MOBILE_NUMBER" NOT NULL ENABLE);
  ALTER TABLE "CUSTOMERS" MODIFY ("GENDER" NOT NULL ENABLE);
  ALTER TABLE "CUSTOMERS" MODIFY ("FIRST_NAME" NOT NULL ENABLE);
  ALTER TABLE "CUSTOMERS" MODIFY ("FATHER_NAME" NOT NULL ENABLE);
  ALTER TABLE "CUSTOMERS" MODIFY ("EMAIL_ID" NOT NULL ENABLE);
  ALTER TABLE "CUSTOMERS" MODIFY ("DOB" NOT NULL ENABLE);
  ALTER TABLE "CUSTOMERS" MODIFY ("APPLICANT_ID" NOT NULL ENABLE);
  ALTER TABLE "CUSTOMERS" MODIFY ("ALTERNATE_MOBILE_NUMBER" NOT NULL ENABLE);
  ALTER TABLE "CUSTOMERS" MODIFY ("AADHAR_NUMBER" NOT NULL ENABLE);
  ALTER TABLE "CUSTOMERS" MODIFY ("UCI" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table CUSTOMERS
--------------------------------------------------------

  ALTER TABLE "CUSTOMERS" ADD CONSTRAINT "FKFF2R2AOU1G8FAQQTBPBL1ILRL" FOREIGN KEY ("ADDRESS_APPLICANTID")
	  REFERENCES "ADDRESS" ("APPLICANTID") ENABLE;
--------------------------------------------------------
--  DDL for Table ACCOUNT
--------------------------------------------------------

  CREATE TABLE "ACCOUNT" 
   (	"ACCOUNT_NUMBER" NUMBER(11), 
	"ACC_CREATION_DATE" DATE, 
	"ACC_STATUS" VARCHAR2(7 CHAR), 
	"ACCOUNT_TYPE" VARCHAR2(7 CHAR), 
	"BALANCE" NUMBER(19,2), 
	"MATURITY_AMT" NUMBER(19,2), 
	"OPEN_BALANCE" NUMBER(19,2), 
	"TENURE" FLOAT(126), 
	"TRANSAC_PASS" VARCHAR2(15 CHAR), 
	"UCI" NUMBER(19,2)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C008342
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C008342" ON "ACCOUNT" ("ACCOUNT_NUMBER") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table ACCOUNT
--------------------------------------------------------

  ALTER TABLE "ACCOUNT" ADD PRIMARY KEY ("ACCOUNT_NUMBER")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "ACCOUNT" MODIFY ("UCI" NOT NULL ENABLE);
  ALTER TABLE "ACCOUNT" MODIFY ("TRANSAC_PASS" NOT NULL ENABLE);
  ALTER TABLE "ACCOUNT" MODIFY ("OPEN_BALANCE" NOT NULL ENABLE);
  ALTER TABLE "ACCOUNT" MODIFY ("BALANCE" NOT NULL ENABLE);
  ALTER TABLE "ACCOUNT" MODIFY ("ACCOUNT_TYPE" NOT NULL ENABLE);
  ALTER TABLE "ACCOUNT" MODIFY ("ACC_STATUS" NOT NULL ENABLE);
  ALTER TABLE "ACCOUNT" MODIFY ("ACC_CREATION_DATE" NOT NULL ENABLE);
  ALTER TABLE "ACCOUNT" MODIFY ("ACCOUNT_NUMBER" NOT NULL ENABLE);
--------------------------------------------------------
--  DDL for Table ACCOUNT_HOLDING_BEAN
--------------------------------------------------------

  CREATE TABLE "ACCOUNT_HOLDINGS" 
   (	"AHID" NUMBER(19,0), 
	"TYPE" VARCHAR2(255 CHAR), 
	"ACCOUNT_ACCOUNT_NUMBER" NUMBER(19,2), 
	"CUSTOMER_UCI" NUMBER(19,2)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C008344
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C008344" ON "ACCOUNT_HOLDINGS" ("AHID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table ACCOUNT_HOLDING_BEAN
--------------------------------------------------------

  ALTER TABLE "ACCOUNT_HOLDINGS" ADD PRIMARY KEY ("AHID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "ACCOUNT_HOLDINGS" MODIFY ("AHID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table ACCOUNT_HOLDING_BEAN
--------------------------------------------------------

  ALTER TABLE "ACCOUNT_HOLDINGS" ADD CONSTRAINT "FKKPYJY82N14ETNCT92M8B7V7R2" FOREIGN KEY ("ACCOUNT_ACCOUNT_NUMBER")
	  REFERENCES "ACCOUNT" ("ACCOUNT_NUMBER") ENABLE;
  ALTER TABLE "ACCOUNT_HOLDINGS" ADD CONSTRAINT "FKM4H1MA21GLDI6725K4V2HCXE" FOREIGN KEY ("CUSTOMER_UCI")
	  REFERENCES "CUSTOMERS" ("UCI") ENABLE;
--------------------------------------------------------
--  DDL for Table TRANSACTION
--------------------------------------------------------

  CREATE TABLE "TRANSACTION" 
   (	"TRANS_ID" NUMBER(10,0), 
	"REFERENCE_ID" VARCHAR2(20 CHAR), 
	"AMOUNT" NUMBER(19,2), 
	"TRANS_DATE_TIME" TIMESTAMP (6), 
	"TRANS_DESC" VARCHAR2(40 CHAR), 
	"TRANS_MODE" VARCHAR2(20 CHAR), 
	"TRANS_TYPE" VARCHAR2(20 CHAR), 
	"TRXBALANCE" NUMBER(19,2), 
	"ACCOUNT_ACCOUNT_NUMBER" NUMBER(11)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C008397
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C008397" ON "TRANSACTION" ("TRANS_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table TRANSACTION
--------------------------------------------------------

  ALTER TABLE "TRANSACTION" ADD PRIMARY KEY ("TRANS_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "TRANSACTION" MODIFY ("TRANS_TYPE" NOT NULL ENABLE);
  ALTER TABLE "TRANSACTION" MODIFY ("TRANS_MODE" NOT NULL ENABLE);
  ALTER TABLE "TRANSACTION" MODIFY ("TRANS_DESC" NOT NULL ENABLE);
  ALTER TABLE "TRANSACTION" MODIFY ("TRANS_DATE_TIME" NOT NULL ENABLE);
  ALTER TABLE "TRANSACTION" MODIFY ("AMOUNT" NOT NULL ENABLE);
  ALTER TABLE "TRANSACTION" MODIFY ("TRANS_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table TRANSACTION
--------------------------------------------------------

  ALTER TABLE "TRANSACTION" ADD CONSTRAINT "FKOK7YRSB4GC77E3K1FDJCJ267I" FOREIGN KEY ("ACCOUNT_ACCOUNT_NUMBER")
	  REFERENCES "ACCOUNT" ("ACCOUNT_NUMBER") ENABLE;
--------------------------------------------------------
--  DDL for Table TRANSACTION_EXTENDED
--------------------------------------------------------

  CREATE TABLE "TRANSACTION_EXTENDED" 
   (	"PRICE_PER_UNIT" FLOAT(126), 
	"UNITS" FLOAT(126), 
	"TRANS_ID" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C008399
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C008399" ON "TRANSACTION_EXTENDED" ("TRANS_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table TRANSACTION_EXTENDED
--------------------------------------------------------

  ALTER TABLE "TRANSACTION_EXTENDED" ADD PRIMARY KEY ("TRANS_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "TRANSACTION_EXTENDED" MODIFY ("TRANS_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table TRANSACTION_EXTENDED
--------------------------------------------------------

  ALTER TABLE "TRANSACTION_EXTENDED" ADD CONSTRAINT "FKJ4WSB3X54L5MXSQ7RDAN98XI9" FOREIGN KEY ("TRANS_ID")
	  REFERENCES "TRANSACTION" ("TRANS_ID") ENABLE;
--------------------------------------------------------
--  DDL for Table ACCOUNT_TRANSACTION
--------------------------------------------------------

  CREATE TABLE "ACCOUNT_TRANSACTION" 
   (	"ACCOUNTBEAN_ACCOUNT_NUMBER" NUMBER(11), 
	"TRANSACTION_TRANS_ID" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C008347
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C008347" ON "ACCOUNT_TRANSACTION" ("ACCOUNTBEAN_ACCOUNT_NUMBER", "TRANSACTION_TRANS_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index UK_GMU76MKIH0AV4WTXP180CN4ML
--------------------------------------------------------

  CREATE UNIQUE INDEX "UK_GMU76MKIH0AV4WTXP180CN4ML" ON "ACCOUNT_TRANSACTION" ("TRANSACTION_TRANS_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table ACCOUNT_TRANSACTION
--------------------------------------------------------

  ALTER TABLE "ACCOUNT_TRANSACTION" ADD CONSTRAINT "UK_GMU76MKIH0AV4WTXP180CN4ML" UNIQUE ("TRANSACTION_TRANS_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "ACCOUNT_TRANSACTION" ADD PRIMARY KEY ("ACCOUNTBEAN_ACCOUNT_NUMBER", "TRANSACTION_TRANS_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "ACCOUNT_TRANSACTION" MODIFY ("TRANSACTION_TRANS_ID" NOT NULL ENABLE);
  ALTER TABLE "ACCOUNT_TRANSACTION" MODIFY ("ACCOUNTBEAN_ACCOUNT_NUMBER" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table ACCOUNT_TRANSACTION
--------------------------------------------------------

  ALTER TABLE "ACCOUNT_TRANSACTION" ADD CONSTRAINT "FK3O9RK3PJ5OFMLOCXJRDGVA1CJ" FOREIGN KEY ("TRANSACTION_TRANS_ID")
	  REFERENCES "TRANSACTION" ("TRANS_ID") ENABLE;
  ALTER TABLE "ACCOUNT_TRANSACTION" ADD CONSTRAINT "FKQIVXH0JXQJBER948P8KHVXQEB" FOREIGN KEY ("ACCOUNTBEAN_ACCOUNT_NUMBER")
	  REFERENCES "ACCOUNT" ("ACCOUNT_NUMBER") ENABLE;

--------------------------------------------------------
--  DDL for Table BANK_MUTUAL_FUND
--------------------------------------------------------

  CREATE TABLE "BANK_MUTUAL_FUND" 
   (	"MF_PLAN_ID" NUMBER(10,0), 
	"DIR_STATUS" NUMBER(1,0), 
	"EXPIRY_DATE" DATE, 
	"LAUNCH_DATE" DATE, 
	"MIN_AMT_DIR" FLOAT(126), 
	"MIN_AMT_SIP" FLOAT(126), 
	"NAV" FLOAT(126), 
	"SIP_STATUS" NUMBER(1,0), 
	"TITLE" VARCHAR2(255 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C008365
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C008365" ON "BANK_MUTUAL_FUND" ("MF_PLAN_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table BANK_MUTUAL_FUND
--------------------------------------------------------

  ALTER TABLE "BANK_MUTUAL_FUND" ADD PRIMARY KEY ("MF_PLAN_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BANK_MUTUAL_FUND" MODIFY ("MF_PLAN_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  DDL for Table INVESTMENTS
--------------------------------------------------------

  CREATE TABLE "INVESTMENTS" 
   (	"UCI" NUMBER(16), 
	"GOLD_UNITS" FLOAT(126), 
	"SILVER_UNITS" FLOAT(126), 
	"ACCOUNT_ACCOUNT_NUMBER" NUMBER(19,2)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C008386
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C008386" ON "INVESTMENTS" ("UCI") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table INVESTMENTS
--------------------------------------------------------

  ALTER TABLE "INVESTMENTS" ADD PRIMARY KEY ("UCI")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "INVESTMENTS" MODIFY ("UCI" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table INVESTMENTS
--------------------------------------------------------

  ALTER TABLE "INVESTMENTS" ADD CONSTRAINT "FKIDWGYA2TQAHQF0CKY2JHCKY3E" FOREIGN KEY ("UCI")
	  REFERENCES "CUSTOMERS" ("UCI") ENABLE;
  ALTER TABLE "INVESTMENTS" ADD CONSTRAINT "FKJ37VHJEPOBX6IUA0NKGP4TGLR" FOREIGN KEY ("ACCOUNT_ACCOUNT_NUMBER")
	  REFERENCES "ACCOUNT" ("ACCOUNT_NUMBER") ENABLE;
--------------------------------------------------------
--  DDL for Table MUTUAL_FUND
--------------------------------------------------------

  CREATE TABLE "MUTUAL_FUND" 
   (	"FOLIO_NUMBER" NUMBER(10,0), 
	"BUY_DATE" DATE, 
	"CLOSING_DATE" DATE, 
	"DURATION" NUMBER(10,0), 
	"FREQUENCY" VARCHAR2(255 CHAR), 
	"INSTALLMENTS" NUMBER(10,0), 
	"MF_AMOUNT" FLOAT(126), 
	"MF_UNITS" FLOAT(126), 
	"NEXT_INSTALL_DATE" DATE, 
	"OPENING_DATE" DATE, 
	"MF_STATUS" NUMBER(1,0), 
	"MF_TYPE" VARCHAR2(255 CHAR), 
	"BANKMUTUALFUND_MF_PLAN_ID" NUMBER(10,0), 
	"INV_UCI" NUMBER(11)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C008388
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C008388" ON "MUTUAL_FUND" ("FOLIO_NUMBER") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table MUTUAL_FUND
--------------------------------------------------------

  ALTER TABLE "MUTUAL_FUND" ADD PRIMARY KEY ("FOLIO_NUMBER")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "MUTUAL_FUND" MODIFY ("FOLIO_NUMBER" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table MUTUAL_FUND
--------------------------------------------------------

  ALTER TABLE "MUTUAL_FUND" ADD CONSTRAINT "FK2RMK4FQ0Q370NOPEF149191QR" FOREIGN KEY ("BANKMUTUALFUND_MF_PLAN_ID")
	  REFERENCES "BANK_MUTUAL_FUND" ("MF_PLAN_ID") ENABLE;
  ALTER TABLE "MUTUAL_FUND" ADD CONSTRAINT "FKAOIJG61DIJ5LOUF1UHDOI3U9S" FOREIGN KEY ("INV_UCI")
	  REFERENCES "INVESTMENTS" ("UCI") ENABLE;
--------------------------------------------------------
--  DDL for Table SILVER_PRICE
--------------------------------------------------------

  CREATE TABLE "SILVER_PRICE" 
   (	"UPDATE_DATE" DATE, 
	"SILVER_PRICE" FLOAT(126)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C008390
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C008390" ON "SILVER_PRICE" ("UPDATE_DATE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table SILVER_PRICE
--------------------------------------------------------

  ALTER TABLE "SILVER_PRICE" ADD PRIMARY KEY ("UPDATE_DATE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SILVER_PRICE" MODIFY ("UPDATE_DATE" NOT NULL ENABLE);
  --------------------------------------------------------
--  DDL for Table GOLD_PRICE
--------------------------------------------------------

  CREATE TABLE "GOLD_PRICE" 
   (	"UPDATE_DATE" DATE, 
	"GOLD_PRICE" FLOAT(126)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C008384
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C008384" ON "GOLD_PRICE" ("UPDATE_DATE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table GOLD_PRICE
--------------------------------------------------------

  ALTER TABLE "GOLD_PRICE" ADD PRIMARY KEY ("UPDATE_DATE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "GOLD_PRICE" MODIFY ("UPDATE_DATE" NOT NULL ENABLE);
--------------------------------------------------------
--  DDL for Table BANKER
--------------------------------------------------------

  CREATE TABLE "BANKER" 
   (	"BANKER_ID" NUMBER(10,0), 
	"DESIGNATION" NUMBER(10,0), 
	"PASSWORD" VARCHAR2(255 CHAR), 
	"USER_ID" VARCHAR2(255 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C008367
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C008367" ON "BANKER" ("BANKER_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table BANKER
--------------------------------------------------------

  ALTER TABLE "BANKER" ADD PRIMARY KEY ("BANKER_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BANKER" MODIFY ("BANKER_ID" NOT NULL ENABLE);

