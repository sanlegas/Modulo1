import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InteiroSetTest {

    @Test
    public void conjuntoVacio(){
        InteiroSet  inteiroSet = new InteiroSet();
        assertEquals(inteiroSet.toSetString(),"-");
    }

    @Test
    public void insertElement(){
        InteiroSet  inteiroSet = new InteiroSet();
        inteiroSet.insertElement(50);
        inteiroSet.insertElement(100);
        inteiroSet.insertElement(0);
        inteiroSet.insertElement(200);
        assertEquals(inteiroSet.toSetString(),"0 50 100 ");

    }

    @Test
    public void union(){
        InteiroSet  inteiroSet = new InteiroSet();
        inteiroSet.insertElement(50);
        inteiroSet.insertElement(100);
        inteiroSet.insertElement(0);

        InteiroSet  inteiroSet2 = new InteiroSet();
        inteiroSet2.insertElement(1);
        inteiroSet2.insertElement(10);

        InteiroSet inteiroUnion = inteiroSet.union(inteiroSet2);
        assertEquals(inteiroUnion.toSetString(),"0 1 10 50 100 ");

    }

    @Test
    public void intersection(){
        InteiroSet  inteiroSet = new InteiroSet();
        inteiroSet.insertElement(50);
        inteiroSet.insertElement(100);
        inteiroSet.insertElement(0);

        InteiroSet  inteiroSet2 = new InteiroSet();
        inteiroSet2.insertElement(1);
        inteiroSet2.insertElement(10);

        InteiroSet inteiroUnion = inteiroSet.interseccion(inteiroSet2);
        assertEquals(inteiroUnion.toSetString(),"-");

    }

    @Test
    public void ehIgualTo(){
        InteiroSet  inteiroSet = new InteiroSet();
        inteiroSet.insertElement(50);
        inteiroSet.insertElement(100);
        inteiroSet.insertElement(0);

        InteiroSet  inteiroSet2 = new InteiroSet();
        inteiroSet2.insertElement(50);
        inteiroSet2.insertElement(100);
        inteiroSet2.insertElement(0);

        assertEquals(true,inteiroSet.ehIgualTo(inteiroSet2));
    }

    @Test
    public void deleteElement(){
        InteiroSet  inteiroSet = new InteiroSet();
        inteiroSet.insertElement(0);
        inteiroSet.insertElement(100);
        inteiroSet.deleteElement(0);
        inteiroSet.deleteElement(100);
        assertEquals(inteiroSet.toSetString(),"-");

    }
}
