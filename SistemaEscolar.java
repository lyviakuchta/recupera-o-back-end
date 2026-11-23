
import java.util.ArrayList;
import java.util.HashMap;

public class SistemaEscolar {
    public static void main(String[] args) {

        // Parte 1 - Fila de Atendimento com ArrayList

        ArrayList<String> fila = new ArrayList<>();

        fila.add("Bruna");
        fila.add("Martha");
        fila.add("Ramon");
        fila.add("Samuel");
        fila.add("Amanda");

        // Consultando a fila
        System.out.println("Fila completa: " + fila);
        System.out.println("Primeiro aluno: " + fila.get(0));
        System.out.println("Último aluno: " + fila.get(fila.size() - 1));
        System.out.println("Total aguardando: " + fila.size());

        // Atualizando a fila
        fila.remove(0);
        fila.remove("Ramon");

        System.out.println("\nFila atualizada: " + fila);
        System.out.println("Novo total aguardando: " + fila.size());


        // Parte 2 - Catálogo de Cursos com HashMap

        HashMap<Integer, String> cursos = new HashMap<>();

        // Cadastrando os cursos
        cursos.put(10, "Desenvolvimento de Sistemas");
        cursos.put(20, "Administração");
        cursos.put(30, "Enfermagem");
        cursos.put(40, "Informática");
        cursos.put(50, "Logística");

        // Exibindo todos os cursos
        System.out.println("\nCursos cadastrados: " + cursos);

        // Buscando cursos pelos códigos
        System.out.println("Curso código 10: " + cursos.get(10));
        System.out.println("Curso código 30: " + cursos.get(30));

        // Verificando o código 99
        if (cursos.containsKey(99)) {
            System.out.println("Curso código 99: " + cursos.get(99));
        } else {
            System.out.println("Código de curso inválido!");
        }

        // Removendo um curso
        cursos.remove(40);

        // Exibindo o mapa atualizado
        System.out.println("Cursos após remoção: " + cursos);

    }
}
