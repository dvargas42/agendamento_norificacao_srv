package com.dvargas42.agendamento_notificacao_srv.controller;

import com.dvargas42.agendamento_notificacao_srv.business.AgendamentoService;
import com.dvargas42.agendamento_notificacao_srv.controller.dto.in.AgendamentoInRecord;
import com.dvargas42.agendamento_notificacao_srv.controller.dto.out.AgendamentoOutRecord;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agendamento")
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoOutRecord> gravarAgendamento(@RequestBody AgendamentoInRecord agendamentoInRecord) {
        return ResponseEntity.ok(agendamentoService.gravarAgendamento(agendamentoInRecord));
    }
}
