import java.time.LocalDate;

import com.dio.desafio.dominio.Curso;

import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso()
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso()
        curso2.setTitulo("curso Java");
        curso2.setDescricao("descrição curso Java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descriÇão mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);

    }
}
