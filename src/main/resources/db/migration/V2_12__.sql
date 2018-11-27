DELIMITER |
CREATE TRIGGER TG_BAIXA_ESTOQUE AFTER INSERT
ON ITEM_VENDA
FOR EACH ROW
BEGIN
UPDATE COMPRAS SET QTDE = QTDE - NEW.QTDE WHERE NEW.ID_CARRO;
END;
|
DELIMITER;

DELIMITER |
CREATE TRIGGER TG_RETORNA_ESTOQUE AFTER DELETE
ON ITEM_VENDA
FOR EACH ROW
BEGIN
UPDATE COMPRAS SET QTDE = QTDE + OLD.QTDE WHERE OLD.ID_CARRO;
END;
|
DELIMITER;