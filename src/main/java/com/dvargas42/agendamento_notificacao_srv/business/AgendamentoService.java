package com.dvargas42.agendamento_notificacao_srv.business;

import com.dvargas42.agendamento_notificacao_srv.business.mapper.IAgendamentoMapper;
import com.dvargas42.agendamento_notificacao_srv.controller.dto.in.AgendamentoInRecord;
import com.dvargas42.agendamento_notificacao_srv.controller.dto.out.AgendamentoOutRecord;
import com.dvargas42.agendamento_notificacao_srv.infrastructure.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;
    private final IAgendamentoMapper agendamentoMapper;

    public AgendamentoOutRecord gravarAgendamento(AgendamentoInRecord agendamento) {
        return agendamentoMapper.paraOut(
                repository.save(
                        agendamentoMapper.paraEntity(agendamento)));
    }
}
