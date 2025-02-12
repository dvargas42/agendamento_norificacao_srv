package com.dvargas42.agendamento_notificacao_srv.infrastructure.repositories;

import com.dvargas42.agendamento_notificacao_srv.infrastructure.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}