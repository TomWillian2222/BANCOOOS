package sistema_banco.bancodocurso.Repository;

    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.data.jpa.repository.Query;
    import org.springframework.data.repository.query.Param;
    import org.springframework.stereotype.Repository;
    import sistema_banco.bancodocurso.Model.M_banco;

@Repository
public interface R_banco extends JpaRepository<M_banco, Long> {
        @Query(value = "SELECT * FROM pessoa WHERE cpf = :nome and senha = :senha limit 1", nativeQuery = true)
        M_banco findByUsuarioESenha(@Param("nome") Long usuario, @Param("senha") String senha);
    }

