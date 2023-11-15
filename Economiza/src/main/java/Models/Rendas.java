package Models;

import java.sql.Date;
import java.sql.Timestamp;

public class Rendas {
    private int id;
    private int id_usuario;
    private int id_tipo_renda;
    private int id_recorrencia;
    private float valor;
    private String descricao;
    private Date data_recebimento;
    private Timestamp created_at;
    private Timestamp updated_at;

    public Rendas() {
        // Construtor vazio
    }

    // Getters e Setters para todos os campos

    // Construtor com os campos relevantes
    public Rendas(int id_usuario, int id_tipo_renda, int id_recorrencia, float valor, String descricao, Date data_recebimento) {
        this.id_usuario = id_usuario;
        this.id_tipo_renda = id_tipo_renda;
        this.id_recorrencia = id_recorrencia;
        this.valor = valor;
        this.descricao = descricao;
        this.data_recebimento = data_recebimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_tipo_renda() {
        return id_tipo_renda;
    }

    public void setId_tipo_renda(int id_tipo_renda) {
        this.id_tipo_renda = id_tipo_renda;
    }

    public int getId_recorrencia() {
        return id_recorrencia;
    }

    public void setId_recorrencia(int id_recorrencia) {
        this.id_recorrencia = id_recorrencia;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_recebimento() {
        return data_recebimento;
    }

    public void setData_recebimento(Date data_recebimento) {
        this.data_recebimento = data_recebimento;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Rendas{" +
                "id=" + id +
                ", id_usuario=" + id_usuario +
                ", id_tipo_renda=" + id_tipo_renda +
                ", id_recorrencia=" + id_recorrencia +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", data_recebimento=" + data_recebimento +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
