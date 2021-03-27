import org.junit.Test;

public class EmpregadoTeste {

    @Test
    public void testEmpregado(){
        Empregado empregado1 = new Empregado("empregado 1","mike",10000);
        Empregado empregado2 = new Empregado("empregado 2","jake",13000);

        System.out.println("Salario mensaual de " + empregado1.getNome() + " :" + empregado1.getSalarioMensual());
        System.out.println("Salario mensaual de " +  empregado2.getNome() + " :" + empregado2.getSalarioMensual());

        empregado1.setSalarioMensual(empregado1.getSalarioMensual() * 1.1);
        empregado2.setSalarioMensual(empregado2.getSalarioMensual() * 1.1);

        System.out.println("Salario anual de " + empregado1.getNome() + " :" + (empregado1.getSalarioMensual() * 12 ));
        System.out.println("Salario anual de " + empregado2.getNome() + " :" + (empregado2.getSalarioMensual() * 12 ));

        System.out.println("Han pasado " + Empregado.contadorEmpregado + " empleados por la empresa");


    }
}
