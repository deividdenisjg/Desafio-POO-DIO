import java.time.LocalDate;

import br.com.deivid.desafio.dominio.Bootcamp;
import br.com.deivid.desafio.dominio.Conteudo;
import br.com.deivid.desafio.dominio.Curso;
import br.com.deivid.desafio.dominio.Dev;
import br.com.deivid.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descriÇão mentoria java");
        mentoria.setData(LocalDate.now());


        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcampo Java Developer");
        bootcamp.setDescricao("Descrição Bootcampo Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDeivid = new Dev();
        devDeivid.setNome("Deivid");
        devDeivid.inscreverBootcamp(bootcamp);
        devDeivid.progredir();
        devDeivid.progredir();
        System.out.println("Conteúdos Inscritos " + devDeivid.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devDeivid.getConteudosConcluidos());
        System.out.println("XP: "+ devDeivid.calcularXp());

        Dev devDenis = new Dev();
        devDenis.setNome("DevNovo");
        devDenis.inscreverBootcamp(bootcamp);
        devDenis.progredir();
        System.out.println("Conteúdos Inscritos " + devDenis.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devDenis.getConteudosConcluidos());
        System.out.println("XP: "+ devDenis.calcularXp());

    }
}
