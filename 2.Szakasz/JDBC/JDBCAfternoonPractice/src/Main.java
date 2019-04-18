import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("FónNámbörGetter!");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Databe connector not found");
            System.exit(0);
        }

        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java_test", "postgres", "12345");

        } catch (SQLException e) {
            System.err.println("Connection failed!");
        }

        PhonebookEntry infos = new PhonebookEntry(123, "0650323423", "Józsi", "CsokoládéHello");

        //System.out.println(getRecord(connection));
        //System.out.println("insert is: " + insertRecord(infos, connection));
        //System.out.println("delete is: " + deleteRecord(connection, 8));
        scannerFunction(connection);

    }

    public static List<PhonebookEntry> getRecord (Connection connection) {
        List<PhonebookEntry> records = new ArrayList<>();

        try(PreparedStatement statement = connection.prepareStatement("select * from phonebook");){

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String pn = resultSet.getString("pn");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");

                records.add(new PhonebookEntry(id, pn, name, description));
            }

        } catch (SQLException e) {
            System.err.println("NotGood");
        }
        return records;
    }

    public static boolean insertRecord (PhonebookEntry phonebook, Connection connection) {
        try (PreparedStatement statement = connection
                .prepareStatement("insert into phonebook (pn, name, description) values (?, ?, ?);")) {

            statement.setString(1, phonebook.getPn());
            statement.setString(2, phonebook.getName());
            statement.setString(3, phonebook.getDescription());
            statement.execute();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    public static boolean deleteRecord (Connection connection, int id) {
        try (PreparedStatement statement = connection.prepareStatement( "DELETE from phonebook WHERE id=?")){

            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    public static boolean addField (Connection connection, String name) {
        try(PreparedStatement statement = connection
                .prepareStatement("ALTER TABLE phonebook ADD COLUMN ? varchar(255)")) {

            statement.setString(1, name);
            statement.execute();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    public static void scannerFunction (Connection connection) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Válassz, írj egy számot:" + "\n" + "1. adatok lekérése, " + "\n" +
                "2. adja meg az adatokat amiket fel akar tölteni! (pn name description)" + "\n" +
                "3. törölje az adott rekordot, id alapján" + "\n" +
                "4. adjon hozzá a táblához, egy új VARCHAR mezőt");
        String str = scan.nextLine();

        while (!str.equals("q")) {

            if (str.equals("1")) {
                System.out.println(getRecord(connection));
            } else if (str.equals("2")) {
                //System.out.println("Adja meg a telefonszámot:");
                //String pn = scan.nextLine();
                //System.out.println("Adja meg a nevet:");
                //String name = scan.nextLine();
                //System.out.println("Adja meg a leírást:");
                //String description = scan.nextLine();
                //PhonebookEntry phonebookEntry= new PhonebookEntry(1213, pn, name, description);
                String[] array = scan.nextLine().split(" ");
                List<String> datas = new ArrayList<>();
                // AMI EZ FÖLÖTT VAN A KIKOMENTEZETT RÉSZ A JÓ AMI NINCS KOMMENTEZVE AZ ROSSZ AZT TÖRÖLNI KELL MAJD HA NEM JUTOK SEHOVA
                insertRecord(phonebookEntry, connection);
                System.out.println("Siker! Következő parancs/szám?");
            } else if (str.equals("3")) {
                System.out.println("Adja meg az id-t");
                int id = Integer.parseInt(scan.nextLine());
                deleteRecord(connection, id);
                System.out.println("Siker! Következő parancs/szám?");
            }   else if (str.equals("4")) {
                System.out.println("Adja meg az új mező nevét:");
                String name = scan.nextLine();
                addField(connection, name);
                System.out.println("Siker! Következő parancs/szám?");
            }

            str = scan.nextLine();
        }


    }




}