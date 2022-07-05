public class HistroyOne {

    public static void setMoneyOfGeralth(int moneyOfGeralth) {
        HistroyOne.moneyOfGeralth = moneyOfGeralth;
    }

    static int moneyOfGeralth = 300;

    public void playGame(){


        System.out.println("Приветствуем вас в истории одного человека по имени Геральт! Ваш главный герой очень силен, обладает нечеловеческими способностями , которые помогают ему в повседневной охоте на монстров и помощи мирным жителям. Желаем вам удачи и хорошего времяпровождения!\n");

        System.out.println("Глава 1:\n" +
                "\n" +
                "Ваш главный герой просыпается в лесу возле своего возведённого костра и начинает задумываться о том, чтобы поехать в ближайшую деревню верхом и взять новый заказ на чудовище! \n");
        System.out.println("1. Взять заказ");
        System.out.println("2. Не брать заказ");

        int choiseParthOne = Build.inputInt("Выбрать: ",1,2);

        if (choiseParthOne == 1){
            System.out.println("Геральт садится верхом на Плотву и отправляется в деревню");
        }else{
            System.out.println("Геральт решает , что нужно следовать своему основному заданию и идти в направлении Новиграда, великого города красных");
        }

        System.out.println("По пути в Новиград, Геральд все же решается на то, чтобы помочь мирным жителям одной деревни, которые просят о помощи именно ведьмака! Геральт приехал в деревню и встретил там старосту");

        System.out.println("1. Поздороваться со старостой");
        System.out.println("2. сразу приступить к торгу по количеству золотых монет");

        int choiseParthTwo = Build.inputInt("Выбрать: ",1,2);

        if(choiseParthTwo == 1){
            System.out.println("Геральт поздоровался со старостой и зашел в пивную сыграть в гвинт, проиграв при этом 50 крон");
            int loseMoney = 50;
            moneyOfGeralth -= loseMoney;
        }else {
            System.out.println("Староста очень недоволен ведьмаком и не сможет предложить ему большую сумму");
        }
        System.out.println("Колличество крон на данный момент: " + moneyOfGeralth);

        System.out.println("Староста сказал Геральту, что выплатить всей деревней они смогут не более 500 новиградских крон(");

        System.out.println("");

    }





}
