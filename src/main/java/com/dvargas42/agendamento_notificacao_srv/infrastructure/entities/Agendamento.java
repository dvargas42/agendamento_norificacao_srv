package com.dvargas42.agendamento_notificacao_srv.infrastructure.entities;

import com.dvargas42.agendamento_notificacao_srv.infrastructure.enums.StatusNoficacaoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "agendamento")
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emailDestinatario;

    @Column(name = "telefone_destinatario")
    private String telefoneDestinatario;

    private LocalDateTime dataHoraEnvio;

    private LocalDateTime dataHoraAgendamento;

    private LocalDateTime dataHoraModificacao;

    private String mensagem;

    private StatusNoficacaoEnum statusNotificacao;

    @PrePersist
    private void prePersist() {
        dataHoraAgendamento = LocalDateTime.now();
        statusNotificacao = StatusNoficacaoEnum.AGENDADO;
    }

}
