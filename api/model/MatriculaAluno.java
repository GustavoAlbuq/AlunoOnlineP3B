package br.com.alunoonline.api.model;

import br.com.alunoonline.api.enums.MatriculaAlunoStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "matricula_aluno")
public class MatriculaAluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula",nullable = false)
    private Long idMatricula;

    @ManyToOne
    @JoinColumn(name = "ALUNO_id_aluno",nullable = false)
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "DISCIPLINA_id_disciplina",nullable = false)
    private Disciplina disciplina;

    @Column(name = "nota_1", nullable = false)
    private Double nota1;

    @Column(name = "nota_2", nullable = false)
    private Double nota2;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_aluno",nullable = false)
    private MatriculaAlunoStatusEnum status;;
}
