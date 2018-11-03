public class Main {

    public static void main(String[] args) {

        Integer[] array = new Integer[] {2, 5, 7, 1, 99, 13, 58};

        SearchAlgorithm searchAlgorithm = new LinearSearch();
        int result = searchAlgorithm.search(1,array);
        System.out.println(result);

    }

}
