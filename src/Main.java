public class Main {

    public static void main(String[] args) {

        double[] faturamentoDiario = { 100, 200, 0, 150, 300, 0, 250, 180, 220, 0, 280, 320 };

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;


        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }

        double mediaAnual = somaFaturamento / diasComFaturamento;

        int diasSuperiorMedia = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0 && faturamento > mediaAnual) {
                diasSuperiorMedia++;
            }
        }

        System.out.println("Menor valor de faturamento ocorrido em um dia do ano: " + menorFaturamento);
        System.out.println("Maior valor de faturamento ocorrido em um dia do ano: " + maiorFaturamento);
        System.out.println("numero de dias com faturamento diário superior a media anual: " + diasSuperiorMedia);
    }
}
