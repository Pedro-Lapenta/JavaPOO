package ex3;

public class Main {
    public static void main(String[] args) {
    
    // -------- PRODUTOS ESTADUAIS --------- // 
        Estadual[] estaduais = Estadual.criaEstadual(5);

        estaduais[0] = new Estadual("Produto A", 100.0f);
        estaduais[1] = new Estadual("Produto B", 200.0f);
        estaduais[2] = new Estadual("Produto C", 150.0f);
        estaduais[3] = new Estadual("Produto D", 300.0f);
        estaduais[4] = new Estadual("Produto E", 250.0f);

        Estadual.exibeEstadual(estaduais);
    
    // -------- PRODUTOS NACIONAIS --------- // 
        Nacional[] nacionais = Nacional.criaNacional(5);

        nacionais[0] = new Nacional("Produto A", 100.0f);
        nacionais[1] = new Nacional("Produto B", 200.0f);
        nacionais[2] = new Nacional("Produto C", 150.0f);
        nacionais[3] = new Nacional("Produto D", 300.0f);
        nacionais[4] = new Nacional("Produto E", 250.0f);
        
        Nacional.exibeNacional(nacionais);

        Internacional[] internacionais = Internacional.criaInternacional(5);

    // -------- PRODUTOS INTERNACIONAIS --------- // 

        internacionais[0] = new Internacional("Produto A", 100.0f);
        internacionais[1] = new Internacional("Produto B", 200.0f);
        internacionais[2] = new Internacional("Produto C", 150.0f);
        internacionais[3] = new Internacional("Produto D", 300.0f);
        internacionais[4] = new Internacional("Produto E", 250.0f);
        
        Internacional.exibeInternacional(internacionais);
    }   
}
