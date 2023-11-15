package Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {
	private int id;
    private String nome;
    private String email;
    private String senha;
    private Date dataNascimento;
    private String foto;
    private String cpf;
    private Date createdAt;
    private Date updatedAt;
    
	public Usuario(int id, String nome, String email, String senha, Date dataNascimento, String foto, String cpf) {
      this.id = id;
      this.nome = nome;
      this.email = email;
      this.senha = senha;
      this.setDataNascimento(dataNascimento);
      this.foto = foto;
      this.cpf = cpf;
  }
    
	public Usuario(String nome, String email, String senha, Date dataNascimento, String foto, String cpf) {
      this.nome = nome;
      this.email = email;
      this.senha = senha;
      this.setDataNascimento(dataNascimento);
      this.foto = foto;
      this.cpf = cpf;
  }

    public Usuario(String nome, String email, String senha, String dataNascimento, String foto, String cpf) {
//        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        try {
        	this.dataNascimento = new SimpleDateFormat("yyyy-MM-dd").parse(dataNascimento);
			//this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
        this.foto = foto;
        this.cpf = cpf;
    }

    // Getters e Setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
    public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	@Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", foto='" + foto + '\'' +
                ", cpf='" + cpf + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}