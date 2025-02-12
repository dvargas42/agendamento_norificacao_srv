package com.dvargas42.agendamento_notificacao_srv.controller.dto.out;

import com.dvargas42.agendamento_notificacao_srv.infrastructure.enums.StatusNoficacaoEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record AgendamentoOutRecord(
        Long id,
        String emailDestinatario,
        String telefoneDestinatario,
        String mensagem,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime dataHoraEnvio,
        StatusNoficacaoEnum statusNotificacao) {
}
