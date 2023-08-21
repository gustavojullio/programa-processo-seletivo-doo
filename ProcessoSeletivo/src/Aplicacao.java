import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao{
    public static void opcoes(){
        
        System.out.println("O que deseja fazer?");
        System.out.println("Selecione a opção desejada:");
        System.out.println("1 - Cadastrar candidato a DOCENTE");
        System.out.println("2 - Cadastrar candidato a TAE");
        System.out.println("3 - Listar candidatos a DOCENTE");
        System.out.println("4 - Listar candidatos a TAE");
        System.out.println("5 - Listar candidato(s) aprovado(s) para DOCENTE");
        System.out.println("6 - Listar candidato(s) aprovado(s) para TAE");
        System.out.println("7 - Excluir inscrição candidato DOCENTE");
        System.out.println("8 - Excluir inscrição candidato TAE");
        System.out.println("9 - Editar cadastro - Candidatos TAE e DOCENTE");
        System.out.println("10 - Encerrar");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int codigo = 0;
        int selecao = 0;
        int escolha = -1;
        int escolhaAlt = 0;
        int escolhaC = 0;
        int escolhaCd = 0;
        int escolhaCT = 0;
        
        ArrayList<Professor> arrayProfessor = new ArrayList<Professor>();

        ArrayList<Tae> arrayTae = new ArrayList<Tae>();

        Professor novProf;
        Tae novTae;
        System.out.println("|----------------------------------------------------------------|");
        System.out.println("|-------------------------Seja Bem-Vindo-------------------------|");
        System.out.println("|--------Processo Seletivo - Contratação de TAE e DOCENTE--------|");
        System.out.println("|----------------------------------------------------------------|");
        
        while(true){
            String nomeCompleto, email, telefone, endereco; 
            int formacao = 0, experiencia = -1, nota1 = -1, nota2 = -1, nota3 = -1, habilitacao = 0;

            do {
                opcoes();
                try {
                    escolha = sc.nextInt();
                    if(escolha < 0 || escolha > 10){
                        System.out.println("Por favor, selecione um número entre 1 e 10.");
                    }
                } catch (Exception e) {
                    System.out.println("Você não digitou um dado válido, por favor, tente novamente."); 
                    sc.nextLine();
                } 
            } while (escolha < 0 || escolha > 10);
           
            
            switch(escolha){
                case 1: {
                        System.out.println("Digite o nome completo:");
                        sc.nextLine();
                        nomeCompleto = sc.nextLine();
                    
                        System.out.println("Digite o e-mail:");
                        email = sc.nextLine();
                    

                        System.out.println("Digite o telefone:");
                        telefone = sc.nextLine();


                        System.out.println("Digite o endereço: (Ex.: Rua Josefina, nº 145, Realeza)");
                        endereco = sc.nextLine();

                        while(formacao < 1 || formacao > 5){
                                System.out.println("Digite a formação do Candidato:");
                                System.out.println("1 - Curso na Área - Carga horária min 180h");
                                System.out.println("2 - Curso na Área - Carga horária min 360h");
                                System.out.println("3 - Mestrado");
                                System.out.println("4 - Doutorado");
                                System.out.println("Caso possua o grau bacharelado, digite 5, mas será contabiliazado valor 0.");

                            try {

                                formacao = sc.nextInt();

                                if(formacao < 1 || formacao > 5){
                                 System.out.println("Por favor, selecione um número entre 1 e 5.");
                                }

                            } catch (Exception dados) {
                                System.out.println("Você não digitou um dado válido, por favor, tente novamente.");  
                            }sc.nextLine();
                        }

                        while(habilitacao != 1 && habilitacao != 2){
                            System.out.println("O Candidato possui Licenciatura Plena ou Habilitação Pedagógica Docente?");
                            System.out.println("1 - Sim 2 - Não");
                            try {
                                habilitacao = sc.nextInt();
                                if(habilitacao != 1 && habilitacao != 2){
                                    System.out.println("Por favor, selecione 1 ou 2.");
                                }
                            } catch (Exception e) {
                                System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                            } sc.nextLine();
                        }

                        do {
                            System.out.println("Digite a experiência do Candidato:");
                            try {
                                experiencia = sc.nextInt();
                                if(experiencia < 0){
                                    System.out.println("A experiência em ANOS precisa ser maior ou igual a ZERO.");
                                }
                            } catch (Exception e) {
                                System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                            } sc.nextLine();

                        } while (experiencia < 0);

                        do {
                            System.out.println("Digite a nota da PRIMEIRA PROVA do Candidato:(Somente número inteiro)");
                            try {
                                nota1 = sc.nextInt();
                                if(nota1 < 0 || nota1 > 100){
                                    System.out.println("A nota da PROVA 1  precisa ser maior ou igual a ZERO e MENOR que 100.");
                                }
                            } catch (Exception e) {
                                System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                            } sc.nextLine();
                            
                        } while (nota1 < 0 || nota1 > 100);


                        do {
                            System.out.println("Digite a nota da SEGUNDA PROVA do Candidato:(Somente número inteiro)");
                            try {
                                nota2 = sc.nextInt();
                                if(nota2 < 0 || nota2 > 100){
                                    System.out.println("A nota da PROVA 2  precisa ser maior ou igual a ZERO e MENOR que 100.");
                                }
                            } catch (Exception e) {
                                System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                            }sc.nextLine();
                            
                        } while (nota2 < 0 || nota2 > 100);

                        do {
                            System.out.println("Digite a nota da TERCEIRA PROVA do Candidato:(Somente número inteiro)");
                            try {
                                nota3 = sc.nextInt();
                                if(nota3 < 0 || nota3 > 100){
                                    System.out.println("A nota da PROVA 3  precisa ser maior ou igual a ZERO e MENOR que 100.");
                                }
                                
                            } catch (Exception e) {
                                System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                            }sc.nextLine();
                        } while (nota3 <  0 || nota3 > 100);

                    novProf = new Professor(nomeCompleto, email, telefone, endereco, formacao, habilitacao,experiencia, nota1, nota2, nota3);
                    arrayProfessor.add(novProf);
                    System.out.println("Professor cadastrado com sucesso!");
                    break;

                }

                case 2: {
                    
                    System.out.println("Digite o nome completo:");
                    sc.nextLine();
                    nomeCompleto = sc.nextLine();
                
                    System.out.println("Digite o e-mail:");
                    email = sc.nextLine();
                

                    System.out.println("Digite o telefone:");
                    telefone = sc.nextLine();
                
                    System.out.println("Digite o endereço:(Ex.: Rua Josefina, nº 145, Realeza)");
                    endereco = sc.nextLine();

                    while(formacao < 1 || formacao > 6){
                        System.out.println("Digite a formação do Candidato:");
                        System.out.println("1 - Ensino Médio");
                        System.out.println("2 - Curso Superior - Área de Atuação");
                        System.out.println("3 - Curso na Área - Carga horária min 180h");
                        System.out.println("4 - Curso na Área - Carga horária min 360h");
                        System.out.println("5 - Mestrado");
                        System.out.println("6 - Doutorado");

                        try {
                            formacao = sc.nextInt();

                            if(formacao < 1 || formacao > 6){
                                System.out.println("Por favor, selecione um número entre 1 e 6.");
                            }
                        } catch (Exception e) {
                            System.out.println("Você não digitou um dado válido, por favor, tente novamente.");  
                        } sc.nextLine();
                    }
                
                   
                    do {
                        System.out.println("Digite a experiência do Candidato:");
                        try {
                            experiencia = sc.nextInt();
                            if(experiencia < 0){
                                System.out.println("A experiência em ANOS precisa ser maior ou igual a ZERO.");
                            }
                        } catch (Exception e) {
                            System.out.println("Você não digitou um dado válido, por favor, tente novamente.");  
                        } sc.nextLine();
                    } while (experiencia < 0);
                

                    novTae = new Tae(nomeCompleto, email, telefone, endereco, formacao, experiencia);
                    arrayTae.add(novTae);
                    System.out.println("Tae cadastrado com sucesso!");
                    break;
                }

                case 3: {
                    if(arrayProfessor.isEmpty()){
                        System.out.println("Não existe nenhum candidato cadastrado!");
                    }
                    else{
                        for(int i = 0; i < arrayProfessor.size(); i++ ){
                            System.out.print("Cód.: " + (i + 1) + " -- ");
                            System.out.print("Nome: " + arrayProfessor.get(i).getNomeCompleto() + " -- ");
                            System.out.println("Nota: " + arrayProfessor.get(i).getPontuacaoTotal());
                            System.out.println("----------------------------------------------------");
                        }
                    }
                break;
                }
                case 4: { 
                    if(arrayTae.isEmpty()){
                        System.out.println("Não existe nenhum candidato cadastrado!");
                    }
                    else{
                        for(int i = 0; i < arrayTae.size(); i++ ){
                            System.out.print("Cód.: " + (i + 1) + " -- ");
                            System.out.print("Nome: " + arrayTae.get(i).getNomeCompleto() + " -- ");
                            System.out.println("Nota: " + arrayTae.get(i).getPontuacaoTotal());
                            System.out.println("----------------------------------------------------");
                        }
                    }
                    break;
                }
                case 5:{
                    if(arrayProfessor.isEmpty()){
                        System.out.println("Não existe nenhum candidato APROVADO!");
                    }
                    else{
                        Professor lider = arrayProfessor.get(0);

                        for (int i = 0; i < arrayProfessor.size(); i++) {
                            if (arrayProfessor.get(i).getPontuacaoTotal() > lider.getPontuacaoTotal() ) {
                                lider = arrayProfessor.get(i);
                             }
                        }
                        
                         for (int i = 0; i < arrayProfessor.size(); i++) {
                            if(arrayProfessor.get(i).getPontuacaoTotal() == lider.getPontuacaoTotal()){
                                System.out.print("1º Lugar" + " -- ");
                                System.out.print("Nome: " + arrayProfessor.get(i).getNomeCompleto() + " -- ");
                                System.out.println("Nota: " + arrayProfessor.get(i).getPontuacaoTotal());
                                System.out.println("----------------------------------------------------");
                            }
                        }
                    }
                   
                    break;
            }
                case 6:{

                    if(arrayTae.isEmpty()){
                        System.out.println("Não existe nenhum candidato APROVADO!");
                    }
                    else{
                        Tae liderT = arrayTae.get(0);

                    for (int i = 0; i < arrayTae.size(); i++) {
                        if (arrayTae.get(i).getPontuacaoTotal() > liderT.getPontuacaoTotal() ) {
                            liderT = arrayTae.get(i);
                         }
                    }
                        
                    for (int i = 0; i < arrayTae.size(); i++) {
                        if(arrayTae.get(i).getPontuacaoTotal() == liderT.getPontuacaoTotal()){
                            System.out.print("1º Lugar" + " -- ");
                            System.out.print("Nome: " + arrayTae.get(i).getNomeCompleto() + " -- ");
                            System.out.println("Nota: " + arrayTae.get(i).getPontuacaoTotal());
                            System.out.println("----------------------------------------------------");
                        }
                    }
                    }

                    break;
                }
                case 7:{
                    selecao = 0;
                    if(arrayProfessor.isEmpty()){
                        System.out.println("Não existe nenhum candidato para ser excluído!");
                    }else{
                        while(selecao == 0){
                            System.out.println("Informe o código do CANDIDATO que deseja EXCLUIR:");
                            for(int i = 0; i < arrayProfessor.size(); i++ ){
                                System.out.print("Cód.: " + (i + 1) + " -- ");
                                System.out.print("Nome: " + arrayProfessor.get(i).getNomeCompleto() + " -- ");
                                System.out.println("Nota: " + arrayProfessor.get(i).getPontuacaoTotal());
                                System.out.println("----------------------------------------------------");
                            }
    
                            codigo = -1;
                                try {
                                     codigo = sc.nextInt();
                                    if((codigo - 1) <= arrayProfessor.size() && (codigo - 1) >= 0){
                                        arrayProfessor.remove((codigo - 1));
                                        System.out.println("Candidato excluído com sucesso!");
                                        selecao = 1;
                                    }
                                    else{
                                        System.out.println("Informe um código válido.");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                                } sc.nextLine();
    
                        }
                    }
                    break;
                }
                case 8: {
                    selecao = 0;
                    if(arrayTae.isEmpty()){
                        System.out.println("Não existe nenhum candidato para ser excluído!");
                    }else{
                        while(selecao == 0){
                            System.out.println("Informe o código do CANDIDATO que deseja EXCLUIR:");
                            for(int i = 0; i < arrayTae.size(); i++ ){
                                System.out.print("Cód.: " + (i + 1) + " -- ");
                                System.out.print("Nome: " + arrayTae.get(i).getNomeCompleto() + " -- ");
                                System.out.println("Nota: " + arrayTae.get(i).getPontuacaoTotal());
                                System.out.println("----------------------------------------------------");
                            }
    
                            codigo = -1;
                                try {
                                     codigo = sc.nextInt();
                                    if((codigo - 1) <= arrayTae.size() && (codigo - 1) >= 0){
                                        arrayTae.remove((codigo - 1));
                                        System.out.println("Candidato excluído com sucesso!");
                                        selecao = 1;
                                    }
                                    else{
                                        System.out.println("Informe um código válido.");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                                } sc.nextLine();
                        }
                    }
                    break;
                }         
                case 9:{
                    escolhaAlt = 0;
                    do {
                        System.out.println("Informe qual tipo de candidato deseja alterar as informações:");
                        System.out.println("1 - Candidato DOCENTE");
                        System.out.println("2 - Candidato TAE");
                        try {
                            escolhaAlt = sc.nextInt();

                            if(escolhaAlt != 1 && escolhaAlt != 2){
                                System.out.println("Por favor, selecione 1 ou 2.");
                            }
                        } catch (Exception e) {
                            System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                        } sc.nextLine();
                        
                    } while (escolhaAlt != 1 && escolhaAlt != 2);

                    switch(escolhaAlt){
                        case 1: {

                            escolhaC = 0;
                            escolhaCd = 0;

                            if(arrayProfessor.isEmpty()){
                                System.out.println("Não existe nenhum candidato cadastrado para ser alterado!");
                            }

                            else{
                                do {
                                    System.out.println("Selecione qual candidato a DOCENTE deseja ALTERAR:");
                                    for(int i = 0; i < arrayProfessor.size(); i++ ){
                                    System.out.print("Cód.: " + (i + 1) + " -- ");
                                    System.out.println("Nome: " + arrayProfessor.get(i).getNomeCompleto());
                                    System.out.println("----------------------------------------------------");
                                    }

                                    try {
                                        escolhaC = sc.nextInt();
                                        if(escolhaC <= 0 || escolhaC > (arrayProfessor.size())){
                                            System.out.println("Informe um número válido dentre as opções.");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                                    }sc.nextLine();
                                } while (escolhaC <= 0 || escolhaC > (arrayProfessor.size()));

                                

                                System.out.println("Candidato:");
                                System.out.println("----------------------------------------------------");
                                System.out.println("1 - Nome: " + arrayProfessor.get(escolhaC - 1).getNomeCompleto());
                                System.out.println("2 - E-mail: " + arrayProfessor.get(escolhaC - 1).getEmail());
                                System.out.println("3 - Telefone: " + arrayProfessor.get(escolhaC - 1).getTelefone());
                                System.out.println("4 - Endereço: " + arrayProfessor.get(escolhaC - 1).getEndereco());
                                System.out.println("5 - Formação: " + arrayProfessor.get(escolhaC - 1).getTitulacao());
                                System.out.println("6 - Habilitação: " + arrayProfessor.get(escolhaC - 1).getHabilitacao());
                                System.out.println("7 - Experiência: " + arrayProfessor.get(escolhaC - 1).getExperiencia());
                                System.out.println("8 - Nota prova 1: " + arrayProfessor.get(escolhaC - 1).getNota1());
                                System.out.println("9 - Nota prova 2: " + arrayProfessor.get(escolhaC - 1).getNota2());
                                System.out.println("10 -Nota prova 3: " + arrayProfessor.get(escolhaC - 1).getNota3());
                                System.out.println("----------------------------------------------------");

                                do {
                                    System.out.println("Informe qual campo deseja alterar:");
                                    System.out.println("Exemplo: Digite 1 para alterar o Nome:");

                                    try {
                                        escolhaCd = sc.nextInt(); 
                                        if(escolhaCd <= 0 || escolhaCd > 10){
                                            System.out.println("Informe uma opção entre 1 e 10.");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                                    } sc.nextLine();
                                } while (escolhaCd <= 0 || escolhaCd > 10);


                                switch(escolhaCd){
                                    case 1:{
                                        System.out.println("Digite o nome completo:");
                                        nomeCompleto  = sc.nextLine();
                                        arrayProfessor.get(escolhaC - 1).setNomeCompleto(nomeCompleto);
                                        break;
                                    }

                                    case 2:{
                                        System.out.println("Digite o e-mail:");
                                        email = sc.nextLine();
                                        arrayProfessor.get(escolhaC - 1).setEmail(email);
                                        break;
                                    }

                                    case 3:{
                                        System.out.println("Digite o telefone:");
                                        telefone = sc.nextLine();
                                        arrayProfessor.get(escolhaC - 1).setTelefone(telefone);
                                        break;
                                    }

                                    case 4:{
                                        System.out.println("Digite o endereço: (Ex.: Rua Josefina, nº 145, Realeza)");
                                        endereco = sc.nextLine();
                                        arrayProfessor.get(escolhaC - 1).setEndereco(endereco);
                                        break;
                                    }

                                    case 5:{
                                        while(formacao < 1 || formacao > 5){
                                            System.out.println("Digite a formação do Candidato:");
                                            System.out.println("1 - Curso na Área - Carga horária min 180h");
                                            System.out.println("2 - Curso na Área - Carga horária min 360h");
                                            System.out.println("3 - Mestrado");
                                            System.out.println("4 - Doutorado");
                                            System.out.println("Caso possua o grau bacharelado, digite 5, mas será contabiliazado valor 0.");
                                        try {
            
                                            formacao = sc.nextInt();
            
                                            if(formacao < 1 || formacao > 5){
                                             System.out.println("Por favor, selecione um número entre 1 e 4.");
                                            }
                                            else{
                                                arrayProfessor.get(escolhaC - 1).setPontuacaoTotal(0);
                                                arrayProfessor.get(escolhaC - 1).setFormacao(formacao);
                                                arrayProfessor.get(escolhaC - 1).pontuacao();
                                            }
            
                                        } catch (Exception dados) {
                                            System.out.println("Você não digitou um dado válido, por favor, tente novamente.");  
                                        }sc.nextLine();
                                    }
                                        
                                        break;
                                    }

                                    case 6:{
                                        while(habilitacao != 1 && habilitacao != 2){
                                            System.out.println("O Candidato possui Licenciatura Plena ou Habilitação Pedagógica Docente?");
                                            System.out.println("1 - Sim 2 - Não");
                                            try {
                                                habilitacao = sc.nextInt();
                                                if(habilitacao != 1 && habilitacao != 2){
                                                    System.out.println("Por favor, selecione 1 ou 2.");
                                                }
                                                else{
                                                    arrayProfessor.get(escolhaC - 1).setPontuacaoTotal(0);
                                                    arrayProfessor.get(escolhaC - 1).setHabilitacao(habilitacao);
                                                    arrayProfessor.get(escolhaC - 1).pontuacao();
                                                }
                                            } catch (Exception e) {
                                                System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                                            } sc.nextLine();
                                        }
                                       
                                        break;
                                    }

                                    case 7:{
                                        do {
                                            System.out.println("Digite a experiência do Candidato:");
                                            try {
                                                experiencia = sc.nextInt();
                                                if(experiencia < 0){
                                                    System.out.println("A experiência em ANOS precisa ser maior ou igual a ZERO.");
                                                }
                                                else{
                                                    arrayProfessor.get(escolhaC - 1).setPontuacaoTotal(0);
                                                    arrayProfessor.get(escolhaC - 1).setExperiencia(experiencia);
                                                    arrayProfessor.get(escolhaC - 1).pontuacao();
                                                }
                                            } catch (Exception e) {
                                                System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                                            } sc.nextLine();
                                        } while (experiencia < 0);
                    
                                        break;
                                    }
                                    case 8:{
                                        do {
                                            System.out.println("Digite a nota da PRIMEIRA PROVA do Candidato:");
                                            try {
                                                nota1 = sc.nextInt();
                                                if(nota1 < 0 || nota1 > 100){
                                                    System.out.println("A nota da PROVA 1  precisa ser maior ou igual a ZERO e MENOR que 100.");
                                                }
                                                else{
                                                    arrayProfessor.get(escolhaC - 1).setPontuacaoTotal(0);
                                                    arrayProfessor.get(escolhaC - 1).setNota1(nota1);
                                                    arrayProfessor.get(escolhaC - 1).pontuacao();
                                                }
                                            } catch (Exception e) {
                                                System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                                            } sc.nextLine();
                                            
                                        } while (nota1 < 0 || nota1 > 100);
                                            
                                        break;
                                    }

                                    case 9:{
                                        do {
                                            System.out.println("Digite a nota da SEGUNDA PROVA do Candidato:");
                                            try {
                                                nota2 = sc.nextInt();
                                                if(nota2 < 0 || nota2 > 100){
                                                    System.out.println("A nota da PROVA 2  precisa ser maior ou igual a ZERO e MENOR que 100.");
                                                }
                                                else{
                                                    arrayProfessor.get(escolhaC - 1).setPontuacaoTotal(0);
                                                    arrayProfessor.get(escolhaC - 1).setNota2(nota2);
                                                    arrayProfessor.get(escolhaC - 1).pontuacao();
                                                }
                                            } catch (Exception e) {
                                                System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                                            }sc.nextLine();
                                            
                                        } while (nota2 < 0 || nota2 > 100);
                                        
                                        break;
                                    }

                                    case 10:{
                                        do {
                                            System.out.println("Digite a nota da TERCEIRA PROVA do Candidato:");
                                            try {
                                                nota3 = sc.nextInt();
                                                if(nota3 < 0 || nota3 > 100){
                                                    System.out.println("A nota da PROVA 3  precisa ser maior ou igual a ZERO e MENOR que 100.");
                                                }
                                                else{
                                                    arrayProfessor.get(escolhaC - 1).setPontuacaoTotal(0);
                                                    arrayProfessor.get(escolhaC - 1).setNota3(nota3);
                                                    arrayProfessor.get(escolhaC - 1).pontuacao();
                                                }
                                            } catch (Exception e) {
                                                System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                                            }sc.nextLine();
                                        } while (nota3 <  0 || nota3 > 100);
                                        break;
                                    }
                                }
                            }
                            break;
                        }

                        case 2:{
                            escolhaC = 0;
                            escolhaCT = 0;

                            if(arrayTae.isEmpty()){
                                System.out.println("Não existe nenhum candidato cadastrado para ser alterado!");
                            }

                            else{
                                do {
                                    System.out.println("Selecione qual candidato a TAE deseja ALTERAR:");
                                    for(int i = 0; i < arrayTae.size(); i++ ){
                                        System.out.print("Cód.: " + (i + 1) + " -- ");
                                        System.out.println("Nome: " + arrayTae.get(i).getNomeCompleto());
                                        System.out.println("----------------------------------------------------");
                                    }
                                    try {
                                        escolhaC = sc.nextInt();
                                        if(escolhaC <= 0 || escolhaC > (arrayTae.size())){
                                            System.out.println("Informe um número válido dentre as opções.");
                                        }

                                    } catch (Exception e) {
                                        System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                                    }sc.nextLine();
                                    
                                } while (escolhaC <= 0 || escolhaC > (arrayTae.size()));


                                System.out.println("Candidato:");
                                System.out.println("----------------------------------------------------");
                                System.out.println("1 - Nome: " + arrayTae.get(escolhaC - 1).getNomeCompleto());
                                System.out.println("2 - E-mail: " + arrayTae.get(escolhaC - 1).getEmail());
                                System.out.println("3 - Telefone: " + arrayTae.get(escolhaC - 1).getTelefone());
                                System.out.println("4 - Endereço: " + arrayTae.get(escolhaC - 1).getEndereco());
                                System.out.println("5 - Formação: " + arrayTae.get(escolhaC - 1).getTitulacao());
                                System.out.println("6 - Experiência: " + arrayTae.get(escolhaC - 1).getExperiencia());
                                System.out.println("----------------------------------------------------");


                                do {
                                    System.out.println("Informe qual campo deseja alterar:");
                                    System.out.println("Exemplo: Digite 1 para alterar o Nome:");

                                    try {
                                        escolhaCT = sc.nextInt(); 

                                        if(escolhaCT <= 0 || escolhaCT > 6){
                                            System.out.println("Informe uma opção entre 1 e 6.");
                                        }

                                    } catch (Exception e) {
                                        System.out.println("Você não digitou um dado válido, por favor, tente novamente.");
                                    }sc.nextLine();
                                } while (escolhaCT <= 0 || escolhaCT > 6);


                                switch(escolhaCT){
                                    case 1:{
                                        System.out.println("Digite o nome completo:");
                                        nomeCompleto  = sc.nextLine();
                                        arrayTae.get(escolhaC - 1).setNomeCompleto(nomeCompleto);
                                        break;
                                    }

                                    case 2:{
                                        System.out.println("Digite o e-mail:");
                                        email = sc.nextLine();
                                        arrayTae.get(escolhaC - 1).setEmail(email);
                                        break;
                                    }

                                    case 3:{
                                        System.out.println("Digite o telefone:");
                                        telefone = sc.nextLine();
                                        arrayTae.get(escolhaC - 1).setTelefone(telefone);
                                        break;
                                    }

                                    case 4:{
                                        System.out.println("Digite o endereço: (Ex.: Rua Josefina, nº 145, Realeza)");
                                        endereco = sc.nextLine();
                                        arrayTae.get(escolhaC - 1).setEndereco(endereco);
                                        break;
                                    }

                                    case 5:{

                                        while(formacao < 1 || formacao > 6){
                                            System.out.println("Digite a formação do Candidato:");
                                            System.out.println("1 - Ensino Médio");
                                            System.out.println("2 - Curso Superior - Área de Atuação");
                                            System.out.println("3 - Curso na Área - Carga horária min 180h");
                                            System.out.println("4 - Curso na Área - Carga horária min 360h");
                                            System.out.println("5 - Mestrado");
                                            System.out.println("6 - Doutorado");
                    
                                            try {
                                                formacao = sc.nextInt();
                    
                                                if(formacao < 1 || formacao > 6){
                                                    System.out.println("Por favor, selecione um número entre 1 e 6.");
                                                }
                                                else{
                                                    arrayTae.get(escolhaC - 1).setPontuacaoTotal(0);
                                                    arrayTae.get(escolhaC - 1).setFormacao(formacao);
                                                    arrayTae.get(escolhaC - 1).pontuacao();
                                                }
                                            } catch (Exception e) {
                                                System.out.println("Você não digitou um dado válido, por favor, tente novamente.");  
                                            } sc.nextLine();
                                        }
                                        break;
                                    }

                                    case 6:{
                                        do {
                                            System.out.println("Digite a experiência do Candidato:");
                                            try {
                                                experiencia = sc.nextInt();
                                                if(experiencia < 0){
                                                    System.out.println("A experiência em ANOS precisa ser maior ou igual a ZERO.");
                                                }
                                                else{
                                                    arrayTae.get(escolhaC - 1).setPontuacaoTotal(0);
                                                    arrayTae.get(escolhaC - 1).setExperiencia(experiencia);
                                                    arrayTae.get(escolhaC - 1).pontuacao();
                                                }
                                            } catch (Exception e) {
                                                System.out.println("Você não digitou um dado válido, por favor, tente novamente.");  
                                            } sc.nextLine();
                                        } while (experiencia < 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                case 10:{
                    System.exit(0);
                    break;
                }
        }
        }
    }
}
