package ex4;

public class Main {
    public static void main(String[] args) {
        Horario horario1 = new Horario(12, 35, 20);
        horario1.exibirHorario();
        horario1.calcularSegundos();

        Horario horario2 = new Horario(30, 120, -30);
        horario2.exibirHorario();
        horario2.calcularSegundos();

        Horario horarioSemParametro = new Horario();
        horarioSemParametro.exibirHorario();
        horarioSemParametro.calcularSegundos();
    }
}
