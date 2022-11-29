import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso1.setTitulo("Js");
        curso1.setDescricao("Descrição curso Js");
        curso1.setCargaHoraria(50);
        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}