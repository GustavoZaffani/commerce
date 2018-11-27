DELIMITER |
CREATE TRIGGER TG_RELATORIO_COMPRAS_DELETE AFTER DELETE
ON COMPRAS
FOR EACH ROW
BEGIN
DELETE FROM RELATORIO WHERE ID_TRANS = OLD.ID;
END;
|
DELIMITER;

DELIMITER |
CREATE TRIGGER TG_RELATORIO_VENDAS_DELETE AFTER DELETE
ON VENDAS
FOR EACH ROW
BEGIN
DELETE FROM RELATORIO WHERE ID_TRANS = OLD.ID;
END;
|
DELIMITER;