package sistema_banco.bancodocurso.Service;

import org.springframework.stereotype.Service;
import sistema_banco.bancodocurso.Model.M_banco;
import sistema_banco.bancodocurso.Repository.R_banco;

@Service
public class S_banco {

        private static R_banco r_banco;

        public S_banco(R_banco r_pessoa){
            this.r_banco = r_pessoa;
        }

        public static M_banco getPessoaLogin(String nome, String senha){
            nome = NumberCleaner.cleanNumber(nome);
            if(nome.equals("")){
                return r_banco.findByUsuarioESenha(null,senha);
            }else{
                return r_banco.findByUsuarioESenha(Long.valueOf(nome),senha);
            }
        }



}
