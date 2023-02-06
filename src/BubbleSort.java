/*

    Name: Wolfgang Marbler
    Email: 52210474@edu.campus02.at
    Matrikel-Number: 52210474

 */



public class BubbleSort {

    public static void sort(int[] array) {

        /*
        TODO: Sortieren Sie den Inhalt eines Arrays mittels BubbleSort
        Vorschlag:
            - Iterieren Sie mit einer Schleife über den gesamten Array
            - Innerhalb der Schleife implementieren Sie eine weitere, innere Schleife
                - Vergleichen Sie jeweils das aktuelle Element mit dem nächsten Element
                - Wenn diese größer ist, dann tauschen Sie diese aus

        https://de.wikipedia.org/wiki/Bubblesort#Algorithmus
         */

        int temp;
        for(int i=1; i<array.length; i++) {
            for(int j=0; j<array.length-i; j++) {
                if(array[j]>array[j+1]) {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }
        }



    }

}
