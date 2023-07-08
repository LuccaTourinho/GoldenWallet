package Main;

import java.io.PrintStream;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import Tabelas.*;
import DB.*;
import DAO_Interface.*;
import DAO.*;


public class Main {

    static PrintStream console = System.out;
    static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean continua = true;

        while(continua){
            console.println("""
                    ***Comandos o banco golden_wallet***

                    Escolha uma das tabelas se quiser continuar, caso contrario irá finalizar o processo.

                    1.TB_USUARIO
                    2.TB_PAIS
                    7.TB_MOEDA                 
                    
                    """);

            /*
                    3.TB_BANCO
                    4.TB_CAT_RECEITA
                    5.TB_CAT_DESPESA
                    6.TB_PLANEJAMENTO
                    8.TB_CONTA
                    9.TB_LANCAMENTO
                    10.TB_APORTE_PLAN
                    11.TB_TRANSFERENCIA
                    12.TB_RECEITA
                    13.TB_DESPESA
                    14.TB_CARTAO_CREDITO
                    15.TB_LANC_CARTAO_CREDITO
                    16.TB_FATURA
                    17.TB_LIMITES_GASTOS
                    18.TB_LOG
             */

            int ind1 = scanner.nextInt();

            console.println("""
                    Escolha uma das ações se quiser continuar, caso contrário irá finalizar o processo.

                    1. INSERT
                    2. UPDATE
                    3. DELETE
                    4. SELECT
                    5. SELECT*
                    
                    """);

            int ind2 = scanner.nextInt();

            if (ind1 > 18 || ind1 < 1 || ind2 < 1 || ind2 > 5) {
                continua = false;
            } else {
                switch (ind1) {
                    case 1:
                        metodoTB_USUARIO(ind2);
                        break;
                    case 2:
                        metodoTB_PAIS(ind2);
                        break;
                        /*
                    case 3:
                        metodoTB_BANCO(ind2);
                        break;
                    case 4:
                        metodoTB_CAT_RECEITA(ind2);
                        break;
                    case 5:
                        metodoTB_CAT_DESPESA(ind2);
                        break;
                    case 6:
                        metodoTB_PLANEJAMENTO(ind2);
                        break;
                        */
                    case 7:
                        metodoTB_MOEDA(ind2);
                        break;
                        /*
                    case 8:
                        metodoTB_CONTA(ind2);
                        break;
                    case 9:
                        metodoTB_LANCAMENTO(ind2);
                        break;
                    case 10:
                        metodoTB_APORTE_PLAN(ind2);
                        break;
                    case 11:
                        metodoTB_TRANSFERENCIA(ind2);
                        break;
                    case 12:
                        metodoTB_RECEITA(ind2);
                        break;
                    case 13:
                        metodoTB_DESPESA(ind2);
                        break;
                    case 14:
                        metodoTB_CARTAO_CREDITO(ind2);
                        break;
                    case 15:
                        metodoTB_LANC_CARTAO_CREDITO(ind2);
                        break;
                    case 16:
                        metodoTB_FATURA(ind2);
                        break;
                    case 17:
                        metodoTB_LIMITES_GASTOS(ind2);
                        break;
                    case 18:
                        metodoTB_LOG(ind2);
                        break;
                         */
                }
            }
        }

        scanner.close();
    }

    private static void metodoTB_USUARIO(int i2) {
        Scanner scanner = new Scanner(System.in);

        UsuarioDAO usuarioDAO = new UsuarioDAOImpl(); // Instanciar o DAO correspondente

        switch (i2) {
            case 1: // INSERT
                console.println("Digite o nome do usuário: ");
                String nomeUsuario = scanner.nextLine();
                console.println("Digite a senha do usuário: ");
                String senha = scanner.nextLine();

                Usuario usuario = new Usuario(nomeUsuario, senha);
                usuarioDAO.inserirUsuario(usuario);
                console.println("Usuário inserido com sucesso!");
                break;

            case 2: // UPDATE
                console.println("""
                    Escolha o que deseja atualizar:
                    1. Mudar nome
                    2. Mudar senha
                    Default: Nome
                """);
                int ind3 = scanner.nextInt();
                scanner.nextLine();

                switch (ind3) {
                    case 1: // Mudar nome
                        console.println("Digite o nome do usuário a ser atualizado: ");
                        String nomeUsuarioSubstituido = scanner.nextLine();
                        console.println("Digite o novo nome do usuário: ");
                        String nomeUsuarioSubstituto = scanner.nextLine();

                        usuarioDAO.atualizarUsuarioNome(nomeUsuarioSubstituto, nomeUsuarioSubstituido);
                        console.println("Nome do usuário atualizado com sucesso!");
                        break;

                    case 2: // Mudar senha
                        console.println("Digite o nome do usuário: ");
                        String nomeUsuarioSenha = scanner.nextLine();
                        console.println("Digite a nova senha do usuário: ");
                        String senhaUsuarioSubstituta = scanner.nextLine();

                        usuarioDAO.atualizarUsuarioSenha(senhaUsuarioSubstituta, nomeUsuarioSenha);
                        console.println("Senha do usuário atualizada com sucesso!");
                        break;

                    default: // Nome
                        console.println("Digite o nome do usuário a ser atualizado: ");
                        String nomeUsuarioSubstituidoDefault = scanner.nextLine();
                        console.println("Digite o novo nome do usuário: ");
                        String nomeUsuarioSubstitutoDefault = scanner.nextLine();

                        usuarioDAO.atualizarUsuarioNome(nomeUsuarioSubstitutoDefault, nomeUsuarioSubstituidoDefault);
                        console.println("Nome do usuário atualizado com sucesso!");
                        break;
                }
                break;

            case 3: // DELETE
                console.println("Digite o nome do usuário a ser excluído: ");
                String nomeUsuarioExcluir = scanner.nextLine();

                usuarioDAO.excluirUsuario(nomeUsuarioExcluir);
                console.println("Usuário excluído com sucesso!");
                break;

            case 4: // SELECT
                console.println("Digite o ID do usuário a ser buscado: ");
                int idUsuario = scanner.nextInt();

                Usuario usuarioBuscado = usuarioDAO.buscarUsuarioPorId(idUsuario);

                if (usuarioBuscado != null) {
                    console.println("Usuário encontrado:");
                    console.println("ID: " + usuarioBuscado.getIdUsuario());
                    console.println("Nome: " + usuarioBuscado.getNomeUsuario());
                    console.println("Senha: " + usuarioBuscado.getSenha());
                } else {
                    console.println("Usuário não encontrado!");
                }
                break;

            case 5: // SELECT*
                List<Usuario> usuarios = usuarioDAO.listarUsuarios();

                if (!usuarios.isEmpty()) {
                    console.println("Lista de usuários:");
                    for (Usuario u : usuarios) {
                        console.println("ID: " + u.getIdUsuario());
                        console.println("Nome: " + u.getNomeUsuario());
                        console.println("Senha: " + u.getSenha());
                        console.println("-----------");
                    }
                } else {
                    console.println("Não há usuários cadastrados!");
                }
                break;

            default:
                break;
        }
    }

    private static void metodoTB_PAIS(int i2) {
        Scanner scanner = new Scanner(System.in);

        PaisDAO paisDAO = new PaisDAOImpl(); // Instanciar o DAO correspondente

        switch (i2) {
            case 1: // INSERT
                console.println("Digite o nome do país: ");
                String nomePais = scanner.nextLine();
                console.println("Digite a sigla do país: ");
                String siglaPais = scanner.nextLine();

                Pais pais = new Pais(nomePais, siglaPais);
                paisDAO.inserirPais(pais);
                break;

            case 2: // UPDATE
                console.println("Digite o nome do país a ser atualizado: ");
                String nomePaisSubstituido = scanner.nextLine();
                console.println("Digite a sigla do país a ser atualizado: ");
                String siglaPaisSubstituida = scanner.nextLine();
                console.println("Digite o novo nome do país: ");
                String nomePaisSubstituto = scanner.nextLine();
                console.println("Digite a nova sigla do país: ");
                String siglaPaisSubstituta = scanner.nextLine();

                paisDAO.atualizarPaisNomeSigla(nomePaisSubstituto, siglaPaisSubstituta, nomePaisSubstituido, siglaPaisSubstituida);
                break;

            case 3: // DELETE
                console.println("Digite o nome do país a ser excluído: ");
                String nomePaisExcluir = scanner.nextLine();

                paisDAO.excluirPais(nomePaisExcluir);
                break;

            case 4: // SELECT
                console.println("Digite o ID do país a ser buscado: ");
                int idPais = scanner.nextInt();

                Pais paisBuscado = paisDAO.buscarPaisporID(idPais);

                if (paisBuscado != null) {
                    console.println("País encontrado:");
                    console.println("ID: " + paisBuscado.getIdPais());
                    console.println("Nome: " + paisBuscado.getNomePais());
                    console.println("Sigla: " + paisBuscado.getSiglaPais());
                } else {
                    console.println("País não encontrado!");
                }
                break;

            case 5: // SELECT*
                List<Pais> paises = paisDAO.listarPais();

                if (!paises.isEmpty()) {
                    console.println("Lista de países:");
                    for (Pais p : paises) {
                        console.println("ID: " + p.getIdPais());
                        console.println("Nome: " + p.getNomePais());
                        console.println("Sigla: " + p.getSiglaPais());
                        console.println("-----------");
                    }
                } else {
                    console.println("Não há países cadastrados!");
                }
                break;

            default:
                break;
        }
    }

/*
    private static void metodoTB_BANCO(int i2) {
        // Implementação para a tabela TB_BANCO
    }

    private static void metodoTB_CAT_RECEITA(int i2) {
        // Implementação para a tabela TB_CAT_RECEITA
    }

    private static void metodoTB_CAT_DESPESA(int i2) {
        // Implementação para a tabela TB_CAT_DESPESA
    }

    private static void metodoTB_PLANEJAMENTO(int i2) {
        // Implementação para a tabela TB_PLANEJAMENTO
    }
*/
    // Métodos para tabela TB_MOEDA

    public static void metodoTB_MOEDA(int ind){
        Scanner scanner = new Scanner(System.in);
        MoedaDAO moedaDAO = new MoedaDAOImpl();

        switch (ind){
            case 1:
                console.println("Inserir Moeda");
                console.println("Digite o id do pais da moeda: ");
                Integer idpm = scanner.nextInt();
                scanner.nextLine();
                console.println("Digite a sigla da moeda: ");
                String sigla = scanner.nextLine();
                console.println("Digite o símbolo da moeda: ");
                String simbolo = scanner.nextLine();

                Moeda moeda = new Moeda(idpm, sigla, simbolo);
                moedaDAO.inserirMoeda(moeda);
                break;

            case 2:
                console.println("Atualizar Moeda");
                console.println("Digite o ID do pais_FK a ser atualizado: ");
                int idmOLD = scanner.nextInt();
                scanner.nextLine();
                console.println("Digite o ID do novo pais_FK: ");
                int idmNEW = scanner.nextInt();
                scanner.nextLine();
                moedaDAO.atualizarMoeda(idmNEW,idmOLD);
                break;

            case 3:
                console.println("Excluir Moeda");
                console.println("Digite o ID da moeda a ser excluída: ");
                int idM = scanner.nextInt();
                scanner.nextLine();
                moedaDAO.excluirMoeda(idM);
                break;

            case 5:
                console.println("Listar Moedas");
                List<Moeda> moedas = moedaDAO.listarMoeda();
                if(!moedas.isEmpty()){
                    for(Moeda coin : moedas){
                        console.println(coin.toString());
                    }
                }else{
                    console.println("Não há moedas cadastradas");
                }

                break;

            case 4:
                console.println("Buscar Moeda");
                console.println("Digite o ID da moeda a ser buscada: ");
                int idMoe = scanner.nextInt();
                scanner.nextLine();
                Moeda moedaBusca = moedaDAO.buscarMoeda(idMoe);
                if(moedaBusca != null){
                    console.println(moedaBusca.toString());
                } else {
                    console.println("Moeda não encontrada.");
                }
                break;

            default:
                break;
        }
    }

/*
    private static void metodoTB_CONTA(int i2) {
        // Implementação para a tabela TB_CONTA
    }

    private static void metodoTB_LANCAMENTO(int i2) {
        // Implementação para a tabela TB_LANCAMENTO
    }

    private static void metodoTB_APORTE_PLAN(int i2) {
        // Implementação para a tabela TB_APORTE_PLAN
    }

    private static void metodoTB_TRANSFERENCIA(int i2) {
        // Implementação para a tabela TB_TRANSFERENCIA
    }

    private static void metodoTB_RECEITA(int i2) {
        // Implementação para a tabela TB_RECEITA
    }

    private static void metodoTB_DESPESA(int i2) {
        // Implementação para a tabela TB_DESPESA
    }

    private static void metodoTB_CARTAO_CREDITO(int i2) {
        // Implementação para a tabela TB_CARTAO_CREDITO
    }

    private static void metodoTB_LANC_CARTAO_CREDITO(int i2) {
        // Implementação para a tabela TB_LANC_CARTAO_CREDITO
    }

    private static void metodoTB_FATURA(int i2) {
        // Implementação para a tabela TB_FATURA
    }

    private static void metodoTB_LIMITES_GASTOS(int i2) {
        // Implementação para a tabela TB_LIMITES_GASTOS
    }

    private static void metodoTB_LOG(int i2) {
        // Implementação para a tabela TB_LOG
    }
*/
}