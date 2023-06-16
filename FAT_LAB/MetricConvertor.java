package FAT_LAB;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MetricConvertor {
    private static Map<String, Double> metricConversionTable;

    public static void main(String[] args) {
        initializeConversionTable();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a conversion question (or 'exit' to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 6) {
                System.out.println("Invalid input. Please follow the format: 'How many <unit1> are in <value> <unit2>?'");
                continue;
            }

            String unit1 = parts[2];
            double value = Double.parseDouble(parts[4]);
            String unit2 = parts[5];

            if (!metricConversionTable.containsKey(unit1) || !metricConversionTable.containsKey(unit2)) {
                System.out.println("Invalid conversion. Please provide valid units.");
                continue;
            }

            double result = convert(value, unit1, unit2);
            if (result == -1) {
                System.out.println("Invalid conversion. Units are not compatible.");
                continue;
            }

            System.out.printf("%.2f %s = %.2f %s\n", value, unit1, result, unit2);
        }

        scanner.close();
    }

    private static void initializeConversionTable() {
        metricConversionTable = new HashMap<>();
        metricConversionTable.put("centimeters", 0.01);
        metricConversionTable.put("meters", 1.0);
        metricConversionTable.put("kilometers", 1000.0);
        metricConversionTable.put("liters", 1.0);
        metricConversionTable.put("milliliters", 0.001);
        // Add more conversions as needed...
    }

    private static double convert(double value, String unit1, String unit2) {
        if (unit1.equals(unit2)) {
            return value;
        }

        if (isLengthUnit(unit1) && isLengthUnit(unit2)) {
            return value * (metricConversionTable.get(unit2) / metricConversionTable.get(unit1));
        }

        if (isVolumeUnit(unit1) && isVolumeUnit(unit2)) {
            return value * (metricConversionTable.get(unit2) / metricConversionTable.get(unit1));
        }

        return -1;
    }

    private static boolean isLengthUnit(String unit) {
        return unit.equals("centimeters") || unit.equals("meters") || unit.equals("kilometers");
    }

    private static boolean isVolumeUnit(String unit) {
        return unit.equals("liters") || unit.equals("milliliters");
    }
}
