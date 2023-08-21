

public class Professor extends Pessoa{
    private int habilitacao;
    private int nota1; 
    private int nota2; 
    private int nota3;

    public Professor(String nomeCompleto, String email, String telefone, String endereco, int formacao, int habilitacao,  int experiencia, int nota1, int nota2,  int nota3){
        super(nomeCompleto, email, telefone, endereco, formacao, experiencia);
        this.setNota1(nota1);
        this.setNota2(nota2);
        this.setNota3(nota3);
        this.setHabilitacao(habilitacao);
        this.pontuacao();
    }
    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(int habilitacao) {
        this.habilitacao = habilitacao;
    }

   @Override
   public void pontuacao() {
       switch(this.getFormacao()){
        case 1:{
            this.setPontuacaoTotal(getPontuacaoTotal() + 8);
            this.setTitulacao("Curso na Área - Carga horária min 180h");
            break;
        }
        case 2: {
            this.setPontuacaoTotal(getPontuacaoTotal() + 10);
            this.setTitulacao("Curso na Área - Carga horária min 360h");
            break;
        }

        case 3: {
            this.setPontuacaoTotal(getPontuacaoTotal() + 15);
            this.setTitulacao("Mestrado");
            break;
        }

        case 4: {
            this.setPontuacaoTotal(getPontuacaoTotal() + 20);
            this.setTitulacao("Doutorado");
            break;
        }
        case 5: {
            this.setPontuacaoTotal(getPontuacaoTotal() + 0);
            this.setTitulacao("Bacharelado");
            break;
        }
       }

       if(this.getHabilitacao() == 1){
        this.setPontuacaoTotal(getPontuacaoTotal() + 10);
       }

       if(this.getExperiencia() <= 5){
            this.setPontuacaoTotal(this.getPontuacaoTotal() + (this.getExperiencia() * 2));
       }
       else{
            this.setPontuacaoTotal(this.getPontuacaoTotal() + 10);
       }
       this.setPontuacaoTotal(this.getPontuacaoTotal() + ((int) (nota1 + nota2 + nota3) / 3));
   }

}
