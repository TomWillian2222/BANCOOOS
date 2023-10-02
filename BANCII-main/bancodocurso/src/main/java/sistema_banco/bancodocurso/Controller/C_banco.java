package sistema_banco.bancodocurso.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sistema_banco.bancodocurso.Model.M_banco;
import sistema_banco.bancodocurso.Service.S_banco;

@Controller
public class C_banco {
    @GetMapping("/")
    public String helloWorld(){
        return "Cadastro";
    }

    @PostMapping("/")
    public String postLogin(@RequestParam("nome") String nome,
                            @RequestParam("data_nascimento") int data_nascimetno,
                            @RequestParam("CPF") int CPF,
                            @RequestParam("RG") int RG,
                            @RequestParam("numero_celular")  int numero_celular,
                            @RequestParam("email") String email,
                            @RequestParam("CEP") int CEP,
                            @RequestParam("cidade") String cidade,
                            @RequestParam("estado")  String estado,
                            @RequestParam("senha") String senha,
                            @RequestParam("confirmar_senha") String confirmar_senha,
                            HttpSession session,
                            RedirectAttributes redirectAttributes){
                            M_banco banco = S_banco.getPessoaLogin(nome,senha);
                            session.setAttribute("nome", nome);
        if(session.getAttribute("nome") == null){
            return "Login/login";
        }else{
            redirectAttributes.addFlashAttribute("nome",banco.getNome());
            return "Cadastro/cadastro";
        }
    }
}

