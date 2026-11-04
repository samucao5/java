package Expressoes_Regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validando_horarios_e_datas_com_regex {
    public static void main(String[] args) {
        //validação datas e horarios
        String regexData = "^([0-2][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$";
        String[] data = {"02/01/20444", "03/11/2005", "25/10/2007"};

        System.out.println("Validar data DD/MM/YYYY");
        for(String datas : data)
            {
                if(validarRegex(datas, regexData))
                    {
                        System.out.println("Data valida: " + datas);
                    }
                else
                    {
                        System.out.println("Data invalida: " + datas);
                    }
            }


        //Validação de Horario  HH:MM:SS
        String regexHorario = "^([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$";
        String[] horario = {"11:50:12", "99:12:32", "02:24:35"};

        System.out.println("\nValidar Horarios HH:MM:SS");
        for(String horarios : horario)
            {
                if(validarRegex(horarios, regexHorario))
                    {
                        System.out.println("Horario valido: " + horarios);
                    }
                else
                    {
                        System.out.println("Horario invalido: " + horarios);
                    }
            }




    }








    public static boolean validarRegex(String texto, String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        return matcher.matches();
    }
}
