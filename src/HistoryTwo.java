public class HistoryTwo {

    public static void PlayGame2(){

        System.out.println("Ваш главный герой - это Вито Скалетта. Вито - обычный военнослужащий, вернувшийся с боевых действий в родной город. С этих пор начались приключения Вито Скалетта и его друга Джо.");

        System.out.println("Глава 1:\n" +
                "\n" +
                "Вито приезжает домой, навещает свою семью и понимает, что нужны больше деньги для обеспечения себя и своей семьи. Вито заглядывает в гости к своему другу Джо и они решаются на первое дело по ограблению ювелирного магазина.");

        System.out.println("1. Взять с собой лом");
        System.out.println("2. Взять с собой пистолет");
        System.out.println("3. Взять с собой пистолет-пулемет");

        int choiceParthOne = Build.inputInt("Выбрать: ",1,3);

        if(choiceParthOne == 1){
            System.out.println("Вито и Джо долго копаются с входной дверью и успевают практически по приезду полиции.");
        } else if (choiceParthOne == 2) {
            System.out.println("Главный герой выстреливает в замок и быстро забирают все драгоценности.");
        }else {
            System.out.println("непонятный выбор для Вито, который не приводит ни к чему хорошему, замок сбивается быстро, но автомат всегда в руках и некуда его положить, тем самым Вито взял слишком мало.");
        }

        System.out.println("Глава 2:\n" +
                "\n" +
                "Главные герои забирают золото и слышат полицеские сирены, кто-то увидел и вызвал полицию.Остается только одно, бежать");

        System.out.println("1. Бежать вместе с Джо");
        System.out.println("2. Разделиться");

        int choiceParthTwo = Build.inputInt("Выбрать: ",1,2);

        if(choiceParthTwo == 1){
            System.out.println("Вито не решается бросить друга и они вместе выходят через черный ход, пытаясь убежать от полицейских.");
        }else {
            System.out.println("Вито бросается бежать через главный ход и сворачивает во двор, где его и схватили полицейские, Джо был уже далеко.");
        }

        System.out.println("Глава 3:\n" +
                "\n" +
                "Полицейские все же нагнали Вито и арестовали его. Его друг бросил его и убежал один. Вито осудили за ограбление магазина и дали ему небольшой срок в колонии строго режима. Попав в колонию, спустя несколько недель, Вито увидел потасовку в столовой . Амбал потребовал еду у недавнего заключенного.");

        System.out.println("1. Вступиться");
        System.out.println("2. Не лезть в драку");

        int choiceParthThree = Build.inputInt("Выбрать: ",1,2);

        if(choiceParthThree == 1){
            System.out.println("Вито вступается за заключенного и сильно избивает Амбала, его замечает старый заключенный Лео, бывший мафиози.");
        }else {
            System.out.println("Вито смотрит со стороны, как Амбал забирает себе еду и продолжает спокойно есть свою порцию.");
        }

        System.out.println("Глава 4:\n" +
                "\n" +
                "В колонии Вито знакомится с Лео. Лео предлагает ему продолжить незаконные дела для получения денег. Вито соглашается. После возвращения из колонии, Вито снова встречается с Джо и тот везет его на еще одно дело.");

        System.out.println("1. Поехать с Джо сразу");
        System.out.println("2. Навестить свою семью");
        System.out.println("3. Выпить в баре)");

        int choiceParthFour = Build.inputInt("Выбрать: ",1,3);

        if(choiceParthFour == 1){
            System.out.println(" Вито едет на свалку автомобилей и встречается там с ее хозяином.");
        } else if (choiceParthFour == 2) {
            System.out.println("Вито едет к своей семье и узнает, что его сестру сильно избивает муж.");
        }else {
            System.out.println("Вито берет паузу между всеми событиями и решает напиться как следует прежде чем предпринять следующий шаг.");
        }

        System.out.println("Глава 5:\n" +
                "\n" +
                "Для матери Вито нужны большие деньги. Чтобы вылечить ее, Вито едет с Джо на следующее дело. Джо предлагает украсть дорогой автомобиль и пригнать его к своему другу.");

        System.out.println("1. Перекрасить автомобиль и поменять номера");
        System.out.println("2. не предпринимать никаких действий");

        int choiceParthFive = Build.inputInt("Выбрать: ",1,2);

        if(choiceParthFive == 1){
            System.out.println("Вито, после успешного взлома замка автомобиля, приезжает в гараж к знакомым, где его машину полностью меняют и делают ее едва заметной для полиции.");
        }else{
            System.out.println("Вито, не предпринимая никакой конспирации, едет по городу и его настигает полиция. Главному герою приходится удирать от полицейских. Он сильно царапает машину за что получает намного меньше обещанной суммы.");
        }

        System.out.println("Глава 6:\n" +
                "\n" +
                "После нескольких незаконных деяний, Вито решает навестить свою сестру и отправляется на поиски ее мужа. Он находит его и решает его проучить ");

        System.out.println("1. Пригрозить ему сильным избиением");
        System.out.println("2. Побить его прямо здесь");

        int choiceParthSix = Build.inputInt("Выбрать: ",1,2);

        if(choiceParthSix == 1){
            System.out.println("Вито пригрозил мужу сестры смертью и сказал, что если еще раз такое повториться, он будет мертв");
        }else{
            System.out.println("Увидев эту сволочь Вито бросается на него с кулаками и избивает до полусмерти.");
        }

        System.out.println("Глава 7:\n" +
                "\n" +
                "После всех разборок, в одном из баров, Вито и Джо встречают Фальконе, того самого заключенного друга главного героя. Фальконе предлагает работать на него и большие деньги");

        System.out.println("1. Согласиться");
        System.out.println("2. Отказаться");

        int choiceParthSeven = Build.inputInt("Выбрать: ",1,2);

        if(choiceParthSeven == 1){
            System.out.println("Вито становится на сторону мафии Фальконе, помогает ему в его делах");
        }else {
            System.out.println("Вито ищет пути , не связанные с мафией и жизни Фальконе, но все равно принимает его предложение");
        }

        System.out.println("Глава 8:\n" +
                "\n" +
                "Во время очередного задания Фальконе в поисках мафий других групп до Вито доходит информация о смерти его матери.");

        System.out.println("1. Прервать его текущее задание и поехать к сестре");
        System.out.println("2. Не прерывать задание");
        System.out.println("3. Поехать в бар");

        int choiceParthEight = Build.inputInt("Выбрать: ",1,3);

        if(choiceParthEight == 1){
            System.out.println("Вито тут же разворочает свой автомобиль и направляется к сестре, которая находится на кладбище и успокаивает ее.");
        } else if (choiceParthEight == 2) {
            System.out.println("Вито скорбит по матери, но дело должно быть сделано до конца. Вито продолжает убивать людей для Фальконе.");
        }else{
            System.out.println("Вито сворачивает с пути и находит небольшой бар, напивается и засыпает.");
        }

        System.out.println("Глава 9:\n" +
                "\n" +
                "Вито был богатым человеком до одного крупного дела, они с Джо занимают большую сумму денег. Дело срывается и Вито с Джо в больших долгах. Они решаются на убийство высокопоставленных личностей для того, чтобы отдать долг. Это были люди Фальконе и Вито вызывает его босс.");

        System.out.println("1. Взять Джо с собой");
        System.out.println("2. Не брать Джо с собой");

        int choiceParthNine = Build.inputInt("Выбрать: ",1,2);

        if(choiceParthNine == 1){
            System.out.println("Вито и Джо отправляются в планетарий где их ждет Фальконе и убивают своего босса.");
        }else {
            System.out.println("Вито садится в машину и едет один к Фальконе, зайдя в планетарий и встретив банды мафии, которые пытаются его убить, Вито встречает Джо, который на этот раз не бросил своего друга.\n");
        }

        System.out.println("Глава 10: \n" +
                "\n" +
                "Вито и Джо справляются с последним делом и снизу их дожидается Лео Галанте, тот самый друг-заключенный Вито. Вито садится в машину с Лео, а Джо в другую. Лео не сохранил другу Вито жизнь.\n" +
                "\n" +
                "Поздравялем, вы узнали историю Вито Скелетта и его друга Джо!");

        int choice = Build.inputInt("Желаете начать следующую историю? 1 - Да, 2 - Нет ",1,2);

        if (choice == 1){
            HistroyOne.playGame();
        }else{
            System.exit(0);
        }




    }
}
