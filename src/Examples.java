public class Examples {

    public static void main(String[] args) {

        System.out.println("---------- charAt ----------");
        String[] names = {"Marek", "Karol", "Justyna", "Karolina"};
        for(String name : names){
            if(name.charAt(0) == 'K'){
                System.out.println(name);
            }
        }

        System.out.println("---------- indexOf ----------");
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
        System.out.println(text.indexOf('.'));

        System.out.println("---------- lastIndexOf ----------");
        text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
        System.out.println(text.lastIndexOf('.'));

        System.out.println("---------- startsWith ----------");
        String[] pesels = {"99011222239", "88011751221", "50112751261" };
        for(String pesel: pesels){
            if(pesel.startsWith("88")){
                System.out.println(pesel);
            }
        }

        System.out.println("---------- endsWith ----------");
        String[] files= {"cv.pdf", "passwords.txt", "example.sql", "notes.txt", "draft.doc"};
        for(String file: files){
            if(file.endsWith(".txt")){
                System.out.println(file);
            }
        }

        System.out.println("---------- length ----------");
        String[] names2 = {"Marek", "Karol", "Justyna", "Karolina"};
        for(String name : names2){
            if(name.length() > 5){
                System.out.println(name);
            }
        }

        System.out.println("---------- repeat ----------");
        text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n";
        String newText = text.repeat(100);
        System.out.println(newText);

        System.out.println("---------- replace ----------");
        text = "Lorem Ipsum is simply dummy text\tof\n the printing and typesetting industry.";
        text = text.replace('x', 'Z');
        System.out.println(text);

        System.out.println("---------- replaceAll ----------");
        text = "Gdy pada śnieg, ulice stoją w korkach. Są miejsca, w których opady śniegu występują przez cały rok.";
        text = text.replaceAll("śnieg", "deszcz");
        System.out.println(text);

        System.out.println("---------- split ----------");
        text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        String[] words = text.split(" ");
        System.out.println("Number of words: "+words.length);

        System.out.println("---------- trim i strip ----------");
        text = "\u2001   Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n\n";

        String textTrimmed = text.trim();
        System.out.println(textTrimmed);

        String textStripped = text.strip();
        System.out.println(textStripped);

        System.out.println("---------- substring ----------");
        String[] pesels2 = {"99011222239", "88011751221", "50112751261" };
        for(String pesel: pesels2){
            String month = pesel.substring(2,4);
            String day = pesel.substring(4,6);
            System.out.println(day+"."+month);
        }

        System.out.println("---------- toCharArray ----------");
        String[] numbers = {"5412", "55123541", "1188", "987654321" };
        for(String number: numbers){
            for(char c : number.toCharArray()){
                if(c%2==0){
                    System.out.print(c);
                }
            }
            System.out.println();
        }

        System.out.println("---------- toLowerCase ----------");
        String[] users = {"Marek12", "JuRekStefffaniak", "buziaczekDEFnowy" };
        for(int i = 0; i < users.length; i++){
            users[i] = users[i].toLowerCase();
        }
        for (String user : users) {
            System.out.println(user);
        }

        System.out.println("---------- sekwencje wywołań ----------");
        text = "   Jurek, Czarek i Karol znają się od lat";
        newText = text.strip().replaceAll(",", "").replaceAll(" ",";").toLowerCase();
        System.out.println(newText);

        System.out.println();

        System.out.println("--------------- podziel na akapity ---------------");
        String loremIpsumText = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. " +
                "Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.";
        System.out.println(loremIpsumText);

        System.out.println();

        // znajdź drugie wystąpienie ". "
        String loremIpsumText1 = loremIpsumText.replaceAll("\\. ", "\\. \n\n");

        // pierwszy akapit
        System.out.println("----------------------------");


        int beginIndex = 0;
        int secondDot;
        do {
            int firstDot = loremIpsumText.indexOf(". ", beginIndex);
            secondDot = loremIpsumText.indexOf(". ", firstDot + 1);

            // wyciąnięcie podzbioru
            if(secondDot == -1){
                loremIpsumText1 = loremIpsumText.substring(beginIndex);
            } else {
                loremIpsumText1 = loremIpsumText.substring(beginIndex, secondDot + 2);
            }
            System.out.println(loremIpsumText1+"\n\n");
            beginIndex = secondDot+2;
        } while (secondDot != -1);


    }
}
