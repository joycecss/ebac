package br.com.salvina.produtor;

import br.com.salvina.servico.ServicoEnvioMensagemKafka;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class ProdutorController {

    private ServicoEnvioMensagemKafka servico;

    @PostMapping
    public void enviarMensagem(@RequestBody String mensagem){
        servico.enviarMensagem(mensagem);
    }
}
