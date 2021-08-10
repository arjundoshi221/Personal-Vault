#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>
#include <windows.h>

int m = 10, w = 10, chi = 10;
int cipherKey = 100;

/*
Maximum 15 items per category
*/

/*----------------------------- Mens --------------------------------*/
char *mens_name[15] = {"Regular T-shirt", "Cologne      ", "Football Jersey", "Running shoes", "Loafer    ", "Casual trousers", "Slim fit Cargo", "Cotton shorts", "Denim jeans", "Wallet & Belt"};
int mens_price[15] = {499, 500, 600, 2000, 800, 799, 600, 399, 500, 500};
char *mens_code[15] = {"M01", "M02", "M03", "M04", "M05", "M06", "M07", "M08", "M09", "M10"};
int mens_stock[15] = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20};

/*---------------------------- Womens --------------------------------*/
char *womens_name[15] = {"Earrings", "Sweatshirt", "Perfume     ", "Runningshoes", "Indian kurti", "Maxi dress", "Handbag   ", "Cotton leggings", "Denim jeans", "Sunglasses"};
int womens_price[15] = {499, 500, 600, 2000, 800, 799, 600, 399, 500, 500};
char *womens_code[15] = {"W01", "W02", "W03", "W04", "W05", "W06", "W07", "W08", "W09", "W10"};
int womens_stock[15] = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20};

/*--------------------------- Children -------------------------------*/
char *child_name[15] = {"Denim Jeans", "Shirt   ", "Baseball cap", "Digital watch", "Duffel bag", "Floral Frock", "Embroidrd skirt", "Girls trousers", "Unicorn Onesie", "Hairband"};
int child_price[15] = {499, 500, 600, 400, 800, 799, 600, 399, 500, 500};
char *child_code[15] = {"C01", "C02", "C03", "C04", "C05", "C06", "C07", "C08", "C09", "C10"};
int child_stock[15] = {0, 20, 20, 20, 20, 20, 20, 20, 20, 20};

//Main Functions
void admin();
int passwordCheckAdmin();
int customerLogin();

//Admin Functions Declaration
void add(int cat);
void inventory();
void search();
void display();

//CustomerLogin Functions Declaration
void customer();
int accountChecker();
const char *getfield(char *line, int num);
void newUser();

//Customer Functions Declaration
void shopping();
void billing();
int game();
void d_time();

char prodCodes[45][100]; //Final Bill Codes
char products[45][100];  //Final Bill Product Names
int prodPrice[45];       //FInal Product Prices
int no = 1, customerCall = 0;
int checkerForShopping = 0;
int billNumber = 1;
struct bill
{
    float price;
    float tax;
    float discount;
    float sub_total;
    float grand_total;
};

int main()
{
    system("clear");
    int login;
    printf("Login Screen\n1. Admin Login\t2. Customer Login\t3. Exit\n");
    scanf("%d", &login);

    do
    {
        switch (login)
        {
        case 1:;
            if (passwordCheckAdmin() == 0)
                admin(); //Admin Function call
            break;

        case 2:
            customerLogin(); //Customer Login Database
            break;

        case 3:
            exit(0);
            break;

        default:
            printf("Enter correct input:\n 1. Admin Login\t2. Customer Login\t3. Exit\n");
            scanf("%d", &login);
        }

    } while (login != 1 || login != 2 || login != 3);

    return 0;
}

/**
    Main Functions
    void admin();
    int passwordCheck();
    void customerLogin();
*/

void admin()
{
    /**
        Admin Functions:
        void add(int cat);
        void inventory(int op);
        void search(int op);
        void display();
     */
    system("clear");
    int option;
    printf("\tAdmin Screen\n1. Add Items\n2. Check Inventory \n3. Search \n4. Logout\n5. Exit\n");
    d_time();

    printf("\nEnter function to perform:");
    scanf("%d", &option);
    int cat;
    do
    {
        switch (option)
        {
        case 1:
            printf("\tINVENTORY\n1. Mens\n2. Womens\n3. Childrens\nEnter Category:");
            scanf("%d", &cat);
            add(cat);
            break;

        case 2:
            system("clear");
            inventory();
            break;

        case 3:
            system("clear");
            search();
            break;

        case 4:
            system("clear");
            main();

            break;

        case 5:
            exit(0);
            break;

        default:
            printf("Enter correct input\n");
            scanf("%d", &option);
        }
    } while (option != 1 || option != 2 || option != 3 || option != 4 || option != 5);
}

int passwordCheckAdmin()
{
    int cp = 124;
    int ep;
    printf("Enter password\n");
    scanf("%d", &ep);

    if (ep == cp)
    {
        return 0;
    }
    else
    {
        return 1;
        while (ep != cp)
        {
            printf("Incorrect password\n");
            printf("Enter password\n");
            scanf("%d", &ep);
        }
    }
}

/*
    CustomerLogin Functions Declaration
    void customer();
    int accountChecker();
    const char *getfield(char *line, int num);
    void newUser();
*/

int customerLogin()
{
    system("clear");
    int option;
    printf("\tCustomer Screen\n1. Login (registered) \n2. Sign up (New User)\n3. Back \n4. Exit\n");
    d_time();

    scanf("%d", &option);

    do
    {
        switch (option)
        {
        case 1:
            accountChecker();
            break;

        case 2:
            newUser();
            break;

        case 3:
            system("clear");
            main();
            break;

        case 4:
            exit(0);
            break;

        default:
            printf("Enter correct input\n");
            scanf("%d", &option);
        }
    } while (option != 1 || option != 2 || option != 3 || option != 4 || option != 5);
}

int accountChecker()
{
    int c = 0;
    char *name[100];
    char password[50];
    printf("\nENTER YOUR CREDENTIALS : \n");
    printf("\nENTER YOUR USERNAME : ");
    scanf("%s", name);
    printf("\nENTER YOUR PASSWORD : ");
    scanf("%s", password);
    char comma[50] = ",";
    const char *tp1[100];
    const char *tp2[100];

    char encrypted[50];

    int i;
    int a;
    for (i = 0; (i < 50 && password[i] != '\0'); i++)
    {
        encrypted[i] = password[i] + cipherKey;
        a = i;
    }

    encrypted[a] = password[a] + cipherKey;
    encrypted[a + 1] = '\0';

    strcpy(tp1, strcat(name, comma));
    strcpy(tp2, strcat(tp1, encrypted));
    tp2[strlen(tp2)] = '\n';

    FILE *filePointer = fopen("Users.csv", "r");

    if (filePointer == NULL)
    {
        printf(" file failed to open.\n");
    }
    else
    {
        printf(" \nRegistration Portal.\n");

        int eof = 0;
        int count = 0;
        char buffer[1024];
        while (fgets(buffer, 1024, filePointer))
        {
            char *tmp = strdup(buffer);
            const char *usernamePassword[100];
            char *cpy;
            int n, i;

            strcpy(usernamePassword, getfield(tmp, 1));
            i = strlen(usernamePassword);
            cpy = (char *)malloc(i);
            strncpy(cpy, usernamePassword, i - 1);
            cpy[i - 1] = '\0';

            eof = eof + EOF;

            if ((n = strcmp(tp2, cpy)) == 0)
            {
                printf("\nTaking you to customer section");
                Sleep(3000);
                customer();
            }
            else
            {
                count--;
            }

            free(cpy);
            free(tmp);
        }

        if (count == eof)
        {
            printf("\nIncprrect username/Password. Sign up if you haven't registered with us!");
            Sleep(3000);
            customerLogin();
        }
    }
}

const char *getfield(char *line, int num)
{
    const char *tok;
    for (tok = strtok(line, ";");
         tok && *tok;
         tok = strtok(NULL, ";\n"))
    {
        if (!--num)
            return tok;
    }
    return NULL;
}

void newUser()
{
    system("clear");
    FILE *fp = fopen("Users.csv", "a+");

    char name[50], password[50];

    if (!fp)
    {
        // Error in file opening
        printf("Can't open file\n");
        Sleep(3000);
        main();
    }

    // Asking user input for the
    // new record to be added
    printf("\nEnter Username with no spaces:\n");
    scanf("%s", &name);
    printf("\nEnter Password: \n");
    scanf("%s", &password);

    char encrypted[50];
    int i;
    int a;
    for (i = 0; (i < 50 && password[i] != '\0'); i++)
    {
        encrypted[i] = password[i] + cipherKey;
        a = i;
    }

    encrypted[a] = password[a] + cipherKey;
    encrypted[a + 1] = '\0';

    // Saving data in file
    fprintf(fp, "%s,%s\n", name, encrypted);

    printf("\nNew Account added to record");
    fclose(fp);

    printf("\nTaking you to customer section");
    Sleep(3000);

    customer();
}

void customer()
{
    /**
        Customer Functions:
        void shopping(int op);
        void billing();
        int game();
        void d_time();
        void cart();
     */
    system("clear");

    int option;
    printf("\tCustomer Screen\n1. Shop\n2. Bill\n3. Logout \n4. Exit\n");
    d_time();

    printf("Enter function to perform: ");
    scanf("%d", &option);

    do
    {

        switch (option)
        {
        case 1:
            system("clear");
            shopping();
            break;

        case 2:
            system("clear");
            billing();
            break;

        case 3:
            system("clear");
            main();
            break;

        case 4:
            exit(0);
            break;

        default:
            printf("Enter correct input\n");
            scanf("%d", &option);
        }
    } while (option != 1 || option != 2 || option != 3 || option != 4);
}

/*------------------------------------------------ Functions -------------------------------------------------------*/

/*Customer Functions*/

void shopping()
{
    system("clear");
    display();
    checkerForShopping++;

    printf("\nEnter product codes to buy:\nTo buy more than once enter code for the number of times you would like to purchase the product.\nWhen complete Click 'M' to go back to main customer menu for Billing:\n");

    for (int i = 0; i < no; i++)
    {
        scanf("%s", prodCodes[i]);
        no++;

        if (strcmp(prodCodes[i], "m") == 0 || strcmp(prodCodes[i], "M") == 0)
        {
            printf("\nTaking you to main menu!\n");
            Sleep(3000);
            customerCall++;
            break;
        }
    }

    if (customerCall != 0)
    {
        customer();
    }
}

void billing()
{
    struct bill bill;

    system("clear");
    if (checkerForShopping == 0)
    {
        system("clear");
        printf("Oh no you haven't purchased anything! Find exciting new fashion at out shopping section!\nPress 1 to go back to main menu: ");

        int n;
        scanf("%d", &n);

        if (n == 1)
            customer();
    }
    else if (prodCodes[1] == 0)
    {
        system("clear");
        printf("Oh no you haven't purchased anything! Find exciting new fashion at out shopping section!\nPress 1 to go back to main menu: ");

        int n;
        scanf("%d", &n);

        if (n == 1)
            customer();
    }
    else
    {
        float b_mens = 0.0, b_womens = 0.0, b_child = 0.0;
        int c1 = 0, c2 = 0;

        for (int i = 0; i < no - 2; i++)
        {
            //searchCounter(product);

            for (int j = 0; j < m; j++) //iterate over category
            {

                if (strcmp(prodCodes[i], mens_code[j]) == 0) //check product
                {

                    if (mens_stock[j] != 0) //check stock
                    {
                        mens_stock[j]--;
                        b_mens += mens_price[j];
                        strcpy(products[c1], mens_name[j]);
                        prodPrice[c1] = mens_price[j];
                        c1++;
                    }
                }
            }

            for (int j = 0; j < w; j++)
            {
                if (strcmp(prodCodes[i], womens_code[j]) == 0)
                {
                    if (womens_stock[j] != 0)
                    {
                        womens_stock[j]--;
                        b_womens += womens_price[j];
                        strcpy(products[c1], womens_name[j]);
                        prodPrice[c1] = womens_price[j];
                        c1++;
                    }
                }
            }

            for (int j = 0; j < chi; j++)
            {
                if (strcmp(prodCodes[i], child_code[j]) == 0)
                {
                    if (child_stock[j] != 0)
                    {
                        child_stock[j]--;
                        b_child += child_price[i];
                        strcpy(products[c1], child_name[j]);
                        prodPrice[c1] = child_price[j];
                        c1++;
                    }
                }
            }
        }

        bill.price = (b_mens + b_womens + b_child);

        int gameResult = game();
        if (gameResult == 1)
        {
            int randomNumber = 0;
            time_t t;

            // Initialization of random number generator
            srand((unsigned)time(&t));

            // get the random number
            randomNumber = rand() % 11;
            bill.discount = randomNumber;
        }
        else
        {
            bill.discount = 0;
        }
        float cgst, sgst;

        cgst = (0.025 * bill.price);
        sgst = (0.025 * bill.price);
        bill.tax = cgst + sgst;
        bill.sub_total = bill.price + bill.tax;

        if (bill.discount == 0)
        {
            bill.grand_total = bill.sub_total;
        }
        else
        {
            bill.grand_total = bill.sub_total - (bill.sub_total * (bill.discount / 100.0));
        }

        /*--------------------------------------------------------------------*/
        FILE *fp = fopen("Billing.csv", "a+");
        if (!fp)
        {
            // Error in file opening
            printf("Can't open file\n");
            Sleep(3000);
            customer();
        }
        // Saving data in file
        fprintf(fp, "%d, %f\n", billNumber, bill.grand_total);
        fclose(fp);
        billNumber++;
        /*-----------------------------------------------------------------------*/

        printf("Product:\t Price\n");

        for (int i = 0; i < no - 2; i++)
        {
            printf("%s\t %d\n", products[i], prodPrice[i]); //Final Bill Codes
        }

        printf("\n\nPrice Total : %0.2f\nCGST @2.5%% : %0.2f\nSGST @2.5%% : %0.2f\nTotal Tax : %0.2f\nSub Total: %0.2f\nDiscount: %0.2f\n\nGrand Total: %0.2f\n\n", bill.price, cgst, sgst, bill.tax, bill.sub_total, bill.discount, bill.grand_total);
        d_time();

        printf("** ** Thank you for shopping with us! We do hope you come back! Have a great day! ** **");

        int exit;
        printf("\nEnter any key to go back to main screen: ");
        scanf("%d", &exit);

        if (exit == 1)
        {
            customer();
        }
        else
        {
            customer();
        }
    }
}

int game()
{
    int randomNumber = 0;
    int guess = 0;
    int numberOfGuesses;
    time_t t;

    // Initialization of random number generator
    srand((unsigned)time(&t));

    // get the random number
    randomNumber = rand() % 21;

    printf("\nThis is a guessing game.");
    printf("\nWe have chosen a number between 0 and 20, which you must guess. If you do get it right a surprise discount awaits you! \n");

    int c = 0;
    for (numberOfGuesses = 5; numberOfGuesses > 0; --numberOfGuesses)
    {
        printf("\nYou have %d tr%s left.", numberOfGuesses, numberOfGuesses == 1 ? "y" : "ies");
        printf("\nEnter a guess: ");
        scanf("%d", &guess);

        if (guess == randomNumber)
        {
            printf("\nCongratulations.  You guessed it! A surprise discount awaits you!\n");
            c = 1;
            Sleep(3000);
            break;
        }
        else if (guess < 0 || guess > 20) // checking for an invalid guess
        {
            printf("The number is between 0 and 20.\n");
        }
        else if (randomNumber > guess)
        {
            printf("Sorry, %d is wrong.  The number is greater than that.\n", guess);
        }
        else if (randomNumber < guess)
        {
            printf("Sorry, %d is wrong.  The number is less than that.\n", guess);
        }
    }
    if (c == 0)
    {
        printf("\nYou have had five tries and failed. The number was %d. Sorry you do NOT get a discount :(\n", randomNumber);
        Sleep(3000);
    }
    else
        return c;
}

void d_time()
{
    char temp[100];
    time_t current_time = time(NULL);
    struct tm *tm = localtime(&current_time);
    strftime(temp, sizeof(temp), "%c", tm);
    printf("\nDate and Time:");
    printf("\n%s\n", temp);
}

/*Admin Functions*/

void add(int cat)
{

    if (cat == 1) //Mens
    {
        char name[25], code[10];
        int price, stock = 0;

        system("clear");

        printf("\nCode of item: ");
        scanf("%s", code);

        //codechecker

        for (int i = 0; i < m; i++)
        {
            if (strcmp(code, mens_code[i]) == 0)
            {
                printf("\nCode already exists. Enter a new code:\n ");
                Sleep(2000);
                add(1);
            }
        }

        mens_code[m] = code;

        // element to be inserted
        printf("\nEnter Details:");

        printf("\nName of item: ");
        scanf("%s", name);
        mens_name[m] = name;

        printf("\nPrice of item: ");
        scanf("%d", &price);
        mens_price[m] = price;

        printf("\nStock of item: ");
        scanf("%d", &stock);
        mens_stock[m] = stock;

        m++;
        system("clear");
        admin();
    }
    else if (cat == 2) //Womens
    {
        char name[25], code[10];
        int price, stock = 0;

        system("clear");

        printf("\nCode of item: ");
        scanf("%s", code);

        //codechecker

        for (int i = 0; i < w; i++)
        {
            if (strcmp(code, womens_code[i]) == 0)
            {
                printf("\nCode already exists. Enter a new code:\n ");
                Sleep(2000);
                add(2);
            }
        }

        womens_code[w] = code;

        // element to be inserted
        printf("\nEnter Details:");

        printf("\nName of item: ");
        scanf("%s", name);
        womens_name[w] = name;

        printf("\nPrice of item: ");
        scanf("%d", &price);
        womens_price[w] = price;

        printf("\nStock of item: ");
        scanf("%d", &stock);
        womens_stock[w] = stock;

        w++;

        system("clear");
        admin();
    }
    else if (cat == 3) //Childrens
    {
        char name[25], code[10];
        int price, stock = 0;

        system("clear");

        printf("\nCode of item: ");
        scanf("%s", code);

        //codechecker

        for (int i = 0; i < chi; i++)
        {
            if (strcmp(code, child_code[i]) == 0)
            {
                printf("\nCode already exists. Enter a new code:\n ");
                Sleep(2000);
                add(3);
            }
        }

        child_code[chi] = code;

        // element to be inserted
        printf("\nEnter Details:");

        printf("\nName of item: ");
        scanf("%s", name);
        child_name[chi] = name;

        printf("\nPrice of item: ");
        scanf("%d", &price);
        child_price[chi] = price;

        printf("\nStock of item: ");
        scanf("%d", &stock);
        child_stock[chi] = stock;

        chi++;

        system("clear");
        admin();
    }
    else
    {
        printf("\nWrong Input\n");
        Sleep(3000);
        admin();
    }
}

void inventory()
{
    display();

    int j = 0;
    for (int i = 0; i < m; i++)
    {

        if (mens_stock[i] == 0)
        {
            printf("\n\nProduct Code: %s\t", mens_code[i]);
            printf("Product Name: %s\t", mens_name[i]);
            printf("Product Price: %d\n", mens_price[i]);

            j++;
        }
    }

    for (int i = 0; i < w; i++)
    {

        if (womens_stock[i] == 0)
        {
            printf("\n\nProduct Code: %s\t", womens_code[i]);
            printf("Product Name: %s\t", womens_name[i]);
            printf("Product Price: %d\n", womens_price[i]);

            j++;
        }
    }
    for (int i = 0; i < chi; i++)
    {
        if (child_stock[i] == 0)
        {
            printf("\n\nProduct Code: %s\t", child_code[i]);
            printf("Product Name: %s\t", child_name[i]);
            printf("Product Price: %d\n", child_price[i]);

            j++;
        }
    }

    if (j == 0)
    {
        printf("\nAll items in stock\n");
    }
    else
    {
        printf("\n** Items out of stock: %d **", j);
    }

    int exit;
    printf("\nEnter 0 to exit inventory: ");
    scanf("%d", &exit);

    if (exit == 0)
    {
        system("clear");
        admin();
    }
}

void search()
{
    int exit;
    do
    {
        char s1[50];
        printf("Enter code for the product to be found:");
        scanf("%s", s1);
        int c1 = 0, c2 = 0, c3 = 0;
        int k = 0;
        for (int i = 0; i < m; i++)
        {

            if (strcmp(s1, mens_code[i]) == 0)
            {
                c1++;
                k = i;
            }
        }

        for (int i = 0; i < w; i++)
        {
            if (strcmp(s1, womens_code[i]) == 0)
            {
                c2++;
                k = i;
            }
        }
        for (int i = 0; i < chi; i++)
        {
            if (strcmp(s1, child_code[i]) == 0)
            {
                c3++;
                k = i;
            }
        }

        if (c1 > 0)
        {
            printf("Name\t\tPrice\tCode\tStock\n\n%s\t%i\t%s\t%d\n\n", mens_name[k], mens_price[k], s1, mens_stock[k]);
        }
        else if (c2 > 0)
        {
            printf("Name\t\tPrice\tCode\tStock\n\n%s\t%i\t%s\t%d\n\n", womens_name[k], womens_price[k], s1, womens_stock[k]);
        }
        else if (c3 > 0)
        {
            printf("Name\t\tPrice\tCode\tStock\n\n%s\t%i\t%s\t%d\n\n", child_name[k], child_price[k], s1, child_stock[k]);
        }
        else
        {
            printf("product code invalid !\n\n");
        }

        printf("\nEnter 0 to exit OR any other number to search another item: ");
        fflush(stdin);
        scanf("%d", &exit);

    } while (exit != 0);

    system("clear");
    admin();
}

void display()
{
    //Prints out MENU and INVENTORY
    printf("\t\t\t\tXYZ FASHION STORE!\n");

    printf("\t\t\tMENS:\n");

    for (int a = 0; a < m; a++)
    {
        printf("%s", mens_name[a]);
        printf("\t\t%s", mens_code[a]);
        printf("\t\t%d", mens_stock[a]);
        printf("\t\t%d\n", mens_price[a]);
    }

    printf("\n\t\t\tWomens\n");
    for (int a = 0; a < w; a++)
    {
        printf("%s", womens_name[a]);
        printf("\t\t%s", womens_code[a]);
        printf("\t\t%d", womens_stock[a]);
        printf("\t\t%d\n", womens_price[a]);
    }

    printf("\n\t\t\tChildrens\n");
    for (int a = 0; a < chi; a++)
    {
        printf("%s", child_name[a]);
        printf("\t\t%s", child_code[a]);
        printf("\t\t%d", child_stock[a]);
        printf("\t\t%d\n", child_price[a]);
    }
}
