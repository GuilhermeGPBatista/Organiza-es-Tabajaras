public class Gerente extends Funcionario{
    protected int salario;
    public Gerente(String nome, int salario) {
        super(nome);
        this.salario=salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public String descreverResponsabilidades() {
        return this.nome+" Gerencia a equipe";
    }
}
