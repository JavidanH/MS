package Task2.Adapter;

public class Main {
    public static void main(String[] args) {
        XML xmlAdapter = new XML();
        EXCEL adapter = new ConventerAdapter(xmlAdapter);

        String xmlData = xmlAdapter.readFromXML();
        adapter.writeToExcel(xmlData);
    }
}
