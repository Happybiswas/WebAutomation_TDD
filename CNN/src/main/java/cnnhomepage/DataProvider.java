package cnnhomepage;

public class DataProvider {

    @org.testng.annotations.DataProvider(name ="getData")
    public Object[][] getDataFromDataProvider(){

        Object[][] data = new Object[3][2];
        data[0][0]= "happy1234@yahoo.com";
        data[0][1]= "happy1234";

        data[1][0]= "Anindya1234@gmail.com";
        data[1][1]= "anindya1234";

        data[2][0]= "tapan3456@gmail.com";
        data[2][1]= "tapan1234";

        return data;

    }
}
