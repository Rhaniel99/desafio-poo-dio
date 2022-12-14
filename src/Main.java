import br.com.dio.desafio.dominio.*;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = null;
        Curso curso2 = null;

        try {
            curso1 = new Curso();
            curso1.setTitulo(JOptionPane.showInputDialog("Digite o titulo do Curso: "));
            curso1.setDescricao(JOptionPane.showInputDialog("Digite descrição do Curso: "));
            curso1.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária do Curso: ")));
            if (curso1.getCargaHoraria() != 0) {
                curso2 = new Curso();
                curso2.setTitulo("Js");
                curso2.setDescricao("Descrição curso Js");
                curso2.setCargaHoraria(50);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Insira um número válido." + e.getMessage());
        }

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devRhani = new Dev();
        devRhani.setNome("Rhani");
        devRhani.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Rhani: " + devRhani.getConteudosInscritos());
        devRhani.progredir();
        devRhani.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Rhani: " + devRhani.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Rhani: " + devRhani.getConteudosConcluidos());
        System.out.println("XP: " + devRhani.calcularTotalXp());

        Dev devLower = new Dev();
        devLower.setNome("Lo");
        devLower.inscreverBootcamp(bootcamp);
        System.out.println("-");
        System.out.println("Conteudos Inscritos Lo: " + devLower.getConteudosInscritos());
        devLower.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Lo: " + devLower.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Lo: " + devLower.getConteudosConcluidos());
        System.out.println("XP: " + devLower.calcularTotalXp());


//      curso1.setTitulo(a);

        //System.out.println(curso1);
        //System.out.println(mentoria1);

        // Exemplo de poliformismo : Conteudo conteudo = new Curso();
    }
}