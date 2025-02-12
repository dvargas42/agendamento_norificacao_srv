package com.dvargas42.agendamento_notificacao_srv.controller.dto.in;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record AgendamentoInRecord(
        String emailDestinatario,
        String telefoneDestinatario,
        String mensagem,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime dataHoraEnvio) {
}
