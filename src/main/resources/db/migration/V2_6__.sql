ALTER TABLE VENDAS ADD COLUMN DATA_VENDA DATE;

CREATE TABLE IF NOT EXISTS RELATORIO (
  ID                  INTEGER auto_increment,
  TIPO                VARCHAR (1),
  VLR                 NUMERIC (15,2),
  DATA_COMPRA         DATE,
  PRIMARY KEY(ID)
);

DELIMITER |
CREATE TRIGGER TG_RELATORIO_COMPRAS AFTER INSERT
ON COMPRAS
FOR EACH ROW
BEGIN
INSERT INTO RELATORIO (TIPO, VLR, DATA_COMPRA) VALUES ('C', NEW.VLR_TOTAL, NEW.DATA_COMPRA);
END;
|
DELIMITER;

DELIMITER |
CREATE TRIGGER TG_RELATORIO_VENDAS AFTER INSERT
ON VENDAS
FOR EACH ROW
BEGIN
INSERT INTO RELATORIO (TIPO, VLR, DATA_COMPRA) VALUES ('V', NEW.VLR_TOTAL, NEW.DATA_VENDA);
END;
|
DELIMITER;