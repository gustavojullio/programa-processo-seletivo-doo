public class Tae extends Pessoa{

    public Tae(String nomeCompleto, String email, String telefone, String endereco, int formacao, int experiencia){
        super(nomeCompleto, email, telefone, endereco, formacao, experiencia);
        this.pontuacao();
        
    }

    @Override
    public void pontuacao() {
        switch(this.getFormacao()){
            case 1: {
                this.setPontuacaoTotal(this.getPontuacaoTotal() + 3);
                this.setTitulacao("Ensino Médio");
                break;
            }
            case 2: {
                this.setPontuacaoTotal(this.getPontuacaoTotal() + 5);
                this.setTitulacao("Curso Superior - Área de Atuação");
                break;
            }

            case 3: {
                this.setPontuacaoTotal(this.getPontuacaoTotal() + 8);
                this.setTitulacao("Curso na Área - Carga horária min 180h");
                break;
            }

            case 4: {
                this.setPontuacaoTotal(this.getPontuacaoTotal() + 10);
                this.setTitulacao("Curso na Área - Carga horária min 360h");
                break;
            }

            case 5: {
                this.setPontuacaoTotal(this.getPontuacaoTotal() + 15);
                this.setTitulacao("Mestrado");
                break;
            }

            case 6: {
                this.setPontuacaoTotal(this.getPontuacaoTotal() + 20);
                this.setTitulacao("Doutorado");
                break;
            }
        }
        
        this.setPontuacaoTotal(getPontuacaoTotal() + this.getExperiencia());
    }
    
}
