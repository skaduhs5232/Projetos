import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota;
        float els;
        float nota2;


        System.out.println("digite a sua primeira nota da av1:");
        nota = input.nextInt();
        System.out.println("digite a sua segunda nota da av1");
        nota2 = input.nextFloat();
        float notaf = (nota + nota2) / 2;

        if ((nota + nota2) / 2 >= 5) {

            System.out.format(" sua nota é %.2f e voce esta aprovado na Av1\n", notaf);

        } else {
            els = 10 - notaf;
            System.out.format(" sua nota é %.2f e voce nao foi aprovado e faltou %.2f para voce ser aprovado na AV1 \n", notaf, els);
        }


        Scanner av = new Scanner(System.in);
        float av2n1;
        float av2n2;

        System.out.println("digite a primeira nota da Av2");
        av2n1 = av.nextFloat();

        System.out.println("digite a segunda nota da Av2");
        av2n2 = av.nextFloat();

        float av2f = (av2n1 + av2n2) / 2;

        float med = (notaf + av2f) / 2;
        System.out.println(med);

        if ((av2n1 + av2n2) / 2 >= 5) {

            System.out.format("Parabens voce passou, sua media de Av2 foi %.2f\n", av2f);


        } else {
            System.out.format("infelizmente voce nao passou, sua media da Av2 foi %.2f\n", av2f);
            System.out.format("voce nao avançou para Av3, sua media da Av1 e Av2 foi %.2f e nao foi suficiente\n", med);

        }

        float av3m;
        if (med >= 5) {
            Scanner avv = new Scanner(System.in);
            float av3n1;
            float av3n2;

            System.out.format("voce avançou para Av3, sua media da Av1 e Av2 foi %.2f\n", med);

            System.out.println("agora digite a sua primeira nota de Av3 (seja trabalho ou prova)");
            av3n1 = avv.nextFloat();

            System.out.println("agora digite a sua segunda nota de Av3 (seja trabalho ou prova)");
            av3n2 = avv.nextFloat();

            av3m = (av3n1 + av3n2) / 2;

            if ((av3n1 + av3n2) / 2 >= 5) {
                System.out.printf("Parabens, voce passou de semestre nessa materia, sua media final foi de %.2f\n", av3m);

                int tamanho = 5;

                for (int linha = tamanho / 2; linha <= tamanho; linha += 2) {
                    for (int espaco = 1; espaco < tamanho - linha; espaco += 2) {
                        System.out.print(" ");
                    }

                    for (int asterisco = 1; asterisco <= linha; asterisco++) {
                        System.out.print(".");
                    }

                    for (int espaco = 1; espaco <= tamanho - linha; espaco++) {
                        System.out.print(" ");
                    }

                    for (int asterisco = 1; asterisco <= linha; asterisco++) {
                        System.out.print(".");
                    }

                    System.out.println();
                }

                for (int linha = tamanho; linha >= 1; linha--) {
                    for (int espaco = linha; espaco < tamanho; espaco++) {
                        System.out.print(" ");
                    }

                    for (int asterisco = 1; asterisco <= (linha * 2) - 1; asterisco++) {
                        System.out.print(".");
                    }

                    System.out.println();
                System.out.println("ate proximo semestre");
                }
            }

        } else {

            System.out.println("voce nao passou de semestre");
        }
    }
}



