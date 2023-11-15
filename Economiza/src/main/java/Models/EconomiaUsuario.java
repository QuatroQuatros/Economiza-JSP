package Models;

import java.util.Date;

public class EconomiaUsuario {
	private int id;
	private int idUsuario;
	private Date mes;
	private double valor;
	private Date createdAt;
	private Date updatedAt;

	// Construtores
	public EconomiaUsuario() {
	}

	public EconomiaUsuario(int id, int idUsuario, Date mes, double valor, Date createdAt, Date updatedAt) {
		this.id = id;
		this.idUsuario = idUsuario;
		this.mes = mes;
		this.valor = valor;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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

	public Date getMes() {
		return mes;
	}

	public void setMes(Date mes) {
		this.mes = mes;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
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
}
