package trabalho.poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);

        // Cria uma lista de alunos Erasmus
        // List<ErasmusStudent> students = new ArrayList<ErasmusStudent>();
        ArrayList<aluno> alunos_lista = new ArrayList<>();
        aluno a1 = new aluno("Rafael Teste", "Indefinido", 20, "Portugal", "PT", "FDULP");
        aluno a2 = new aluno("Fabio Maio", "Indefinido", 17, "Portugal", "PT", "FDULP");
        alunos_lista.add(a1);
        alunos_lista.add(a2);
        //alunos_lista.add(a1);

        // Cria uma lista de professores
        //List<Professor> professors = new ArrayList<Professor>();
        ArrayList<Professor> profs_lista = new ArrayList<>();
        Professor p1 = new Professor( "Manuel", "Masculino", 30);
        Professor p2 = new Professor( "Joana", "Feminino", 38);
        Professor p3 = new Professor( "Bernardo", "Masculino", 40);
        Professor p4 = new Professor( "Nuno Pombo", "Masculino", 32);
        profs_lista.add(p1);
        profs_lista.add(p2);
        profs_lista.add(p3);
        profs_lista.add(p4);

        // Cria uma lista de cursos
        ArrayList<Curso> curso_lista = new ArrayList<>();
        Curso c1 = new Curso("Infowmatica Web");
        Curso c2 = new Curso("Engenharia Informatica");
        Curso c3 = new Curso("Moda");
        curso_lista.add(c1);
        curso_lista.add(c2);
        curso_lista.add(c3);
        // Cria uma lista de disciplinas
        //List<Discipline> disciplines = new ArrayList<Discipline>();

        ArrayList<Disciplinas> disciplinas_lista = new ArrayList<>();
                Disciplinas d1 = new Disciplinas("Informatica Web","Multimedia II",p1,"PT",6);
                   
                Disciplinas d2 = new Disciplinas("Informatica Web","Linguaguem Scripting",p2,"Misto",6);
                   
                Disciplinas d3 = new Disciplinas("Engenharia Informatica","Engenharia Software",p3,"Portugues",6);
                
                Disciplinas d4 = new Disciplinas("Informatica Web","Programacao orientada a objetos",p2,"Portugues",6);
                
                Disciplinas d5 = new Disciplinas("Moda","Design 1",p2,"Portugues",6);
                Disciplinas d6 = new Disciplinas("Moda","Design 2",p2,"Portugues",6);
                Disciplinas d7 = new Disciplinas("Moda","Costura",p2,"Portugues",6);
                Disciplinas d8 = new Disciplinas("Moda","Pintura",p2,"Portugues",6);
                   disciplinas_lista.add(d1);
                   disciplinas_lista.add(d2);
                   disciplinas_lista.add(d3);                    
                   disciplinas_lista.add(d4); 
                   disciplinas_lista.add(d5);
                   disciplinas_lista.add(d6);
                   disciplinas_lista.add(d7);
                   disciplinas_lista.add(d8);
        //Começa o menu

        int ciclo = 1;

        while (ciclo == 1) {

            //MENU
            System.out.print("           ##--Menu--##\n\n");
            System.out.print("|----------------------------------------|\n");
            System.out.print("| 1 - Gestao de alunos de Erasmus        |\n");
            System.out.print("|                                        |\n");
            System.out.print("| 2 - Gestao de Professores              |\n");
            System.out.print("|                                        |\n");
            System.out.print("| 3 - Gestao de Cursos                   |\n");
            System.out.print("|                                        |\n");
            System.out.print("| 4 - Gestao de Disciplinas              |\n");
            System.out.print("|                                        |\n");
            System.out.print("| 0 - Sair do programa                   |\n");
            System.out.print("|----------------------------------------|\n");

            System.out.print("Digite uma opcao: ");
            int opcao = menu.nextInt();

            switch (opcao) {
                case 0:
                    System.out.print("\nAte logo!");
                    System.exit(0);

                //ALUNOS ERASMUS
                case 1:
                    System.out.print("\n\n  ##--Visualizar e Editar Dados--##\n\n");
                    System.out.print("\n      Gestao de alunos de Erasmus\n");
                    System.out.print("|----------------------------------------|\n");
                    System.out.print("| 1 - Visualizar alunos Erasmus          |\n");
                    System.out.print("| 2 - Editar aluno Erasmus               |\n");
                    System.out.print("| 3 - Novo aluno Erasmus                 |\n");
                    System.out.print("| 0 - Sair do programa/MENU ANTERIOR     |\n");
                    System.out.print("|----------------------------------------|\n");
                    System.out.print("Digite uma opcao: ");
                    int opcao1 = menu.nextInt();

                    switch (opcao1) {
                        case 0:
                            System.out.print("\n\n");
                            break;
                        case 1: //Visualizar Alunos
                            System.out.print("\n\n##--Lista de alunos de Erasmus--##\n\n");
                            //CICLO FOR PARA RECOLHER E APRESENTAR DADOS DE ALUNOS NA LISTA "alunos_lista", classs/ objeto / lista
                            for (aluno aluno : alunos_lista) {
                                System.out.println(aluno.toString());

                            }
                            //Ler objeto num ficheiro

                            break;
                        case 2:
                            System.exit(0);

                        case 3:
                            Scanner myObj = new Scanner(System.in);
                            String scnome,
                             scgenero,
                             scpais,
                             sclingua,
                             scuniversidade;
                            int scgeneroint,
                             sccursoint,
                             scidade,
                             sclinguaint;

                            System.out.println("Nome do aluno:");
                            scnome = myObj.nextLine();
                            System.out.print("|--------------------------|\n");
                            System.out.println("Indique o seu genero");
                            System.out.println("1-Feminino");
                            System.out.println("2-Masculino");

                            scgeneroint = myObj.nextInt();
                            if (scgeneroint == 1) {
                                scgenero = "Feminino";
                            } else if (scgeneroint == 2) {
                                scgenero = "Masculino";
                            } else {
                                System.out.println("ERRO, INDIQUE VALORES VALIDOS");
                                break;
                            }
                            System.out.print("|--------------------------|\n");
                            System.out.println("Idade:");
                            scidade = myObj.nextInt();
                            System.out.print("|--------------------------|\n");
                            System.out.println("Pais de Origem:");
                            scpais = myObj.next();
                            System.out.print("|--------------------------|\n");

                            System.out.println("Indique a sua lingua");
                            System.out.println("1-Portugues");
                            System.out.println("2-Ingles");

                            sclinguaint = myObj.nextInt();
                            if (sclinguaint == 1) {
                                sclingua = "Portugues";
                            } else if (sclinguaint == 2) {
                                sclingua = "Ingles";
                            } else {
                                System.out.println("ERRO, INDIQUE VALORES VALIDOS");
                                break;
                            }

                            System.out.print("|--------------------------|\n");
                            System.out.println("Universidade de origem");
                            scuniversidade = myObj.next();
                            
                            //Inscrever a curso
                            System.out.print("|--------------------------|\n");
                            System.out.println("A que curso o aluno pretende se inscrever");
                          
                            int n=0,x=0;
                            //Corre todas as posições da lista curso_lista
                            for (Curso Curso : curso_lista) {
                                n++;
                                System.out.println(n + "-" + Curso.toString());
                            }
                            sccursoint = myObj.nextInt() - 1;
                            Curso sccurso = curso_lista.get(sccursoint);
                            String sccursoNome = sccurso.getNomeCurso();

                            System.out.println(sccurso);
                            
                            System.out.print("|--------------------------|\n");
                            System.out.println("Estas sao as cadeiras disponiveis do curso de "+sccursoNome);
                            //Corre todas as posições da lista disciplinas_lista
                            for (Disciplinas Disciplinas : disciplinas_lista) {
                                
                                if (sccursoNome.equals(Disciplinas.getNomeCurso())) {
                                   x++; // Se o nome do aluno for igual ao nome especificado, imprimir os detalhes do aluno
                                    System.out.println(x+ "-" + Disciplinas.getNome());
                                
                                }
                            }
                            int ciclo_disciplinas=1,scDisciplinas;
                            String scDiscLista;
                            
                            while (ciclo_disciplinas!=0){
                                System.out.print("Insira as disciplinas que quer ter 0 para o programa:");
                                ciclo_disciplinas = myObj.nextInt();
                                scDisciplinas = ciclo_disciplinas -1;
                                Disciplinas scDisciplina = disciplinas_lista.get(scDisciplinas);
//                                 String scDisciplinaADD = scDisciplina.getNome();
//                                aluno.cadeiras_lista.adicionarAluno(scDisciplinasADD);
                                 //Tou a tentar adicionar as disciplinas que o utilizador inserir, tipo, ele mete 1-moda e ele adiciopna
                                 //moda a lista cadeiras_lista que ta na class aluno
                            }//fecha ciclo
                            
                            System.out.print(ciclo_disciplinas);
                          
                            aluno a = new aluno(scnome, scgenero, scidade, scpais, sclingua, scuniversidade);
                            alunos_lista.add(a);

                           
                            System.out.print("      ##--Aluno adicionado com sucesso--##\n\n");
                            System.out.println(a.toString());
                            
                            


                    }
                    break;

                //PROFESSORES
                case 2:
                    System.out.print("      ##--Visualizar e Editar Dados--##\n\n");
                    System.out.print("\n         Gestao de Professores\n");
                    System.out.print("|----------------------------------------|\n");
                    System.out.print("| 1 - Visualizar professor               |\n");
                    System.out.print("| 2 - Editar professores                 |\n");
                    System.out.print("| 3 - Novo professor                     |\n");
                    System.out.print("| 0 - Sair do programa/MENU ANTERIOR     |\n");
                    System.out.print("|----------------------------------------|\n");
                    int opcao2 = menu.nextInt();

                    switch (opcao2) {
                        case 0:
                            System.out.print("\n\n");
                            break;

                        case 1://Visualizar Professores
                            System.out.print("\n\n##--Lista de Professores--##\n\n");
                            //CICLO FOR PARA RECOLHER E APRESENTAR DADOS DE PROFESSOR NA LISTA "profs_lista", classs/ objeto / lista
                            for (Professor Professor : profs_lista) {
                                System.out.println(Professor.toString());
                            }
                            break;
                        case 2:

                        case 3:

                            Scanner myObj = new Scanner(System.in);
                            String scnome;
                            String scgenero;
                            int scidade;
                            int scgeneroint;

                            System.out.println("Nome do professor:");
                            scnome = myObj.nextLine();
                            System.out.println("Indique o seu genero");
                            System.out.println("1-Feminino");
                            System.out.println("2-Masculino");

                            scgeneroint = myObj.nextInt();
                            if (scgeneroint == 1) {
                                scgenero = "Feminino";
                            } else if (scgeneroint == 2) {
                                scgenero = "Masculino";
                            } else {
                                break;
                            }

                            System.out.println("Idade:");
                            scidade = myObj.nextInt();

                            Professor p = new Professor( scnome, scgenero, scidade);
                            profs_lista.add(p);

                            break;

                    }
                    break;

                //CURSOS
                case 3:
                    System.out.print("    ##--Visualizar e Editar Dados--##\n\n");
                    System.out.print("\n        Gestao de cursos\n");
                    System.out.print("|----------------------------------------|\n");
                    System.out.print("| 1 - Visualizar cursos                  |\n");
                    System.out.print("| 2 - Editar curso                       |\n");
                    System.out.print("| 3 - Novo curso                         |\n");
                    System.out.print("| 0 - Sair do programa/MENU ANTERIOR     |\n");
                    System.out.print("|----------------------------------------|\n");
                    int opcao3 = menu.nextInt();

                    switch (opcao3) {
                        case 0:
                            System.out.print("\n\n");
                            break;
                        case 1: //Visualizar Curso
                            System.out.print("\n\n##--Lista de Cursos--##\n\n");
                            //CICLO FOR PARA RECOLHER E APRESENTAR DADOS DE CURSOS NA LISTA "cursos_lista", classs/ objeto / lista
                            for (Curso Curso : curso_lista) {
                                System.out.println(Curso.toString());
                            }
                        case 2:
                            System.out.print("\nSOPA\n");
                            break;
                        case 3:

                            Scanner myObj = new Scanner(System.in);
                            String scnomeCurso;

                            System.out.println("Nome do curso:");
                            scnomeCurso = myObj.nextLine();

                            //Não apagar
                            Curso c = new Curso(scnomeCurso);
                            curso_lista.add(c);

                            break;

                    }
                    break;

                //Disciplina    
                case 4:
                    System.out.print("\n   ##--Visualizar e Editar Dados--##\n\n");
                    System.out.print("\n       Gestao de Disciplinas  \n");

                    System.out.print("|----------------------------------------|\n");
                    System.out.print("| 1 - Visualizar disciplinas             |\n");
                    System.out.print("| 2 - Editar disciplinas                 |\n");
                    System.out.print("| 3 - Nova disciplina                    |\n");
                    System.out.print("| 0 - Sair do programa/MENU ANTERIOR     |\n");
                    System.out.print("|----------------------------------------|\n");
                    int opcao4 = menu.nextInt();
                    int i = 0;

                    switch (opcao4) {
                        case 0:
                            System.out.print("\n\n");
                        // break;
                        case 1://Visualizar Disciplinas
                       
                        for (Disciplinas Disciplinas : disciplinas_lista) {
                            System.out.println(Disciplinas.toString());
                            }
                        
                       break;

            

                        case 3:

                            Scanner myObj = new Scanner(System.in);

                            String scnomeDisciplina,scLingua;
                            int scECTS,a = 0,scLinguaint;

                            System.out.println("##--Curso da disciplina--##");
                            System.out.println("Cursos disponiveis:");
                            for (Curso Curso : curso_lista) {
                                i++;
                                System.out.println(i + "-" + Curso.toString());
                            }
                            int scnumCurso = myObj.nextInt() - 1;

                            Curso scCursoNome = curso_lista.get(scnumCurso);

                            String nome_curso = scCursoNome.getNomeCurso();

                            for (Disciplinas Disciplinas : disciplinas_lista) {

                                if (Disciplinas.getNomeCurso().equals(nome_curso)) {
                                    // Se o nome do aluno for igual ao nome especificado, imprimir os detalhes do aluno
                                    System.out.println("Escolheu curso de:" + Disciplinas.getNomeCurso());
                                }

                            }

                            System.out.println("Nome da Disciplina:");
                            scnomeDisciplina = myObj.next();

                            //Pedir prof
                            System.out.println("##--Professor/professores da disciplina--##");
                            System.out.println("Professores disponiveis:");
                            for (Professor Professor : profs_lista) {
                                a++;
                                System.out.println(a + "-" + Professor.getNome());
                            }
                            int scProfint = myObj.nextInt() - 1;

                            Professor scprof = profs_lista.get(scProfint);
                            
                            for (Disciplinas Disciplinas : disciplinas_lista) {
                                //Corre todos os cursos
                                   //Se o nome do curso no momento for igual ao nome idicado pelo utilizador 
                                if (Disciplinas.getNomeCurso().equals(nome_curso)) {
                                    // Se o nome do curso for igual ao nome especificado
                                    System.out.println("Escolheu curso de:" + Disciplinas.getNomeCurso());
                                }

                            }
                            //Acaba pedir prof

                            System.out.println("<--Linguas disponiveis-->\n1- Portugues\n2- Ingles\n 3-Misto");
                            System.out.println("Lingua usada durante aula:");
                            scLinguaint = myObj.nextInt();
                            if (scLinguaint == 1) {
                                scLingua = "Portugues";
                            } else if (scLinguaint == 2) {
                                scLingua = "Ingles";
                            } else if (scLinguaint == 3) {
                                scLingua = "Misto";
                            } else {
                                break;
                            }

                            System.out.println("Numero de ECTS correspondente a essa disciplina:");
                            scECTS = myObj.nextInt();

                            Disciplinas d = new Disciplinas(nome_curso, scnomeDisciplina, scprof, scLingua, scECTS);
                            disciplinas_lista.add(d);

                            System.out.println(d.toString());

                            break;

                    }
                    break;

                default:
                    System.out.print("\nOpcao Invalida!");
                    break;

            }
        }
//       File arquivo = new File("dados.bin");
//       
//       ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(arquivo));
//       
//       oos.writeObject(alunos);
//       oos.writeObject(Professores);
//       oos.writeObject(Disciplinas);
//       oos.writeObject(Curso);
//       
//       
//       
//       oos.close();
//       
//       ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
//       
//       
//                            aluno a8 =null;
//                            ObjectInputStream input = null;
//                            String filePath = "C:/Users/Simão/Desktop/POO/Trabalho POO/teste.bin";
//                            try{
//                                 input = new ObjectInputStream( new FileInputStream(filePath));
//                                a8 = (aluno) input.readObject();
//                                input.close();
//                                System.out.print("Sopa");
//                                System.out.print(a8);
//                            }catch(IOException ioe){
//                                System.err.println("Erro ao abrir o ficheiro");
//                            }catch(ClassNotFoundException cnfe){
//                                System.err.println("Erro de classe num ficheiro");
//                        }
//                        
//                                System.out.print(a8);


//Escrever objeto
//try{
//                            ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream("teste.dat"));
//                            output.writeObject(p);
//                            output.close();
//                             System.err.println("Sopa");
//                        }catch(IOException ioe){
//                            System.err.println("Erro ao salvar num ficheiro");
//                        }


 //Guardar dados
//                       try{
//                            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("teste.bin"));
//                            output.writeObject(a);
//                            System.out.println("Sopaaaa");
//                            output.close();
//                        }catch(IOException ioe){
//                            ioe.printStackTrace();
//                            System.err.println("Erro ao salvar num ficheiro");
//                            System.err.println("Erro ao salvar num ficheiro");
//                        }
//                       


    }
    
    

}
