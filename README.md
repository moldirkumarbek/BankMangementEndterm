
# Description of the project “Online Bank Account Management”:

This project is a model of Banking Management System. This model shows how Bank Account Management system enables the customers to perform essential keeping money exchanges and other operations. The system provides access to the database from our java project. 

# Business rules:
 1)Banks have branches; 2) Branches have customers; 3) Customer has account and acquest; 4) Account has deposit; 5) Acquest has transaction;

# Database: 

```sql
CREATE TABLE bank(
    bank_id INT NOT NULL,
    bank_name VARCHAR(50) NOT NULL,
    bank_country VARCHAR(50) NOT NULL,
    bank_city VARCHAR(50) NOT NULL,
    bank_address TEXT NOT NULL,
    PRIMARY KEY(bank_id)
);
INSERT INTO bank(bank_id, bank_name, bank_country, bank_city, bank_address)
VALUES
    (01,'Kaspi Bank','Kazakhstan','Almaty','Nauryzbai batyr street,154'),
    (02,'Halyk Bank','Kazakhstan','Nur-Sultan','Kabanbai batyr street,17'),
    (03,'Qazqom Bank','Kazakhstan','Almaty','Gagarin street,135/8'),
    (04,'Jysan Bank','Kazakhstan','Nur-Sultan','Syganak street,24'),
    (05,'Eurasian Bank','Kazakhstan','Nur-Sultan','Kabanbai Batyr street,30'),
    (06,'Sberbank','Russia','Moscow','Vavilova street,19'),
    (07,'ForteBank','Kazakhstan','Nur-Sultan','Dostyk street,8/1'),
    (08,'RBK Bank','Kazakhstan','Nur-Sultan','Saraishyk street,11'),
    (09,'ATF Bank','Kazakhstan','Nur-Sultan','Saraishyk street,34'),
    (10,'VTB Bank','Russia','Moscow','Myasnitskaya street,35');

CREATE TABLE branches(
    branch_id INT NOT NULL,
    branch_name VARCHAR(50) NOT NULL,
    Branch_city VARCHAR(50) NOT NULL,
    branch_address TEXT NOT NULL,
    bank_id INT,
    FOREIGN KEY (bank_id) REFERENCES bank(bank_id),
    PRIMARY KEY(branch_id)
);
INSERT INTO branches(branch_id, branch_name, branch_city, branch_address, bank_id)
VALUES
    (11,'Kaspi Bank Branch', 'Nur-Sultan','Kunayev street,14/2',01),
    (12,'Halyk Bank Branch', 'Almaty','Altynsarin street,23',02),
    (13,'Qazqom Bank Branch', 'Shymkent','Ilyayeva street,33',03),
    (14,'Jysan Bank Branch', 'Almaty','Rozybakiyeva street,273',04),
    (15,'Eurasian Bank Branch', 'Shymkent','Tashenov street,4',05),
    (16,'Sberbank Branch', 'Nur-Sultan','Dostyk street,9',06),
    (17,'ForteBank Branch', 'Shymkent','Zheltoksan street,15',07),
    (18,'RBK Bank Branch', 'Almaty','Sharipova street,84',08),
    (19,'ATF Bank Branch', 'Almaty','Tole bi street,83',09),
    (20,'VTB Bank Branch', 'Nur-Sultan','Dostyk street,12',10);   

CREATE TABLE customer(
    customer_id INT NOT NULL,
    branch_id INT NOT NULL,
    customer_name TEXT NOT NULL,
    surname TEXT NOT NULL,
    gender TEXT NOT NULL,
    telephone DECIMAL (12) NOT NULL,
    address TEXT NOT NULL,
    FOREIGN KEY (branch_id) REFERENCES branches(branch_id),
    PRIMARY KEY(customer_id)
);
INSERT INTO customer(customer_id, branch_id, customer_name, surname, gender, telephone, address)
VALUES (31, 11, 'Sarah', 'Conor', 'Female', '87019007557', 'Amanzholova,12'),
    (32, 12, 'Madiyar', 'Baurzhan','Male', '87015555335', 'Uly Dala,13'),
    (33, 13,'Assel','Butovand','Female','87059010101','Ualikhanova,79'),
    (34, 14,'Allen','Beikay','Male','87059020202','Zholdasbekova, 13'),
    (35, 15,'Aldiyar','Makhan','Male','87059030303','Baitursynova,15'),
    (36, 16,'Zhanat','Altynkyzy','Female','87029040404','Adyrbekova, 65'),
    (37, 17,'Kamshat','Aspanova','Female','87019050505','Mailina, 93'),
    (38, 18,'Daulet','Kopbar','Male','87059060606','Zholdasbekova, 183'),
    (39, 19,'Altyn','Timurova','Female','87079070707', 'Amanzholova, 24'),
    (40, 20,'Maksat','Mashat','Male','87089080808','Nazhimedenova, 14'),
    (41, 11,'Miras','Sergazyuly','Male','87019090909', 'Uly Dala, 65'),
    (42, 12,'Karlygash','Kanatbekova','Female','87018755700','Rozybakiyeva,146');
CREATE TABLE account(
    account_id INT NOT NULL,
    customer_id INT NOT NULL,
    type TEXT NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
    PRIMARY KEY(account_id)
);
INSERT INTO account(account_id, customer_id,  type)
VALUES (671, 31, 'personal'),
(672, 32, 'personal'),
(673, 33, 'personal'),
(674, 34, 'personal'),
(675, 35, 'personal'),
(676, 36, 'corporate'),
(677, 37, 'corporate'),
(678, 38, 'corporate'),
(679, 39, 'corporate'),
(680, 40, 'corporate');

CREATE TABLE deposit(
depo_id INT NOT NULL,
account_id INT NOT NULL,
depo_amount DECIMAL(20) NOT NULL, 
FOREIGN KEY (account_id) REFERENCES account(account_id),
PRIMARY KEY(depo_id)
);
INSERT INTO deposit (depo_id, account_id, depo_amount)
VALUES(21, 671, 12000000),
(22, 672, 15000000),
(23, 673, 18000000),
(24, 674, 17000000),
(25, 675, 19000000),
(26, 676, 35000000),
(27, 677, 22000000),
(28, 678, 5000000),
(29, 679, 2000000),
(30, 680, 5000000);

CREATE TABLE Customer_acquests(
    Acquest_id INT NOT NULL,
    Acquest_date DATE NOT NULL,
    Acquest_number FLOAT(10) NOT NULL,
    customer_id INT,
    PRIMARY KEY(Acquest_id),
    FOREIGN KEY (customer_id) REFERENCES customer (customer_id)
);
INSERT INTO Customer_acquests(Acquest_id, Acquest_date, Acquest_number, customer_id)
VALUES
    (851,'19-MAY-2020','0001',31),
    (852,'10-MAY-2018','0002',32),
    (853,'19-OCT-2016','0003',33),
    (854,'25-NOV-2017','0004',34),
    (855,'24-MAY-2015','0005',35),
    (856,'11-FEB-2016','0006',36),
    (857,'27-MAR-2018','0007',37),
    (858,'29-SEP-2014','0008',38),
    (859,'29-OCT-2015','0009',39),
    (860,'11-JAN-2014','0010',40);

CREATE TABLE Transactions(
    Transaction_id INT NOT NULL,
    Transaction_date DATE NOT NULL,
    Transaction_amount FLOAT(10) NOT NULL,
    Acquest_id INT,
    Account_id INT,
    Transaction_type TEXT,
    PRIMARY KEY(Transaction_id),
    FOREIGN KEY (Acquest_id) REFERENCES Customer_acquests(Acquest_id),
    FOREIGN KEY (account_id) REFERENCES account (account_id)
);
INSERT INTO Transactions(Transaction_id, Transaction_date, Transaction_amount, Account_id, Acquest_id, Transaction_type)
VALUES
    (961,'01-APR-2020','20000',671,851, 'Transfer: Move money from one account to another'),
    (962,'09-SEP-2020','15000',672,852, 'Charge: Record a purchase on a debit card'),
    (963,'19-AUG-2020','5000',673,853, 'Online: online a web-based store or online banking service'),
    (964,'17-OCT-2019','700000',674,854, 'Transfer: Move money from one account to another'),
    (965,'21-JAN-2018','220000',675,855, 'Charge: Record a purchase on a debit card'),
    (966,'04-APR-2017','400000',676,856, 'Online: online a web-based store or online banking service'),
    (967,'15-OCT-2020','100000',677,857, 'Transfer: Move money from one account to another'),
    (968,'29-SEP-2020','30000',678,858, 'Charge: Record a purchase on a debit card'),
    (969,'20-APR-2020','2990',679,859, 'Online: online a web-based store or online banking service'),
    (970,'29-APR-2019','100000',680,860, 'Transfer: Move money from one account to another'),
    (971,'19-APR-2019','200000',671,851, 'Charge: Record a purchase on a debit card'),
    (972,'10-APR-2020','1500',672,852, 'Online: online a web-based store or online banking service'),
    (973,'09-SEP-2020','2000',673,853, 'Transfer: Move money from one account to another'),
    (974,'05-OCT-2020','70000',674,854, 'Charge: Record a purchase on a debit card'),
    (975,'14-APR-2016','170000',675,855, 'Online: online a web-based store or online banking service'),
    (976,'11-JAN-2017','200000',676,856, 'Transfer: Move money from one account to another'),
    (977,'17-OCT-2020','200000',677,857, 'Charge: Record a purchase on a debit card'),
    (978,'29-AUG-2020','20000',678,858, 'Online: online a web-based store or online banking service'),
    (979,'20-MAY-2020','990',679,859, 'Transfer: Move money from one account to another'),
    (980,'29-MAR-2019','150000',680,860, 'Charge: Record a purchase on a debit card');
```
# Description of the classes:
Main class is the entry point of our java project. When you execute this program in Java starts executing from it. In our project, main class specify which DB and Repository to use. 

MyApplication class is the base class within a console app that contains all other components such as menu, services and activities. MyApplication class is instantiated before other class when the process for package created. In this class we working out the design of our menu in the console.

Entity classes (Bank, Branch, Customer, Account, Deposit, Acquest, Transaction) are an ordinary Java class that is marked as having ability to represent objects in database.
So, entity classes are components that represent tables in the database. 
In this classes, we use getters and setters to define specific objects.

Controller classes are responsible for processing incoming requests. It invokes business logic, updates the models and returns the view that should be rendered. Controllers are the program that manages the flow of data between two entities. As an example, in our project we see direction of the flow between Account and IAccountRepository.

PostgreDB class is used for establishing a connection between Postgres (PgAdmin) and our java project. Here, we load the driver’s class file into memory at the runtime and give a path to the database. 

IDB interface is used for implementation of the getConnection method.

Repository classes are components that encapsulate logic required to access data sources. They centralize common data access functionality, providing better technology used to access databases from the domain model. In our project repositories abstracts the data store and enables you to replace your data store without changing the code. Here we use methods to create, select and get data from database.

Repository interfaces define the repositories with logical read and write methods for a specific entity. In our project, repository interfaces is used to define methods.
