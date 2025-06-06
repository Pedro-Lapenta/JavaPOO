public class Main {
    public static void main(String[] args) throws Exception {
        // Criando universidade
        Universidade unesp = new Universidade("001", "UNESP", 3);

        // Criando departamentos
        Departamento dep1 = new Departamento("D01", "Computação", 5);
        Departamento dep2 = new Departamento("D02", "Matemática", 5);

        // Adicionando departamentos à universidade
        unesp.addDepartamento(dep1);
        unesp.addDepartamento(dep2);

        // Adicionando docentes
        unesp.addDocente("D01", "F01", "João", 5000, 1.2f, "Doutor");
        unesp.addDocente("D01", "F02", "Maria", 4000, 1.1f, "Mestre");
        unesp.addDocente("D02", "F03", "Carlos", 4500, 1.3f, "Doutor");

        // Adicionando técnicos
        unesp.addTecnico("D01", "T01", "Ana", 3000, "Pleno");
        unesp.addTecnico("D02", "T02", "Pedro", 3200, "Sênior");

        // Exibir departamentos
        System.out.println("=== Departamentos ===");
        unesp.exibirDepartamentos();

        // Exibir docentes
        System.out.println("\n=== Docentes ===");
        unesp.exibirDocentes();

        // Buscar docente
        System.out.println("\n=== Buscar Docente F02 ===");
        Docente docente = unesp.buscaDocente("F02");
        if (docente != null) {
            docente.exibir();
        } else {
            System.out.println("Docente não encontrado.");
        }

        // Exibir departamentos com gasto entre valores
        System.out.println("\n=== Departamentos com gasto entre 4000 e 10000 ===");
        unesp.exibirDepartamentoComGastoEntre(4000, 10000);

        // Testar métodos do departamento diretamente
        System.out.println("\n=== Funcionários do Departamento de Computação ===");
        dep1.exibirFuncionarios();

        System.out.println("\n=== Total de salários do Departamento de Computação ===");
        System.out.println(dep1.calcularTotalSalarios());
    }
}
