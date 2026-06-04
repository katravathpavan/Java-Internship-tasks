import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> grades = new HashMap<>();

        grades.put("Prabhas", 85);
        grades.put("Pavan", 90);
        grades.put("Pawankalyan", 78);

        System.out.println("Pavan's Grade: " + grades.get("Pavan"));

        grades.put("Pawankalyan", 88);
        System.out.println("Updated Grade of Pawankalyan: " + grades.get("Pawankalyan"));

        System.out.println("\nStudent Grades:");
        for (String name : grades.keySet()) {
            System.out.println(name + " : " + grades.get(name));
        }
    }
}
