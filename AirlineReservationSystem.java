import java.util.Scanner;

public class AirlineReservationSystem {
    private static final boolean[] seats = new boolean[10]; // Array to represent seating chart

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Please type 1 for First Class or 2 for Economy:");
            choice = scanner.nextInt();

            if (choice == 1) {
                assignSeat(true); // First Class
            } else if (choice == 2) {
                assignSeat(false); // Economy
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.println("Boarding pass:");
            printBoardingPass();
            System.out.println();

            if (isFlightFull()) {
                System.out.println("The flight is full.");
                break;
            }
        }
    }

    private static void assignSeat(boolean isFirstClass) {
        int seatNumber;

        if (isFirstClass) {
            seatNumber = findAvailableSeat(1, 5); // Check first-class seats
            if (seatNumber == -1) {
                System.out.println("First-class seats are full.");
                System.out.println("Would you like to be placed in the economy section? (yes/no)");
                Scanner scanner = new Scanner(System.in);
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("yes")) {
                    assignSeat(false); // Assign economy seat
                } else {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            } else {
                seats[seatNumber - 1] = true; // Assign seat
            }
        } else {
            seatNumber = findAvailableSeat(6, 10); // Check economy seats
            if (seatNumber == -1) {
                System.out.println("Economy seats are full.");
                System.out.println("Would you like to be placed in the first-class section? (yes/no)");
                Scanner scanner = new Scanner(System.in);
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("yes")) {
                    assignSeat(true); // Assign first-class seat
                } else {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            } else {
                seats[seatNumber - 1] = true; // Assign seat
            }
        }
    }

    private static int findAvailableSeat(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (!seats[i - 1]) {
                return i;
            }
        }
        return -1; // No available seat found
    }

    private static boolean isFlightFull() {
        for (boolean seat : seats) {
            if (!seat) {
                return false; // At least one seat is empty
            }
        }
        return true; // All seats are occupied
    }

    private static void printBoardingPass() {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                String section = (i < 5) ? "First Class" : "Economy";
                System.out.println("Seat Number: " + (i + 1) + " (" + section + ")");
            }
        }
    }
}
