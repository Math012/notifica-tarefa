package com.math012.notificacaoapi.business.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.math012.notificacaoapi.business.enums.ModoEnvioEnum;
import com.math012.notificacaoapi.business.enums.StatusEnvioEnum;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ComunicacaoInDTO implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime dataHoraEnvio;
    private String nomeDestinatario;
    private String emailDestinatario;
    private String telefoneDestinatario;
    private String mensagem;
    private String nomeRemetente;
    private ModoEnvioEnum modoDeEnvio;
    @JsonIgnore
    private StatusEnvioEnum statusEnvio;

}
