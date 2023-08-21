public abstract class Pessoa implements IProcesso{
    private String nomeCompleto;
    private String email;
    private String telefone;
    private String endereco;
    private int formacao;
    private int experiencia;
    private int pontuacaoTotal;
    private String titulacao;


    public Pessoa(String nomeCompleto, String email, String telefone, String endereco, int formacao, int experiencia){
        this.setNomeCompleto(nomeCompleto);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
        this.setFormacao(formacao);
        this.setExperiencia(experiencia);
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getFormacao() {
        return formacao;
    }
    public void setFormacao(int formacao) {
        this.formacao = formacao;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public int getPontuacaoTotal() {
        return pontuacaoTotal;
    }

    public void setPontuacaoTotal(int pontuacaoTotal) {
        this.pontuacaoTotal = pontuacaoTotal;
    } 
    
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public abstract void pontuacao();

    
}