import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Dominando a Linguagem de Programação Java");
        curso1.setDescricao("Introdução a Linguagem Java");
        curso1.setCargaHoraria(14);

        Curso curso2 = new Curso();
        curso2.setTitulo("Programação Orientada a Objetos com Java");
        curso2.setDescricao("Introdução ao Paradigma Orientado a Objetos em Java");
        curso2.setCargaHoraria(20);

        Curso curso3 = new Curso();
        curso3.setTitulo("Base em Lógica de Programação para Jogos");
        curso3.setDescricao("Introdução a Lógica de Programação");
        curso3.setCargaHoraria(7);

        Curso curso4 = new Curso();
        curso4.setTitulo("Operadores e Estruturas de Controle para Jogos");
        curso4.setDescricao("Introdução de Operadores Lógicas e Estruturas de Controle");
        curso4.setCargaHoraria(11);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Gerenciamento de Tempo");
        mentoria1.setDescricao("Descubra estratégias eficazes de gerenciamento de tempo.");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Explorando IAs Generativas Com Foco em Produtividade");
        mentoria2.setDescricao("Compreenda como as IAs generativas podem ser utilizadas para aumentar a produtividade.");
        mentoria2.setData(LocalDate.now());


        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Backend com Java");
        bootcampJava.setDescricao("Aprenda Java partindo da sintaxe básica até a implementação de uma API.");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria1);
        bootcampJava.getConteudos().add(mentoria2);


        Bootcamp bootcampGodot = new Bootcamp();
        bootcampGodot.setNome("Criando Jogos com Godot");
        bootcampGodot.setDescricao("Desenvolva suas habilidades com JavaScript e GDscript e construa seu primeiro jogo em 2D na engine Godot.");
        bootcampGodot.getConteudos().add(curso3);
        bootcampGodot.getConteudos().add(curso4);
        bootcampJava.getConteudos().add(mentoria1);
        bootcampJava.getConteudos().add(mentoria2);

        Dev devSara = new Dev();
        devSara.setNome("Sara");
        devSara.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos:" + devSara.getConteudosInscritos());
        devSara.progredir();
        devSara.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + devSara.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devSara.getConteudosConcluidos());
        System.out.println("XP:" + devSara.calcularTotalXp());

        System.out.println("-------");

        Dev devSalomão = new Dev();
        devSalomão.setNome("Salomão");
        devSalomão.inscreverBootcamp(bootcampGodot);
        System.out.println("Conteúdos Inscritos:" + devSalomão.getConteudosInscritos());
        devSalomão.progredir();
        devSalomão.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + devSalomão.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos:" + devSalomão.getConteudosConcluidos());
        System.out.println("XP:" + devSalomão.calcularTotalXp());


    }

}
