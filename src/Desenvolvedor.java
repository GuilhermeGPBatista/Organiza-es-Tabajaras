public class Desenvolvedor extends Funcionario{
    protected int salario;
    public Desenvolvedor(String nome, int salario) {
        super(nome);
        this.salario=salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public String descreverResponsabilidades() {
        return this.nome+" Desenvolvee as aplicações";
    }
}
