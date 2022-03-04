import java.time.LocalDate;

import dev.alejandrocosta.bootcamps.dominio.Bootcamp;
import dev.alejandrocosta.bootcamps.dominio.Curso;
import dev.alejandrocosta.bootcamps.dominio.Dev;
import dev.alejandrocosta.bootcamps.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JUnit");
		curso2.setDescricao("Descrição do Curso JUnit");
		curso2.setCargaHoraria(12);
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição da mentoria de Java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev dev01 = new Dev();
		dev01.setNome("Alejandro Costa");
		dev01.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos:");
		System.out.println(dev01.getNome() + ": " + dev01.getConteudosInscritos());
		
		
		Dev dev02 = new Dev();
		dev02.setNome("Jana R de Santana");
		dev02.inscreverBootcamp(bootcamp);
		System.out.println(dev02.getNome() + ": " + dev02.getConteudosInscritos());
		
		System.out.println();
		
		System.out.println("Conteúdos concluídos:");
		dev01.progredir();
		System.out.println(dev01.getNome() + ": " + dev01.getConteudosConcluidos());
		dev02.progredir();
		dev02.progredir();
		System.out.println(dev02.getNome() + ": " + dev02.getConteudosConcluidos());
		
		System.out.println();
		
		System.out.println("XP:");
		System.out.println(dev01.getNome() + ": " + dev01.calcularTotalXP());
		System.out.println(dev02.getNome() + ": " + dev02.calcularTotalXP());
		
		System.out.println();
		
		System.out.println("Conteúdos inscritos:");
		System.out.println(dev01.getNome() + ": " + dev01.getConteudosInscritos());
		System.out.println(dev02.getNome() + ": " + dev02.getConteudosInscritos());
		
		
		System.out.println();
		
		System.out.println("Desenvolvedores matriculados no Bootcamp:");
		System.out.println(bootcamp.getDevsInscritos());

	}

}
