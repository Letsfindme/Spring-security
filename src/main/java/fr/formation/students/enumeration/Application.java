package fr.formation.students.enumeration;

public class Application {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (Days day : Days.values()
        ) {
            String name = day.name();
            sb.append(name);
            sb.append(": ");
            sb.append(day.getNumberOfPlates());
            sb.append(", PlatePrice: ");
            sb.append(day.getPlatePrice());
            sb.append(", isWorkingDay: ");
            sb.append(day.isWorkingDay());
            sb.append(", ordinal: ");
            sb.append(day.ordinal());
            sb.append(System.lineSeparator());
            //System.out.println(day.toString() + day.isWorkingDay());
        }
        System.out.println(sb);
    }
}
