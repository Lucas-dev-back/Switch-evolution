public class App {
    public static void main(String[] args) {
        System.out.println(mensagemNoob(Constantes.SEXTA));
        System.out.println(mensagemIntermediario(Constantes.SEXTA));
        System.out.println(mensagemAvancado(Constantes.SEXTA));
    }

    public static String mensagemNoob(Constantes constante) {
        switch (constante) {
            case SEGUNDA:
                return "DIA ÚTIL";
            case TERÇA:
                return "DIA ÚTIL";
            case QUARTA:
                return "DIA ÚTIL";
            case QUINTA:
                return "DIA ÚTIL";
            case SEXTA:
                return "DIA ÚTIL";
            case SABADO:
                return "TÁ LIVRE";
            case DOMINGO:
                return "TÁ LIVRE";
            default:
                return "TÁ INVENTANDO MODA";
        }
    }

    public static String mensagemIntermediario(Constantes constante) {
        switch (constante) {
            case SEGUNDA:
            case TERÇA:
            case QUARTA:
            case QUINTA:
            case SEXTA:
                return "DIA ÚTIL";
            case SABADO:
            case DOMINGO:
                return "TÁ LIVRE";
            default:
                return "TÁ INVENTANDO MODA";
        }
    }

    public static String mensagemAvancado(Constantes constante) {
        return switch (constante) {
            case SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA -> "DIA ÚTIL";
            case SABADO, DOMINGO -> "TÁ LIVRE";
            default -> "TÁ INVENTANDO MODA";
        };
    }

}
