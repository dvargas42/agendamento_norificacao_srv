package com.dvargas42.agendamento_notificacao_srv.controller;

import com.dvargas42.agendamento_notificacao_srv.business.AgendamentoService;
import com.dvargas42.agendamento_notificacao_srv.controller.dto.in.AgendamentoInRecord;
import com.dvargas42.agendamento_notificacao_srv.controller.dto.out.AgendamentoOutRecord;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agendamento")
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoOutRecord> gravarAgendamento(@RequestBody AgendamentoInRecord agendamentoInRecord) {
        return ResponseEntity.ok(agendamentoService.gravarAgendamento(agendamentoInRecord));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AgendamentoOutRecord> buscarAgendamentoPorId(@PathVariable Long id) {
        return ResponseEntity.ok(agendamentoService.buscarAgendamentoPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelarAgendamento(@PathVariable Long id) {
        agendamentoService.cancelarAgendamento(id);
        return ResponseEntity.accepted().build();
    }
}
