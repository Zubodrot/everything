package ru.isbo1016.chumakov.prak6.pt1;

public class Test6 {
    public static void main(String[] args) {
        Student[] Studentarchive = new Student[6];
        Student[] Studentarchive2 = new Student[6];
        Studentarchive[0] = new Student("Владимир",1015);
        Studentarchive[1] = new Student("Николай",1034);
        Studentarchive[2] = new Student("Ксения",1013);
        Studentarchive[3] = new Student("Иван",1076);
        Studentarchive[4] = new Student("Екатерина",1010);
        Studentarchive[5] = new Student("Дмитрий", 1054);

        Studentarchive2 = Studentarchive;

        System.out.println("Чумаков Дмитрий ИСБО-10-16");
        System.out.println("Несортированный список");
        for(int i = 0; i<Studentarchive.length; i++){
            System.out.print(Studentarchive[i].name+"  "+Studentarchive[i].IDnumber+"  ");
        }
        System.out.println();

        int[] numbers = new int[Studentarchive.length];
        for (int i = 0; i<Studentarchive.length; i++){
            numbers[i] = Studentarchive[i].IDnumber;
        }

        selectionSort(numbers);

        for (int i = 0; i< numbers.length; i++){
            for ( int j = 0; j<numbers.length;j++){
                if (Studentarchive[j].IDnumber == numbers [i]){
                    Studentarchive2[i].name = Studentarchive[j].name;
                    Studentarchive2[i].IDnumber = Studentarchive[j].IDnumber;
                }
            }
        }

        System.out.println("Сортированный список");
        for(int i = 0; i<Studentarchive.length; i++){
            System.out.print(Studentarchive2[i].name+"  "+Studentarchive2[i].IDnumber+"  ");
        }


    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }

}
