import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private String[] daysArr = { "01/01/2023", "21/02/2023", "17/04/2023", "21/04/2023", "01/05/2023", "08/06/2023",
            "07/09/2023", "12/10/2023", "02/11/2023", "15/11/2023", "25/12/2023" };
    private String[] holidaysArr = { "Confraternização mundial", "Carnaval", "Páscoa", "Tiradentes", "Dia do trabalho",
            "Corpus Christi", "Independência do Brasil", "Nossa Senhora Aparecida", "Finados",
            "Proclamação da República", "Natal" };
    List<String> days = new ArrayList<>();

    Calendar(){
        for(int i=0; i<daysArr.length; i++){
            days.add(daysArr[i]);
        }
        
    }

    public String getHoliday(String inputDate){
        if(days.contains(inputDate)){
            int index = days.indexOf(inputDate);
            return holidaysArr[index];
        }
        else{return "não existe feriado com tal dada";}
    }

    public String getAllHolidays(){
        String allHolidays = "";
        for(int i=0; i<daysArr.length; i++){
            allHolidays += daysArr[i].toString()+" => "+holidaysArr[i].toString()+"\n";
        }
        return allHolidays;
    }
}