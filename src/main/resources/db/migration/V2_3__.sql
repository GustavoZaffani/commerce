ALTER TABLE VENDAS CHANGE VENDEDOR ID_VENDEDOR INTEGER;
ALTER TABLE VENDAS CHANGE CLIENTE ID_CLIENTE INTEGER;
ALTER TABLE PESSOA CHANGE RG RG VARCHAR(20);
ALTER TABLE PESSOA CHANGE CPF_CNPJ CPF_CNPJ VARCHAR(20);
ALTER TABLE PESSOA CHANGE CEP CEP VARCHAR (15);
ALTER TABLE PESSOA CHANGE TEL_CEL TEL_CEL VARCHAR(20);
ALTER TABLE PESSOA CHANGE TEL_RES TEL_RES VARCHAR(20);
ALTER TABLE PESSOA CHANGE IE IE VARCHAR(20);
ALTER TABLE COMPRAS DROP COLUMN ORIGEM;