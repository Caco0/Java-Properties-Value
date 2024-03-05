package dio.rafael.springpropertiesvalue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagens implements CommandLineRunner{
    
    @Value("${nome: Rafão do Caminhão!}")
    private String nome;
    @Value("${amail: Noreply@mail.com}")
    private String email ;
    @Value("${telefone: SAC 0800-989898}")
    private List<Long> telefones = new ArrayList<>(Arrays.asList(new Long[]{11974096150L})) ;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome + "\n Email: "+ email + "\n  Telefones para contato: " + telefones);
        System.out.println("Seu cadastro foi aprovado");
    }
}
