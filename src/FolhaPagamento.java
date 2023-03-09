public class FolhaPagamento {


    //Método
    double calcularSalario(int horaNormal, int horaExtra, double valorHoraNormal, double valorHoraExtra ) {

        double salarioHoraNormal = horaNormal * valorHoraNormal;
        double salarioHoraExtra = horaExtra * valorHoraExtra;
        return salarioHoraNormal + salarioHoraExtra;
    }
}