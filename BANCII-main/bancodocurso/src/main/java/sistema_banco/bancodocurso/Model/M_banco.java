package sistema_banco.bancodocurso.Model;

import jakarta.persistence.*;

@Entity
@Table(name="cadastro")
public class M_banco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int CPF;
    private int RG;
    private int numero_celular;
    private String email;
    private int CEP;
    private String cidade;
    private String estado;
    private String senha;
    private String confirmar_senha;
    private int data_nacimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getNumero_celular() {
        return numero_celular;
    }

    public void setNumero_celular(int numero_celular) {
        this.numero_celular = numero_celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmar_senha() {
        return confirmar_senha;
    }

    public void setConfirmar_senha(String confirmar_senha) {
        this.confirmar_senha = confirmar_senha;
    }

    public int getData_nacimento() {
        return data_nacimento;
    }

    public void setData_nacimento(int data_nacimento) {
        this.data_nacimento = data_nacimento;
    }
}
