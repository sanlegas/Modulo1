import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FaturaTeste {

    @Test
    public void getTotalPositive(){
        Factura factura = new Factura("123","Descripcion de factura",5,100);
        assertEquals(factura.getTotalFactura(),500,0);

    }

    @Test
    public void getTotalNegative(){
        Factura factura = new Factura("123","Descripcion de factura negativa",5,-400);
        assertEquals(factura.getTotalFactura(),0,0);

    }
}
