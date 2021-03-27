import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Projeto1Test {


    //PRUEBA DE CREACIÓN DE OBJETOS DE CARRO, PROPIETARIO, ENERECO Y MARCA
    @Test
    public void instanciaObjetos(){
       Endereco endereco = new Endereco("16 de septiembre","Linda vista","Oaxaca de Juares","Oaxaca","71600","");
       Propietario  propietario = new Propietario("Isaac","1234--","SALI93XX",endereco);
       Marca marca = new Marca("BMW",4,2020,"CBZ1P0");

       Carro carro = new Carro(propietario,marca);
       System.out.println(carro);
    }
}
