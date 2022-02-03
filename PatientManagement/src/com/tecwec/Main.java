package com.tecwec;


import com.tecwec.db.Operations;
import com.tecwec.db.Rules;
import com.tecwec.model.PatientData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    Rules<PatientData> rules;

    public Main(){
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println("Welcome to PMS App");
        System.out.println("~~~~~~~~~~~~~~~~~~~");

        rules=new Operations();
    }
    void showMenu() {
        while(true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1. Register Patient");
            System.out.println("2. Update Patient");
            System.out.println("3. Delete Patient");
            System.out.println("4. Fetch All Patients");
            System.out.println("5. To Quit");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("Select Your Option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    PatientData data = new PatientData();
                    data.inputData();
                    int result = rules.insert(data);
                    String message = result > 0 ? data.name + " Registered" : data.name + " Registration failed";
                    System.out.println(message);
                    break;

                case 2:
                    System.out.println("Enter Patient ID to Update: ");
                    int id = scanner.nextInt();

                    PatientData updatDdata = new PatientData();
                    updatDdata.inputData();
                    updatDdata.id = id; // allocate customer id to be updated

                    int updateResult = rules.update(updatDdata);

                    String updateMessage = updateResult > 0 ? updatDdata.name + " Updated" : updatDdata.name + " Updation Failed";
                    System.out.println(updateMessage);
                    break;

                case 3:
                    System.out.println("Enter Patient ID to Delete: ");
                    int pid = scanner.nextInt();

                    int DeleteResult = rules.delete(pid);

                    String deleteMessage = DeleteResult > 0 ? pid + " Deleted" : pid + " Deletion Failed";
                    System.out.println(deleteMessage);
                    break;

                case 4:
                    ArrayList<PatientData> fetchData = rules.query();
                    Comparator<PatientData> comparator1 = new Comparator<PatientData>() {
                        public int compare(PatientData o1, PatientData o2) {
                            return o1.name.compareToIgnoreCase(o2.name);
                        }
                    };
                    Collections.sort(fetchData, (o1, o2) -> o2.id - o1.id);

                    fetchData.forEach((patientsdata) -> System.out.println(patientsdata));
                    break;

                case 5:
                    scanner.close();
                    return;


                default:
                    System.out.println("Invalid Choice");
            }

        }
    }

    public static void main(String[] args) {
        Main app=new Main();
        app.showMenu();
    }

}
