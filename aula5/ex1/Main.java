public class Main {
    public static void main(String[] args) {
        // Criando uma peça normal
        Peca p1 = new Peca("Parafuso", 2.0f, 1.0f);
        System.out.println("=== Peça Nacional ===");
        p1.exibir();

        System.out.println();

        // Parafuso importado
        Peca p2 = new PecaImportada("Parafuso Importado", 2.0f, 1.10f, 
        1.10f, 1.15f);
        System.out.println("=== Parafuso Importado ===");
        p2.exibir();

        // Criando uma peça importada
        PecaImportada p3 = new PecaImportada("Motor", 500.0f, 200.0f, 
        1.10f, 1.15f);
        System.out.println("=== Peça Importada ===");
        p3.exibir();

    }
}

