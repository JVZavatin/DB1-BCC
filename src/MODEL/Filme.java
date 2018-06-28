package MODEL;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author André Schwerz
 */
public class Filme {
    // Nome, Produtora_idNomeProdutora, Diretor_NomeDiretor, Ano

    //SimpleDateFormat formatter = new SimpleDateFormat("YYYY/MM/dd");
    //private int id;
    private String nome;
    private Produtora  produtora;
    private Diretor diretor;
    private int ano;
    //private Date dataNasc; Em data

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produtora getProdutora() {
        return produtora;
    }

    public void setProdutora(Produtora produtora) {
        this.produtora = produtora;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
   
}
