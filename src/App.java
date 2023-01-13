public class App {
    public static void main(String[] args) throws Exception {
        Calendar calendar = new Calendar();

        System.out.println("TODOS OS FERIADOS:");
        System.out.println(calendar.getAllHolidays());

        System.out.println("_____________________________");

        System.out.println("FERIADOS ESPECÍFICOS:");
        System.out.println(calendar.getHoliday("01/01/2023"));
        System.out.println(calendar.getHoliday("25/12/2023"));

        System.out.println("_____________________________");

        System.out.println("DATA INEXISTENTE");
        System.out.println(calendar.getHoliday("data inexistente"));
    }
}
