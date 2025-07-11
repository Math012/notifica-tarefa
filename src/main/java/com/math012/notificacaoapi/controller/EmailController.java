package com.math012.notificacaoapi.controller;


import com.math012.notificacaoapi.business.EmailService;
import com.math012.notificacaoapi.business.dto.ComunicacaoInDTO;
import com.math012.notificacaoapi.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/email")
@RequiredArgsConstructor
@RestController
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefasDTO tarefasDTO){
        emailService.enviaEmail(tarefasDTO);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/mensagem")
    public ResponseEntity<Void> enviarMensagem(@RequestBody ComunicacaoInDTO comunicacaoInDTO){
        emailService.enviaEmailMensagem(comunicacaoInDTO);
        return ResponseEntity.ok().build();
    }
}
