DROP TRIGGER TG_RELATORIO_COMPRAS;
DROP TRIGGER TG_RELATORIO_VENDAS;

ALTER TABLE RELATORIO ADD COLUMN ID_TRANS BIGINT;

DELIMITER |
CREATE TRIGGER TG_RELATORIO_VENDAS AFTER INSERT
ON VENDAS
FOR EACH ROW
BEGIN
INSERT INTO RELATORIO (ID_TRANS, TIPO, VLR, DATA) VALUES (NEW.ID, 'V', NEW.VLR_TOTAL, NEW.DATA_VENDA);
END;
|
DELIMITER;

DELIMITER |
CREATE TRIGGER TG_RELATORIO_COMPRAS AFTER INSERT
ON COMPRAS
FOR EACH ROW
BEGIN
INSERT INTO RELATORIO (ID_TRANS, TIPO, VLR, DATA) VALUES (NEW.ID, 'C', NEW.VLR_TOTAL, NEW.DATA_COMPRA);
END;
|
DELIMITER;