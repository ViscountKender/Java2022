package ru.gb.siyanov;

    public class HomeWorkApp {
        public static void main (){

        }
        public static void printThreeWords (){
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        public static void checkSumSign(){
            int a = 10;
            int b = 20;
            if (a+b >= 0 ){
                System.out.println("Сумма положительная");

            }else {
                System.out.println("Сумма отрицательная");

            }

        }
        public static void printColor (){
            int value = -100;
            if (0 >= value){
                System.out.println("Красный");

            }
            if (0 < value&&value <=100 ){
                System.out.println("Желтый");

            }
            else {
                System.out.println("Желтый");

            }


        }

}

