package CapHomePage;

import databases.ConnectToSqlDB;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utilities.DataReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import static databases.ConnectToSqlDB.connectToSqlDatabase;

public class DataSource {

    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;
    public static DataReader excelReader = new DataReader();
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        //InputStream ism = new FileInputStream("/secret.properties");
        InputStream ism = new FileInputStream("../CapitalOne/src/main/secret.properties");
        prop.load(ism);
        ism.close();
        return prop;
    }
    public static Connection connectToSqlDatabase() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = loadProperties();
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connect = DriverManager.getConnection(url,userName,password);
        System.out.println("Database is connected");
        return connect;
    }

    // Insert Data from into Database
    public static void insertDataIntoDB(){
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"amazonitems","items");
    }
    //  From Class/ Same class
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Hand sanitizer");
        itemsList.add("iphone 11 pro max");
        itemsList.add("T-shirt");
        itemsList.add("Mens shirt");
        itemsList.add("Shoes");
        itemsList.add("Camera");
        itemsList.add("Bike");
        itemsList.add("Tv");
        System.out.println(itemsList);
        return itemsList;
    }
//    public static void readFromSQLDB() throws Exception {
//        connectToSqlDB = new ConnectToSqlDB();
//        connectToSqlDB.readDataBase("chase_emp","emp_FirstName");}
//

    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{
        String path = "../Amazon/DataTest/testdata.xlsx";
        String[] myStringArray = excelReader.fileReader2(path, 0);
        for(int i=1;i<myStringArray.length; i++)
            System.out.println(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();

        // Using add() method to add elements in array_list
        //System.out.println();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
            //System.out.print(list.get(i+1) + " ");
        }
        return list;
    }
//      get data from xlsx

    public static ArrayList<String> getDataFromexcel(String testcaseName) throws IOException {
        //fileInputStream argument
        ArrayList<String> arrayList = new ArrayList<String>();
        FileInputStream inputStream = new FileInputStream("../Amazon/DataTest/testdata.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("logindata")) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                Iterator<Row> rows = sheet.iterator();// sheet is collection of rows
                Row firstrow = rows.next();
                Iterator<Cell> ce = firstrow.cellIterator();//row is collection of cells
                int k = 0;
                int coloumn = 0;
                while (ce.hasNext()) {
                    Cell value = ce.next();
                    if (value.getStringCellValue().equalsIgnoreCase("TestCase")) ;
                    coloumn = k;
                }
                k++;
                System.out.println(coloumn);
                ////once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
                while (rows.hasNext()) {
                    Row r = rows.next();
                    if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName)) {
                        //after you grab login testcase row = pull all the data of that row and feed into test
                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()) {
                            Cell c = cv.next();
                            if (c.getCellType() == CellType.STRING) {//getCellTypeEnum()

                                arrayList.add(c.getStringCellValue());
                            } else {
                                arrayList.add(NumberToTextConverter.toText(c.getNumericCellValue()));
                            }

                        }
                    }
                }
            }

        }
        return arrayList;
    }

    public static ArrayList<String> readUserProfileFromSqlTable1()throws IOException, SQLException, ClassNotFoundException {
        ArrayList<String> list = new ArrayList<>();
      //  User user = null;
        try{
            Connection conn = connectToSqlDatabase();
            String query = "SELECT * FROM chase_emp where emp_id = 102";
            // SELECT * FROM emloyee_db.chase_emp where emp_id= 102;
            // create the java statement
            Statement st = conn.createStatement();
            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
            // iterate through the java resultset
            while (rs.next())
            {
                String firstname = rs.getString("emp_Firstname");
                String lastname = rs.getString("emp_Lastname");
                String password = rs.getString("emp_password");
                //System.out.format("%s, %s\n", name, id);
               // user = new User(firstname, password);
                //list.add(user);
                System.out.println(firstname);

            }
            st.close();
        }catch (Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return list;
    }



}
