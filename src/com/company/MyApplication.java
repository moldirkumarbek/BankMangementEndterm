package com.company;
//import a paths to the classes

import com.company.controllers.*;
import com.company.repositories.interfaces.*;

import java.util.Scanner;

public class MyApplication {
    private final BankController controller;
    private final AccountController controller1;
    private final CustomerController controller2;
    private final DepositController controller3;
    private final BranchController controller4;
    private final AcquestController controller5;
    private final TransactionController controller6;
    private final Scanner scanner;

    /**
     * Overloaded constructor with default parameter values
     */
    public MyApplication(IBankRepository repo, ICustomerRepository repo1, IAccountRepository repo2,
                         IDepositRepository repo3, IBranchRepository repo4, IAcquestRepository repo5,
                         ITransactionRepository repo6) {
        controller = new BankController(repo);
        controller1 = new AccountController(repo2);
        controller2 = new CustomerController(repo1);
        controller3= new DepositController(repo3);
        controller4= new BranchController(repo4);
        controller5= new AcquestController(repo5);
        controller6= new TransactionController(repo6);

        scanner = new Scanner(System.in);
    }

    /**
     * Method start is used to start program execution
     */
    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to Online Bank Application!");
            System.out.println("Please select an option:");
            System.out.println("1. Get information about Banks ");
            System.out.println("2. Get information about customers");
            System.out.println("3. Get information about accounts");
            System.out.println("4. Get information about deposits");
            System.out.println("5. Get information about branches");
            System.out.println("6. Get information about acquests");
            System.out.println("7. Get information about transactions");
            System.out.println("0. Stop the program");
            System.out.println();

            try {
                System.out.print("Enter option (1-7): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    bankMenu();
                } else if (option == 3) {
                    AccountMenu();
                } else if (option == 2) {
                    CustomerMenu();
                } else if (option == 4) {
                    DepositMenu();
                } else if (option == 5) {
                    BranchMenu();
                } else if (option == 6) {
                    AcquestMenu();
                } else if (option == 7) {
                    TransactionMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }
        }
    }

    private void TransactionMenu() {
        while (true) {
            System.out.println("Welcome to Bank Application!");
            System.out.println("Select option:");
            System.out.println("1. Get all transactions");
            System.out.println("2. Get transaction by acquest_id");
            //System.out.println("3. Create branch");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllTransactionsMenu();
                } else if (option == 2) {
                    getTransactionByIdMenu();
                    //} else if (option == 3) {
                    // createBankMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

    private void AcquestMenu() {
        while (true) {
            System.out.println("Welcome to Bank Application!");
            System.out.println("Select option:");
            System.out.println("1. Get all acquests");
            System.out.println("2. Get acquest by customer_id");
            //System.out.println("3. Create branch");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllAcquestsMenu();
                } else if (option == 2) {
                    getAcquestByIdMenu();
                    //} else if (option == 3) {
                    // createBankMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

    private void BranchMenu() {
        while (true) {
            System.out.println("Welcome to Bank Application!");
            System.out.println("Select option:");
            System.out.println("1. Get all branches");
            System.out.println("2. Get branch by bank_id");
            //System.out.println("3. Create branch");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllBranchesMenu();
                } else if (option == 2) {
                    getBranchByIdMenu();
                //} else if (option == 3) {
                   // createBankMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

    /**
     * Method bankMenu, which returns the bank menu
     */
    private void bankMenu() {
        while (true) {
            System.out.println("Welcome to Bank Application!");
            System.out.println("Select option:");
            System.out.println("1. Get all banks");
            System.out.println("2. Get bank by bank_id");
            //System.out.println("3. Create bank");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllBanksMenu();
                } else if (option == 2) {
                    getBankByIdMenu();
                // } else if (option == 3) {
                    //    createBankMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

    /**
     * Method AccountMenu, which returns the account menu
     */
    private void AccountMenu() {
        while (true) {
            System.out.println("Welcome to Bank Application!");
            System.out.println("Select option:");
            System.out.println("1. Get all accounts");
            System.out.println("2. Get account by customer_id");
            // System.out.println("3. Create account");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllAccountsMenu();
                } else if (option == 2) {
                    getAccountsByIdMenu();
              //  } else if (option == 3) {
             //        createAccountMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

    /**
     * Method CustomerMenu, which returns the customer menu
     */
    private void CustomerMenu() {
        while (true) {
            System.out.println("Welcome to Bank Application!");
            System.out.println("Select option:");
            System.out.println("1. Get all customers");
            System.out.println("2. Get customer by branch_id");
            // System.out.println("3. Create customer");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllCustomersMenu();
                } else if (option == 2) {
                    getCustomerByIdMenu();
              //   } else if (option == 3) {
             //       createCustomerMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

    /**
     * Method CustomerMenu, which returns the deposit menu
     */
    private void DepositMenu() {
        while (true) {
            System.out.println("Welcome to Bank Application!");
            System.out.println("Select option:");
            System.out.println("1. Get all deposits");
            System.out.println("2. Get deposit by account_id");
            // System.out.println("3. Create customer");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllDepositsMenu();
                } else if (option == 2) {
                    getDepositsByIdMenu();
                 //} else if (option == 3) {
                //    createCustomerMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

    /**
     * Method, which returns getAllBanks menu
     */
    public void getAllBanksMenu() {
        String response = controller.getAllBanks();
        System.out.println(response);
    }

    /**
     * Method, which returns all Acquests Menu
     */
    public void getAllAcquestsMenu() {
        String response = controller5.getAllAcquestеs();
        System.out.println(response);
    }

    /**
     * Method, which returns Bank by bank_id menu
     */
    public void getBankByIdMenu() {
        System.out.println("Please enter bank_id:");

        int bank_id = scanner.nextInt();
        String response = controller.getBank(bank_id);
        System.out.println(response);
    }
    /**
     * Method, which returns Acquest By customer_id menu
     */
    public void getAcquestByIdMenu() {
        System.out.println("Please enter customer_id:");

        int customer_id = scanner.nextInt();
        String response = controller5.getAcquest(customer_id);
        System.out.println(response);
    }
    /**
     * Method, which returns all accounts menu
     */
    public void getAllAccountsMenu() {
        String response = controller1.getAllAccounts();
        System.out.println(response);
    }
    /**
     * Method, which returns accounts by customer_id menu
     */
    public void getAccountsByIdMenu() {
        System.out.println("Please enter customer_id:");

        int account_id = scanner.nextInt();
        String response = controller1.getAccount(account_id);
        System.out.println(response);
    }
    /**
     * Method, which returns all deposits menu
     */
    public void getAllDepositsMenu() {
        String response = controller3.getAllDeposits();
        System.out.println(response);
    }
    /**
     * Method, which returns deposits by account_id menu
     */
    public void getDepositsByIdMenu() {
        System.out.println("Please enter account_id:");
        int id = scanner.nextInt();
        String response = controller3.getDeposit(id);
        System.out.println(response);
    }

    /**
     * Method, which returns all transactions menu
     */
    public void getAllTransactionsMenu() {
        String response = controller6.getAllTransactions();
        System.out.println(response);
    }
    /**
     * Method, which returns transaction by acquest_id menu
     */
    public void getTransactionByIdMenu() {
        System.out.println("Please enter acquest_id:");

        int id = scanner.nextInt();
        String response = controller6.getTransaction(id);
        System.out.println(response);
    }

    /**
     * Method, which returns all branches menu
     */
    public void getAllBranchesMenu() {
        String response = controller4.getAllBranchеs();
        System.out.println(response);
    }
    /**
     * Method, which returns branch by account_id menu
     */
    public void getBranchByIdMenu() {
        System.out.println("Please enter bank_id:");

        int id = scanner.nextInt();
        String response = controller4.getBranch(id);
        System.out.println(response);
    }

    /**
     * Method, which returns all customers menu
     */
    public void getAllCustomersMenu() {
        String response = controller2.getAllCustomers();
        System.out.println(response);
    }
    /**
     * Method, which returns customer by bank_id menu
     */
    public void getCustomerByIdMenu() {
        System.out.println("Please enter branch_id:");

        int customer_id = scanner.nextInt();
        String response = controller2.getCustomer(customer_id);
        System.out.println(response);
    }
    /**
     * Method, which  create low level employee
     */
}