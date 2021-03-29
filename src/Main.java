import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("""
                 _       __________    __________  __  _________   __________     ________  ________   ____________  ______  __________     _________   _____ _____   ______\s
                | |     / / ____/ /   / ____/ __ \\/  |/  / ____/  /_  __/ __ \\   /_  __/ / / / ____/  / ____/ __ \\ \\/ / __ \\/_  __/ __ \\   / ____/   | / ___//  _/ | / / __ \\
                | | /| / / __/ / /   / /   / / / / /|_/ / __/      / / / / / /    / / / /_/ / __/    / /   / /_/ /\\  / /_/ / / / / / / /  / /   / /| | \\__ \\ / //  |/ / / / /
                | |/ |/ / /___/ /___/ /___/ /_/ / /  / / /___     / / / /_/ /    / / / __  / /___   / /___/ _, _/ / / ____/ / / / /_/ /  / /___/ ___ |___/ // // /|  / /_/ /\s
                |__/|__/_____/_____/\\____/\\____/_/  /_/_____/    /_/  \\____/    /_/ /_/ /_/_____/   \\____/_/ |_| /_/_/     /_/  \\____/   \\____/_/  |_/____/___/_/ |_/\\____/ \s
                                                                                                                                                                            \s""");

        System.out.println("""
                                                                                                                   \s
                                                                                                                   \s
                                                                  `//`                                             \s
                                                                 `+s+/.                                            \s
                                                                .oss+++.                                           \s
                                                               :ssss++++:`                                         \s
                                                             `/sssss+++++/`                                        \s
                                                            `+ssssss++++++/.                                       \s
                                                           .osssssss++++++++-                                      \s
                                                          :ossssssss+++++++++-                                     \s
                                                        `/ssssssssss++++++++++:`                                   \s
                                                       `+sssssssssss+++++++++++/.                                  \s
                                                      -ossssssssssss++++++++++++/-                                 \s
                                                     -ssssssssssssss++++++++++++++-                                \s
                                                   `/sssssssssssssss+++++++++++++++:`                              \s
                                                  `+ssssssssssssssss++++++++++++++++/.                             \s
                                                 .osssssssssssssssss+++++++++++++++++/.                            \s
                                                :sssssssssssssssssss+++++++++++++++++++:                           \s
                                              `/ssssssssssssssssssss++++++++++++++++++++:`                         \s
                                             `+ssssssssssssssssssoo+-:://++++++++++++++++/.                        \s
                                            .ossssssssssssssoo++++++-...--:///+++++++++++++.                       \s
                                           -ssssssssssssoo++++++++++-.......--:://++++++++++-                      \s
                                          /ssssssssoo+++++++++++++++-............--://+++++++/`                    \s
                                        `+ssssooo+++++++++++++++++++-.................-:://+++/`                   \s
                                       .osoo++++++++++++++++++++++++-......................-://+-                  \s
                                       +++++++++++++++++++++++++++++-..........................-:`                 \s
                                        `.:+++++++++++++++++++++++++-.......................-.``                   \s
                                            .:/+++++++++++++++++++++-......................`                       \s
                                       .`      `-:/+++++++++++++++++-...................`       .`                 \s
                                       .++-.       .:/++++++++++++++-...............`       `.:/.                  \s
                                        `+so+:.`      `-:+++++++++++-............`       .-:/+/`                   \s
                                          -ossso/-`      `.:/+++++++-........``      `.://++/-                     \s
                                           .+ssssso+:.      ``-//+++-.....`       `-:/+++++/.                      \s
                                             -sssssssoo/-`      `-:/...       `.://+++++++-                        \s
                                              .+ssssssssso+-.`     `       `.:/+++++++++/.                         \s
                                               `/ossssssssssoo:.`      `.-//+++++++++++:`                          \s
                                                 .+ssssssssssssso/-.`.:/+++++++++++++/.                            \s
                                                  `/ssssssssssssssso++++++++++++++++:`                             \s
                                                    -ossssssssssssss++++++++++++++/-                               \s
                                                     `/sssssssssssss+++++++++++++/`                                \s
                                                       -osssssssssss+++++++++++/-                                  \s
                                                        `/ssssssssss++++++++++/.                                   \s
                                                          :ossssssss++++++++/:`                                    \s
                                                           .+sssssss+++++++/.                                      \s
                                                             /osssss++++++:`                                       \s
                                                              .+ssss++++/.                                         \s
                                                               `/sss+++/`                                          \s
                                                                 -os+/-                                            \s
                                                                  `//`                                             \s
                                                                                                                   \s
                                                                                                                   \s
                """);


        System.out.println("""
                 ____                                                 _                       _                         _                \s
                |  _ \\  _ __    ___    ___   ___      ___    _ __   | |_    ___    _ __     | |_     ___       _ __   | |   __ _   _   _\s
                | |_) | | '__|  / _ \\ / __| / __|    / _ \\ | '_ \\ | __|  / _ \\ | '__|    | __|   / _ \\    | '_ \\ | |  / _` | | | | |
                |  __/  | |    |  __/ \\__ \\ \\__ \\   |  __/ | | | | | |_  |  __/ | |      | |_   | (_) |    | |_) | | | | (_| | | |_| |
                |_|     |_|     \\___| |___/ |___/    \\___| |_| |_|  \\__|  \\___| |_|      \\__|  \\___/    | .__/  |_|  \\__,_|\\__, |
                                                                                                               |_|                  |___/\s""".indent(1));


        Scanner stringInput = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        String[] symbols = {"{$}", "{€}", "{J}", "{7}"};

        boolean x = true;

        int counterWins = 0;
        int counterLoss = 0;
        int eth;
        int ethSpin = 0;


        String question = stringInput.nextLine();
        System.out.println();

        System.out.println("How much ETH would you like to deposit");
        int deposit = input.nextInt();

        eth = deposit;

        System.out.println("How much would you like to spin for");
        int creditPerSpin = input.nextInt();

        while (deposit == 0) {

            System.out.println("eth = 0");


        } while (eth < ethSpin){
            System.out.println("eth < ethSpin");
        }


        while (x) {
            eth = deposit - creditPerSpin;
            String randomSymbol1 = symbols[(int) Math.floor(Math.random() * symbols.length)];
            String randomSymbol2 = symbols[(int) Math.floor(Math.random() * symbols.length)];
            String randomSymbol3 = symbols[(int) Math.floor(Math.random() * symbols.length)];
            String randomSymbol4 = symbols[(int) Math.floor(Math.random() * symbols.length)];


            String[] animationChars = new String[]{"-$-", "-€-", "-J-", "-7-"};

            for (int i = 0; i <= 250; i++) {

                Random random = new Random();

                System.out.print("| " + animationChars[random.nextInt(4)] + " | " + animationChars[random.nextInt(4)] + " | " + animationChars[random.nextInt(4)] + " | " + animationChars[random.nextInt(4)] + " |" + "\r");


                try {

                    Thread.sleep(5);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            }


            for (int i = 0; i <= 300; i++) {
                System.out.print("| " + randomSymbol1);

                Random random = new Random();
                System.out.print(" | " + animationChars[random.nextInt(4)] + " | " + animationChars[random.nextInt(4)] + " | " + animationChars[random.nextInt(4)] + " | " + "\r");

                try {

                    Thread.sleep(5);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            }


            for (int i = 0; i <= 400; i++) {
                System.out.print("| " + randomSymbol1 + " | " + randomSymbol2 + " | ");

                Random random = new Random();

                System.out.print(animationChars[random.nextInt(4)] + " | " + animationChars[random.nextInt(4)] + " | " + "\r");

                try {

                    Thread.sleep(5);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            }


            for (int i = 0; i <= 500; i++) {

                System.out.print("| " + randomSymbol1 + " | " + randomSymbol2 + " | " + randomSymbol3 + " | ");

                Random random = new Random();

                System.out.print(animationChars[random.nextInt(4)] + " | " + "\r");

                try {

                    Thread.sleep(5);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            }
            System.out.println("| " + randomSymbol1 + " | " + randomSymbol2 + " | " + randomSymbol3 + " | " + randomSymbol4 + " |");


            if ((randomSymbol1 == randomSymbol2)

                    && (randomSymbol1 == randomSymbol3)

                    && (randomSymbol1 == randomSymbol4)

                    && (randomSymbol2 == randomSymbol3)

                    && (randomSymbol2 == randomSymbol4)

                    && (randomSymbol3 == randomSymbol4)) {

                counterWins++;
                eth = deposit + creditPerSpin;
                System.out.println("\n" + " Jackpot!");
                System.out.println("\n" + "Wins: " + counterWins + "Losses: " + counterLoss);
                System.out.println("\n" + "Etherium: " + eth);
            } else {
                counterLoss++;

                if (deposit < creditPerSpin) {
                    eth = deposit - creditPerSpin;
                    System.out.println("\n" + "Credit: 0");
                }
                System.out.println("\n" + " No wins");
                System.out.println("\n" + "Wins: " + counterWins + " " + "Losses: " + counterLoss);
                System.out.println("\n" + "Credit: " + eth);
            }

            x = false;
            System.out.println("\n" + "Would you like to play again?");
            System.out.println();

            question = stringInput.nextLine();
            System.out.println();

            if (question.equals("yes")) {

                x = true;

            } else if (question.equals("no")) {

                x = false;

            }

        }
    }

}
