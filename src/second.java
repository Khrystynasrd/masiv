public class second {

        public static void main(String[] args) {
            int second [] = new int [20];
            for (int i = 0; i < second.length; i++){
                second[i] = (int)(Math.random() * 10);
            }
            System.out.println("Початковий масив : ");
            for (int i = 0; i < second.length; i++) {
                System.out.print(second[i] + " ");
            }
            System.out.println();
            for (int i = 1; i < second.length; i+=2){
                second[i] = 0;
            }
            System.out.println("Оновлений масив : ");
            for (int i = 0; i < second.length; i++){
                System.out.print(second[i] + " ");
            }
        }
    }

