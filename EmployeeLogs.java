public class EmployeeLogs  {

    /*
    You are provided a employee’s action logs from their computer. In it is a 2D array logs such that logs[i] = [IDi, timei], such that IDi represents the employee’s identification and timei represents how long they were performing an action on their computer.
    Your task is to report how long each user was performing any action in total minutes and to organize the employee by their identification descending.
    */

    public static String solution(String input) {

        StringBuilder output = new StringBuilder("Employee Logs:\n");
        output.append("--------------------------\n");

        String log_entries[] = input.split(";");
        for (String entry: log_entries) {

            String[] employee_log = entry.split(",");
            output.append("IDi: ");
            output.append(employee_log[0].substring(1));
            output.append("\ntimei: ");
            output.append(employee_log[1]);
            output.deleteCharAt(output.length()-1);
            output.append("\n--------------------------\n");

        }

        return output.toString();
    }

    public static void main(String[] args){

        System.out.println(solution("[ID1,12/32/2121 07:46:34];[ID2,11/23/3213 07:46:34];[ID3,09/05/2022 07:46:34]"));
    }
}
