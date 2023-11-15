package Models;

import java.sql.Timestamp;

public class TipoDespesa {
    private int id;
    private String descricao;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    
    public TipoDespesa(String descricao) {
        this.descricao = descricao;
        this.createdAt = null;
        this.updatedAt = null;
    }

    public TipoDespesa(int id, String descricao, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.descricao = descricao;
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
        return "TipoDespesa{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
