package Models;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Meta {
    private int id;
    private int idUsuario;
    private String descricao;
    private double valor;
    private Date dataConclusaoEstimada;
    private Date dataConclusao;
    private int status;
    private Date createdAt;
    private Date updatedAt;

    // Construtores
    public Meta() {}

    public Meta(int id, int idUsuario, String descricao, double valor, Date dataConclusaoEstimada, Date dataConclusao, int status, Date createdAt, Date updatedAt) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.descricao = descricao;
        this.valor = valor;
        this.dataConclusaoEstimada = dataConclusaoEstimada;
        this.dataConclusao = dataConclusao;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Meta(int idUsuario, String descricao, double valor, String dataConclusaoEstimada, String dataConclusao, int status) {
        this.idUsuario = idUsuario;
        this.descricao = descricao;
        this.valor = valor;
        // Converte as Strings em Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dataConclusaoEstimada = sdf.parse(dataConclusaoEstimada);
            this.dataConclusao = sdf.parse(dataConclusao);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.status = status;
        this.createdAt = new Date();
        this.updatedAt = null;
    }

    
    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataConclusaoEstimada() {
        return dataConclusaoEstimada;
    }

    public void setDataConclusaoEstimada(Date dataConclusaoEstimada) {
        this.dataConclusaoEstimada = dataConclusaoEstimada;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    //
}