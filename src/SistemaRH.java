
public class SistemaRH {
    public static void main(String[] args) {
       Gerente gerente = new Gerente("Lucas",1200);
       Desenvolvedor desenvolvedor = new Desenvolvedor("João",3000);

        System.out.println(gerente.descreverResponsabilidades());
        System.out.println(gerente.calcularSalario());
        System.out.println("-----------------------------------------------------");
        System.out.println(desenvolvedor.descreverResponsabilidades());
        System.out.println(desenvolvedor.calcularSalario());
    }
}