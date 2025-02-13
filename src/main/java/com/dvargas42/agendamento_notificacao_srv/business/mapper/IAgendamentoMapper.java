package com.dvargas42.agendamento_notificacao_srv.business.mapper;

import com.dvargas42.agendamento_notificacao_srv.controller.dto.in.AgendamentoInRecord;
import com.dvargas42.agendamento_notificacao_srv.controller.dto.out.AgendamentoOutRecord;
import com.dvargas42.agendamento_notificacao_srv.infrastructure.entities.Agendamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    Agendamento paraEntity(AgendamentoInRecord agendamento);

    AgendamentoOutRecord paraOut(Agendamento agendamento);

    @Mapping(target = "dataHoraModificacao", expression = "java(LocalDateTime.now())")
    @Mapping(target = "statusNotificacao", expression = "java(StatusNoficacaoEnum.CANCELADO)")
    Agendamento paraEntityCancelamento(Agendamento agendamento);
}

