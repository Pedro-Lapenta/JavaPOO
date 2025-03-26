package ex4;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(){}

    public Horario(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora(){
        return hora;
    }

    public int getMinuto(){
        return minuto;
    }

    public int getSegundo(){
        return segundo;
    }

    public void setHora(int hora){
        if (hora >= 0 && hora < 24){
            this.hora = hora;
        }
        else {
            System.out.println("HORA INVALIDA || SETADO PARA HORA PADRAO (0)");
            this.hora = 0;
        }
    }

    public void setMinuto(int minuto){
        if (minuto >= 0 && minuto < 60){
            this.minuto = minuto;
        }
        else {
            System.out.println("MINUTO INVALIDO  || SETADO PARA MINUTOs PADRAO (0)");
            this.minuto = 0;
        }
    }

    public void setSegundo(int segundo){
        if (segundo >= 0 && segundo < 60){
            this.segundo = segundo;
        }
        else {
            System.out.println("SEGUNDO INVALIDO || SETADO PARA SEGUNDO PADRAO (0)");
            this.segundo = 0;
        }
    }

    public void exibirHorario(){
        System.out.println("HORARIO: " + hora + ":" + minuto + ":" + segundo);
    }

    public int calcularSegundos(){
        int horarioEmSegundos = 3600 * hora + 60 * minuto + segundo;
        System.out.println("Horario em Segundos: " + horarioEmSegundos + " segundos");

        return horarioEmSegundos;
    }
    
}
