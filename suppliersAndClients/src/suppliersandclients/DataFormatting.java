package suppliersandclients;

public class DataFormatting {
    public static boolean isNumeric(String str) { // estão como static pois os métodos pertencem à própria classe, e não a instâncias individuais da classe
        return str.matches("\\d+");
    }

    public static String formatPhoneNumber(String phoneNumber) {
        return phoneNumber.replaceAll("(\\d{2})(\\d{4})(\\d{4})", "($1) $2-$3");
    }

    public static String formatCPF(String cpf) {
        return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }
    
    public static String formatCNPJ(String cnpj) {
        return cnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
    }
    
    public static String formatInscricaoEstadual(String inscricaoEstadual) {
        return inscricaoEstadual.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{3})", "$1.$2.$3-$4");
    }

    public static String formatInscricaoMunicipal(String inscricaoMunicipal) {
        return inscricaoMunicipal.replaceAll("(\\d{4})(\\d{3})(\\d{3})", "$1.$2.$3");
    }
}
