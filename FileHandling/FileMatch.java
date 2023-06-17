package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMatch {
    private String masterFile;
    private String transactionFile;
    private String newMasterFile;
    private String logFile;

    public FileMatch() {
        masterFile = "oldmast.txt";
        transactionFile = "trans.txt";
        newMasterFile = "newmast.txt";
        logFile = "log.txt";
    }

    public void matchRecords() {
        try {
            BufferedReader masterReader = new BufferedReader(new FileReader(masterFile));
            BufferedReader transactionReader = new BufferedReader(new FileReader(transactionFile));
            BufferedWriter newMasterWriter = new BufferedWriter(new FileWriter(newMasterFile));
            BufferedWriter logWriter = new BufferedWriter(new FileWriter(logFile));

            String masterLine;
            String transactionLine;

            while ((masterLine = masterReader.readLine()) != null) {
                String[] masterFields = masterLine.split("\\s+");
                int accountNumber = Integer.parseInt(masterFields[0]);
                double balance = Double.parseDouble(masterFields[1]);

                boolean matched = false;

                while ((transactionLine = transactionReader.readLine()) != null) {
                    String[] transactionFields = transactionLine.split("\\s+");
                    int transAccountNumber = Integer.parseInt(transactionFields[0]);
                    double transAmount = Double.parseDouble(transactionFields[1]);

                    if (accountNumber == transAccountNumber) {
                        balance += transAmount;
                        matched = true;
                    }
                }

                if (matched) {
                    newMasterWriter.write(accountNumber + " " + balance);
                    newMasterWriter.newLine();
                } else {
                    logWriter.write("Unmatched transaction record for account number: " + accountNumber);
                    logWriter.newLine();
                }

                // Reset transaction reader back to the beginning of the file
                transactionReader = new BufferedReader(new FileReader(transactionFile));
            }

            masterReader.close();
            transactionReader.close();
            newMasterWriter.close();
            logWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileMatch fileMatch = new FileMatch();
        fileMatch.matchRecords();
    }
}
