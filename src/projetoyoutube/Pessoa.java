package projetoyoutube;

public abstract class Pessoa {
    protected String nome, sexo;
    protected int idade;
    protected float experiencia;

    public Pessoa(String nome, String sexo, int idade){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    protected void ganharExp(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa" + '\n' +
                "nome: " + nome + '\n' +
                "sexo: " + sexo + '\n' +
                "idade: " + idade + '\n' +
                "experiencia: " + experiencia + '\n';
    }
}
