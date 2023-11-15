package Models;

import java.sql.Timestamp;

public class Recorrencia {
    private int id;
    private String descricao;
    private double juros;
    private Timestamp createdAt;
	private Timestamp updatedAt;
	
    public Recorrencia(String descricao, double juros) {
        this.descricao = descricao;
        this.juros = juros;
        this.createdAt = null;
        this.updatedAt = null;
    }

    public Recorrencia(int id, String descricao, double juros, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.descricao = descricao;
        this.juros = juros;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public double getJuros() {
		return juros;
	}



	public void setJuros(double juros) {
		this.juros = juros;
	}



	public Timestamp getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}



	public Timestamp getUpdatedAt() {
		return updatedAt;
	}



	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}



    @Override
    public String toString() {
        return "Recorrencia{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", juros=" + juros +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
