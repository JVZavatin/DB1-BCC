package MODEL;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author André Schwerz
 */
public class Prova {/*

    private int id;
    private String gp;
    private Circuito circuito;
    private Date data;
    private Time duracao;
    private int numVoltas;
    private int extensao;

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    public String getDataMySQL() {
        DateFormat dateFormat = DateFormat.getDateInstance();
        String temp = dateFormat.format(this.data);

        String day = temp.substring(0, 2);
        String month = temp.substring(3, 5);
        String year = temp.substring(6, 10);
        return year + '/' + month + '/' + day;
    }

    public String getStrData() {
        DateFormat dateFormat = DateFormat.getDateInstance();
        String temp = dateFormat.format(this.data);

        String day = temp.substring(0, 2);
        String month = temp.substring(3, 5);
        String year = temp.substring(6, 10);
        return day + '/' + month + '/' + year;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setData(String data) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        this.data = (Date) format.parse(data);
    }

    public void setDataMySQL(String data) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        this.data = (Date) format.parse(data);
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }

    public void setDuracao(String duracao) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        format.setLenient(false);
        format.parse(duracao);
        this.duracao = Time.valueOf(duracao);
    }

    public int getExtensao() {
        return extensao;
    }

    public void setExtensao(int extensao) {
        this.extensao = extensao;
    }

    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp = gp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumVoltas() {
        return numVoltas;
    }

    public void setNumVoltas(int numVoltas) {
        this.numVoltas = numVoltas;
    }

*/
}
